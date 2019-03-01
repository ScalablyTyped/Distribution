package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Caption extends js.Object {
  /**
    * Indicates whether captions are available for the video.
    */
  var caption: java.lang.String
  /**
    * Specifies the ratings that the video received under various rating schemes.
    */
  var contentRating: Anon_AcbRating
  /**
    * Indicates whether the video is available in high definition (HD) or only in standard definition.
    */
  var definition: java.lang.String
  /**
    * Indicates whether the video is available in 3D or in 2D.
    */
  var dimension: java.lang.String
  /**
    * The length of the video. The tag value is an ISO 8601 duration in the format PT#M#S, in which the letters PT indicate that the value specifies a period of time, and the letters M and S refer to length in minutes and seconds, respectively. The # characters preceding the M and S letters are both integers that specify the number of minutes (or seconds) of the video.
    */
  var duration: java.lang.String
  /**
    * Indicates whether the video represents licensed content, which means that the content has been claimed by a YouTube content partner.
    */
  var licensedContent: scala.Boolean
  /**
    * The regionRestriction object contains information about the countries where a video is (or is not) viewable. The object will contain either the contentDetails.regionRestriction.allowed property or the contentDetails.regionRestriction.blocked property.
    */
  var regionRestriction: Anon_Allowed
}

object Anon_Caption {
  @scala.inline
  def apply(
    caption: java.lang.String,
    contentRating: Anon_AcbRating,
    definition: java.lang.String,
    dimension: java.lang.String,
    duration: java.lang.String,
    licensedContent: scala.Boolean,
    regionRestriction: Anon_Allowed
  ): Anon_Caption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("caption")(caption)
    __obj.updateDynamic("contentRating")(contentRating)
    __obj.updateDynamic("definition")(definition)
    __obj.updateDynamic("dimension")(dimension)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("licensedContent")(licensedContent)
    __obj.updateDynamic("regionRestriction")(regionRestriction)
    __obj.asInstanceOf[Anon_Caption]
  }
}

