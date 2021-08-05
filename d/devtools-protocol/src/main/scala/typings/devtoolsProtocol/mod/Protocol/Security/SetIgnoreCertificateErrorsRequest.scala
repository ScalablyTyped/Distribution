package typings.devtoolsProtocol.mod.Protocol.Security

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetIgnoreCertificateErrorsRequest extends StObject {
  
  /**
    * If true, all certificate errors will be ignored.
    */
  var ignore: Boolean
}
object SetIgnoreCertificateErrorsRequest {
  
  inline def apply(ignore: Boolean): SetIgnoreCertificateErrorsRequest = {
    val __obj = js.Dynamic.literal(ignore = ignore.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIgnoreCertificateErrorsRequest]
  }
  
  extension [Self <: SetIgnoreCertificateErrorsRequest](x: Self) {
    
    inline def setIgnore(value: Boolean): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
  }
}
