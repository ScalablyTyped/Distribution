package typings
package gaxiosLib.buildSrcGaxiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gaxios/build/src/gaxios", "Gaxios")
@js.native
/**
  * The Gaxios class is responsible for making HTTP requests.
  * @param defaults The default set of options to be used for this instance.
  */
class Gaxios () extends js.Object {
  def this(defaults: gaxiosLib.buildSrcCommonMod.GaxiosOptions) = this()
  var agentCache: js.Any = js.native
  /**
    * Default HTTP options that will be used for every HTTP request.
    */
  var defaults: gaxiosLib.buildSrcCommonMod.GaxiosOptions = js.native
  var getResponseData: js.Any = js.native
  var isReadableStream: js.Any = js.native
  /**
    * Encode a set of key/value pars into a querystring format (?foo=bar&baz=boo)
    * @param params key value pars to encode
    */
  var paramsSerializer: js.Any = js.native
  var translateResponse: js.Any = js.native
  /**
    * Validate the options, and massage them to match the fetch format.
    * @param opts The original options passed from the client.
    */
  var validateOpts: js.Any = js.native
  /**
    * By default, throw for any non-2xx status code
    * @param status status code from the HTTP response
    */
  var validateStatus: js.Any = js.native
  /**
    * Perform an HTTP request with the given options.
    * @param opts Set of HTTP options that will be used for this HTTP request.
    */
  def request[T](): gaxiosLib.buildSrcCommonMod.GaxiosPromise[T] = js.native
  def request[T](opts: gaxiosLib.buildSrcCommonMod.GaxiosOptions): gaxiosLib.buildSrcCommonMod.GaxiosPromise[T] = js.native
}

