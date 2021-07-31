package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientObjectContainer.FlashScriptCommand client event.
  */
@JSGlobal("ASPxClientFlashScriptCommandEventArgs")
@js.native
class ASPxClientFlashScriptCommandEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientFlashScriptCommandEventArgs {
  /**
    * Initializes a new object of the ASPxClientFlashScriptCommandEventArgs type with the specified settings.
    */
  def this(command: String, args: String) = this()
  
  /**
    * Gets arguments passed via the FSCommand action of the flash object.
    */
  /* CompleteClass */
  var args: String = js.native
  
  /**
    * Gets a command passed via the FSCommand action of the flash object.
    */
  /* CompleteClass */
  var command: String = js.native
}
