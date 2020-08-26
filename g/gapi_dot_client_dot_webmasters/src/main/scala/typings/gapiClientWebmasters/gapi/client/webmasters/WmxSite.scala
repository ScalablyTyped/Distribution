package typings.gapiClientWebmasters.gapi.client.webmasters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WmxSite extends js.Object {
  /** The user's permission level for the site. */
  var permissionLevel: js.UndefOr[String] = js.native
  /** The URL of the site. */
  var siteUrl: js.UndefOr[String] = js.native
}

object WmxSite {
  @scala.inline
  def apply(): WmxSite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WmxSite]
  }
  @scala.inline
  implicit class WmxSiteOps[Self <: WmxSite] (val x: Self) extends AnyVal {
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
    def setPermissionLevel(value: String): Self = this.set("permissionLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissionLevel: Self = this.set("permissionLevel", js.undefined)
    @scala.inline
    def setSiteUrl(value: String): Self = this.set("siteUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteUrl: Self = this.set("siteUrl", js.undefined)
  }
  
}

