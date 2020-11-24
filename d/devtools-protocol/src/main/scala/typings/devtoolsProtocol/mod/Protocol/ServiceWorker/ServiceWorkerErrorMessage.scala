package typings.devtoolsProtocol.mod.Protocol.ServiceWorker

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceWorkerErrorMessage extends js.Object {
  
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
  implicit class ServiceWorkerErrorMessageOps[Self <: ServiceWorkerErrorMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumnNumber(value: integer): Self = this.set("columnNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumber(value: integer): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationId(value: RegistrationID): Self = this.set("registrationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceURL(value: String): Self = this.set("sourceURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionId(value: String): Self = this.set("versionId", value.asInstanceOf[js.Any])
  }
}
