package typings.googleapis.buildSrcApisChatV1Mod.chat_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a membership relation in Hangouts Chat.
  */
@js.native
trait Schema$Membership extends js.Object {
  /**
    * The creation time of the membership a.k.a the time at which the member
    * joined the space, if applicable.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Member details.
    */
  var member: js.UndefOr[Schema$User] = js.native
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

object Schema$Membership {
  @scala.inline
  def apply(createTime: String = null, member: Schema$User = null, name: String = null, state: String = null): Schema$Membership = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (member != null) __obj.updateDynamic("member")(member.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Membership]
  }
}

