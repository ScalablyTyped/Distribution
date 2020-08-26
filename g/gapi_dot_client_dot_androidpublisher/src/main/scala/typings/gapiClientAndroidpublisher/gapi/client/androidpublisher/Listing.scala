package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Listing extends js.Object {
  /** Full description of the app; this may be up to 4000 characters in length. */
  var fullDescription: js.UndefOr[String] = js.native
  /** Language localization code (for example, "de-AT" for Austrian German). */
  var language: js.UndefOr[String] = js.native
  /** Short description of the app (previously known as promo text); this may be up to 80 characters in length. */
  var shortDescription: js.UndefOr[String] = js.native
  /** App's localized title. */
  var title: js.UndefOr[String] = js.native
  /** URL of a promotional YouTube video for the app. */
  var video: js.UndefOr[String] = js.native
}

object Listing {
  @scala.inline
  def apply(): Listing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Listing]
  }
  @scala.inline
  implicit class ListingOps[Self <: Listing] (val x: Self) extends AnyVal {
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
    def setFullDescription(value: String): Self = this.set("fullDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullDescription: Self = this.set("fullDescription", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setShortDescription(value: String): Self = this.set("shortDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortDescription: Self = this.set("shortDescription", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVideo(value: String): Self = this.set("video", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
  }
  
}

