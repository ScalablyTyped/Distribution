package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfileFilterLink extends js.Object {
  var filterRef: js.UndefOr[FilterRef] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var profileRef: js.UndefOr[ProfileRef] = js.native
  var rank: js.UndefOr[Double] = js.native
  var selfLink: js.UndefOr[String] = js.native
}

object ProfileFilterLink {
  @scala.inline
  def apply(): ProfileFilterLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileFilterLink]
  }
  @scala.inline
  implicit class ProfileFilterLinkOps[Self <: ProfileFilterLink] (val x: Self) extends AnyVal {
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
    def setFilterRef(value: FilterRef): Self = this.set("filterRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterRef: Self = this.set("filterRef", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setProfileRef(value: ProfileRef): Self = this.set("profileRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileRef: Self = this.set("profileRef", js.undefined)
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRank: Self = this.set("rank", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
  
}

