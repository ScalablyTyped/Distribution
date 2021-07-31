package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDropDownEdit.DropDownCommandButtonClick event.
  */
@JSGlobal("ASPxClientDropDownCommandEventArgs")
@js.native
/**
  * Initializes a new instance of the ASPxClientDropDownCommandEventArgs class.
  */
class ASPxClientDropDownCommandEventArgs ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDropDownCommandEventArgs {
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the name of the processed command in the ASPxClientDropDownEdit.DropDownCommandButtonClick event.
    */
  /* CompleteClass */
  var commandName: String = js.native
}
