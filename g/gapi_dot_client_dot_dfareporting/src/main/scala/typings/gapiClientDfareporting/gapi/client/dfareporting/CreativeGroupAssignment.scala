package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeGroupAssignment extends js.Object {
  /** ID of the creative group to be assigned. */
  var creativeGroupId: js.UndefOr[String] = js.undefined
  /** Creative group number of the creative group assignment. */
  var creativeGroupNumber: js.UndefOr[String] = js.undefined
}

object CreativeGroupAssignment {
  @scala.inline
  def apply(creativeGroupId: String = null, creativeGroupNumber: String = null): CreativeGroupAssignment = {
    val __obj = js.Dynamic.literal()
    if (creativeGroupId != null) __obj.updateDynamic("creativeGroupId")(creativeGroupId.asInstanceOf[js.Any])
    if (creativeGroupNumber != null) __obj.updateDynamic("creativeGroupNumber")(creativeGroupNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreativeGroupAssignment]
  }
}

