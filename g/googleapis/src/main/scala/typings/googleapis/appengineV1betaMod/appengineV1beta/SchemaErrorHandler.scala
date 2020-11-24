package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom static error page to be served when an error occurs.
  */
@js.native
trait SchemaErrorHandler extends js.Object {
  
  /**
    * Error condition this handler applies to.
    */
  var errorCode: js.UndefOr[String] = js.native
  
  /**
    * MIME type of file. Defaults to text/html.
    */
  var mimeType: js.UndefOr[String] = js.native
  
  /**
    * Static file content to be served for this error.
    */
  var staticFile: js.UndefOr[String] = js.native
}
object SchemaErrorHandler {
  
  @scala.inline
  def apply(): SchemaErrorHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorHandler]
  }
  
  @scala.inline
  implicit class SchemaErrorHandlerOps[Self <: SchemaErrorHandler] (val x: Self) extends AnyVal {
    
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
    def setErrorCode(value: String): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    
    @scala.inline
    def setStaticFile(value: String): Self = this.set("staticFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticFile: Self = this.set("staticFile", js.undefined)
  }
}
