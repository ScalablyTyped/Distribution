package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Security.HandleCertificateErrorRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `169` extends StObject {
  
  var paramsType: js.Array[HandleCertificateErrorRequest]
  
  var returnType: Unit
}
object `169` {
  
  @scala.inline
  def apply(paramsType: js.Array[HandleCertificateErrorRequest], returnType: Unit): `169` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`169`]
  }
  
  @scala.inline
  implicit class `169MutableBuilder`[Self <: `169`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[HandleCertificateErrorRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: HandleCertificateErrorRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
