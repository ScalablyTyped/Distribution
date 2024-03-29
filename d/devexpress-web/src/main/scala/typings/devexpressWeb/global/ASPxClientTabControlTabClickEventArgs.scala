package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which concern clicking on the control's tabs.
  */
@JSGlobal("ASPxClientTabControlTabClickEventArgs")
@js.native
open class ASPxClientTabControlTabClickEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientTabControlTabClickEventArgs {
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
    htmlElement: Any,
    htmlEvent: Any
  ) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the HTML object that contains the processed tab.
    */
  /* CompleteClass */
  var htmlElement: Any = js.native
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  /* CompleteClass */
  var htmlEvent: Any = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
  
  /**
    * Gets or sets a value specifying whether a callback should be sent to the server to reload the content of the page being activated.
    */
  /* CompleteClass */
  var reloadContentOnCallback: Boolean = js.native
  
  /**
    * Gets the tab object related to the event.
    */
  /* CompleteClass */
  var tab: typings.devexpressWeb.ASPxClientTab = js.native
}
