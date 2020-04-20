package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdevtools extends js.Object {
  /**
    * Use the `browser.devtools.inspectedWindow` API to interact with the inspected window: obtain the tab ID for the
    * inspected page, evaluate the code in the context of the inspected window, reload the page, or obtain the list of
    * resources within the page.
    *
    * Allowed in: Devtools pages only
    */
  val inspectedWindow: TypeofinspectedWindow
  /**
    * Use the `browser.devtools.network` API to retrieve the information about network requests displayed by the Developer
    * Tools in the Network panel.
    *
    * Allowed in: Devtools pages only
    */
  val network: TypeofnetworkGetHAR
  /**
    * Use the `browser.devtools.panels` API to integrate your extension into Developer Tools window UI: create your own
    * panels, access existing panels, and add sidebars.
    *
    * Allowed in: Devtools pages only
    */
  val panels: Typeofpanels
}

object Typeofdevtools {
  @scala.inline
  def apply(inspectedWindow: TypeofinspectedWindow, network: TypeofnetworkGetHAR, panels: Typeofpanels): Typeofdevtools = {
    val __obj = js.Dynamic.literal(inspectedWindow = inspectedWindow.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], panels = panels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofdevtools]
  }
}

