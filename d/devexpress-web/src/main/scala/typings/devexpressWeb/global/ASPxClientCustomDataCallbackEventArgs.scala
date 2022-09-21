package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the CustomCallback event.
  */
@JSGlobal("ASPxClientCustomDataCallbackEventArgs")
@js.native
open class ASPxClientCustomDataCallbackEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientCustomDataCallbackEventArgs {
  /**
    * Initializes a new object of the ASPxClientCustomDataCallbackEventArgs type with the specified settings.
    * @param result A string value that represents the result of server-side processing.
    */
  def this(result: String) = this()
  
  /**
    * Gets a string that contains specific information (if any) that has been passed from the server to the client side for further processing, related to the CustomCallback event.
    */
  /* CompleteClass */
  var result: String = js.native
}
