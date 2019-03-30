package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeFieldAssignment extends js.Object {
  var creativeFieldId: js.UndefOr[java.lang.String] = js.undefined
  var creativeFieldValueId: js.UndefOr[java.lang.String] = js.undefined
}

object CreativeFieldAssignment {
  @scala.inline
  def apply(creativeFieldId: java.lang.String = null, creativeFieldValueId: java.lang.String = null): CreativeFieldAssignment = {
    val __obj = js.Dynamic.literal()
    if (creativeFieldId != null) __obj.updateDynamic("creativeFieldId")(creativeFieldId)
    if (creativeFieldValueId != null) __obj.updateDynamic("creativeFieldValueId")(creativeFieldValueId)
    __obj.asInstanceOf[CreativeFieldAssignment]
  }
}

