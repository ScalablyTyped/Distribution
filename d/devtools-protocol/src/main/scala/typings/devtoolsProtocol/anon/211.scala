package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.GetCookiesRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.GetCookiesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `211` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[GetCookiesRequest]]
  
  var returnType: GetCookiesResponse
}
object `211` {
  
  inline def apply(paramsType: js.Array[js.UndefOr[GetCookiesRequest]], returnType: GetCookiesResponse): `211` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`211`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `211`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[js.UndefOr[GetCookiesRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[GetCookiesRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetCookiesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
