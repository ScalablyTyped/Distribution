package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Emulation.SetLocaleOverrideRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `89` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[SetLocaleOverrideRequest]]
  
  var returnType: Unit
}
object `89` {
  
  inline def apply(paramsType: js.Array[js.UndefOr[SetLocaleOverrideRequest]], returnType: Unit): `89` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`89`]
  }
  
  extension [Self <: `89`](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[SetLocaleOverrideRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[SetLocaleOverrideRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
