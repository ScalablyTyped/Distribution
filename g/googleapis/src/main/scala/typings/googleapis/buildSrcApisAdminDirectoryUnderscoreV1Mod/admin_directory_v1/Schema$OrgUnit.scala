package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Org Unit resource in Directory API.
  */
@js.native
trait Schema$OrgUnit extends js.Object {
  /**
    * Should block inheritance
    */
  var blockInheritance: js.UndefOr[Boolean] = js.native
  /**
    * Description of OrgUnit
    */
  var description: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of OrgUnit
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Id of OrgUnit
    */
  var orgUnitId: js.UndefOr[String] = js.native
  /**
    * Path of OrgUnit
    */
  var orgUnitPath: js.UndefOr[String] = js.native
  /**
    * Id of parent OrgUnit
    */
  var parentOrgUnitId: js.UndefOr[String] = js.native
  /**
    * Path of parent OrgUnit
    */
  var parentOrgUnitPath: js.UndefOr[String] = js.native
}

object Schema$OrgUnit {
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
  ): Schema$OrgUnit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockInheritance)) __obj.updateDynamic("blockInheritance")(blockInheritance.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (orgUnitId != null) __obj.updateDynamic("orgUnitId")(orgUnitId.asInstanceOf[js.Any])
    if (orgUnitPath != null) __obj.updateDynamic("orgUnitPath")(orgUnitPath.asInstanceOf[js.Any])
    if (parentOrgUnitId != null) __obj.updateDynamic("parentOrgUnitId")(parentOrgUnitId.asInstanceOf[js.Any])
    if (parentOrgUnitPath != null) __obj.updateDynamic("parentOrgUnitPath")(parentOrgUnitPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrgUnit]
  }
}

