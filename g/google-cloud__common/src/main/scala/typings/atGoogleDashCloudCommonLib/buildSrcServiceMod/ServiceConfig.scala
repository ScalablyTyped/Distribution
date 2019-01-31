package typings
package atGoogleDashCloudCommonLib.buildSrcServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceConfig extends js.Object {
  /**
    * Reuse an existing GoogleAuth client instead of creating a new one.
    */
  var authClient: js.UndefOr[googleDashAuthDashLibraryLib.googleDashAuthDashLibraryMod.GoogleAuth] = js.native
  /**
    * The base URL to make API requests to.
    */
  var baseUrl: java.lang.String = js.native
  var packageJson: atGoogleDashCloudCommonLib.buildSrcUtilMod.PackageJson = js.native
  var projectIdRequired: js.UndefOr[scala.Boolean] = js.native
  @JSName("requestModule")
  var requestModule_Original: atGoogleDashCloudCommonLib.Anon_Request with (requestLib.requestMod.requestNs.RequestAPI[
    requestLib.requestMod.requestNs.Request, 
    requestLib.requestMod.requestNs.CoreOptions, 
    requestLib.requestMod.requestNs.RequiredUriUrl
  ]) = js.native
  /**
    * The scopes required for the request.
    */
  var scopes: js.Array[java.lang.String] = js.native
  def requestModule(
    options: requestLib.requestMod.requestNs.RequiredUriUrl with requestLib.requestMod.requestNs.CoreOptions
  ): requestLib.requestMod.requestNs.Request = js.native
  def requestModule(
    options: requestLib.requestMod.requestNs.RequiredUriUrl with requestLib.requestMod.requestNs.CoreOptions,
    callback: requestLib.requestMod.requestNs.RequestCallback
  ): requestLib.requestMod.requestNs.Request = js.native
  def requestModule(uri: java.lang.String): requestLib.requestMod.requestNs.Request = js.native
  def requestModule(uri: java.lang.String, callback: requestLib.requestMod.requestNs.RequestCallback): requestLib.requestMod.requestNs.Request = js.native
  def requestModule(uri: java.lang.String, options: requestLib.requestMod.requestNs.CoreOptions): requestLib.requestMod.requestNs.Request = js.native
  def requestModule(
    uri: java.lang.String,
    options: requestLib.requestMod.requestNs.CoreOptions,
    callback: requestLib.requestMod.requestNs.RequestCallback
  ): requestLib.requestMod.requestNs.Request = js.native
}

