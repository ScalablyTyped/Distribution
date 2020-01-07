package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative Field Assignment.
  */
@js.native
trait Schema$CreativeFieldAssignment extends js.Object {
  /**
    * ID of the creative field.
    */
  var creativeFieldId: js.UndefOr[String] = js.native
  /**
    * ID of the creative field value.
    */
  var creativeFieldValueId: js.UndefOr[String] = js.native
}

object Schema$CreativeFieldAssignment {
  @scala.inline
  def apply(creativeFieldId: String = null, creativeFieldValueId: String = null): Schema$CreativeFieldAssignment = {
    val __obj = js.Dynamic.literal()
    if (creativeFieldId != null) __obj.updateDynamic("creativeFieldId")(creativeFieldId.asInstanceOf[js.Any])
    if (creativeFieldValueId != null) __obj.updateDynamic("creativeFieldValueId")(creativeFieldValueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreativeFieldAssignment]
  }
}

