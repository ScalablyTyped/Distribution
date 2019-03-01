package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyContactGroupMembersRequest extends js.Object {
  /**
    * The resource names of the contact people to add in the form of in the form
    * `people/`<var>person_id</var>.
    */
  var resourceNamesToAdd: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The resource names of the contact people to remove in the form of in the
    * form of `people/`<var>person_id</var>.
    */
  var resourceNamesToRemove: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ModifyContactGroupMembersRequest {
  @scala.inline
  def apply(
    resourceNamesToAdd: js.Array[java.lang.String] = null,
    resourceNamesToRemove: js.Array[java.lang.String] = null
  ): ModifyContactGroupMembersRequest = {
    val __obj = js.Dynamic.literal()
    if (resourceNamesToAdd != null) __obj.updateDynamic("resourceNamesToAdd")(resourceNamesToAdd)
    if (resourceNamesToRemove != null) __obj.updateDynamic("resourceNamesToRemove")(resourceNamesToRemove)
    __obj.asInstanceOf[ModifyContactGroupMembersRequest]
  }
}

