package typings
package googleDashGaxLib.buildSrcBundlingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/bundling", "BundleExecutor")
@js.native
class BundleExecutor protected () extends js.Object {
  /**
    * Organizes requests for an api service that requires to bundle them.
    *
    * @param {BundleOptions} bundleOptions - configures strategy this instance
    *   uses when executing bundled functions.
    * @param {BundleDescriptor} bundleDescriptor - the description of the bundling.
    * @constructor
    */
  def this(bundleOptions: BundleOptions, bundleDescriptor: BundleDescriptor) = this()
  var _descriptor: BundleDescriptor = js.native
  var _invocationId: scala.Double = js.native
  var _invocations: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  var _options: BundleOptions = js.native
  var _tasks: org.scalablytyped.runtime.StringDictionary[Task] = js.native
  var _timers: org.scalablytyped.runtime.StringDictionary[nodeLib.NodeJSNs.Timer] = js.native
  /**
    * Cancels an event.
    *
    * @param {String} id - The id for the event in the task.
    * @private
    */
  def _cancel(id: java.lang.String): scala.Unit = js.native
  /**
    * Clears scheduled timeout if it exists.
    *
    * @param {String} bundleId - the id for the task whose timeout needs to be
    *   cleared.
    * @private
    */
  def _maybeClearTimeout(bundleId: java.lang.String): scala.Unit = js.native
  /**
    * Invokes a task.
    *
    * @param {String} bundleId - The id for the task.
    * @private
    */
  def _runNow(bundleId: java.lang.String): scala.Unit = js.native
  /**
    * Schedule a method call.
    *
    * @param {function} apiCall - the function for an API call.
    * @param {Object} request - the request object to be bundled with others.
    * @param {APICallback} callback - the callback to be called when the method finished.
    * @return {function()} - the function to cancel the scheduled invocation.
    */
  def schedule(
    apiCall: googleDashGaxLib.buildSrcApiCallableMod.APICall,
    request: org.scalablytyped.runtime.StringDictionary[js.Array[js.Object] | java.lang.String]
  ): js.Any = js.native
  def schedule(
    apiCall: googleDashGaxLib.buildSrcApiCallableMod.APICall,
    request: org.scalablytyped.runtime.StringDictionary[js.Array[js.Object] | java.lang.String],
    callback: TaskCallback
  ): js.Any = js.native
}

