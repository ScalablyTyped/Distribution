package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Populate extends js.Object {
  /**
    * If true, the `windows.Window` returned will have a `tabs` property that contains a list of the `tabs.Tab`
    * objects. The `Tab` objects only contain the `url`, `title` and `favIconUrl` properties if the extension's
    * manifest file includes the `"tabs"` permission. If false, the `windows.Window` won't have the `tabs`
    * property.
    */
  var populate: js.UndefOr[scala.Boolean] = js.undefined
  /** One or more tab indices to highlight. */
  var tabs: js.Array[scala.Double] | scala.Double
  /** The window that contains the tabs. */
  var windowId: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Populate {
  @scala.inline
  def apply(
    tabs: js.Array[scala.Double] | scala.Double,
    populate: js.UndefOr[scala.Boolean] = js.undefined,
    windowId: scala.Int | scala.Double = null
  ): Anon_Populate = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    if (!js.isUndefined(populate)) __obj.updateDynamic("populate")(populate)
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Populate]
  }
}

