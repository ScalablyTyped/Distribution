package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIgnoreCache extends js.Object {
  /**
    * When true, the loader will bypass the cache for all inspected page resources loaded before the `load` event
    * is fired. The effect is similar to pressing Ctrl+Shift+R in the inspected window or within the Developer
    * Tools window.
    */
  var ignoreCache: js.UndefOr[Boolean] = js.undefined
  /**
    * If specified, the script will be injected into every frame of the inspected page immediately upon load,
    * before any of the frame's scripts. The script will not be injected after subsequent reloads—for example, if
    * the user presses Ctrl+R.
    */
  var injectedScript: js.UndefOr[String] = js.undefined
  /**
    * If specified, this script evaluates into a function that accepts three string arguments: the source to
    * preprocess, the URL of the source, and a function name if the source is an DOM event handler. The
    * preprocessorerScript function should return a string to be compiled by Chrome in place of the input source.
    * In the case that the source is a DOM event handler, the returned source must compile to a single JS
    * function.
    * @deprecated Please avoid using this parameter, it will be removed soon.
    */
  var preprocessorScript: js.UndefOr[String] = js.undefined
  /**
    * If specified, the string will override the value of the `User-Agent` HTTP header that's sent while loading
    * the resources of the inspected page. The string will also override the value of the `navigator.userAgent`
    * property that's returned to any scripts that are running within the inspected page.
    */
  var userAgent: js.UndefOr[String] = js.undefined
}

object AnonIgnoreCache {
  @scala.inline
  def apply(
    ignoreCache: js.UndefOr[Boolean] = js.undefined,
    injectedScript: String = null,
    preprocessorScript: String = null,
    userAgent: String = null
  ): AnonIgnoreCache = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreCache)) __obj.updateDynamic("ignoreCache")(ignoreCache.asInstanceOf[js.Any])
    if (injectedScript != null) __obj.updateDynamic("injectedScript")(injectedScript.asInstanceOf[js.Any])
    if (preprocessorScript != null) __obj.updateDynamic("preprocessorScript")(preprocessorScript.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIgnoreCache]
  }
}

