package typings.devexpressWeb.global

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDateEdit.ParseDate client-side event that parses a string entered into a date editor.
  */
@JSGlobal("ASPxClientParseDateEventArgs")
@js.native
class ASPxClientParseDateEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientParseDateEventArgs {
  /**
    * Initializes a new instance of the ASPxClientParseDateEventArgs class with specified settings.
    * @param value A string containing the value entered into the date editor.
    */
  def this(value: String) = this()
  
  /**
    * Gets or sets the edit value of the date editor.
    */
  /* CompleteClass */
  var date: Date = js.native
  
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  /* CompleteClass */
  var handled: Boolean = js.native
  
  /**
    * Gets the value entered into the date editor by an end user.
    */
  /* CompleteClass */
  var value: String = js.native
}
