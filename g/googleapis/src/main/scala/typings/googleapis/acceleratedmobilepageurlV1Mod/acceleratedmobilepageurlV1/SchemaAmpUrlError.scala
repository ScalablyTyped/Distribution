package typings.googleapis.acceleratedmobilepageurlV1Mod.acceleratedmobilepageurlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AMP URL Error resource for a requested URL that couldn&#39;t be found.
  */
@js.native
trait SchemaAmpUrlError extends js.Object {
  
  /**
    * The error code of an API call.
    */
  var errorCode: js.UndefOr[String] = js.native
  
  /**
    * An optional descriptive error message.
    */
  var errorMessage: js.UndefOr[String] = js.native
  
  /**
    * The original non-AMP URL.
    */
  var originalUrl: js.UndefOr[String] = js.native
}
object SchemaAmpUrlError {
  
  @scala.inline
  def apply(): SchemaAmpUrlError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAmpUrlError]
  }
  
  @scala.inline
  implicit class SchemaAmpUrlErrorOps[Self <: SchemaAmpUrlError] (val x: Self) extends AnyVal {
    
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
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setOriginalUrl(value: String): Self = this.set("originalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalUrl: Self = this.set("originalUrl", js.undefined)
  }
}
