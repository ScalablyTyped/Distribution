package typings.electronPackager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** See the documentation for [`electron-osx-sign`](https://npm.im/electron-osx-sign#opts) for details. */
/* Inlined std.Omit<electron-osx-sign.electron-osx-sign.SignOptions, 'app' | 'binaries' | 'platform' | 'version'> */
trait OsxSignOptions extends js.Object {
  var entitlements: js.UndefOr[String] = js.undefined
  var `entitlements-inherit`: js.UndefOr[String] = js.undefined
  var `entitlements-loginhelper`: js.UndefOr[String] = js.undefined
  var `gatekeeper-assess`: js.UndefOr[Boolean] = js.undefined
  var hardenedRuntime: js.UndefOr[Boolean] = js.undefined
  var identity: js.UndefOr[String] = js.undefined
  var `identity-validation`: js.UndefOr[Boolean] = js.undefined
  var ignore: js.UndefOr[String] = js.undefined
  var keychain: js.UndefOr[String] = js.undefined
  var `pre-auto-entitlements`: js.UndefOr[Boolean] = js.undefined
  var `pre-embed-provisioning-profile`: js.UndefOr[Boolean] = js.undefined
  var `provisioning-profile`: js.UndefOr[String] = js.undefined
  var requirements: js.UndefOr[String] = js.undefined
  var `signature-size`: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object OsxSignOptions {
  @scala.inline
  def apply(
    entitlements: String = null,
    `entitlements-inherit`: String = null,
    `entitlements-loginhelper`: String = null,
    `gatekeeper-assess`: js.UndefOr[Boolean] = js.undefined,
    hardenedRuntime: js.UndefOr[Boolean] = js.undefined,
    identity: String = null,
    `identity-validation`: js.UndefOr[Boolean] = js.undefined,
    ignore: String = null,
    keychain: String = null,
    `pre-auto-entitlements`: js.UndefOr[Boolean] = js.undefined,
    `pre-embed-provisioning-profile`: js.UndefOr[Boolean] = js.undefined,
    `provisioning-profile`: String = null,
    requirements: String = null,
    `signature-size`: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): OsxSignOptions = {
    val __obj = js.Dynamic.literal()
    if (entitlements != null) __obj.updateDynamic("entitlements")(entitlements.asInstanceOf[js.Any])
    if (`entitlements-inherit` != null) __obj.updateDynamic("entitlements-inherit")(`entitlements-inherit`.asInstanceOf[js.Any])
    if (`entitlements-loginhelper` != null) __obj.updateDynamic("entitlements-loginhelper")(`entitlements-loginhelper`.asInstanceOf[js.Any])
    if (!js.isUndefined(`gatekeeper-assess`)) __obj.updateDynamic("gatekeeper-assess")(`gatekeeper-assess`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hardenedRuntime)) __obj.updateDynamic("hardenedRuntime")(hardenedRuntime.get.asInstanceOf[js.Any])
    if (identity != null) __obj.updateDynamic("identity")(identity.asInstanceOf[js.Any])
    if (!js.isUndefined(`identity-validation`)) __obj.updateDynamic("identity-validation")(`identity-validation`.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (keychain != null) __obj.updateDynamic("keychain")(keychain.asInstanceOf[js.Any])
    if (!js.isUndefined(`pre-auto-entitlements`)) __obj.updateDynamic("pre-auto-entitlements")(`pre-auto-entitlements`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`pre-embed-provisioning-profile`)) __obj.updateDynamic("pre-embed-provisioning-profile")(`pre-embed-provisioning-profile`.get.asInstanceOf[js.Any])
    if (`provisioning-profile` != null) __obj.updateDynamic("provisioning-profile")(`provisioning-profile`.asInstanceOf[js.Any])
    if (requirements != null) __obj.updateDynamic("requirements")(requirements.asInstanceOf[js.Any])
    if (!js.isUndefined(`signature-size`)) __obj.updateDynamic("signature-size")(`signature-size`.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OsxSignOptions]
  }
}

