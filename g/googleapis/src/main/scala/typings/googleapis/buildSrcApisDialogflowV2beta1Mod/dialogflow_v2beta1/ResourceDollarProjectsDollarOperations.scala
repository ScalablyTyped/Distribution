package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dialogflow/v2beta1", "dialogflow_v2beta1.Resource$Projects$Operations")
@js.native
class ResourceDollarProjectsDollarOperations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dialogflow.projects.operations.get
    * @desc Gets the latest state of a long-running operation.  Clients can use
    * this method to poll the operation result at intervals as recommended by
    * the API service.
    * @alias dialogflow.projects.operations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the operation resource.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def get(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarOperationsDollarGet): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarGet,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarGet,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarOperationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
}

