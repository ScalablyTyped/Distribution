package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Embeddable extends StObject {
  
  /**
    * This value indicates whether the video can be embedded on another website.
    */
  var embeddable: Boolean = js.native
  
  /**
    * This value explains why a video failed to upload. This property is only present if the uploadStatus property indicates that the upload failed.
    */
  var failureReason: String = js.native
  
  /**
    * The videos license.
    */
  var license: String = js.native
  
  /**
    * The videos privacy status.
    */
  var privacyStatus: String = js.native
  
  /**
    * This value indicates whether the extended video statistics on the videos watch page are publicly viewable. By default, those statistics are viewable, and statistics like a videos viewcount and ratings will still be publicly visible even if this propertys value is set to false.
    */
  var publicStatsViewable: Boolean = js.native
  
  /**
    * This value explains why YouTube rejected an uploaded video. This property is only present if the uploadStatus property indicates that the upload was rejected.
    */
  var rejectionReason: String = js.native
  
  /**
    * The status of the uploaded video.
    */
  var uploadStatus: String = js.native
}
object Embeddable {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class EmbeddableMutableBuilder[Self <: Embeddable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmbeddable(value: Boolean): Self = StObject.set(x, "embeddable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacyStatus(value: String): Self = StObject.set(x, "privacyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicStatsViewable(value: Boolean): Self = StObject.set(x, "publicStatsViewable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectionReason(value: String): Self = StObject.set(x, "rejectionReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadStatus(value: String): Self = StObject.set(x, "uploadStatus", value.asInstanceOf[js.Any])
  }
}
