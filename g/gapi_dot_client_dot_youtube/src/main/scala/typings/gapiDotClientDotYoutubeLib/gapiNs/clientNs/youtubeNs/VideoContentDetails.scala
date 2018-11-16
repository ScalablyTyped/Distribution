package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VideoContentDetails extends js.Object {
  /** The value of captions indicates whether the video has captions or not. */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the ratings that the video received under various rating schemes. */
  var contentRating: js.UndefOr[ContentRating] = js.undefined
  /** The countryRestriction object contains information about the countries where a video is (or is not) viewable. */
  var countryRestriction: js.UndefOr[AccessPolicy] = js.undefined
  /** The value of definition indicates whether the video is available in high definition or only in standard definition. */
  var definition: js.UndefOr[java.lang.String] = js.undefined
  /** The value of dimension indicates whether the video is available in 3D or in 2D. */
  var dimension: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The length of the video. The tag value is an ISO 8601 duration in the format PT#M#S, in which the letters PT indicate that the value specifies a period
               * of time, and the letters M and S refer to length in minutes and seconds, respectively. The # characters preceding the M and S letters are both integers
               * that specify the number of minutes (or seconds) of the video. For example, a value of PT15M51S indicates that the video is 15 minutes and 51 seconds
               * long.
               */
  var duration: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether the video uploader has provided a custom thumbnail image for the video. This property is only visible to the video uploader. */
  var hasCustomThumbnail: js.UndefOr[scala.Boolean] = js.undefined
  /** The value of is_license_content indicates whether the video is licensed content. */
  var licensedContent: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the projection format of the video. */
  var projection: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The regionRestriction object contains information about the countries where a video is (or is not) viewable. The object will contain either the
               * contentDetails.regionRestriction.allowed property or the contentDetails.regionRestriction.blocked property.
               */
  var regionRestriction: js.UndefOr[VideoContentDetailsRegionRestriction] = js.undefined
}

