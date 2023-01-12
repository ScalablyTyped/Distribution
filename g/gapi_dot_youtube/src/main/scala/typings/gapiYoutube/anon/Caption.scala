package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Caption extends StObject {
  
  /**
    * Indicates whether captions are available for the video.
    */
  var caption: String
  
  /**
    * Specifies the ratings that the video received under various rating schemes.
    */
  var contentRating: AcbRating
  
  /**
    * Indicates whether the video is available in high definition (HD) or only in standard definition.
    */
  var definition: String
  
  /**
    * Indicates whether the video is available in 3D or in 2D.
    */
  var dimension: String
  
  /**
    * The length of the video. The tag value is an ISO 8601 duration in the format PT#M#S, in which the letters PT indicate that the value specifies a period of time, and the letters M and S refer to length in minutes and seconds, respectively. The # characters preceding the M and S letters are both integers that specify the number of minutes (or seconds) of the video.
    */
  var duration: String
  
  /**
    * Indicates whether the video represents licensed content, which means that the content has been claimed by a YouTube content partner.
    */
  var licensedContent: Boolean
  
  /**
    * The regionRestriction object contains information about the countries where a video is (or is not) viewable. The object will contain either the contentDetails.regionRestriction.allowed property or the contentDetails.regionRestriction.blocked property.
    */
  var regionRestriction: Allowed
}
object Caption {
  
  inline def apply(
    caption: String,
    contentRating: AcbRating,
    definition: String,
    dimension: String,
    duration: String,
    licensedContent: Boolean,
    regionRestriction: Allowed
  ): Caption = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], contentRating = contentRating.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], dimension = dimension.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], licensedContent = licensedContent.asInstanceOf[js.Any], regionRestriction = regionRestriction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Caption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Caption] (val x: Self) extends AnyVal {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setContentRating(value: AcbRating): Self = StObject.set(x, "contentRating", value.asInstanceOf[js.Any])
    
    inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setLicensedContent(value: Boolean): Self = StObject.set(x, "licensedContent", value.asInstanceOf[js.Any])
    
    inline def setRegionRestriction(value: Allowed): Self = StObject.set(x, "regionRestriction", value.asInstanceOf[js.Any])
  }
}
