package typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response of `GenerateDownloadUrl` method.
  */
@js.native
trait SchemaGenerateDownloadUrlResponse extends js.Object {
  
  /**
    * The generated Google Cloud Storage signed URL that should be used for
    * function source code download.
    */
  var downloadUrl: js.UndefOr[String] = js.native
}
object SchemaGenerateDownloadUrlResponse {
  
  @scala.inline
  def apply(): SchemaGenerateDownloadUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateDownloadUrlResponse]
  }
  
  @scala.inline
  implicit class SchemaGenerateDownloadUrlResponseOps[Self <: SchemaGenerateDownloadUrlResponse] (val x: Self) extends AnyVal {
    
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
    def setDownloadUrl(value: String): Self = this.set("downloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadUrl: Self = this.set("downloadUrl", js.undefined)
  }
}
