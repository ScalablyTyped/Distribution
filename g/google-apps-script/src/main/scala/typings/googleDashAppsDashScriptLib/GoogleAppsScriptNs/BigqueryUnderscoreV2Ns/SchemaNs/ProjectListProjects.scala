package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectListProjects extends js.Object {
  var friendlyName: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var numericId: js.UndefOr[java.lang.String] = js.undefined
  var projectReference: js.UndefOr[ProjectReference] = js.undefined
}

object ProjectListProjects {
  @scala.inline
  def apply(
    friendlyName: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    numericId: java.lang.String = null,
    projectReference: ProjectReference = null
  ): ProjectListProjects = {
    val __obj = js.Dynamic.literal()
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (numericId != null) __obj.updateDynamic("numericId")(numericId)
    if (projectReference != null) __obj.updateDynamic("projectReference")(projectReference)
    __obj.asInstanceOf[ProjectListProjects]
  }
}

