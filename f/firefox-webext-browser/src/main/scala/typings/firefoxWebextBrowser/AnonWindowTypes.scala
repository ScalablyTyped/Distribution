package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.windows.WindowType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWindowTypes extends js.Object {
  /**
    * If true, the `windows.Window` returned will have a `tabs` property that contains a list of the `tabs.Tab`
    * objects. The `Tab` objects only contain the `url`, `title` and `favIconUrl` properties if the extension's
    * manifest file includes the `"tabs"` permission.
    */
  var populate: js.UndefOr[Boolean] = js.undefined
  /**
    * If set, the `windows.Window` returned will be filtered based on its type. If unset the default filter is set
    * to `['app', 'normal', 'panel', 'popup']`, with `'app'` and `'panel'` window types limited to the extension's
    * own windows.
    * @deprecated If set, the `windows.Window` returned will be filtered based on its type. If unset the default
    *     filter is set to `['app', 'normal', 'panel', 'popup']`, with `'app'` and `'panel'` window types limited
    *     to the extension's own windows.
    */
  var windowTypes: js.UndefOr[js.Array[WindowType]] = js.undefined
}

object AnonWindowTypes {
  @scala.inline
  def apply(populate: js.UndefOr[Boolean] = js.undefined, windowTypes: js.Array[WindowType] = null): AnonWindowTypes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(populate)) __obj.updateDynamic("populate")(populate.asInstanceOf[js.Any])
    if (windowTypes != null) __obj.updateDynamic("windowTypes")(windowTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWindowTypes]
  }
}

