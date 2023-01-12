package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the client ASPxClientControlCollection.ControlsInitialized event.
  */
trait ASPxClientControlsInitializedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets a value that specifies whether a callback is sent during a controls initialization.
    */
  var isCallback: Boolean
}
object ASPxClientControlsInitializedEventArgs {
  
  inline def apply(isCallback: Boolean): ASPxClientControlsInitializedEventArgs = {
    val __obj = js.Dynamic.literal(isCallback = isCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientControlsInitializedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientControlsInitializedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setIsCallback(value: Boolean): Self = StObject.set(x, "isCallback", value.asInstanceOf[js.Any])
  }
}
