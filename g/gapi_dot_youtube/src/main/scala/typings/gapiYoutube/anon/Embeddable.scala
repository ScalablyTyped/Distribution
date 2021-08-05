package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Embeddable extends StObject {
  
  /**
    * This value indicates whether the video can be embedded on another website.
    */
  var embeddable: Boolean
  
  /**
    * This value explains why a video failed to upload. This property is only present if the uploadStatus property indicates that the upload failed.
    */
  var failureReason: String
  
  /**
    * The videos license.
    */
  var license: String
  
  /**
    * The videos privacy status.
    */
  var privacyStatus: String
  
  /**
    * This value indicates whether the extended video statistics on the videos watch page are publicly viewable. By default, those statistics are viewable, and statistics like a videos viewcount and ratings will still be publicly visible even if this propertys value is set to false.
    */
  var publicStatsViewable: Boolean
  
  /**
    * This value explains why YouTube rejected an uploaded video. This property is only present if the uploadStatus property indicates that the upload was rejected.
    */
  var rejectionReason: String
  
  /**
    * The status of the uploaded video.
    */
  var uploadStatus: String
}
object Embeddable {
  
  inline def apply(
    embeddable: Boolean,
    failureReason: String,
    license: String,
    privacyStatus: String,
    publicStatsViewable: Boolean,
    rejectionReason: String,
    uploadStatus: String
  ): Embeddable = {
    val __obj = js.Dynamic.literal(embeddable = embeddable.asInstanceOf[js.Any], failureReason = failureReason.asInstanceOf[js.Any], license = license.asInstanceOf[js.Any], privacyStatus = privacyStatus.asInstanceOf[js.Any], publicStatsViewable = publicStatsViewable.asInstanceOf[js.Any], rejectionReason = rejectionReason.asInstanceOf[js.Any], uploadStatus = uploadStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Embeddable]
  }
  
  extension [Self <: Embeddable](x: Self) {
    
    inline def setEmbeddable(value: Boolean): Self = StObject.set(x, "embeddable", value.asInstanceOf[js.Any])
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setPrivacyStatus(value: String): Self = StObject.set(x, "privacyStatus", value.asInstanceOf[js.Any])
    
    inline def setPublicStatsViewable(value: Boolean): Self = StObject.set(x, "publicStatsViewable", value.asInstanceOf[js.Any])
    
    inline def setRejectionReason(value: String): Self = StObject.set(x, "rejectionReason", value.asInstanceOf[js.Any])
    
    inline def setUploadStatus(value: String): Self = StObject.set(x, "uploadStatus", value.asInstanceOf[js.Any])
  }
}
