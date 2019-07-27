package typings
package atElasticElasticsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Info extends js.Object {
  @JSName("info")
  var info_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.XpackInfo, _] = js.native
  @JSName("usage")
  var usage_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.XpackUsage, _] = js.native
  // Promise API
  def info(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def info(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def info(params: atElasticElasticsearchLib.apiRequestParamsMod.XpackInfo): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def info(
    params: atElasticElasticsearchLib.apiRequestParamsMod.XpackInfo,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def info(
    params: atElasticElasticsearchLib.apiRequestParamsMod.XpackInfo,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def info(
    params: atElasticElasticsearchLib.apiRequestParamsMod.XpackInfo,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def usage(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def usage(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def usage(params: atElasticElasticsearchLib.apiRequestParamsMod.XpackUsage): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def usage(
    params: atElasticElasticsearchLib.apiRequestParamsMod.XpackUsage,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def usage(
    params: atElasticElasticsearchLib.apiRequestParamsMod.XpackUsage,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def usage(
    params: atElasticElasticsearchLib.apiRequestParamsMod.XpackUsage,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
}

