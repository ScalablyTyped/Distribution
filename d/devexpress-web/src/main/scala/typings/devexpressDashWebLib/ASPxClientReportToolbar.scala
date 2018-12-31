package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the ASPxClientDocumentViewer control's toolbar.
  */
trait ASPxClientReportToolbar extends ASPxClientControl {
  /**
    * Provides access to the control template assigned for the specified menu item.
    * @param name A String value, specifying the menu item name.
    */
  def GetItemTemplateControl(name: java.lang.String): ASPxClientControl
}

