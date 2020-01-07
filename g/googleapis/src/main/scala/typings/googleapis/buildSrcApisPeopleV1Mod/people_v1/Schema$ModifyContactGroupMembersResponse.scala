package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response to a modify contact group members request.
  */
@js.native
trait Schema$ModifyContactGroupMembersResponse extends js.Object {
  /**
    * The contact people resource names that were not found.
    */
  var notFoundResourceNames: js.UndefOr[js.Array[String]] = js.native
}

object Schema$ModifyContactGroupMembersResponse {
  @scala.inline
  def apply(notFoundResourceNames: js.Array[String] = null): Schema$ModifyContactGroupMembersResponse = {
    val __obj = js.Dynamic.literal()
    if (notFoundResourceNames != null) __obj.updateDynamic("notFoundResourceNames")(notFoundResourceNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ModifyContactGroupMembersResponse]
  }
}

