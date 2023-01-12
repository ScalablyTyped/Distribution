package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceWorkerErrorMessage extends StObject {
  
  var columnNumber: integer
  
  var errorMessage: String
  
  var lineNumber: integer
  
  var registrationId: RegistrationID
  
  var sourceURL: String
  
  var versionId: String
}
object ServiceWorkerErrorMessage {
  
  inline def apply(
    columnNumber: integer,
    errorMessage: String,
    lineNumber: integer,
    registrationId: RegistrationID,
    sourceURL: String,
    versionId: String
  ): ServiceWorkerErrorMessage = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], registrationId = registrationId.asInstanceOf[js.Any], sourceURL = sourceURL.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerErrorMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceWorkerErrorMessage] (val x: Self) extends AnyVal {
    
    inline def setColumnNumber(value: integer): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setLineNumber(value: integer): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setRegistrationId(value: RegistrationID): Self = StObject.set(x, "registrationId", value.asInstanceOf[js.Any])
    
    inline def setSourceURL(value: String): Self = StObject.set(x, "sourceURL", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
  }
}
