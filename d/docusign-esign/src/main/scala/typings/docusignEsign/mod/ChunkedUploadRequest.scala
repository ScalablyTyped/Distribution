package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChunkedUploadRequest extends js.Object {
  
  /**
    * The id of the chunked upload.
    *
    * **Note**: This property is ignored in requests, and overridden with an auto-generated value in responses.
    */
  var chunkedUploadId: js.UndefOr[String] = js.native
  
  /**
    * A Base64-encoded representation of the content hat is used to upload the file.
    *
    * Maximum size: 50 MB. However, data is also subject to REST API limits regarding request sizes, and Internet Information Systems
    * (IIS) might place further constraints on file size.
    */
  var data: js.UndefOr[String] = js.native
}
object ChunkedUploadRequest {
  
  @scala.inline
  def apply(): ChunkedUploadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkedUploadRequest]
  }
  
  @scala.inline
  implicit class ChunkedUploadRequestOps[Self <: ChunkedUploadRequest] (val x: Self) extends AnyVal {
    
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
    def setChunkedUploadId(value: String): Self = this.set("chunkedUploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkedUploadId: Self = this.set("chunkedUploadId", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
}
