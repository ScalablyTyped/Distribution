package typings.firefoxWebextBrowser.browser.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies whether the `windows.Window` returned should contain a list of the `tabs.Tab` objects. */
trait GetInfo extends js.Object {
  /**
    * If true, the `windows.Window` returned will have a `tabs` property that contains a list of the `tabs.Tab`
    * objects. The `Tab` objects only contain the `url`, `title` and `favIconUrl` properties if the extension's
    * manifest file includes the `"tabs"` permission.
    */
  var populate: js.UndefOr[Boolean] = js.undefined
  /**
    * `windowTypes` is deprecated and ignored on Firefox.
    * @deprecated `windowTypes` is deprecated and ignored on Firefox.
    */
  var windowTypes: js.UndefOr[js.Array[WindowType]] = js.undefined
}

object GetInfo {
  @scala.inline
  def apply(populate: js.UndefOr[Boolean] = js.undefined, windowTypes: js.Array[WindowType] = null): GetInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(populate)) __obj.updateDynamic("populate")(populate.get.asInstanceOf[js.Any])
    if (windowTypes != null) __obj.updateDynamic("windowTypes")(windowTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInfo]
  }
}

