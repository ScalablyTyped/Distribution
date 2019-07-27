package typings
package atElasticElasticsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Certificates extends js.Object {
  @JSName("certificates")
  var certificates_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.SslCertificates, _] = js.native
  // Promise API
  def certificates(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def certificates(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def certificates(params: atElasticElasticsearchLib.apiRequestParamsMod.SslCertificates): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def certificates(
    params: atElasticElasticsearchLib.apiRequestParamsMod.SslCertificates,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def certificates(
    params: atElasticElasticsearchLib.apiRequestParamsMod.SslCertificates,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def certificates(
    params: atElasticElasticsearchLib.apiRequestParamsMod.SslCertificates,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
}

