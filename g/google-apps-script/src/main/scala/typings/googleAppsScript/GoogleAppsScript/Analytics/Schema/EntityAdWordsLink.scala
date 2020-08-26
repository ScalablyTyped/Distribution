package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityAdWordsLink extends js.Object {
  var adWordsAccounts: js.UndefOr[js.Array[AdWordsAccount]] = js.native
  var entity: js.UndefOr[EntityAdWordsLinkEntity] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var profileIds: js.UndefOr[js.Array[String]] = js.native
  var selfLink: js.UndefOr[String] = js.native
}

object EntityAdWordsLink {
  @scala.inline
  def apply(): EntityAdWordsLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityAdWordsLink]
  }
  @scala.inline
  implicit class EntityAdWordsLinkOps[Self <: EntityAdWordsLink] (val x: Self) extends AnyVal {
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
    def setAdWordsAccountsVarargs(value: AdWordsAccount*): Self = this.set("adWordsAccounts", js.Array(value :_*))
    @scala.inline
    def setAdWordsAccounts(value: js.Array[AdWordsAccount]): Self = this.set("adWordsAccounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdWordsAccounts: Self = this.set("adWordsAccounts", js.undefined)
    @scala.inline
    def setEntity(value: EntityAdWordsLinkEntity): Self = this.set("entity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntity: Self = this.set("entity", js.undefined)
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
    def setProfileIdsVarargs(value: String*): Self = this.set("profileIds", js.Array(value :_*))
    @scala.inline
    def setProfileIds(value: js.Array[String]): Self = this.set("profileIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileIds: Self = this.set("profileIds", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
  
}

