package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which concern clicking on the control's tabs.
  */
@JSGlobal("ASPxClientTabControlTabClickEventArgs")
@js.native
class ASPxClientTabControlTabClickEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientTabControlTabClickEventArgs {
  /**
    * Initializes a new object of the ASPxClientTabControlTabClickEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param tab An ASPxClientTab object that represents a tab related to the event.
    * @param htmlElement An HTML object that contains the processed tab.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    */
  def this(
    processOnServer: Boolean,
    tab: typings.devexpressWeb.ASPxClientTab,
    htmlElement: js.Any,
    htmlEvent: js.Any
  ) = this()
}
