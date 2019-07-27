package typings
package atElasticElasticsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Delete extends js.Object {
  @JSName("delete")
  var delete_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.LicenseDelete, _] = js.native
  @JSName("getBasicStatus")
  var getBasicStatus_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.LicenseGetBasicStatus, _] = js.native
  @JSName("getTrialStatus")
  var getTrialStatus_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.LicenseGetTrialStatus, _] = js.native
  @JSName("get")
  var get_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.LicenseGet, _] = js.native
  @JSName("get_basic_status")
  var get_basic_status_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.LicenseGetBasicStatus, _] = js.native
  @JSName("get_trial_status")
  var get_trial_status_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.LicenseGetTrialStatus, _] = js.native
  @JSName("postStartBasic")
  var postStartBasic_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.LicensePostStartBasic, _] = js.native
  @JSName("postStartTrial")
  var postStartTrial_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.LicensePostStartTrial, _] = js.native
  @JSName("post")
  var post_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.LicensePost[_], _] = js.native
  @JSName("post_start_basic")
  var post_start_basic_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.LicensePostStartBasic, _] = js.native
  @JSName("post_start_trial")
  var post_start_trial_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.LicensePostStartTrial, _] = js.native
  // Promise API
  def delete(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def delete(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def delete(params: atElasticElasticsearchLib.apiRequestParamsMod.LicenseDelete): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def delete(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicenseDelete,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def delete(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicenseDelete,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def delete(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicenseDelete,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def get(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def get(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def get(params: atElasticElasticsearchLib.apiRequestParamsMod.LicenseGet): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def get(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicenseGet,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def get(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicenseGet,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def get(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicenseGet,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def getBasicStatus(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def getBasicStatus(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def getBasicStatus(params: atElasticElasticsearchLib.apiRequestParamsMod.LicenseGetBasicStatus): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def getBasicStatus(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicenseGetBasicStatus,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def getBasicStatus(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicenseGetBasicStatus,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def getBasicStatus(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicenseGetBasicStatus,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def getTrialStatus(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def getTrialStatus(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def getTrialStatus(params: atElasticElasticsearchLib.apiRequestParamsMod.LicenseGetTrialStatus): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def getTrialStatus(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicenseGetTrialStatus,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def getTrialStatus(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicenseGetTrialStatus,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def getTrialStatus(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicenseGetTrialStatus,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def get_basic_status(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def get_basic_status(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def get_basic_status(params: atElasticElasticsearchLib.apiRequestParamsMod.LicenseGetBasicStatus): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def get_basic_status(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicenseGetBasicStatus,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def get_basic_status(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicenseGetBasicStatus,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def get_basic_status(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicenseGetBasicStatus,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def get_trial_status(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def get_trial_status(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def get_trial_status(params: atElasticElasticsearchLib.apiRequestParamsMod.LicenseGetTrialStatus): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def get_trial_status(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicenseGetTrialStatus,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def get_trial_status(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicenseGetTrialStatus,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def get_trial_status(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicenseGetTrialStatus,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def post(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def post(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def post(params: atElasticElasticsearchLib.apiRequestParamsMod.LicensePost[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def post(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicensePost[_],
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def post(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicensePost[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def post(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicensePost[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def postStartBasic(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def postStartBasic(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def postStartBasic(params: atElasticElasticsearchLib.apiRequestParamsMod.LicensePostStartBasic): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def postStartBasic(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicensePostStartBasic,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def postStartBasic(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicensePostStartBasic,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def postStartBasic(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicensePostStartBasic,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def postStartTrial(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def postStartTrial(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def postStartTrial(params: atElasticElasticsearchLib.apiRequestParamsMod.LicensePostStartTrial): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def postStartTrial(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicensePostStartTrial,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def postStartTrial(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicensePostStartTrial,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def postStartTrial(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicensePostStartTrial,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def post_start_basic(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def post_start_basic(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def post_start_basic(params: atElasticElasticsearchLib.apiRequestParamsMod.LicensePostStartBasic): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def post_start_basic(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicensePostStartBasic,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def post_start_basic(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicensePostStartBasic,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def post_start_basic(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicensePostStartBasic,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def post_start_trial(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def post_start_trial(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def post_start_trial(params: atElasticElasticsearchLib.apiRequestParamsMod.LicensePostStartTrial): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def post_start_trial(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicensePostStartTrial,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def post_start_trial(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicensePostStartTrial,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def post_start_trial(
    params: atElasticElasticsearchLib.apiRequestParamsMod.LicensePostStartTrial,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
}

