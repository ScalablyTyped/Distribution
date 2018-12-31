package typings
package atGoogleDashCloudStorageLib.buildSrcAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AclOptions extends js.Object {
  var pathPrefix: java.lang.String = js.native
  @JSName("request")
  var request_Original: requestLib.requestMod.requestNs.RequestAPI[
    requestLib.requestMod.requestNs.Request, 
    requestLib.requestMod.requestNs.CoreOptions, 
    requestLib.requestMod.requestNs.RequiredUriUrl
  ] = js.native
  def request(
    options: requestLib.requestMod.requestNs.RequiredUriUrl with requestLib.requestMod.requestNs.CoreOptions
  ): requestLib.requestMod.requestNs.Request = js.native
  def request(
    options: requestLib.requestMod.requestNs.RequiredUriUrl with requestLib.requestMod.requestNs.CoreOptions,
    callback: requestLib.requestMod.requestNs.RequestCallback
  ): requestLib.requestMod.requestNs.Request = js.native
  def request(uri: java.lang.String): requestLib.requestMod.requestNs.Request = js.native
  def request(uri: java.lang.String, callback: requestLib.requestMod.requestNs.RequestCallback): requestLib.requestMod.requestNs.Request = js.native
  def request(uri: java.lang.String, options: requestLib.requestMod.requestNs.CoreOptions): requestLib.requestMod.requestNs.Request = js.native
  def request(
    uri: java.lang.String,
    options: requestLib.requestMod.requestNs.CoreOptions,
    callback: requestLib.requestMod.requestNs.RequestCallback
  ): requestLib.requestMod.requestNs.Request = js.native
}

