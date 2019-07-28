package typings.expressDashMinify.ExpressMinifyInterfacesNs

import typings.node.NodeRequire
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressMinifyOptions extends js.Object {
  /**
    * The directory for cache storage (must be writeable). Pass false to cache in the memory (not recommended).
    */
  var cache: js.UndefOr[String | Boolean] = js.undefined
  /**
    * Matches CoffeeScript content-type.
    */
  var coffee_match: js.UndefOr[RegExp] = js.undefined
  /**
    * Matches CSS content-type.
    */
  var css_match: js.UndefOr[RegExp] = js.undefined
  /**
    * Customize cssmin instance (require('cssmin')).
    */
  var cssmin: js.UndefOr[NodeRequire] = js.undefined
  /**
    * Matches JavaScript content-type.
    */
  var js_match: js.UndefOr[RegExp] = js.undefined
  /**
    * Matches JSON content-type.
    */
  var json_match: js.UndefOr[RegExp] = js.undefined
  /**
    * Matches LESS content-type.
    */
  var less_match: js.UndefOr[RegExp] = js.undefined
  /**
    * Handle compiling errors or minifying errors. You can determine what to respond when facing such errors.
    */
  var onerror: js.UndefOr[js.Function] = js.undefined
  /**
    * Matches SASS content-type.
    */
  var sass_match: js.UndefOr[RegExp] = js.undefined
  /**
    * Matches Stylus content-type.
    */
  var stylus_match: js.UndefOr[RegExp] = js.undefined
  /**
    * Customize UglifyJS instance (require('uglify-js')).
    */
  var uglifyJS: js.UndefOr[NodeRequire] = js.undefined
}

object ExpressMinifyOptions {
  @scala.inline
  def apply(
    cache: String | Boolean = null,
    coffee_match: RegExp = null,
    css_match: RegExp = null,
    cssmin: NodeRequire = null,
    js_match: RegExp = null,
    json_match: RegExp = null,
    less_match: RegExp = null,
    onerror: js.Function = null,
    sass_match: RegExp = null,
    stylus_match: RegExp = null,
    uglifyJS: NodeRequire = null
  ): ExpressMinifyOptions = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (coffee_match != null) __obj.updateDynamic("coffee_match")(coffee_match)
    if (css_match != null) __obj.updateDynamic("css_match")(css_match)
    if (cssmin != null) __obj.updateDynamic("cssmin")(cssmin)
    if (js_match != null) __obj.updateDynamic("js_match")(js_match)
    if (json_match != null) __obj.updateDynamic("json_match")(json_match)
    if (less_match != null) __obj.updateDynamic("less_match")(less_match)
    if (onerror != null) __obj.updateDynamic("onerror")(onerror)
    if (sass_match != null) __obj.updateDynamic("sass_match")(sass_match)
    if (stylus_match != null) __obj.updateDynamic("stylus_match")(stylus_match)
    if (uglifyJS != null) __obj.updateDynamic("uglifyJS")(uglifyJS)
    __obj.asInstanceOf[ExpressMinifyOptions]
  }
}

