package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side counterpart of the RichEdit extension.
  */
@js.native
trait MVCxClientRichEdit extends ASPxClientRichEdit {
  
  /**
    * Sends a callback with a parameter to update the RichEdit by processing the passed information on the server, in an Action specified via the RichEditSettings.CustomActionRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the RichEditSettings.CustomActionRouteValues property.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(data: js.Any): Unit = js.native
  def PerformCallback(data: js.Any, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
}
