package typings.duplicatePackageCheckerWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The configurable options for the plugin */
@js.native
trait Options extends js.Object {
  
  /** Emit errors instead of warnings (default: false) */
  var emitError: js.UndefOr[Boolean] = js.native
  
  /**
    * Exclude instances of packages from the results.
    * If all instances of a package are excluded, or all instances except one,
    * then the package is no longer considered duplicated and won't be emitted as a warning/error.
    * @param instance The instance of a package being evaluated for exclusion.
    * @returns true to exclude the instance, false otherwise
    */
  var exclude: js.UndefOr[js.Function1[/* instance */ PackageInstanceProperties, Boolean]] = js.native
  
  /** Show help message if duplicate packages are found (default: true) */
  var showHelp: js.UndefOr[Boolean] = js.native
  
  /** Warn also if major versions differ (default: true) */
  var strict: js.UndefOr[Boolean] = js.native
  
  /** Also show module that is requiring each duplicate package (default: false) */
  var verbose: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEmitError(value: Boolean): Self = this.set("emitError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmitError: Self = this.set("emitError", js.undefined)
    
    @scala.inline
    def setExclude(value: /* instance */ PackageInstanceProperties => Boolean): Self = this.set("exclude", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setShowHelp(value: Boolean): Self = this.set("showHelp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHelp: Self = this.set("showHelp", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
