package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side counterpart of the PivotGrid extension.
  */
@js.native
trait MVCxClientPivotGrid
  extends StObject
     with ASPxClientPivotGrid {
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientPivotGrid: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientPivotGrid]] = js.native
  
  /**
    * Passes PivotGrid callback parameters to the specified object.
    * @param obj An object that receives PivotGrid callback parameters.
    */
  def FillStateObject(obj: Any): Unit = js.native
  
  /**
    * Sends a callback with a parameter to update the PivotGrid by processing the passed information on the server, in an Action specified via the grid's PivotGridSettings.CustomActionRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the grid's PivotGridSettings.CustomActionRouteValues property.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(data: Any): Unit = js.native
  def PerformCallback(data: Any, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
}
