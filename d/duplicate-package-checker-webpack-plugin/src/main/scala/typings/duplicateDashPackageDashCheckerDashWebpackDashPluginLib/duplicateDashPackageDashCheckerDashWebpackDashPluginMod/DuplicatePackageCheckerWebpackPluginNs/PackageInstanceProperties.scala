package typings
package duplicateDashPackageDashCheckerDashWebpackDashPluginLib.duplicateDashPackageDashCheckerDashWebpackDashPluginMod.DuplicatePackageCheckerWebpackPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The properties of the instance of a package */
trait PackageInstanceProperties extends js.Object {
  /** Absolute path to the module that requested the package */
  var issuer: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the package */
  var name: java.lang.String
  /** Absolute path to the package */
  var path: java.lang.String
  /** The version of the package */
  var version: java.lang.String
}

object PackageInstanceProperties {
  @scala.inline
  def apply(
    name: java.lang.String,
    path: java.lang.String,
    version: java.lang.String,
    issuer: java.lang.String = null
  ): PackageInstanceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("version")(version)
    if (issuer != null) __obj.updateDynamic("issuer")(issuer)
    __obj.asInstanceOf[PackageInstanceProperties]
  }
}

