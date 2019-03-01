package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserComment extends js.Object {
  /** Integer Android SDK version of the user's device at the time the review was written, e.g. 23 is Marshmallow. May be absent. */
  var androidOsVersion: js.UndefOr[scala.Double] = js.undefined
  /** Integer version code of the app as installed at the time the review was written. May be absent. */
  var appVersionCode: js.UndefOr[scala.Double] = js.undefined
  /** String version name of the app as installed at the time the review was written. May be absent. */
  var appVersionName: js.UndefOr[java.lang.String] = js.undefined
  /** Codename for the reviewer's device, e.g. klte, flounder. May be absent. */
  var device: js.UndefOr[java.lang.String] = js.undefined
  /** Some information about the characteristics of the user's device */
  var deviceMetadata: js.UndefOr[DeviceMetadata] = js.undefined
  /** The last time at which this comment was updated. */
  var lastModified: js.UndefOr[Timestamp] = js.undefined
  /** Untranslated text of the review, in the case where the review has been translated. If the review has not been translated this is left blank. */
  var originalText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Language code for the reviewer. This is taken from the device settings so is not guaranteed to match the language the review is written in. May be
    * absent.
    */
  var reviewerLanguage: js.UndefOr[java.lang.String] = js.undefined
  /** The star rating associated with the review, from 1 to 5. */
  var starRating: js.UndefOr[scala.Double] = js.undefined
  /**
    * The content of the comment, i.e. review body. In some cases users have been able to write a review with separate title and body; in those cases the
    * title and body are concatenated and separated by a tab character.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Number of users who have given this review a thumbs down */
  var thumbsDownCount: js.UndefOr[scala.Double] = js.undefined
  /** Number of users who have given this review a thumbs up */
  var thumbsUpCount: js.UndefOr[scala.Double] = js.undefined
}

object UserComment {
  @scala.inline
  def apply(
    androidOsVersion: scala.Int | scala.Double = null,
    appVersionCode: scala.Int | scala.Double = null,
    appVersionName: java.lang.String = null,
    device: java.lang.String = null,
    deviceMetadata: DeviceMetadata = null,
    lastModified: Timestamp = null,
    originalText: java.lang.String = null,
    reviewerLanguage: java.lang.String = null,
    starRating: scala.Int | scala.Double = null,
    text: java.lang.String = null,
    thumbsDownCount: scala.Int | scala.Double = null,
    thumbsUpCount: scala.Int | scala.Double = null
  ): UserComment = {
    val __obj = js.Dynamic.literal()
    if (androidOsVersion != null) __obj.updateDynamic("androidOsVersion")(androidOsVersion.asInstanceOf[js.Any])
    if (appVersionCode != null) __obj.updateDynamic("appVersionCode")(appVersionCode.asInstanceOf[js.Any])
    if (appVersionName != null) __obj.updateDynamic("appVersionName")(appVersionName)
    if (device != null) __obj.updateDynamic("device")(device)
    if (deviceMetadata != null) __obj.updateDynamic("deviceMetadata")(deviceMetadata)
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified)
    if (originalText != null) __obj.updateDynamic("originalText")(originalText)
    if (reviewerLanguage != null) __obj.updateDynamic("reviewerLanguage")(reviewerLanguage)
    if (starRating != null) __obj.updateDynamic("starRating")(starRating.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (thumbsDownCount != null) __obj.updateDynamic("thumbsDownCount")(thumbsDownCount.asInstanceOf[js.Any])
    if (thumbsUpCount != null) __obj.updateDynamic("thumbsUpCount")(thumbsUpCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserComment]
  }
}

