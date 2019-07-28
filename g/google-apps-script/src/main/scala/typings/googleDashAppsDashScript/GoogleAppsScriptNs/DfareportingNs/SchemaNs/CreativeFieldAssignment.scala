package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeFieldAssignment extends js.Object {
  var creativeFieldId: js.UndefOr[String] = js.undefined
  var creativeFieldValueId: js.UndefOr[String] = js.undefined
}

object CreativeFieldAssignment {
  @scala.inline
  def apply(creativeFieldId: String = null, creativeFieldValueId: String = null): CreativeFieldAssignment = {
    val __obj = js.Dynamic.literal()
    if (creativeFieldId != null) __obj.updateDynamic("creativeFieldId")(creativeFieldId)
    if (creativeFieldValueId != null) __obj.updateDynamic("creativeFieldValueId")(creativeFieldValueId)
    __obj.asInstanceOf[CreativeFieldAssignment]
  }
}

