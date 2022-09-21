package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Target.DetachFromTargetRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `219` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[DetachFromTargetRequest]]
  
  var returnType: Unit
}
object `219` {
  
  inline def apply(paramsType: js.Array[js.UndefOr[DetachFromTargetRequest]], returnType: Unit): `219` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`219`]
  }
  
  extension [Self <: `219`](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[DetachFromTargetRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[DetachFromTargetRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
