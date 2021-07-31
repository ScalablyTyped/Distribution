package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Security.SetIgnoreCertificateErrorsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `168` extends StObject {
  
  var paramsType: js.Array[SetIgnoreCertificateErrorsRequest]
  
  var returnType: Unit
}
object `168` {
  
  @scala.inline
  def apply(paramsType: js.Array[SetIgnoreCertificateErrorsRequest], returnType: Unit): `168` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`168`]
  }
  
  @scala.inline
  implicit class `168MutableBuilder`[Self <: `168`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetIgnoreCertificateErrorsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetIgnoreCertificateErrorsRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
