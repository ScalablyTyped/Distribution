package typings
package atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceObjectConfig extends js.Object {
  /**
    * The base URL to make API requests to.
    */
  var baseUrl: js.UndefOr[java.lang.String] = js.native
  /**
    * The method which creates this object.
    */
  var createMethod: js.UndefOr[js.Function] = js.native
  /**
    * The identifier of the object. For example, the name of a Storage bucket or
    * Pub/Sub topic.
    */
  var id: js.UndefOr[java.lang.String] = js.native
  /**
    * A map of each method name that should be inherited.
    */
  var methods: js.UndefOr[Methods] = js.native
  /**
    * The parent service instance. For example, an instance of Storage if the
    * object is Bucket.
    */
  var parent: ServiceObjectParent = js.native
  /**
    * Dependency for HTTP calls.
    */
  @JSName("requestModule")
  var requestModule_Original: atGoogleDashCloudCommonLib.Anon_Request with (requestLib.requestMod.requestNs.RequestAPI[
    requestLib.requestMod.requestNs.Request, 
    requestLib.requestMod.requestNs.CoreOptions, 
    requestLib.requestMod.requestNs.RequiredUriUrl
  ]) = js.native
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

