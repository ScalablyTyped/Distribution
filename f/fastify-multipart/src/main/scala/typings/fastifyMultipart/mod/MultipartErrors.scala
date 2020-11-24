package typings.fastifyMultipart.mod

import typings.fastifyError.mod.FastifyError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipartErrors extends js.Object {
  
  var FieldsLimitError: FastifyError = js.native
  
  var FilesLimitError: FastifyError = js.native
  
  var InvalidMultipartContentTypeError: FastifyError = js.native
  
  var PartsLimitError: FastifyError = js.native
  
  var PrototypeViolationError: FastifyError = js.native
  
  var RequestFileTooLargeError: FastifyError = js.native
}
object MultipartErrors {
  
  @scala.inline
  def apply(
    FieldsLimitError: FastifyError,
    FilesLimitError: FastifyError,
    InvalidMultipartContentTypeError: FastifyError,
    PartsLimitError: FastifyError,
    PrototypeViolationError: FastifyError,
    RequestFileTooLargeError: FastifyError
  ): MultipartErrors = {
    val __obj = js.Dynamic.literal(FieldsLimitError = FieldsLimitError.asInstanceOf[js.Any], FilesLimitError = FilesLimitError.asInstanceOf[js.Any], InvalidMultipartContentTypeError = InvalidMultipartContentTypeError.asInstanceOf[js.Any], PartsLimitError = PartsLimitError.asInstanceOf[js.Any], PrototypeViolationError = PrototypeViolationError.asInstanceOf[js.Any], RequestFileTooLargeError = RequestFileTooLargeError.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipartErrors]
  }
  
  @scala.inline
  implicit class MultipartErrorsOps[Self <: MultipartErrors] (val x: Self) extends AnyVal {
    
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
    def setFieldsLimitError(value: FastifyError): Self = this.set("FieldsLimitError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesLimitError(value: FastifyError): Self = this.set("FilesLimitError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidMultipartContentTypeError(value: FastifyError): Self = this.set("InvalidMultipartContentTypeError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartsLimitError(value: FastifyError): Self = this.set("PartsLimitError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrototypeViolationError(value: FastifyError): Self = this.set("PrototypeViolationError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestFileTooLargeError(value: FastifyError): Self = this.set("RequestFileTooLargeError", value.asInstanceOf[js.Any])
  }
}
