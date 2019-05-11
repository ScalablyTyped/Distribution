package typings
package googleDashGaxLib.buildSrcPagedIterationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/pagedIteration", "PageDescriptor")
@js.native
class PageDescriptor protected () extends js.Object {
  /**
    * Describes the structure of a page-streaming call.
    *
    * @property {String} requestPageTokenField
    * @property {String} responsePageTokenField
    * @property {String} resourceField
    *
    * @param {String} requestPageTokenField - The field name of the page token in
    *   the request.
    * @param {String} responsePageTokenField - The field name of the page token in
    *   the response.
    * @param {String} resourceField - The resource field name.
    *
    * @constructor
    */
  def this(requestPageTokenField: java.lang.String, responsePageTokenField: java.lang.String, resourceField: java.lang.String) = this()
  var requestPageSizeField: js.UndefOr[java.lang.String] = js.native
  var requestPageTokenField: java.lang.String = js.native
  var resourceField: java.lang.String = js.native
  var responsePageTokenField: java.lang.String = js.native
  /**
    * Returns a new API caller.
    * @private
    * @return {PageStreamable} - the page streaming caller.
    */
  def apiCaller(): PagedIteration = js.native
  /**
    * Creates a new object Stream which emits the resource on 'data' event.
    * @private
    * @param {ApiCall} apiCall - the callable object.
    * @param {Object} request - the request object.
    * @param {CallOptions=} options - the call options to customize the api call.
    * @return {Stream} - a new object Stream.
    */
  def createStream(apiCall: googleDashGaxLib.buildSrcApiCallableMod.APICall, request: js.Any, options: js.Any): nodeLib.streamMod.Transform = js.native
}

