package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRibbon.CommandExecuted event.
  */
@JSGlobal("ASPxClientRibbonCommandExecutedEventArgs")
@js.native
class ASPxClientRibbonCommandExecutedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientRibbonCommandExecutedEventArgs {
  /**
    * Initializes a new object of the ASPxClientRibbonCommandExecutedEventArgs type with the specified settings.
    * @param item An ASPxClientRibbonItem object, manipulations on which forced the event to be raised.
    * @param parameter A string value containing additional information about the processed command.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    */
  def this(item: typings.devexpressWeb.ASPxClientRibbonItem, parameter: String, processOnServer: Boolean) = this()
  
  /**
    * Gets an item object related to the event.
    */
  /* CompleteClass */
  var item: typings.devexpressWeb.ASPxClientRibbonItem = js.native
  
  /**
    * Gets an optional parameter that complements the processed command.
    */
  /* CompleteClass */
  var parameter: String = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
}
