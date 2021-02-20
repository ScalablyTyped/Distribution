package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.DeleteCookiesRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `112` extends StObject {
  
  var paramsType: js.Array[DeleteCookiesRequest] = js.native
  
  var returnType: Unit = js.native
}
object `112` {
  
  @scala.inline
  def apply(paramsType: js.Array[DeleteCookiesRequest], returnType: Unit): `112` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`112`]
  }
  
  @scala.inline
  implicit class `112MutableBuilder`[Self <: `112`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[DeleteCookiesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: DeleteCookiesRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
