package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to update an existing user contact group. All updated fields will
  * be replaced.
  */
@js.native
trait Schema$UpdateContactGroupRequest extends js.Object {
  /**
    * The contact group to update.
    */
  var contactGroup: js.UndefOr[Schema$ContactGroup] = js.native
}

object Schema$UpdateContactGroupRequest {
  @scala.inline
  def apply(contactGroup: Schema$ContactGroup = null): Schema$UpdateContactGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (contactGroup != null) __obj.updateDynamic("contactGroup")(contactGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateContactGroupRequest]
  }
}

