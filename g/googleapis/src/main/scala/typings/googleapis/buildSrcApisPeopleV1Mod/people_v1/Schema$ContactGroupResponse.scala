package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for a specific contact group.
  */
@js.native
trait Schema$ContactGroupResponse extends js.Object {
  /**
    * The contact group.
    */
  var contactGroup: js.UndefOr[Schema$ContactGroup] = js.native
  /**
    * The original requested resource name.
    */
  var requestedResourceName: js.UndefOr[String] = js.native
  /**
    * The status of the response.
    */
  var status: js.UndefOr[Schema$Status] = js.native
}

object Schema$ContactGroupResponse {
  @scala.inline
  def apply(
    contactGroup: Schema$ContactGroup = null,
    requestedResourceName: String = null,
    status: Schema$Status = null
  ): Schema$ContactGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (contactGroup != null) __obj.updateDynamic("contactGroup")(contactGroup.asInstanceOf[js.Any])
    if (requestedResourceName != null) __obj.updateDynamic("requestedResourceName")(requestedResourceName.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ContactGroupResponse]
  }
}

