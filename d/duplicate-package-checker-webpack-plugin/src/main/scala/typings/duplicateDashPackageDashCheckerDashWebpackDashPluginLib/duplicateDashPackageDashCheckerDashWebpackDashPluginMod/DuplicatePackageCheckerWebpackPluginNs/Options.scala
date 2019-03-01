package typings
package duplicateDashPackageDashCheckerDashWebpackDashPluginLib.duplicateDashPackageDashCheckerDashWebpackDashPluginMod.DuplicatePackageCheckerWebpackPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The configurable options for the plugin */
trait Options extends js.Object {
  /** Emit errors instead of warnings (default: false) */
  var emitError: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Exclude instances of packages from the results.
    * If all instances of a package are excluded, or all instances except one,
    * then the package is no longer considered duplicated and won't be emitted as a warning/error.
    * @param instance The instance of a package being evaluated for exclusion.
    * @returns true to exclude the instance, false otherwise
    */
  var exclude: js.UndefOr[js.Function1[/* instance */ PackageInstanceProperties, scala.Boolean]] = js.undefined
  /** Show help message if duplicate packages are found (default: true) */
  var showHelp: js.UndefOr[scala.Boolean] = js.undefined
  /** Warn also if major versions differ (default: true) */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  /** Also show module that is requiring each duplicate package (default: false) */
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    emitError: js.UndefOr[scala.Boolean] = js.undefined,
    exclude: js.Function1[/* instance */ PackageInstanceProperties, scala.Boolean] = null,
    showHelp: js.UndefOr[scala.Boolean] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    verbose: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emitError)) __obj.updateDynamic("emitError")(emitError)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (!js.isUndefined(showHelp)) __obj.updateDynamic("showHelp")(showHelp)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[Options]
  }
}

