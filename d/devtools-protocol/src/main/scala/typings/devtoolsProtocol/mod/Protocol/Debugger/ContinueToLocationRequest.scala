package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.devtoolsProtocolStrings.any
import typings.devtoolsProtocol.devtoolsProtocolStrings.current
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinueToLocationRequest extends StObject {
  
  /**
    * Location to continue to.
    */
  var location: Location
  
  /**
    *  (ContinueToLocationRequestTargetCallFrames enum)
    */
  var targetCallFrames: js.UndefOr[any | current] = js.undefined
}
object ContinueToLocationRequest {
  
  inline def apply(location: Location): ContinueToLocationRequest = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueToLocationRequest]
  }
  
  extension [Self <: ContinueToLocationRequest](x: Self) {
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setTargetCallFrames(value: any | current): Self = StObject.set(x, "targetCallFrames", value.asInstanceOf[js.Any])
    
    inline def setTargetCallFramesUndefined: Self = StObject.set(x, "targetCallFrames", js.undefined)
  }
}
