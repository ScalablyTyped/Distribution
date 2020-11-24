package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChunkedUploadResponse extends js.Object {
  
  /**
    * A 64-byte, Secure Hash Algorithm 256 (SHA256) checksum that the caller computes across the entirety of the original content that has been
    * uploaded to the chunked upload. DocuSign compares this value to its own computation. If the two values are not equal, the original
    * content and received content are not the same and the commit action is refused.
    */
  var checksum: js.UndefOr[String] = js.native
  
  /**
    * The id of the chunked upload.
    */
  var chunkedUploadId: js.UndefOr[String] = js.native
  
  /**
    * A list of the parts that compose the chunked upload, including their byte sizes. The list must be contiguous before you can commit the chunked upload.
    */
  var chunkedUploadParts: js.UndefOr[
    js.Array[
      /* An object that contains information about the chunked upload part. */ ChunkedUploadPart
    ]
  ] = js.native
  
  /**
    * The URI that you use to reference the chunked upload in other API requests, such as envelope document and envelope attachment requests.
    */
  var chunkedUploadUri: js.UndefOr[String] = js.native
  
  /**
    * When **true**, the chunked upload has been committed. A committed chunked upload can no longer receive any additional parts and is ready
    * for use within other API requests.
    */
  var committed: js.UndefOr[String] = js.native
  
  /**
    * The UTC time at which the chunked upload expires and is no longer addressable.
    *
    * **Note**: You must fully upload and use a chunked upload within 20 minutes of initializing it.
    *
    */
  var expirationDateTime: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of parts allowed for a chunked upload. This value is configurable per DocuSign environment, account, or integrator.
    * The default value is 128. The maximum possible value is 256.
    */
  var maxChunkedUploadParts: js.UndefOr[String] = js.native
  
  /**
    * The maximum total size allowed for a chunked upload. This value is configured per DocuSign environment, account, or integrator. The default value is 50 MB.
    */
  var maxTotalSize: js.UndefOr[String] = js.native
  
  /**
    * The total size of the parts of the chunked upload.
    *
    * **Note**: When a chunked upload is used as an envelope document, it is subject to the PDF size limit (25 MB) and page count limit that apply to all envelope documents.
    */
  var totalSize: js.UndefOr[String] = js.native
}
object ChunkedUploadResponse {
  
  @scala.inline
  def apply(): ChunkedUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkedUploadResponse]
  }
  
  @scala.inline
  implicit class ChunkedUploadResponseOps[Self <: ChunkedUploadResponse] (val x: Self) extends AnyVal {
    
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
    def setChecksum(value: String): Self = this.set("checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecksum: Self = this.set("checksum", js.undefined)
    
    @scala.inline
    def setChunkedUploadId(value: String): Self = this.set("chunkedUploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkedUploadId: Self = this.set("chunkedUploadId", js.undefined)
    
    @scala.inline
    def setChunkedUploadPartsVarargs(
      value: (/* An object that contains information about the chunked upload part. */ ChunkedUploadPart)*
    ): Self = this.set("chunkedUploadParts", js.Array(value :_*))
    
    @scala.inline
    def setChunkedUploadParts(
      value: js.Array[
          /* An object that contains information about the chunked upload part. */ ChunkedUploadPart
        ]
    ): Self = this.set("chunkedUploadParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkedUploadParts: Self = this.set("chunkedUploadParts", js.undefined)
    
    @scala.inline
    def setChunkedUploadUri(value: String): Self = this.set("chunkedUploadUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkedUploadUri: Self = this.set("chunkedUploadUri", js.undefined)
    
    @scala.inline
    def setCommitted(value: String): Self = this.set("committed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitted: Self = this.set("committed", js.undefined)
    
    @scala.inline
    def setExpirationDateTime(value: String): Self = this.set("expirationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationDateTime: Self = this.set("expirationDateTime", js.undefined)
    
    @scala.inline
    def setMaxChunkedUploadParts(value: String): Self = this.set("maxChunkedUploadParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxChunkedUploadParts: Self = this.set("maxChunkedUploadParts", js.undefined)
    
    @scala.inline
    def setMaxTotalSize(value: String): Self = this.set("maxTotalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTotalSize: Self = this.set("maxTotalSize", js.undefined)
    
    @scala.inline
    def setTotalSize(value: String): Self = this.set("totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalSize: Self = this.set("totalSize", js.undefined)
  }
}
