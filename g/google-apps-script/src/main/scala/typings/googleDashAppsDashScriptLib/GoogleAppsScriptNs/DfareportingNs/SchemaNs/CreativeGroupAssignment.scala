package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeGroupAssignment extends js.Object {
  var creativeGroupId: js.UndefOr[java.lang.String] = js.undefined
  var creativeGroupNumber: js.UndefOr[java.lang.String] = js.undefined
}

object CreativeGroupAssignment {
  @scala.inline
  def apply(creativeGroupId: java.lang.String = null, creativeGroupNumber: java.lang.String = null): CreativeGroupAssignment = {
    val __obj = js.Dynamic.literal()
    if (creativeGroupId != null) __obj.updateDynamic("creativeGroupId")(creativeGroupId)
    if (creativeGroupNumber != null) __obj.updateDynamic("creativeGroupNumber")(creativeGroupNumber)
    __obj.asInstanceOf[CreativeGroupAssignment]
  }
}

