package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUserComment extends js.Object {
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
  implicit class SchemaUserCommentOps[Self <: SchemaUserComment] (val x: Self) extends AnyVal {
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
    def setAndroidOsVersion(value: Double): Self = this.set("androidOsVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidOsVersion: Self = this.set("androidOsVersion", js.undefined)
    @scala.inline
    def setAppVersionCode(value: Double): Self = this.set("appVersionCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppVersionCode: Self = this.set("appVersionCode", js.undefined)
    @scala.inline
    def setAppVersionName(value: String): Self = this.set("appVersionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppVersionName: Self = this.set("appVersionName", js.undefined)
    @scala.inline
    def setDevice(value: String): Self = this.set("device", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    @scala.inline
    def setDeviceMetadata(value: SchemaDeviceMetadata): Self = this.set("deviceMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceMetadata: Self = this.set("deviceMetadata", js.undefined)
    @scala.inline
    def setLastModified(value: SchemaTimestamp): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("lastModified", js.undefined)
    @scala.inline
    def setOriginalText(value: String): Self = this.set("originalText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalText: Self = this.set("originalText", js.undefined)
    @scala.inline
    def setReviewerLanguage(value: String): Self = this.set("reviewerLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReviewerLanguage: Self = this.set("reviewerLanguage", js.undefined)
    @scala.inline
    def setStarRating(value: Double): Self = this.set("starRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStarRating: Self = this.set("starRating", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setThumbsDownCount(value: Double): Self = this.set("thumbsDownCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbsDownCount: Self = this.set("thumbsDownCount", js.undefined)
    @scala.inline
    def setThumbsUpCount(value: Double): Self = this.set("thumbsUpCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbsUpCount: Self = this.set("thumbsUpCount", js.undefined)
  }
  
}

