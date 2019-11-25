package typings.dojo.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/i18n.html
  *
  * This module implements the dojo/i18n! plugin and the v1.6- i18n API
  * We choose to include our own plugin to leverage functionality already contained in dojo
  * and thereby reduce the size of the plugin compared to various loader implementations. Also, this
  * allows foreign AMD loaders to be used without their plugins.
  *
  */
@JSName("i18n")
trait i18n_ extends js.Object {
  /**
    *
    */
  var cache: js.Object
  /**
    *
    */
  var dynamic: Boolean
  /**
    *
    */
  var unitTests: js.Array[_]
  /**
    *
    * @param moduleName
    * @param bundleName
    * @param locale
    */
  def getL10nName(moduleName: js.Any, bundleName: js.Any, locale: js.Any): String
  /**
    *
    * @param moduleName
    * @param bundleName
    * @param locale
    */
  def getLocalization(moduleName: js.Any, bundleName: js.Any, locale: js.Any): js.Any
  /**
    * id is in one of the following formats
    *
    * /nls/
    *  => load the bundle, localized to config.locale; load all bundles localized to
    *  config.extraLocale (if any); return the loaded bundle localized to config.locale.
    * /nls//
    *  => load then return the bundle localized to
    * preload/nls//
    *  => for config.locale and all config.extraLocale, load all bundles found
    *  in the best-matching bundle rollup. A value of 1 is returned, which
    *  is meaningless other than to say the plugin is executing the requested
    *  preloads
    *
    * In cases 1 and 2,  is always normalized to an absolute module id upon entry; see
    * normalize. In case 3, it  is assumed to be absolute; this is arranged by the builder.
    *
    * To load a bundle means to insert the bundle into the plugin's cache and publish the bundle
    * value to the loader. Given , , and a particular , the cache key
    *
    * <path>/nls/<bundle>/<locale>
    * will hold the value. Similarly, then plugin will publish this value to the loader by
    *
    * define("<path>/nls/<bundle>/<locale>", <bundle-value>);
    * Given this algorithm, other machinery can provide fast load paths be preplacing
    * values in the plugin's cache, which is public. When a load is demanded the
    * cache is inspected before starting any loading. Explicitly placing values in the plugin
    * cache is an advanced/experimental feature that should not be needed; use at your own risk.
    *
    * For the normal AMD algorithm, the root bundle is loaded first, which instructs the
    * plugin what additional localized bundles are required for a particular locale. These
    * additional locales are loaded and a mix of the root and each progressively-specific
    * locale is returned. For example:
    *
    * The client demands "dojo/i18n!some/path/nls/someBundle
    * The loader demands load(some/path/nls/someBundle)
    * This plugin require's "some/path/nls/someBundle", which is the root bundle.
    * Assuming config.locale is "ab-cd-ef" and the root bundle indicates that localizations
    * are available for "ab" and "ab-cd-ef" (note the missing "ab-cd", then the plugin
    * requires "some/path/nls/ab/someBundle" and "some/path/nls/ab-cd-ef/someBundle"
    * Upon receiving all required bundles, the plugin constructs the value of the bundle
    * ab-cd-ef as...
    *  mixin(mixin(mixin({}, require("some/path/nls/someBundle"),
    *      require("some/path/nls/ab/someBundle")),
    *      require("some/path/nls/ab-cd-ef/someBundle"));
    *
    * This value is inserted into the cache and published to the loader at the
    * key/module-id some/path/nls/someBundle/ab-cd-ef.
    *
    * The special preload signature (case 3) instructs the plugin to stop servicing all normal requests
    * (further preload requests will be serviced) until all ongoing preloading has completed.
    *
    * The preload signature instructs the plugin that a special rollup module is available that contains
    * one or more flattened, localized bundles. The JSON array of available locales indicates which locales
    * are available. Here is an example:
    *
    * *preload*some/path/nls/someModule*["root", "ab", "ab-cd-ef"]
    * This indicates the following rollup modules are available:
    *
    * some/path/nls/someModule_ROOT
    * some/path/nls/someModule_ab
    * some/path/nls/someModule_ab-cd-ef
    * Each of these modules is a normal AMD module that contains one or more flattened bundles in a hash.
    * For example, assume someModule contained the bundles some/bundle/path/someBundle and
    * some/bundle/path/someOtherBundle, then some/path/nls/someModule_ab would be expressed as follows:
    *
    * define({
    *     some/bundle/path/someBundle:<value of someBundle, flattened with respect to locale ab>,
    *     some/bundle/path/someOtherBundle:<value of someOtherBundle, flattened with respect to locale ab>,
    * });
    * E.g., given this design, preloading for locale=="ab" can execute the following algorithm:
    *
    * require(["some/path/nls/someModule_ab"], function(rollup){
    *     for(var p in rollup){
    *         var id = p + "/ab",
    *         cache[id] = rollup[p];
    *         define(id, rollup[p]);
    *     }
    * });
    * Similarly, if "ab-cd" is requested, the algorithm can determine that "ab" is the best available and
    * load accordingly.
    *
    * The builder will write such rollups for every layer if a non-empty localeList  profile property is
    * provided. Further, the builder will include the following cache entry in the cache associated with
    * any layer.
    *
    * "*now":function(r){r(['dojo/i18n!*preload*<path>/nls/<module>*<JSON array of available locales>']);}
    * The *now special cache module instructs the loader to apply the provided function to context-require
    * with respect to the particular layer being defined. This causes the plugin to hold all normal service
    * requests until all preloading is complete.
    *
    * Notice that this algorithm is rarely better than the standard AMD load algorithm. Consider the normal case
    * where the target locale has a single segment and a layer depends on a single bundle:
    *
    * Without Preloads:
    *
    * Layer loads root bundle.
    * bundle is demanded; plugin loads single localized bundle.
    * With Preloads:
    *
    * Layer causes preloading of target bundle.
    * bundle is demanded; service is delayed until preloading complete; bundle is returned.
    * In each case a single transaction is required to load the target bundle. In cases where multiple bundles
    * are required and/or the locale has multiple segments, preloads still requires a single transaction whereas
    * the normal path requires an additional transaction for each additional bundle/locale-segment. However all
    * of these additional transactions can be done concurrently. Owing to this analysis, the entire preloading
    * algorithm can be discard during a build by setting the has feature dojo-preload-i18n-Api to false.
    *
    * @param id
    * @param require
    * @param load
    */
  def load(id: js.Any, require: js.Any, load: js.Any): Unit
  /**
    * id may be relative.
    * preload has form *preload*<path>/nls/<module>*<flattened locales> and
    * therefore never looks like a relative
    *
    * @param id
    * @param toAbsMid
    */
  def normalize(id: js.Any, toAbsMid: js.Any): js.Any
  /**
    *
    * @param locale
    */
  def normalizeLocale(locale: js.Any): js.Any
}

object i18n_ {
  @scala.inline
  def apply(
    cache: js.Object,
    dynamic: Boolean,
    getL10nName: (js.Any, js.Any, js.Any) => String,
    getLocalization: (js.Any, js.Any, js.Any) => js.Any,
    load: (js.Any, js.Any, js.Any) => Unit,
    normalize: (js.Any, js.Any) => js.Any,
    normalizeLocale: js.Any => js.Any,
    unitTests: js.Array[_]
  ): i18n_ = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], dynamic = dynamic.asInstanceOf[js.Any], getL10nName = js.Any.fromFunction3(getL10nName), getLocalization = js.Any.fromFunction3(getLocalization), load = js.Any.fromFunction3(load), normalize = js.Any.fromFunction2(normalize), normalizeLocale = js.Any.fromFunction1(normalizeLocale), unitTests = unitTests.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[i18n_]
  }
}

