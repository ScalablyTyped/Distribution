package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserProfileList extends js.Object {
  /** The eTag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.native
  /** The user profiles returned in this response. */
  var items: js.UndefOr[js.Array[UserProfile]] = js.native
  /** The kind of list this is, in this case dfareporting#userProfileList. */
  var kind: js.UndefOr[String] = js.native
}

object UserProfileList {
  @scala.inline
  def apply(): UserProfileList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserProfileList]
  }
  @scala.inline
  implicit class UserProfileListOps[Self <: UserProfileList] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setItemsVarargs(value: UserProfile*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[UserProfile]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

