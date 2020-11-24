package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Caption extends js.Object {
  
  /**
    * Indicates whether captions are available for the video.
    */
  var caption: String = js.native
  
  /**
    * Specifies the ratings that the video received under various rating schemes.
    */
  var contentRating: AcbRating = js.native
  
  /**
    * Indicates whether the video is available in high definition (HD) or only in standard definition.
    */
  var definition: String = js.native
  
  /**
    * Indicates whether the video is available in 3D or in 2D.
    */
  var dimension: String = js.native
  
  /**
    * The length of the video. The tag value is an ISO 8601 duration in the format PT#M#S, in which the letters PT indicate that the value specifies a period of time, and the letters M and S refer to length in minutes and seconds, respectively. The # characters preceding the M and S letters are both integers that specify the number of minutes (or seconds) of the video.
    */
  var duration: String = js.native
  
  /**
    * Indicates whether the video represents licensed content, which means that the content has been claimed by a YouTube content partner.
    */
  var licensedContent: Boolean = js.native
  
  /**
    * The regionRestriction object contains information about the countries where a video is (or is not) viewable. The object will contain either the contentDetails.regionRestriction.allowed property or the contentDetails.regionRestriction.blocked property.
    */
  var regionRestriction: Allowed = js.native
}
object Caption {
  
  @scala.inline
  def apply(
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
  implicit class CaptionOps[Self <: Caption] (val x: Self) extends AnyVal {
    
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
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentRating(value: AcbRating): Self = this.set("contentRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinition(value: String): Self = this.set("definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimension(value: String): Self = this.set("dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicensedContent(value: Boolean): Self = this.set("licensedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionRestriction(value: Allowed): Self = this.set("regionRestriction", value.asInstanceOf[js.Any])
  }
}
