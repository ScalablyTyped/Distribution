package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_WindowIdPopulate extends js.Object {
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

