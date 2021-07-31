package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for cancellable events which concern manipulations on tabs.
  */
@JSGlobal("ASPxClientTabControlTabCancelEventArgs")
@js.native
class ASPxClientTabControlTabCancelEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientTabControlTabCancelEventArgs {
  /**
    * Initializes a new object of the ASPxClientTabControlTabCancelEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param tab An ASPxClientTab object representing a tab related to the event.
    */
  def this(processOnServer: Boolean, tab: typings.devexpressWeb.ASPxClientTab) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
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
