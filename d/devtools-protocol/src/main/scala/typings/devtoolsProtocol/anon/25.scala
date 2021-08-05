package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Animation.SeekAnimationsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25` extends StObject {
  
  var paramsType: js.Array[SeekAnimationsRequest]
  
  var returnType: Unit
}
object `25` {
  
  inline def apply(paramsType: js.Array[SeekAnimationsRequest], returnType: Unit): `25` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`25`]
  }
  
  extension [Self <: `25`](x: Self) {
    
    inline def setParamsType(value: js.Array[SeekAnimationsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SeekAnimationsRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
