package typings.duplicateDashPackageDashCheckerDashWebpackDashPlugin.duplicateDashPackageDashCheckerDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The properties of the instance of a package */
trait PackageInstanceProperties extends js.Object {
  /** Absolute path to the module that requested the package */
  var issuer: js.UndefOr[String] = js.undefined
  /** The name of the package */
  var name: String
  /** Absolute path to the package */
  var path: String
  /** The version of the package */
  var version: String
}

object PackageInstanceProperties {
  @scala.inline
  def apply(name: String, path: String, version: String, issuer: String = null): PackageInstanceProperties = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageInstanceProperties]
  }
}

