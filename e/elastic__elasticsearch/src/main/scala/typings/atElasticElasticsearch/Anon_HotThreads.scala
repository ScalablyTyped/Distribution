package typings.atElasticElasticsearch

import typings.atElasticElasticsearch.apiRequestParamsMod.NodesHotThreads
import typings.atElasticElasticsearch.apiRequestParamsMod.NodesInfo
import typings.atElasticElasticsearch.apiRequestParamsMod.NodesReloadSecureSettings
import typings.atElasticElasticsearch.apiRequestParamsMod.NodesStats
import typings.atElasticElasticsearch.apiRequestParamsMod.NodesUsage
import typings.atElasticElasticsearch.atElasticElasticsearchMod.ApiMethod
import typings.atElasticElasticsearch.atElasticElasticsearchMod.callbackFn
import typings.atElasticElasticsearch.libTransportMod.ApiResponse
import typings.atElasticElasticsearch.libTransportMod.TransportRequestCallback
import typings.atElasticElasticsearch.libTransportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_HotThreads extends js.Object {
  @JSName("hotThreads")
  var hotThreads_Original: ApiMethod[NodesHotThreads, _] = js.native
  @JSName("hot_threads")
  var hot_threads_Original: ApiMethod[NodesHotThreads, _] = js.native
  @JSName("info")
  var info_Original: ApiMethod[NodesInfo, _] = js.native
  @JSName("reloadSecureSettings")
  var reloadSecureSettings_Original: ApiMethod[NodesReloadSecureSettings, _] = js.native
  @JSName("reload_secure_settings")
  var reload_secure_settings_Original: ApiMethod[NodesReloadSecureSettings, _] = js.native
  @JSName("stats")
  var stats_Original: ApiMethod[NodesStats, _] = js.native
  @JSName("usage")
  var usage_Original: ApiMethod[NodesUsage, _] = js.native
  // Promise API
  def hotThreads(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def hotThreads(callback: callbackFn[_]): TransportRequestCallback = js.native
  def hotThreads(params: NodesHotThreads): js.Promise[ApiResponse[_, _]] = js.native
  def hotThreads(params: NodesHotThreads, callback: callbackFn[_]): TransportRequestCallback = js.native
  def hotThreads(params: NodesHotThreads, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def hotThreads(params: NodesHotThreads, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def hot_threads(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def hot_threads(callback: callbackFn[_]): TransportRequestCallback = js.native
  def hot_threads(params: NodesHotThreads): js.Promise[ApiResponse[_, _]] = js.native
  def hot_threads(params: NodesHotThreads, callback: callbackFn[_]): TransportRequestCallback = js.native
  def hot_threads(params: NodesHotThreads, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def hot_threads(params: NodesHotThreads, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def info(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def info(callback: callbackFn[_]): TransportRequestCallback = js.native
  def info(params: NodesInfo): js.Promise[ApiResponse[_, _]] = js.native
  def info(params: NodesInfo, callback: callbackFn[_]): TransportRequestCallback = js.native
  def info(params: NodesInfo, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def info(params: NodesInfo, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def reloadSecureSettings(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def reloadSecureSettings(callback: callbackFn[_]): TransportRequestCallback = js.native
  def reloadSecureSettings(params: NodesReloadSecureSettings): js.Promise[ApiResponse[_, _]] = js.native
  def reloadSecureSettings(params: NodesReloadSecureSettings, callback: callbackFn[_]): TransportRequestCallback = js.native
  def reloadSecureSettings(params: NodesReloadSecureSettings, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def reloadSecureSettings(params: NodesReloadSecureSettings, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def reload_secure_settings(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def reload_secure_settings(callback: callbackFn[_]): TransportRequestCallback = js.native
  def reload_secure_settings(params: NodesReloadSecureSettings): js.Promise[ApiResponse[_, _]] = js.native
  def reload_secure_settings(params: NodesReloadSecureSettings, callback: callbackFn[_]): TransportRequestCallback = js.native
  def reload_secure_settings(params: NodesReloadSecureSettings, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def reload_secure_settings(params: NodesReloadSecureSettings, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def stats(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def stats(callback: callbackFn[_]): TransportRequestCallback = js.native
  def stats(params: NodesStats): js.Promise[ApiResponse[_, _]] = js.native
  def stats(params: NodesStats, callback: callbackFn[_]): TransportRequestCallback = js.native
  def stats(params: NodesStats, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def stats(params: NodesStats, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def usage(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def usage(callback: callbackFn[_]): TransportRequestCallback = js.native
  def usage(params: NodesUsage): js.Promise[ApiResponse[_, _]] = js.native
  def usage(params: NodesUsage, callback: callbackFn[_]): TransportRequestCallback = js.native
  def usage(params: NodesUsage, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def usage(params: NodesUsage, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

