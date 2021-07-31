package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Security.SetOverrideCertificateErrorsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `170` extends StObject {
  
  var paramsType: js.Array[SetOverrideCertificateErrorsRequest]
  
  var returnType: Unit
}
object `170` {
  
  @scala.inline
  def apply(paramsType: js.Array[SetOverrideCertificateErrorsRequest], returnType: Unit): `170` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`170`]
  }
  
  @scala.inline
  implicit class `170MutableBuilder`[Self <: `170`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetOverrideCertificateErrorsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetOverrideCertificateErrorsRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
