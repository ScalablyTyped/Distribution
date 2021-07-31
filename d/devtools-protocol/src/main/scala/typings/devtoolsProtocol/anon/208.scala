package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.WebAuthn.AddCredentialRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `208` extends StObject {
  
  var paramsType: js.Array[AddCredentialRequest]
  
  var returnType: Unit
}
object `208` {
  
  @scala.inline
  def apply(paramsType: js.Array[AddCredentialRequest], returnType: Unit): `208` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`208`]
  }
  
  @scala.inline
  implicit class `208MutableBuilder`[Self <: `208`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[AddCredentialRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: AddCredentialRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
