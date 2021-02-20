package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceWorkerErrorMessage extends StObject {
  
  var columnNumber: integer = js.native
  
  var errorMessage: String = js.native
  
  var lineNumber: integer = js.native
  
  var registrationId: RegistrationID = js.native
  
  var sourceURL: String = js.native
  
  var versionId: String = js.native
}
object ServiceWorkerErrorMessage {
  
  @scala.inline
  def apply(
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
  implicit class ServiceWorkerErrorMessageMutableBuilder[Self <: ServiceWorkerErrorMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnNumber(value: integer): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumber(value: integer): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationId(value: RegistrationID): Self = StObject.set(x, "registrationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceURL(value: String): Self = StObject.set(x, "sourceURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
  }
}
