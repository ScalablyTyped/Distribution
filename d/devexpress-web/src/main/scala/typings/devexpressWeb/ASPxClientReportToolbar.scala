package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the ASPxClientDocumentViewer control's toolbar.
  */
@JSGlobal("ASPxClientReportToolbar")
@js.native
class ASPxClientReportToolbar () extends ASPxClientControl {
  /**
    * Provides access to the control template assigned for the specified menu item. A control.
    * @param name A String value, specifying the menu item name.
    */
  def GetItemTemplateControl(name: String): ASPxClientControl = js.native
}

/* static members */
@JSGlobal("ASPxClientReportToolbar")
@js.native
object ASPxClientReportToolbar extends js.Object {
  /**
    * Converts the specified object to the current object's type. This method is effective when you utilize the Client API IntelliSense feature provided by DevExpress. An ASPxClientReportToolbar object.
    * @param obj The client object to be type cast. Represents an instance of a DevExpress web control's client object.
    */
  def Cast(obj: js.Any): ASPxClientReportToolbar = js.native
}

