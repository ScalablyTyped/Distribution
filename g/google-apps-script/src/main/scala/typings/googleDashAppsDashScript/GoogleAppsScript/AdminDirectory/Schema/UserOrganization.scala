package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserOrganization extends js.Object {
  var costCenter: js.UndefOr[String] = js.undefined
  var customType: js.UndefOr[String] = js.undefined
  var department: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var fullTimeEquivalent: js.UndefOr[Double] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var primary: js.UndefOr[Boolean] = js.undefined
  var symbol: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object UserOrganization {
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
  ): UserOrganization = {
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
    __obj.asInstanceOf[UserOrganization]
  }
}

