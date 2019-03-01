package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BuildNumberBundleIdentifier extends js.Object {
  var buildNumber: js.UndefOr[java.lang.String] = js.undefined
  var bundleIdentifier: js.UndefOr[java.lang.String] = js.undefined
  var config: js.UndefOr[Anon_GoogleSignIn] = js.undefined
  var infoPlist: js.UndefOr[js.Any] = js.undefined
  var supportsTablet: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_BuildNumberBundleIdentifier {
  @scala.inline
  def apply(
    buildNumber: java.lang.String = null,
    bundleIdentifier: java.lang.String = null,
    config: Anon_GoogleSignIn = null,
    infoPlist: js.Any = null,
    supportsTablet: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_BuildNumberBundleIdentifier = {
    val __obj = js.Dynamic.literal()
    if (buildNumber != null) __obj.updateDynamic("buildNumber")(buildNumber)
    if (bundleIdentifier != null) __obj.updateDynamic("bundleIdentifier")(bundleIdentifier)
    if (config != null) __obj.updateDynamic("config")(config)
    if (infoPlist != null) __obj.updateDynamic("infoPlist")(infoPlist)
    if (!js.isUndefined(supportsTablet)) __obj.updateDynamic("supportsTablet")(supportsTablet)
    __obj.asInstanceOf[Anon_BuildNumberBundleIdentifier]
  }
}

