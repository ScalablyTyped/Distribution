package typings
package atGoogleDashCloudCommonLib.buildSrcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MakeWritableStreamOptions extends js.Object {
  /**
    * A connection instance used to get a token with and send the request
    * through.
    */
  var connection: js.UndefOr[js.Object] = js.native
  /**
    * Metadata to send at the head of the request.
    */
  var metadata: js.UndefOr[atGoogleDashCloudCommonLib.Anon_ContentType] = js.native
  /**
    * Request object, in the format of a standard Node.js http.request() object.
    */
  var request: js.UndefOr[requestLib.requestMod.requestNs.Options] = js.native
  /**
    * Dependency for HTTP calls.
    */
  @JSName("requestModule")
  var requestModule_Original: requestLib.requestMod.requestNs.RequestAPI[
    requestLib.requestMod.requestNs.Request, 
    requestLib.requestMod.requestNs.CoreOptions, 
    requestLib.requestMod.requestNs.RequiredUriUrl
  ] = js.native
  def makeAuthenticatedRequest(
    reqOpts: requestLib.requestMod.requestNs.OptionsWithUri,
    fnobj: atGoogleDashCloudCommonLib.Anon_OnAuthenticated
  ): scala.Unit = js.native
  /**
    * Dependency for HTTP calls.
    */
  def requestModule(
    options: requestLib.requestMod.requestNs.RequiredUriUrl with requestLib.requestMod.requestNs.CoreOptions
  ): requestLib.requestMod.requestNs.Request = js.native
  /**
    * Dependency for HTTP calls.
    */
  def requestModule(
    options: requestLib.requestMod.requestNs.RequiredUriUrl with requestLib.requestMod.requestNs.CoreOptions,
    callback: requestLib.requestMod.requestNs.RequestCallback
  ): requestLib.requestMod.requestNs.Request = js.native
  /**
    * Dependency for HTTP calls.
    */
  def requestModule(uri: java.lang.String): requestLib.requestMod.requestNs.Request = js.native
  /**
    * Dependency for HTTP calls.
    */
  def requestModule(uri: java.lang.String, callback: requestLib.requestMod.requestNs.RequestCallback): requestLib.requestMod.requestNs.Request = js.native
  /**
    * Dependency for HTTP calls.
    */
  def requestModule(uri: java.lang.String, options: requestLib.requestMod.requestNs.CoreOptions): requestLib.requestMod.requestNs.Request = js.native
  /**
    * Dependency for HTTP calls.
    */
  def requestModule(
    uri: java.lang.String,
    options: requestLib.requestMod.requestNs.CoreOptions,
    callback: requestLib.requestMod.requestNs.RequestCallback
  ): requestLib.requestMod.requestNs.Request = js.native
}

