package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgUnit extends js.Object {
  var blockInheritance: js.UndefOr[scala.Boolean] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var orgUnitId: js.UndefOr[java.lang.String] = js.undefined
  var orgUnitPath: js.UndefOr[java.lang.String] = js.undefined
  var parentOrgUnitId: js.UndefOr[java.lang.String] = js.undefined
  var parentOrgUnitPath: js.UndefOr[java.lang.String] = js.undefined
}

object OrgUnit {
  @scala.inline
  def apply(
    blockInheritance: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    etag: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    orgUnitId: java.lang.String = null,
    orgUnitPath: java.lang.String = null,
    parentOrgUnitId: java.lang.String = null,
    parentOrgUnitPath: java.lang.String = null
  ): OrgUnit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockInheritance)) __obj.updateDynamic("blockInheritance")(blockInheritance)
    if (description != null) __obj.updateDynamic("description")(description)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (orgUnitId != null) __obj.updateDynamic("orgUnitId")(orgUnitId)
    if (orgUnitPath != null) __obj.updateDynamic("orgUnitPath")(orgUnitPath)
    if (parentOrgUnitId != null) __obj.updateDynamic("parentOrgUnitId")(parentOrgUnitId)
    if (parentOrgUnitPath != null) __obj.updateDynamic("parentOrgUnitPath")(parentOrgUnitPath)
    __obj.asInstanceOf[OrgUnit]
  }
}

