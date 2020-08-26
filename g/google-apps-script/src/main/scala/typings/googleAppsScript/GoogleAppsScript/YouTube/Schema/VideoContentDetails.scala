package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoContentDetails extends js.Object {
  var caption: js.UndefOr[String] = js.native
  var contentRating: js.UndefOr[ContentRating] = js.native
  var countryRestriction: js.UndefOr[AccessPolicy] = js.native
  var definition: js.UndefOr[String] = js.native
  var dimension: js.UndefOr[String] = js.native
  var duration: js.UndefOr[String] = js.native
  var hasCustomThumbnail: js.UndefOr[Boolean] = js.native
  var licensedContent: js.UndefOr[Boolean] = js.native
  var projection: js.UndefOr[String] = js.native
  var regionRestriction: js.UndefOr[VideoContentDetailsRegionRestriction] = js.native
}

object VideoContentDetails {
  @scala.inline
  def apply(): VideoContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoContentDetails]
  }
  @scala.inline
  implicit class VideoContentDetailsOps[Self <: VideoContentDetails] (val x: Self) extends AnyVal {
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
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setContentRating(value: ContentRating): Self = this.set("contentRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentRating: Self = this.set("contentRating", js.undefined)
    @scala.inline
    def setCountryRestriction(value: AccessPolicy): Self = this.set("countryRestriction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryRestriction: Self = this.set("countryRestriction", js.undefined)
    @scala.inline
    def setDefinition(value: String): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
    @scala.inline
    def setDimension(value: String): Self = this.set("dimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimension: Self = this.set("dimension", js.undefined)
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setHasCustomThumbnail(value: Boolean): Self = this.set("hasCustomThumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasCustomThumbnail: Self = this.set("hasCustomThumbnail", js.undefined)
    @scala.inline
    def setLicensedContent(value: Boolean): Self = this.set("licensedContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicensedContent: Self = this.set("licensedContent", js.undefined)
    @scala.inline
    def setProjection(value: String): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setRegionRestriction(value: VideoContentDetailsRegionRestriction): Self = this.set("regionRestriction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegionRestriction: Self = this.set("regionRestriction", js.undefined)
  }
  
}

