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
  def apply(createTime: String = null, member: SchemaUser = null, name: String = null, state: String = null): SchemaMembership = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (member != null) __obj.updateDynamic("member")(member.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMembership]
  }
}

