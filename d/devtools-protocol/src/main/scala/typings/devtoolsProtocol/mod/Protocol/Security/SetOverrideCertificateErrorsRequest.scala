package typings.devtoolsProtocol.mod.Protocol.Security

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetOverrideCertificateErrorsRequest extends StObject {
  
  /**
    * If true, certificate errors will be overridden.
    */
  var `override`: Boolean
}
object SetOverrideCertificateErrorsRequest {
  
  inline def apply(`override`: Boolean): SetOverrideCertificateErrorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOverrideCertificateErrorsRequest]
  }
  
  extension [Self <: SetOverrideCertificateErrorsRequest](x: Self) {
    
    inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
  }
}
