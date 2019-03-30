package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectReference extends js.Object {
  var projectId: js.UndefOr[java.lang.String] = js.undefined
}

object ProjectReference {
  @scala.inline
  def apply(projectId: java.lang.String = null): ProjectReference = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[ProjectReference]
  }
}

