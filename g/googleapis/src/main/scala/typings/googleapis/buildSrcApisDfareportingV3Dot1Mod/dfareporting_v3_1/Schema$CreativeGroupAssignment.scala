package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative Group Assignment.
  */
@js.native
trait Schema$CreativeGroupAssignment extends js.Object {
  /**
    * ID of the creative group to be assigned.
    */
  var creativeGroupId: js.UndefOr[String] = js.native
  /**
    * Creative group number of the creative group assignment.
    */
  var creativeGroupNumber: js.UndefOr[String] = js.native
}

object Schema$CreativeGroupAssignment {
  @scala.inline
  def apply(creativeGroupId: String = null, creativeGroupNumber: String = null): Schema$CreativeGroupAssignment = {
    val __obj = js.Dynamic.literal()
    if (creativeGroupId != null) __obj.updateDynamic("creativeGroupId")(creativeGroupId.asInstanceOf[js.Any])
    if (creativeGroupNumber != null) __obj.updateDynamic("creativeGroupNumber")(creativeGroupNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreativeGroupAssignment]
  }
}

