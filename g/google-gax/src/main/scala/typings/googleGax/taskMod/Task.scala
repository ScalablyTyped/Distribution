package typings.googleGax.taskMod

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.apitypesMod.APICallback
import typings.googleGax.apitypesMod.GRPCCallResult
import typings.googleGax.apitypesMod.RequestType
import typings.googleGax.apitypesMod.SimpleCallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/bundlingCalls/task", "Task")
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
  def this(apiCall: SimpleCallbackFunction, bundlingRequest: js.Object, bundledField: String) = this()
  def this(
    apiCall: SimpleCallbackFunction,
    bundlingRequest: js.Object,
    bundledField: String,
    subresponseField: String
  ) = this()
  @JSName("_apiCall")
  var _apiCall_Original: SimpleCallbackFunction = js.native
  var _bundledField: String = js.native
  var _data: js.Array[TaskData] = js.native
  var _request: StringDictionary[js.Array[TaskElement]] = js.native
  var _subresponseField: js.UndefOr[String | Null] = js.native
  var callCanceller: js.UndefOr[GRPCCallResult] = js.native
  def _apiCall(request: RequestType, callback: APICallback): GRPCCallResult = js.native
  /**
    * Cancels a part of elements.
    * @param {string} id - The identifier of the part of elements.
    * @return {boolean} Whether the entire task will be canceled or not.
    */
  def cancel(id: String): Boolean = js.native
  /**
    * Appends the list of elements into the task.
    * @param {Object[]} elements - the new list of elements.
    * @param {number} bytes - the byte size required to encode elements in the API.
    * @param {APICallback} callback - the callback of the method call.
    */
  def extend(elements: js.Array[TaskElement], bytes: Double, callback: TaskCallback): Unit = js.native
  /**
    * Returns the number of elements in a task.
    * @return {number} The number of elements.
    */
  def getElementCount(): Double = js.native
  /**
    * Returns the total byte size of the elements in a task.
    * @return {number} The byte size.
    */
  def getRequestByteSize(): Double = js.native
  /**
    * Invokes the actual API call with current elements.
    * @return {string[]} - the list of ids for invocations to be run.
    */
  def run(): js.Array[String] = js.native
}

