package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to create a new contact group.
  */
@js.native
trait Schema$CreateContactGroupRequest extends js.Object {
  /**
    * The contact group to create.
    */
  var contactGroup: js.UndefOr[Schema$ContactGroup] = js.native
}

object Schema$CreateContactGroupRequest {
  @scala.inline
  def apply(contactGroup: Schema$ContactGroup = null): Schema$CreateContactGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (contactGroup != null) __obj.updateDynamic("contactGroup")(contactGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateContactGroupRequest]
  }
}

