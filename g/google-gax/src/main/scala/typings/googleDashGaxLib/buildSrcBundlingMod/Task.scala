package typings
package googleDashGaxLib.buildSrcBundlingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/bundling", "Task")
@js.native
class Task protected () extends js.Object {
  /**
    * A task coordinates the execution of a single bundle.
    *
    * @param {function} apiCall - The function to conduct calling API.
    * @param {Object} bundlingRequest - The base request object to be used
    *   for the actual API call.
    * @param {string} bundledField - The name of the field in bundlingRequest
    *   to be bundled.
    * @param {string=} subresponseField - The name of the field in the response
    *   to be passed to the callback.
    * @constructor
    * @private
    */
  def this(apiCall: googleDashGaxLib.buildSrcApiCallableMod.APICall, bundlingRequest: js.Object, bundledField: java.lang.String) = this()
  def this(apiCall: googleDashGaxLib.buildSrcApiCallableMod.APICall, bundlingRequest: js.Object, bundledField: java.lang.String, subresponseField: java.lang.String) = this()
  @JSName("_apiCall")
  var _apiCall_Original: googleDashGaxLib.buildSrcApiCallableMod.APICall = js.native
  var _bundledField: java.lang.String = js.native
  var _data: js.Array[TaskData] = js.native
  var _request: org.scalablytyped.runtime.StringDictionary[js.Array[TaskElement]] = js.native
  var _subresponseField: js.UndefOr[java.lang.String | scala.Null] = js.native
  var callCanceller: js.UndefOr[googleDashGaxLib.buildSrcApiCallableMod.PromiseCanceller[_]] = js.native
  def _apiCall(): js.Any = js.native
  def _apiCall(argument: js.Object): js.Any = js.native
  def _apiCall(argument: js.Object, callOptions: js.Object): js.Any = js.native
  def _apiCall(
    argument: js.Object,
    callOptions: js.Object,
    callback: googleDashGaxLib.buildSrcApiCallableMod.APICallback
  ): js.Any = js.native
  def _apiCall(
    argument: js.Object,
    callOptions: scala.Null,
    callback: googleDashGaxLib.buildSrcApiCallableMod.APICallback
  ): js.Any = js.native
  def _apiCall(argument: scala.Null, callOptions: js.Object): js.Any = js.native
  def _apiCall(
    argument: scala.Null,
    callOptions: js.Object,
    callback: googleDashGaxLib.buildSrcApiCallableMod.APICallback
  ): js.Any = js.native
  def _apiCall(
    argument: scala.Null,
    callOptions: scala.Null,
    callback: googleDashGaxLib.buildSrcApiCallableMod.APICallback
  ): js.Any = js.native
  /**
    * Cancels a part of elements.
    * @param {string} id - The identifier of the part of elements.
    * @return {boolean} Whether the entire task will be canceled or not.
    */
  def cancel(id: java.lang.String): scala.Boolean = js.native
  /**
    * Appends the list of elements into the task.
    * @param {Object[]} elements - the new list of elements.
    * @param {number} bytes - the byte size required to encode elements in the API.
    * @param {APICallback} callback - the callback of the method call.
    */
  def extend(elements: js.Array[TaskElement], bytes: scala.Double, callback: TaskCallback): scala.Unit = js.native
  /**
    * Returns the number of elements in a task.
    * @return {number} The number of elements.
    */
  def getElementCount(): scala.Double = js.native
  /**
    * Returns the total byte size of the elements in a task.
    * @return {number} The byte size.
    */
  def getRequestByteSize(): scala.Double = js.native
  /**
    * Invokes the actual API call with current elements.
    * @return {string[]} - the list of ids for invocations to be run.
    */
  def run(): js.Array[java.lang.String] = js.native
}

