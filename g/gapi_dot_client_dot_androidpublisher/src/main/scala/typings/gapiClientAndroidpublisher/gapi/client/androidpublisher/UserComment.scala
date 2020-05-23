package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserComment extends js.Object {
  /** Integer Android SDK version of the user's device at the time the review was written, e.g. 23 is Marshmallow. May be absent. */
  var androidOsVersion: js.UndefOr[Double] = js.undefined
  /** Integer version code of the app as installed at the time the review was written. May be absent. */
  var appVersionCode: js.UndefOr[Double] = js.undefined
  /** String version name of the app as installed at the time the review was written. May be absent. */
  var appVersionName: js.UndefOr[String] = js.undefined
  /** Codename for the reviewer's device, e.g. klte, flounder. May be absent. */
  var device: js.UndefOr[String] = js.undefined
  /** Some information about the characteristics of the user's device */
  var deviceMetadata: js.UndefOr[DeviceMetadata] = js.undefined
  /** The last time at which this comment was updated. */
  var lastModified: js.UndefOr[Timestamp] = js.undefined
  /** Untranslated text of the review, in the case where the review has been translated. If the review has not been translated this is left blank. */
  var originalText: js.UndefOr[String] = js.undefined
  /**
    * Language code for the reviewer. This is taken from the device settings so is not guaranteed to match the language the review is written in. May be
    * absent.
    */
  var reviewerLanguage: js.UndefOr[String] = js.undefined
  /** The star rating associated with the review, from 1 to 5. */
  var starRating: js.UndefOr[Double] = js.undefined
  /**
    * The content of the comment, i.e. review body. In some cases users have been able to write a review with separate title and body; in those cases the
    * title and body are concatenated and separated by a tab character.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Number of users who have given this review a thumbs down */
  var thumbsDownCount: js.UndefOr[Double] = js.undefined
  /** Number of users who have given this review a thumbs up */
  var thumbsUpCount: js.UndefOr[Double] = js.undefined
}

object UserComment {
  @scala.inline
  def apply(
    androidOsVersion: js.UndefOr[Double] = js.undefined,
    appVersionCode: js.UndefOr[Double] = js.undefined,
    appVersionName: String = null,
    device: String = null,
    deviceMetadata: DeviceMetadata = null,
    lastModified: Timestamp = null,
    originalText: String = null,
    reviewerLanguage: String = null,
    starRating: js.UndefOr[Double] = js.undefined,
    text: String = null,
    thumbsDownCount: js.UndefOr[Double] = js.undefined,
    thumbsUpCount: js.UndefOr[Double] = js.undefined
  ): UserComment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(androidOsVersion)) __obj.updateDynamic("androidOsVersion")(androidOsVersion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(appVersionCode)) __obj.updateDynamic("appVersionCode")(appVersionCode.get.asInstanceOf[js.Any])
    if (appVersionName != null) __obj.updateDynamic("appVersionName")(appVersionName.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (deviceMetadata != null) __obj.updateDynamic("deviceMetadata")(deviceMetadata.asInstanceOf[js.Any])
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified.asInstanceOf[js.Any])
    if (originalText != null) __obj.updateDynamic("originalText")(originalText.asInstanceOf[js.Any])
    if (reviewerLanguage != null) __obj.updateDynamic("reviewerLanguage")(reviewerLanguage.asInstanceOf[js.Any])
    if (!js.isUndefined(starRating)) __obj.updateDynamic("starRating")(starRating.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(thumbsDownCount)) __obj.updateDynamic("thumbsDownCount")(thumbsDownCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(thumbsUpCount)) __obj.updateDynamic("thumbsUpCount")(thumbsUpCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserComment]
  }
}

