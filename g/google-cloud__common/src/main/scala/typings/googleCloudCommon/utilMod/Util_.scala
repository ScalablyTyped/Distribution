package typings.googleCloudCommon.utilMod

import org.scalablytyped.runtime.Instantiable1
import typings.googleCloudCommon.anon.TypeofApiError
import typings.std.Error
import typings.teenyRequest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/common/build/src/util", "Util")
@js.native
class Util_ () extends js.Object {
  
  var ApiError: TypeofApiError = js.native
  
  var PartialFailureError: Instantiable1[/* b */ GoogleErrorBody, typings.googleCloudCommon.utilMod.PartialFailureError] = js.native
  
  /**
    * Decorate the options about to be made in a request.
    *
    * @param {object} reqOpts - The options to be passed to `request`.
    * @param {string} projectId - The project ID.
    * @return {object} reqOpts - The decorated reqOpts.
    */
  def decorateRequest(reqOpts: DecorateRequestOptions, projectId: String): DecorateRequestOptions = js.native
  
  /**
    * Create a properly-formatted User-Agent string from a package.json file.
    *
    * @param {object} packageJson - A module's package.json file.
    * @return {string} userAgent - The formatted User-Agent string.
    */
  def getUserAgentFromPackageJson(packageJson: PackageJson): String = js.native
  
  /**
    * Uniformly process an API response.
    *
    * @param {*} err - Error value.
    * @param {*} resp - Response value.
    * @param {*} body - Body value.
    * @param {function} callback - The callback function.
    */
  def handleResp(): Unit = js.native
  def handleResp(
    err: Null,
    resp: js.UndefOr[scala.Nothing],
    body: js.UndefOr[scala.Nothing],
    callback: BodyResponseCallback
  ): Unit = js.native
  def handleResp(err: Null, resp: js.UndefOr[scala.Nothing], body: ResponseBody): Unit = js.native
  def handleResp(err: Null, resp: js.UndefOr[scala.Nothing], body: ResponseBody, callback: BodyResponseCallback): Unit = js.native
  def handleResp(err: Null, resp: Null, body: js.UndefOr[scala.Nothing], callback: BodyResponseCallback): Unit = js.native
  def handleResp(err: Null, resp: Null, body: ResponseBody): Unit = js.native
  def handleResp(err: Null, resp: Null, body: ResponseBody, callback: BodyResponseCallback): Unit = js.native
  def handleResp(err: Null, resp: Response[_]): Unit = js.native
  def handleResp(err: Null, resp: Response[_], body: js.UndefOr[scala.Nothing], callback: BodyResponseCallback): Unit = js.native
  def handleResp(err: Null, resp: Response[_], body: ResponseBody): Unit = js.native
  def handleResp(err: Null, resp: Response[_], body: ResponseBody, callback: BodyResponseCallback): Unit = js.native
  def handleResp(err: Error): Unit = js.native
  def handleResp(
    err: Error,
    resp: js.UndefOr[scala.Nothing],
    body: js.UndefOr[scala.Nothing],
    callback: BodyResponseCallback
  ): Unit = js.native
  def handleResp(err: Error, resp: js.UndefOr[scala.Nothing], body: ResponseBody): Unit = js.native
  def handleResp(err: Error, resp: js.UndefOr[scala.Nothing], body: ResponseBody, callback: BodyResponseCallback): Unit = js.native
  def handleResp(err: Error, resp: Null, body: js.UndefOr[scala.Nothing], callback: BodyResponseCallback): Unit = js.native
  def handleResp(err: Error, resp: Null, body: ResponseBody): Unit = js.native
  def handleResp(err: Error, resp: Null, body: ResponseBody, callback: BodyResponseCallback): Unit = js.native
  def handleResp(err: Error, resp: Response[_]): Unit = js.native
  def handleResp(err: Error, resp: Response[_], body: js.UndefOr[scala.Nothing], callback: BodyResponseCallback): Unit = js.native
  def handleResp(err: Error, resp: Response[_], body: ResponseBody): Unit = js.native
  def handleResp(err: Error, resp: Response[_], body: ResponseBody, callback: BodyResponseCallback): Unit = js.native
  
  def isCustomType(unknown: js.Any, module: String): Boolean = js.native
  
  /**
    * Get a function for making authenticated requests.
    *
    * @param {object} config - Configuration object.
    * @param {boolean=} config.autoRetry - Automatically retry requests if the
    *     response is related to rate limits or certain intermittent server
    * errors. We will exponentially backoff subsequent requests by default.
    * (default: true)
    * @param {object=} config.credentials - Credentials object.
    * @param {boolean=} config.customEndpoint - If true, just return the provided request options. Default: false.
    * @param {string=} config.email - Account email address, required for PEM/P12 usage.
    * @param {number=} config.maxRetries - Maximum number of automatic retries attempted before returning the error. (default: 3)
    * @param {string=} config.keyFile - Path to a .json, .pem, or .p12 keyfile.
    * @param {array} config.scopes - Array of scopes required for the API.
    */
  def makeAuthenticatedRequestFactory(config: MakeAuthenticatedRequestFactoryConfig): MakeAuthenticatedRequest = js.native
  
  /**
    * Make a request through the `retryRequest` module with built-in error
    * handling and exponential back off.
    *
    * @param {object} reqOpts - Request options in the format `request` expects.
    * @param {object=} config - Configuration object.
    * @param {boolean=} config.autoRetry - Automatically retry requests if the
    *     response is related to rate limits or certain intermittent server
    * errors. We will exponentially backoff subsequent requests by default.
    * (default: true)
    * @param {number=} config.maxRetries - Maximum number of automatic retries
    *     attempted before returning the error. (default: 3)
    * @param {object=} config.request - HTTP module for request calls.
    * @param {function} callback - The callback function.
    */
  def makeRequest(reqOpts: DecorateRequestOptions, config: MakeRequestConfig, callback: BodyResponseCallback): Unit | Abortable = js.native
  
  /**
    * Take a Duplexify stream, fetch an authenticated connection header, and
    * create an outgoing writable stream.
    *
    * @param {Duplexify} dup - Duplexify stream.
    * @param {object} options - Configuration object.
    * @param {module:common/connection} options.connection - A connection instance used to get a token with and send the request through.
    * @param {object} options.metadata - Metadata to send at the head of the request.
    * @param {object} options.request - Request object, in the format of a standard Node.js http.request() object.
    * @param {string=} options.request.method - Default: "POST".
    * @param {string=} options.request.qs.uploadType - Default: "multipart".
    * @param {string=} options.streamContentType - Default: "application/octet-stream".
    * @param {function} onComplete - Callback, executed after the writable Request stream has completed.
    */
  def makeWritableStream(dup: Duplexify, options: MakeWritableStreamOptions): Unit = js.native
  def makeWritableStream(dup: Duplexify, options: MakeWritableStreamOptions, onComplete: js.Function): Unit = js.native
  
  /**
    * Given two parameters, figure out if this is either:
    *  - Just a callback function
    *  - An options object, and then a callback function
    * @param optionsOrCallback An options object or callback.
    * @param cb A potentially undefined callback.
    */
  def maybeOptionsOrCallback[T, C](): js.Tuple2[T, C] = js.native
  def maybeOptionsOrCallback[T, C](optionsOrCallback: C | T): js.Tuple2[T, C] = js.native
  def maybeOptionsOrCallback[T, C](optionsOrCallback: js.UndefOr[C | T], cb: C): js.Tuple2[T, C] = js.native
  
  /**
    * No op.
    *
    * @example
    * function doSomething(callback) {
    *   callback = callback || noop;
    * }
    */
  def noop(): Unit = js.native
  
  /**
    * Parse the response body from an HTTP request.
    *
    * @param {object} body - The response body.
    * @return {object} parsedHttpRespMessage - The parsed response.
    * @param {?error} parsedHttpRespMessage.err - An error detected.
    * @param {object} parsedHttpRespMessage.body - The original body value provided
    *     will try to be JSON.parse'd. If it's successful, the parsed value will
    * be returned here, otherwise the original value and an error will be returned.
    */
  def parseHttpRespBody(body: ResponseBody): ParsedHttpResponseBody = js.native
  
  /**
    * Sniff an incoming HTTP response message for errors.
    *
    * @param {object} httpRespMessage - An incoming HTTP response message from `request`.
    * @return {object} parsedHttpRespMessage - The parsed response.
    * @param {?error} parsedHttpRespMessage.err - An error detected.
    * @param {object} parsedHttpRespMessage.resp - The original response object.
    */
  def parseHttpRespMessage(httpRespMessage: Response[_]): ParsedHttpRespMessage = js.native
  
  /**
    * Returns true if the API request should be retried, given the error that was
    * given the first time the request was attempted. This is used for rate limit
    * related errors as well as intermittent server errors.
    *
    * @param {error} err - The API error to check if it is appropriate to retry.
    * @return {boolean} True if the API request should be retried, false otherwise.
    */
  def shouldRetryRequest(): Boolean = js.native
  def shouldRetryRequest(err: ApiError): Boolean = js.native
}
