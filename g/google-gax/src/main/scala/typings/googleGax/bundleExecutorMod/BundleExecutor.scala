package typings.googleGax.bundleExecutorMod

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.apitypesMod.GRPCCallResult
import typings.googleGax.apitypesMod.SimpleCallbackFunction
import typings.googleGax.bundleDescriptorMod.BundleDescriptor
import typings.googleGax.taskMod.Task
import typings.googleGax.taskMod.TaskCallback
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/bundlingCalls/bundleExecutor", "BundleExecutor")
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
  /**
    * Cancels an event.
    *
    * @param {String} id - The id for the event in the task.
    * @private
    */
  var _cancel: js.Any = js.native
  var _descriptor: BundleDescriptor = js.native
  var _invocationId: Double = js.native
  var _invocations: StringDictionary[String] = js.native
  /**
    * Clears scheduled timeout if it exists.
    *
    * @param {String} bundleId - the id for the task whose timeout needs to be
    *   cleared.
    * @private
    */
  var _maybeClearTimeout: js.Any = js.native
  var _options: BundleOptions = js.native
  var _tasks: StringDictionary[Task] = js.native
  var _timers: StringDictionary[
    ReturnType[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof setTimeout */ _
    ]
  ] = js.native
  /**
    * Invokes a task.
    *
    * @param {String} bundleId - The id for the task.
    * @private
    */
  def _runNow(bundleId: String): Unit = js.native
  /**
    * Schedule a method call.
    *
    * @param {function} apiCall - the function for an API call.
    * @param {Object} request - the request object to be bundled with others.
    * @param {APICallback} callback - the callback to be called when the method finished.
    * @return {function()} - the function to cancel the scheduled invocation.
    */
  def schedule(apiCall: SimpleCallbackFunction, request: StringDictionary[js.Array[js.Object] | String]): GRPCCallResult = js.native
  def schedule(
    apiCall: SimpleCallbackFunction,
    request: StringDictionary[js.Array[js.Object] | String],
    callback: TaskCallback
  ): GRPCCallResult = js.native
}

