package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserOrganization extends js.Object {
  var costCenter: js.UndefOr[java.lang.String] = js.undefined
  var customType: js.UndefOr[java.lang.String] = js.undefined
  var department: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var fullTimeEquivalent: js.UndefOr[scala.Double] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  var symbol: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object UserOrganization {
  @scala.inline
  def apply(
    costCenter: java.lang.String = null,
    customType: java.lang.String = null,
    department: java.lang.String = null,
    description: java.lang.String = null,
    domain: java.lang.String = null,
    fullTimeEquivalent: scala.Int | scala.Double = null,
    location: java.lang.String = null,
    name: java.lang.String = null,
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    symbol: java.lang.String = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null
  ): UserOrganization = {
    val __obj = js.Dynamic.literal()
    if (costCenter != null) __obj.updateDynamic("costCenter")(costCenter)
    if (customType != null) __obj.updateDynamic("customType")(customType)
    if (department != null) __obj.updateDynamic("department")(department)
    if (description != null) __obj.updateDynamic("description")(description)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (fullTimeEquivalent != null) __obj.updateDynamic("fullTimeEquivalent")(fullTimeEquivalent.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UserOrganization]
  }
}

