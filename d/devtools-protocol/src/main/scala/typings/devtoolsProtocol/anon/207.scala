package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.WebAuthn.RemoveVirtualAuthenticatorRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `207` extends StObject {
  
  var paramsType: js.Array[RemoveVirtualAuthenticatorRequest]
  
  var returnType: Unit
}
object `207` {
  
  @scala.inline
  def apply(paramsType: js.Array[RemoveVirtualAuthenticatorRequest], returnType: Unit): `207` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`207`]
  }
  
  @scala.inline
  implicit class `207MutableBuilder`[Self <: `207`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[RemoveVirtualAuthenticatorRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: RemoveVirtualAuthenticatorRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
