package typings.googleapis.buildSrcApisGenomicsV2alpha1Mod.genomics_v2alpha1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/genomics/v2alpha1", "genomics_v2alpha1.Resource$Workers")
@js.native
class Resource$Workers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * genomics.workers.checkIn
    * @desc The worker uses this method to retrieve the assigned operation and
    * provide periodic status updates.
    * @alias genomics.workers.checkIn
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The worker id, assigned when it was created.
    * @param {().CheckInRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def checkIn(): GaxiosPromise[Schema$CheckInResponse] = js.native
  def checkIn(callback: BodyResponseCallback[Schema$CheckInResponse]): Unit = js.native
  def checkIn(params: ParamsDollarResourceDollarWorkersDollarCheckin): GaxiosPromise[Schema$CheckInResponse] = js.native
  def checkIn(
    params: ParamsDollarResourceDollarWorkersDollarCheckin,
    callback: BodyResponseCallback[Schema$CheckInResponse]
  ): Unit = js.native
  def checkIn(
    params: ParamsDollarResourceDollarWorkersDollarCheckin,
    options: BodyResponseCallback[Schema$CheckInResponse],
    callback: BodyResponseCallback[Schema$CheckInResponse]
  ): Unit = js.native
  def checkIn(params: ParamsDollarResourceDollarWorkersDollarCheckin, options: MethodOptions): GaxiosPromise[Schema$CheckInResponse] = js.native
  def checkIn(
    params: ParamsDollarResourceDollarWorkersDollarCheckin,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CheckInResponse]
  ): Unit = js.native
}

