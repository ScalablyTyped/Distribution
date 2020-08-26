package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Requirements extends js.Object {
  var caption: js.UndefOr[Boolean] = js.native
  var hdTranscode: js.UndefOr[Boolean] = js.native
  var posterArt: js.UndefOr[Boolean] = js.native
  var spotlightArt: js.UndefOr[Boolean] = js.native
  var spotlightReview: js.UndefOr[Boolean] = js.native
  var trailer: js.UndefOr[Boolean] = js.native
}

object Requirements {
  @scala.inline
  def apply(): Requirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Requirements]
  }
  @scala.inline
  implicit class RequirementsOps[Self <: Requirements] (val x: Self) extends AnyVal {
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
    def setCaption(value: Boolean): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setHdTranscode(value: Boolean): Self = this.set("hdTranscode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHdTranscode: Self = this.set("hdTranscode", js.undefined)
    @scala.inline
    def setPosterArt(value: Boolean): Self = this.set("posterArt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosterArt: Self = this.set("posterArt", js.undefined)
    @scala.inline
    def setSpotlightArt(value: Boolean): Self = this.set("spotlightArt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotlightArt: Self = this.set("spotlightArt", js.undefined)
    @scala.inline
    def setSpotlightReview(value: Boolean): Self = this.set("spotlightReview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotlightReview: Self = this.set("spotlightReview", js.undefined)
    @scala.inline
    def setTrailer(value: Boolean): Self = this.set("trailer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrailer: Self = this.set("trailer", js.undefined)
  }
  
}

