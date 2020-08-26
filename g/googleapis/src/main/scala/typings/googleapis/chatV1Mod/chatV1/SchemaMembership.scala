package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a membership relation in Hangouts Chat.
  */
@js.native
trait SchemaMembership extends js.Object {
  /**
    * The creation time of the membership a.k.a the time at which the member
    * joined the space, if applicable.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Member details.
    */
  var member: js.UndefOr[SchemaUser] = js.native
  /**
    * Resource name of the membership, in the form
    * &quot;spaces/x/members/ *&quot;.  Example:
    * spaces/AAAAMpdlehY/members/105115627578887013105
    */
  var name: js.UndefOr[String] = js.native
  /**
    * State of the membership.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaMembership {
  @scala.inline
  def apply(): SchemaMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembership]
  }
  @scala.inline
  implicit class SchemaMembershipOps[Self <: SchemaMembership] (val x: Self) extends AnyVal {
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setMember(value: SchemaUser): Self = this.set("member", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMember: Self = this.set("member", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

