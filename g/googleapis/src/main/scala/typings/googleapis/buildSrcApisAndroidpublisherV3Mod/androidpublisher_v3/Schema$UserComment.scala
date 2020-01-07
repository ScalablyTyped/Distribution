package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$UserComment extends js.Object {
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
  var deviceMetadata: js.UndefOr[Schema$DeviceMetadata] = js.native
  /**
    * The last time at which this comment was updated.
    */
  var lastModified: js.UndefOr[Schema$Timestamp] = js.native
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

object Schema$UserComment {
  @scala.inline
  def apply(
    androidOsVersion: Int | Double = null,
    appVersionCode: Int | Double = null,
    appVersionName: String = null,
    device: String = null,
    deviceMetadata: Schema$DeviceMetadata = null,
    lastModified: Schema$Timestamp = null,
    originalText: String = null,
    reviewerLanguage: String = null,
    starRating: Int | Double = null,
    text: String = null,
    thumbsDownCount: Int | Double = null,
    thumbsUpCount: Int | Double = null
  ): Schema$UserComment = {
    val __obj = js.Dynamic.literal()
    if (androidOsVersion != null) __obj.updateDynamic("androidOsVersion")(androidOsVersion.asInstanceOf[js.Any])
    if (appVersionCode != null) __obj.updateDynamic("appVersionCode")(appVersionCode.asInstanceOf[js.Any])
    if (appVersionName != null) __obj.updateDynamic("appVersionName")(appVersionName.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (deviceMetadata != null) __obj.updateDynamic("deviceMetadata")(deviceMetadata.asInstanceOf[js.Any])
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified.asInstanceOf[js.Any])
    if (originalText != null) __obj.updateDynamic("originalText")(originalText.asInstanceOf[js.Any])
    if (reviewerLanguage != null) __obj.updateDynamic("reviewerLanguage")(reviewerLanguage.asInstanceOf[js.Any])
    if (starRating != null) __obj.updateDynamic("starRating")(starRating.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (thumbsDownCount != null) __obj.updateDynamic("thumbsDownCount")(thumbsDownCount.asInstanceOf[js.Any])
    if (thumbsUpCount != null) __obj.updateDynamic("thumbsUpCount")(thumbsUpCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserComment]
  }
}

