package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an organization entry.
  */
@js.native
trait Schema$UserOrganization extends js.Object {
  /**
    * The cost center of the users department.
    */
  var costCenter: js.UndefOr[String] = js.native
  /**
    * Custom type.
    */
  var customType: js.UndefOr[String] = js.native
  /**
    * Department within the organization.
    */
  var department: js.UndefOr[String] = js.native
  /**
    * Description of the organization.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The domain to which the organization belongs to.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * The full-time equivalent percent within the organization (100000 = 100%).
    */
  var fullTimeEquivalent: js.UndefOr[Double] = js.native
  /**
    * Location of the organization. This need not be fully qualified address.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Name of the organization
    */
  var name: js.UndefOr[String] = js.native
  /**
    * If it user&#39;s primary organization.
    */
  var primary: js.UndefOr[Boolean] = js.native
  /**
    * Symbol of the organization.
    */
  var symbol: js.UndefOr[String] = js.native
  /**
    * Title (designation) of the user in the organization.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Each entry can have a type which indicates standard types of that entry.
    * For example organization could be of school, work etc. In addition to the
    * standard type, an entry can have a custom type and can give it any name.
    * Such types should have the CUSTOM value as type and also have a
    * CustomType value.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$UserOrganization {
  @scala.inline
  def apply(
    costCenter: String = null,
    customType: String = null,
    department: String = null,
    description: String = null,
    domain: String = null,
    fullTimeEquivalent: Int | Double = null,
    location: String = null,
    name: String = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    symbol: String = null,
    title: String = null,
    `type`: String = null
  ): Schema$UserOrganization = {
    val __obj = js.Dynamic.literal()
    if (costCenter != null) __obj.updateDynamic("costCenter")(costCenter.asInstanceOf[js.Any])
    if (customType != null) __obj.updateDynamic("customType")(customType.asInstanceOf[js.Any])
    if (department != null) __obj.updateDynamic("department")(department.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (fullTimeEquivalent != null) __obj.updateDynamic("fullTimeEquivalent")(fullTimeEquivalent.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserOrganization]
  }
}

