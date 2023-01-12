package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstallabilityErrorsResponse extends StObject {
  
  var installabilityErrors: js.Array[InstallabilityError]
}
object GetInstallabilityErrorsResponse {
  
  inline def apply(installabilityErrors: js.Array[InstallabilityError]): GetInstallabilityErrorsResponse = {
    val __obj = js.Dynamic.literal(installabilityErrors = installabilityErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstallabilityErrorsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInstallabilityErrorsResponse] (val x: Self) extends AnyVal {
    
    inline def setInstallabilityErrors(value: js.Array[InstallabilityError]): Self = StObject.set(x, "installabilityErrors", value.asInstanceOf[js.Any])
    
    inline def setInstallabilityErrorsVarargs(value: InstallabilityError*): Self = StObject.set(x, "installabilityErrors", js.Array(value*))
  }
}
