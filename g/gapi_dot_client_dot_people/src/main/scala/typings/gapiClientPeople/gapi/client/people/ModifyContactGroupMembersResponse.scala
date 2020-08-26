package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyContactGroupMembersResponse extends js.Object {
  /**
    * The contact people resource names that cannot be removed from their
    * last contact group.
    */
  var canNotRemoveLastContactGroupResourceNames: js.UndefOr[js.Array[String]] = js.native
  /** The contact people resource names that were not found. */
  var notFoundResourceNames: js.UndefOr[js.Array[String]] = js.native
}

object ModifyContactGroupMembersResponse {
  @scala.inline
  def apply(): ModifyContactGroupMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyContactGroupMembersResponse]
  }
  @scala.inline
  implicit class ModifyContactGroupMembersResponseOps[Self <: ModifyContactGroupMembersResponse] (val x: Self) extends AnyVal {
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
    def setCanNotRemoveLastContactGroupResourceNamesVarargs(value: String*): Self = this.set("canNotRemoveLastContactGroupResourceNames", js.Array(value :_*))
    @scala.inline
    def setCanNotRemoveLastContactGroupResourceNames(value: js.Array[String]): Self = this.set("canNotRemoveLastContactGroupResourceNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanNotRemoveLastContactGroupResourceNames: Self = this.set("canNotRemoveLastContactGroupResourceNames", js.undefined)
    @scala.inline
    def setNotFoundResourceNamesVarargs(value: String*): Self = this.set("notFoundResourceNames", js.Array(value :_*))
    @scala.inline
    def setNotFoundResourceNames(value: js.Array[String]): Self = this.set("notFoundResourceNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotFoundResourceNames: Self = this.set("notFoundResourceNames", js.undefined)
  }
  
}

