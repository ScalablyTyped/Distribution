package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InspectedWindow extends js.Object {
  /**
    * Use the `browser.devtools.inspectedWindow` API to interact with the inspected window: obtain the tab ID for the
    * inspected page, evaluate the code in the context of the inspected window, reload the page, or obtain the list of
    * resources within the page.
    *
    * Allowed in: Devtools pages only
    */
  val inspectedWindowNs: Anon_Content
  /**
    * Use the `browser.devtools.network` API to retrieve the information about network requests displayed by the Developer
    * Tools in the Network panel.
    *
    * Allowed in: Devtools pages only
    */
  val networkNs: Anon_GetHAR
  /**
    * Use the `browser.devtools.panels` API to integrate your extension into Developer Tools window UI: create your own
    * panels, access existing panels, and add sidebars.
    *
    * Allowed in: Devtools pages only
    */
  val panelsNs: Anon_Create
}

object Anon_InspectedWindow {
  @scala.inline
  def apply(inspectedWindowNs: Anon_Content, networkNs: Anon_GetHAR, panelsNs: Anon_Create): Anon_InspectedWindow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inspectedWindowNs")(inspectedWindowNs)
    __obj.updateDynamic("networkNs")(networkNs)
    __obj.updateDynamic("panelsNs")(panelsNs)
    __obj.asInstanceOf[Anon_InspectedWindow]
  }
}

