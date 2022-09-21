package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedBackendUploadMetadata extends StObject {
  
  /**
    * Blobstore path for the uploaded attachment
    */
  var blobPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The original file name for the content, not the full path.
    */
  var contentName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Scotty reported content size by default. http://google3/uploader/agent/scotty_agent.proto?l=101&rcl=140889785
    */
  var contentSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type is from Scotty's best_guess by default: http://google3/uploader/agent/scotty_agent.proto?l=51&rcl=140889785
    */
  var contentType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The results of the Data Loss Prevention (DLP) scan of the attachment. DEPRECATED: use dlp_scan_summary instead.
    */
  var dlpScanOutcome: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Summary of a Data Loss Prevention (DLP) scan of the attachment. Attachments are evaluated in the backend when they are uploaded.
    */
  var dlpScanSummary: js.UndefOr[SchemaDlpScanSummary] = js.undefined
  
  /**
    * GroupId to which this attachment is uploaded.
    */
  var groupId: js.UndefOr[SchemaGroupId] = js.undefined
  
  /**
    * Original dimension of the content. Only set for image attachments.
    */
  var originalDimension: js.UndefOr[SchemaAppsDynamiteSharedDimension] = js.undefined
  
  /**
    * The message id of a quote reply referencing this attachment. When present, this attachment has been quoted in a reply message. Normally, the attachment is fetched through the message id in the blob_path, but in the case of a quote reply, the blob_path would contain the quoted message id. Thus this message id field is needed to fetch the quote reply message instead. This field is conditionally populated at read time for quotes and never persisted in storage. See go/message-quoting-attachments for more context.
    */
  var quoteReplyMessageId: js.UndefOr[SchemaMessageId] = js.undefined
  
  /**
    * The SHA256 hash of the attachment bytes.
    */
  var sha256: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User IP address at upload time. Ex. "123.1.2.3". Used by Ares abuse scanning.
    */
  var uploadIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Timestamp of when user finished uploading the content.
    */
  var uploadTimestampUsec: js.UndefOr[String | Null] = js.undefined
  
  /**
    * VideoID of the video attachments. This ID shall meets the Youtube ID format of 16 hex characters. For example, '4c14b8825af6059b' is a valid ID.
    */
  var videoId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Full Blobstore ID for the video thumbnail.
    */
  var videoThumbnailBlobId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Result for a virus scan.
    */
  var virusScanResult: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedBackendUploadMetadata {
  
  inline def apply(): SchemaAppsDynamiteSharedBackendUploadMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedBackendUploadMetadata]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedBackendUploadMetadata](x: Self) {
    
    inline def setBlobPath(value: String): Self = StObject.set(x, "blobPath", value.asInstanceOf[js.Any])
    
    inline def setBlobPathNull: Self = StObject.set(x, "blobPath", null)
    
    inline def setBlobPathUndefined: Self = StObject.set(x, "blobPath", js.undefined)
    
    inline def setContentName(value: String): Self = StObject.set(x, "contentName", value.asInstanceOf[js.Any])
    
    inline def setContentNameNull: Self = StObject.set(x, "contentName", null)
    
    inline def setContentNameUndefined: Self = StObject.set(x, "contentName", js.undefined)
    
    inline def setContentSize(value: String): Self = StObject.set(x, "contentSize", value.asInstanceOf[js.Any])
    
    inline def setContentSizeNull: Self = StObject.set(x, "contentSize", null)
    
    inline def setContentSizeUndefined: Self = StObject.set(x, "contentSize", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setDlpScanOutcome(value: String): Self = StObject.set(x, "dlpScanOutcome", value.asInstanceOf[js.Any])
    
    inline def setDlpScanOutcomeNull: Self = StObject.set(x, "dlpScanOutcome", null)
    
    inline def setDlpScanOutcomeUndefined: Self = StObject.set(x, "dlpScanOutcome", js.undefined)
    
    inline def setDlpScanSummary(value: SchemaDlpScanSummary): Self = StObject.set(x, "dlpScanSummary", value.asInstanceOf[js.Any])
    
    inline def setDlpScanSummaryUndefined: Self = StObject.set(x, "dlpScanSummary", js.undefined)
    
    inline def setGroupId(value: SchemaGroupId): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setOriginalDimension(value: SchemaAppsDynamiteSharedDimension): Self = StObject.set(x, "originalDimension", value.asInstanceOf[js.Any])
    
    inline def setOriginalDimensionUndefined: Self = StObject.set(x, "originalDimension", js.undefined)
    
    inline def setQuoteReplyMessageId(value: SchemaMessageId): Self = StObject.set(x, "quoteReplyMessageId", value.asInstanceOf[js.Any])
    
    inline def setQuoteReplyMessageIdUndefined: Self = StObject.set(x, "quoteReplyMessageId", js.undefined)
    
    inline def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSha256Null: Self = StObject.set(x, "sha256", null)
    
    inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
    
    inline def setUploadIp(value: String): Self = StObject.set(x, "uploadIp", value.asInstanceOf[js.Any])
    
    inline def setUploadIpNull: Self = StObject.set(x, "uploadIp", null)
    
    inline def setUploadIpUndefined: Self = StObject.set(x, "uploadIp", js.undefined)
    
    inline def setUploadTimestampUsec(value: String): Self = StObject.set(x, "uploadTimestampUsec", value.asInstanceOf[js.Any])
    
    inline def setUploadTimestampUsecNull: Self = StObject.set(x, "uploadTimestampUsec", null)
    
    inline def setUploadTimestampUsecUndefined: Self = StObject.set(x, "uploadTimestampUsec", js.undefined)
    
    inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    inline def setVideoIdNull: Self = StObject.set(x, "videoId", null)
    
    inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
    
    inline def setVideoThumbnailBlobId(value: String): Self = StObject.set(x, "videoThumbnailBlobId", value.asInstanceOf[js.Any])
    
    inline def setVideoThumbnailBlobIdNull: Self = StObject.set(x, "videoThumbnailBlobId", null)
    
    inline def setVideoThumbnailBlobIdUndefined: Self = StObject.set(x, "videoThumbnailBlobId", js.undefined)
    
    inline def setVirusScanResult(value: String): Self = StObject.set(x, "virusScanResult", value.asInstanceOf[js.Any])
    
    inline def setVirusScanResultNull: Self = StObject.set(x, "virusScanResult", null)
    
    inline def setVirusScanResultUndefined: Self = StObject.set(x, "virusScanResult", js.undefined)
  }
}
