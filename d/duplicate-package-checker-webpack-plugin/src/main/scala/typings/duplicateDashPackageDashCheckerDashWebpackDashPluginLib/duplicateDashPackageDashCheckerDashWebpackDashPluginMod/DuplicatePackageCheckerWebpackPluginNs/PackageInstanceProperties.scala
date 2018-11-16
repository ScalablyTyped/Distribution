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

