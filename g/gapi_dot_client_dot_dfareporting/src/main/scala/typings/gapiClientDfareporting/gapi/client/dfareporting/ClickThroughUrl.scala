package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClickThroughUrl extends js.Object {
  /**
    * Read-only convenience field representing the actual URL that will be used for this click-through. The URL is computed as follows:
    * - If defaultLandingPage is enabled then the campaign's default landing page URL is assigned to this field.
    * - If defaultLandingPage is not enabled and a landingPageId is specified then that landing page's URL is assigned to this field.
    * - If neither of the above cases apply, then the customClickThroughUrl is assigned to this field.
    */
  var computedClickThroughUrl: js.UndefOr[String] = js.native
  /** Custom click-through URL. Applicable if the defaultLandingPage field is set to false and the landingPageId field is left unset. */
  var customClickThroughUrl: js.UndefOr[String] = js.native
  /** Whether the campaign default landing page is used. */
  var defaultLandingPage: js.UndefOr[Boolean] = js.native
  /** ID of the landing page for the click-through URL. Applicable if the defaultLandingPage field is set to false. */
  var landingPageId: js.UndefOr[String] = js.native
}

object ClickThroughUrl {
  @scala.inline
  def apply(): ClickThroughUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClickThroughUrl]
  }
  @scala.inline
  implicit class ClickThroughUrlOps[Self <: ClickThroughUrl] (val x: Self) extends AnyVal {
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
    def setComputedClickThroughUrl(value: String): Self = this.set("computedClickThroughUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputedClickThroughUrl: Self = this.set("computedClickThroughUrl", js.undefined)
    @scala.inline
    def setCustomClickThroughUrl(value: String): Self = this.set("customClickThroughUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomClickThroughUrl: Self = this.set("customClickThroughUrl", js.undefined)
    @scala.inline
    def setDefaultLandingPage(value: Boolean): Self = this.set("defaultLandingPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultLandingPage: Self = this.set("defaultLandingPage", js.undefined)
    @scala.inline
    def setLandingPageId(value: String): Self = this.set("landingPageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLandingPageId: Self = this.set("landingPageId", js.undefined)
  }
  
}

