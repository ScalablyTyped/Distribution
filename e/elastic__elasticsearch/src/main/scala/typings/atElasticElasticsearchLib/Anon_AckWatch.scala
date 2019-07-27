package typings
package atElasticElasticsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AckWatch extends js.Object {
  @JSName("ackWatch")
  var ackWatch_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.WatcherAckWatch, _] = js.native
  @JSName("ack_watch")
  var ack_watch_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.WatcherAckWatch, _] = js.native
  @JSName("activateWatch")
  var activateWatch_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.WatcherActivateWatch, _] = js.native
  @JSName("activate_watch")
  var activate_watch_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.WatcherActivateWatch, _] = js.native
  @JSName("deactivateWatch")
  var deactivateWatch_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.WatcherDeactivateWatch, _] = js.native
  @JSName("deactivate_watch")
  var deactivate_watch_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.WatcherDeactivateWatch, _] = js.native
  @JSName("deleteWatch")
  var deleteWatch_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.WatcherDeleteWatch, _] = js.native
  @JSName("delete_watch")
  var delete_watch_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.WatcherDeleteWatch, _] = js.native
  @JSName("executeWatch")
  var executeWatch_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.WatcherExecuteWatch[_], _] = js.native
  @JSName("execute_watch")
  var execute_watch_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.WatcherExecuteWatch[_], _] = js.native
  @JSName("getWatch")
  var getWatch_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.WatcherGetWatch, _] = js.native
  @JSName("get_watch")
  var get_watch_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.WatcherGetWatch, _] = js.native
  @JSName("putWatch")
  var putWatch_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.WatcherPutWatch[_], _] = js.native
  @JSName("put_watch")
  var put_watch_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.WatcherPutWatch[_], _] = js.native
  @JSName("start")
  var start_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.WatcherStart, _] = js.native
  @JSName("stats")
  var stats_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.WatcherStats, _] = js.native
  @JSName("stop")
  var stop_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.WatcherStop, _] = js.native
  // Promise API
  def ackWatch(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def ackWatch(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def ackWatch(params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherAckWatch): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def ackWatch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherAckWatch,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def ackWatch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherAckWatch,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def ackWatch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherAckWatch,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def ack_watch(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def ack_watch(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def ack_watch(params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherAckWatch): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def ack_watch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherAckWatch,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def ack_watch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherAckWatch,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def ack_watch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherAckWatch,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def activateWatch(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def activateWatch(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def activateWatch(params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherActivateWatch): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def activateWatch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherActivateWatch,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def activateWatch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherActivateWatch,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def activateWatch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherActivateWatch,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def activate_watch(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def activate_watch(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def activate_watch(params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherActivateWatch): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def activate_watch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherActivateWatch,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def activate_watch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherActivateWatch,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def activate_watch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherActivateWatch,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def deactivateWatch(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def deactivateWatch(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def deactivateWatch(params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherDeactivateWatch): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def deactivateWatch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherDeactivateWatch,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def deactivateWatch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherDeactivateWatch,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def deactivateWatch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherDeactivateWatch,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def deactivate_watch(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def deactivate_watch(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def deactivate_watch(params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherDeactivateWatch): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def deactivate_watch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherDeactivateWatch,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def deactivate_watch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherDeactivateWatch,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def deactivate_watch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherDeactivateWatch,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def deleteWatch(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def deleteWatch(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def deleteWatch(params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherDeleteWatch): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def deleteWatch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherDeleteWatch,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def deleteWatch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherDeleteWatch,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def deleteWatch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherDeleteWatch,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def delete_watch(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def delete_watch(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def delete_watch(params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherDeleteWatch): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def delete_watch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherDeleteWatch,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def delete_watch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherDeleteWatch,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def delete_watch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherDeleteWatch,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def executeWatch(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def executeWatch(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def executeWatch(params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherExecuteWatch[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def executeWatch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherExecuteWatch[_],
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def executeWatch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherExecuteWatch[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def executeWatch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherExecuteWatch[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def execute_watch(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def execute_watch(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def execute_watch(params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherExecuteWatch[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def execute_watch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherExecuteWatch[_],
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def execute_watch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherExecuteWatch[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def execute_watch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherExecuteWatch[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def getWatch(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def getWatch(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def getWatch(params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherGetWatch): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def getWatch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherGetWatch,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def getWatch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherGetWatch,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def getWatch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherGetWatch,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def get_watch(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def get_watch(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def get_watch(params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherGetWatch): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def get_watch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherGetWatch,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def get_watch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherGetWatch,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def get_watch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherGetWatch,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def putWatch(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def putWatch(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def putWatch(params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherPutWatch[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def putWatch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherPutWatch[_],
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def putWatch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherPutWatch[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def putWatch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherPutWatch[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def put_watch(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def put_watch(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def put_watch(params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherPutWatch[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def put_watch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherPutWatch[_],
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def put_watch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherPutWatch[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def put_watch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherPutWatch[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def start(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def start(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def start(params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherStart): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def start(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherStart,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def start(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherStart,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def start(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherStart,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def stats(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def stats(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def stats(params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherStats): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def stats(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherStats,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def stats(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherStats,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def stats(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherStats,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def stop(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def stop(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def stop(params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherStop): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def stop(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherStop,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def stop(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherStop,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def stop(
    params: atElasticElasticsearchLib.apiRequestParamsMod.WatcherStop,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
}

