package typings.atElasticElasticsearch

import typings.atElasticElasticsearch.apiRequestParamsMod.SslCertificates
import typings.atElasticElasticsearch.atElasticElasticsearchMod.ApiMethod
import typings.atElasticElasticsearch.atElasticElasticsearchMod.callbackFn
import typings.atElasticElasticsearch.libTransportMod.ApiResponse
import typings.atElasticElasticsearch.libTransportMod.TransportRequestCallback
import typings.atElasticElasticsearch.libTransportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Certificates extends js.Object {
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

