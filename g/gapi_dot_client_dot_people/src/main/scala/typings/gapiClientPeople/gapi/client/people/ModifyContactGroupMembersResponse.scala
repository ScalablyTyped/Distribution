package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyContactGroupMembersResponse extends js.Object {
  /**
    * The contact people resource names that cannot be removed from their
    * last contact group.
    */
  var canNotRemoveLastContactGroupResourceNames: js.UndefOr[js.Array[String]] = js.undefined
  /** The contact people resource names that were not found. */
  var notFoundResourceNames: js.UndefOr[js.Array[String]] = js.undefined
}

object ModifyContactGroupMembersResponse {
  @scala.inline
  def apply(
    canNotRemoveLastContactGroupResourceNames: js.Array[String] = null,
    notFoundResourceNames: js.Array[String] = null
  ): ModifyContactGroupMembersResponse = {
    val __obj = js.Dynamic.literal()
    if (canNotRemoveLastContactGroupResourceNames != null) __obj.updateDynamic("canNotRemoveLastContactGroupResourceNames")(canNotRemoveLastContactGroupResourceNames.asInstanceOf[js.Any])
    if (notFoundResourceNames != null) __obj.updateDynamic("notFoundResourceNames")(notFoundResourceNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyContactGroupMembersResponse]
  }
}

