package typings
package googleDashGaxLib.buildSrcBundlingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/bundling", "Bundleable")
@js.native
class Bundleable protected ()
  extends googleDashGaxLib.buildSrcApiCallableMod.NormalApiCaller {
  /**
    * Creates an API caller that bundles requests.
    *
    * @private
    * @constructor
    * @param {BundleExecutor} bundler - bundles API calls.
    */
  def this(bundler: BundleExecutor) = this()
  var bundler: BundleExecutor = js.native
  def call(
    apiCall: googleDashGaxLib.buildSrcApiCallableMod.APICall,
    argument: js.Object,
    settings: googleDashGaxLib.buildSrcGaxMod.CallSettings,
    status: js.Any
  ): scala.Unit = js.native
}

