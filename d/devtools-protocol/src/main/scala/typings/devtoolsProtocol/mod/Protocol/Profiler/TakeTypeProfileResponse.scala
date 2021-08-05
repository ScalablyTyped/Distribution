package typings.devtoolsProtocol.mod.Protocol.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TakeTypeProfileResponse extends StObject {
  
  /**
    * Type profile for all scripts since startTypeProfile() was turned on.
    */
  var result: js.Array[ScriptTypeProfile]
}
object TakeTypeProfileResponse {
  
  inline def apply(result: js.Array[ScriptTypeProfile]): TakeTypeProfileResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[TakeTypeProfileResponse]
  }
  
  extension [Self <: TakeTypeProfileResponse](x: Self) {
    
    inline def setResult(value: js.Array[ScriptTypeProfile]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultVarargs(value: ScriptTypeProfile*): Self = StObject.set(x, "result", js.Array(value :_*))
  }
}
