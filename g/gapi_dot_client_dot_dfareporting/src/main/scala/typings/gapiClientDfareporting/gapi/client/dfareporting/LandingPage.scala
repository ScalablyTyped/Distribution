package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LandingPage extends js.Object {
  /**
    * Whether or not this landing page will be assigned to any ads or creatives that do not have a landing page assigned explicitly. Only one default landing
    * page is allowed per campaign.
    */
  var default: js.UndefOr[Boolean] = js.native
  /** ID of this landing page. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#landingPage". */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this landing page. This is a required field. It must be less than 256 characters long, and must be unique among landing pages of the same
    * campaign.
    */
  var name: js.UndefOr[String] = js.native
  /** URL of this landing page. This is a required field. */
  var url: js.UndefOr[String] = js.native
}

object LandingPage {
  @scala.inline
  def apply(): LandingPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LandingPage]
  }
  @scala.inline
  implicit class LandingPageOps[Self <: LandingPage] (val x: Self) extends AnyVal {
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
    def setDefault(value: Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

