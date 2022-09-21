package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.ScriptId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetBlackboxedRangesRequest extends StObject {
  
  var positions: js.Array[ScriptPosition]
  
  /**
    * Id of the script.
    */
  var scriptId: ScriptId
}
object SetBlackboxedRangesRequest {
  
  inline def apply(positions: js.Array[ScriptPosition], scriptId: ScriptId): SetBlackboxedRangesRequest = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBlackboxedRangesRequest]
  }
  
  extension [Self <: SetBlackboxedRangesRequest](x: Self) {
    
    inline def setPositions(value: js.Array[ScriptPosition]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    inline def setPositionsVarargs(value: ScriptPosition*): Self = StObject.set(x, "positions", js.Array(value*))
    
    inline def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
  }
}
