package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.ReloadRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `145` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[ReloadRequest]]
  
  var returnType: Unit
}
object `145` {
  
  inline def apply(paramsType: js.Array[js.UndefOr[ReloadRequest]], returnType: Unit): `145` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`145`]
  }
  
  extension [Self <: `145`](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[ReloadRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[ReloadRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
