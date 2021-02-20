package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.ContinueInterceptedRequestRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `111` extends StObject {
  
  var paramsType: js.Array[ContinueInterceptedRequestRequest] = js.native
  
  var returnType: Unit = js.native
}
object `111` {
  
  @scala.inline
  def apply(paramsType: js.Array[ContinueInterceptedRequestRequest], returnType: Unit): `111` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`111`]
  }
  
  @scala.inline
  implicit class `111MutableBuilder`[Self <: `111`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[ContinueInterceptedRequestRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: ContinueInterceptedRequestRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
