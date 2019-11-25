package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeFieldAssignment extends js.Object {
  /** ID of the creative field. */
  var creativeFieldId: js.UndefOr[String] = js.undefined
  /** ID of the creative field value. */
  var creativeFieldValueId: js.UndefOr[String] = js.undefined
}

object CreativeFieldAssignment {
  @scala.inline
  def apply(creativeFieldId: String = null, creativeFieldValueId: String = null): CreativeFieldAssignment = {
    val __obj = js.Dynamic.literal()
    if (creativeFieldId != null) __obj.updateDynamic("creativeFieldId")(creativeFieldId.asInstanceOf[js.Any])
    if (creativeFieldValueId != null) __obj.updateDynamic("creativeFieldValueId")(creativeFieldValueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreativeFieldAssignment]
  }
}

