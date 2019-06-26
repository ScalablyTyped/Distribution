package typings
package electronDashPackagerLib.electronDashPackagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElectronOsXSignOptions extends js.Object {
  var entitlements: js.UndefOr[java.lang.String] = js.undefined
  var `entitlements-inherit`: js.UndefOr[java.lang.String] = js.undefined
  var `gatekeeper-assess`: js.UndefOr[scala.Boolean] = js.undefined
  // see https://github.com/electron-userland/electron-packager/blob/92d09bba34599283a794fd6f24b88470f0cb1074/src/mac.js#L359
  var identity: js.UndefOr[java.lang.String | electronDashPackagerLib.electronDashPackagerLibNumbers.`true`] = js.undefined
  var `identity-validation`: js.UndefOr[scala.Boolean] = js.undefined
  var ignore: js.UndefOr[java.lang.String] = js.undefined
  var keychain: js.UndefOr[java.lang.String] = js.undefined
  var `pre-auto-entitlements`: js.UndefOr[scala.Boolean] = js.undefined
  var `pre-embed-provisioning-profile`: js.UndefOr[scala.Boolean] = js.undefined
  var `provisioning-profile`: js.UndefOr[java.lang.String] = js.undefined
  var requirements: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ElectronOsXSignOptions {
  @scala.inline
  def apply(
    entitlements: java.lang.String = null,
    `entitlements-inherit`: java.lang.String = null,
    `gatekeeper-assess`: js.UndefOr[scala.Boolean] = js.undefined,
    identity: java.lang.String | electronDashPackagerLib.electronDashPackagerLibNumbers.`true` = null,
    `identity-validation`: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: java.lang.String = null,
    keychain: java.lang.String = null,
    `pre-auto-entitlements`: js.UndefOr[scala.Boolean] = js.undefined,
    `pre-embed-provisioning-profile`: js.UndefOr[scala.Boolean] = js.undefined,
    `provisioning-profile`: java.lang.String = null,
    requirements: java.lang.String = null,
    `type`: java.lang.String = null
  ): ElectronOsXSignOptions = {
    val __obj = js.Dynamic.literal()
    if (entitlements != null) __obj.updateDynamic("entitlements")(entitlements)
    if (`entitlements-inherit` != null) __obj.updateDynamic("entitlements-inherit")(`entitlements-inherit`)
    if (!js.isUndefined(`gatekeeper-assess`)) __obj.updateDynamic("gatekeeper-assess")(`gatekeeper-assess`)
    if (identity != null) __obj.updateDynamic("identity")(identity.asInstanceOf[js.Any])
    if (!js.isUndefined(`identity-validation`)) __obj.updateDynamic("identity-validation")(`identity-validation`)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore)
    if (keychain != null) __obj.updateDynamic("keychain")(keychain)
    if (!js.isUndefined(`pre-auto-entitlements`)) __obj.updateDynamic("pre-auto-entitlements")(`pre-auto-entitlements`)
    if (!js.isUndefined(`pre-embed-provisioning-profile`)) __obj.updateDynamic("pre-embed-provisioning-profile")(`pre-embed-provisioning-profile`)
    if (`provisioning-profile` != null) __obj.updateDynamic("provisioning-profile")(`provisioning-profile`)
    if (requirements != null) __obj.updateDynamic("requirements")(requirements)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ElectronOsXSignOptions]
  }
}

