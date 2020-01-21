package typings.elasticElasticsearch

import typings.elasticElasticsearch.mod.ApiMethod
import typings.elasticElasticsearch.mod.callbackFn
import typings.elasticElasticsearch.requestParamsMod.SslCertificates
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.TransportRequestCallback
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCertificates extends js.Object {
  @JSName("certificates")
  var certificates_Original: ApiMethod[SslCertificates, _] = js.native
  // Promise API
  def certificates(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def certificates(callback: callbackFn[_]): TransportRequestCallback = js.native
  def certificates(params: SslCertificates): js.Promise[ApiResponse[_, _]] = js.native
  def certificates(params: SslCertificates, callback: callbackFn[_]): TransportRequestCallback = js.native
  def certificates(params: SslCertificates, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def certificates(params: SslCertificates, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

