package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for cancellable events which concern manipulations on groups.
  */
@JSGlobal("ASPxClientNavBarGroupCancelEventArgs")
@js.native
class ASPxClientNavBarGroupCancelEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientNavBarGroupCancelEventArgs {
  /**
    * Initializes a new object of the ASPxClientNavBarGroupCancelEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param group An ASPxClientNavBarGroup object that represents a group related to the event.
    */
  def this(processOnServer: Boolean, group: typings.devexpressWeb.ASPxClientNavBarGroup) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the group object related to the event.
    */
  /* CompleteClass */
  var group: typings.devexpressWeb.ASPxClientNavBarGroup = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
}
