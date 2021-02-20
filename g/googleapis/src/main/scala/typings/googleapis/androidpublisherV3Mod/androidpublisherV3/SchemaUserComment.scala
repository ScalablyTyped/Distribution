package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaUserComment extends StObject {
  
  /**
    * Integer Android SDK version of the user&#39;s device at the time the
    * review was written, e.g. 23 is Marshmallow. May be absent.
    */
  var androidOsVersion: js.UndefOr[Double] = js.native
  
  /**
    * Integer version code of the app as installed at the time the review was
    * written. May be absent.
    */
  var appVersionCode: js.UndefOr[Double] = js.native
  
  /**
    * String version name of the app as installed at the time the review was
    * written. May be absent.
    */
  var appVersionName: js.UndefOr[String] = js.native
  
  /**
    * Codename for the reviewer&#39;s device, e.g. klte, flounder. May be
    * absent.
    */
  var device: js.UndefOr[String] = js.native
  
  /**
    * Some information about the characteristics of the user&#39;s device
    */
  var deviceMetadata: js.UndefOr[SchemaDeviceMetadata] = js.native
  
  /**
    * The last time at which this comment was updated.
    */
  var lastModified: js.UndefOr[SchemaTimestamp] = js.native
  
  /**
    * Untranslated text of the review, in the case where the review has been
    * translated. If the review has not been translated this is left blank.
    */
  var originalText: js.UndefOr[String] = js.native
  
  /**
    * Language code for the reviewer. This is taken from the device settings so
    * is not guaranteed to match the language the review is written in. May be
    * absent.
    */
  var reviewerLanguage: js.UndefOr[String] = js.native
  
  /**
    * The star rating associated with the review, from 1 to 5.
    */
  var starRating: js.UndefOr[Double] = js.native
  
  /**
    * The content of the comment, i.e. review body. In some cases users have
    * been able to write a review with separate title and body; in those cases
    * the title and body are concatenated and separated by a tab character.
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * Number of users who have given this review a thumbs down
    */
  var thumbsDownCount: js.UndefOr[Double] = js.native
  
  /**
    * Number of users who have given this review a thumbs up
    */
  var thumbsUpCount: js.UndefOr[Double] = js.native
}
object SchemaUserComment {
  
  @scala.inline
  def apply(): SchemaUserComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserComment]
  }
  
  @scala.inline
  implicit class SchemaUserCommentMutableBuilder[Self <: SchemaUserComment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidOsVersion(value: Double): Self = StObject.set(x, "androidOsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidOsVersionUndefined: Self = StObject.set(x, "androidOsVersion", js.undefined)
    
    @scala.inline
    def setAppVersionCode(value: Double): Self = StObject.set(x, "appVersionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppVersionCodeUndefined: Self = StObject.set(x, "appVersionCode", js.undefined)
    
    @scala.inline
    def setAppVersionName(value: String): Self = StObject.set(x, "appVersionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppVersionNameUndefined: Self = StObject.set(x, "appVersionName", js.undefined)
    
    @scala.inline
    def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceMetadata(value: SchemaDeviceMetadata): Self = StObject.set(x, "deviceMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceMetadataUndefined: Self = StObject.set(x, "deviceMetadata", js.undefined)
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    @scala.inline
    def setLastModified(value: SchemaTimestamp): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    @scala.inline
    def setOriginalText(value: String): Self = StObject.set(x, "originalText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalTextUndefined: Self = StObject.set(x, "originalText", js.undefined)
    
    @scala.inline
    def setReviewerLanguage(value: String): Self = StObject.set(x, "reviewerLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewerLanguageUndefined: Self = StObject.set(x, "reviewerLanguage", js.undefined)
    
    @scala.inline
    def setStarRating(value: Double): Self = StObject.set(x, "starRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarRatingUndefined: Self = StObject.set(x, "starRating", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setThumbsDownCount(value: Double): Self = StObject.set(x, "thumbsDownCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbsDownCountUndefined: Self = StObject.set(x, "thumbsDownCount", js.undefined)
    
    @scala.inline
    def setThumbsUpCount(value: Double): Self = StObject.set(x, "thumbsUpCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbsUpCountUndefined: Self = StObject.set(x, "thumbsUpCount", js.undefined)
  }
}
