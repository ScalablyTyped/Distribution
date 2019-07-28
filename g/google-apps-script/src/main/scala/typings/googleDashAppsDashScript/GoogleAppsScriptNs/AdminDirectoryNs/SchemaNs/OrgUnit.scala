package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgUnit extends js.Object {
  var blockInheritance: js.UndefOr[Boolean] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var orgUnitId: js.UndefOr[String] = js.undefined
  var orgUnitPath: js.UndefOr[String] = js.undefined
  var parentOrgUnitId: js.UndefOr[String] = js.undefined
  var parentOrgUnitPath: js.UndefOr[String] = js.undefined
}

object OrgUnit {
  @scala.inline
  def apply(
    blockInheritance: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    etag: String = null,
    kind: String = null,
    name: String = null,
    orgUnitId: String = null,
    orgUnitPath: String = null,
    parentOrgUnitId: String = null,
    parentOrgUnitPath: String = null
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

