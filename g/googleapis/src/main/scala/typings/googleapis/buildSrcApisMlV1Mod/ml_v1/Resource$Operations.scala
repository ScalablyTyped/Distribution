package typings.googleapis.buildSrcApisMlV1Mod.ml_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/ml/v1", "ml_v1.Resource$Operations")
@js.native
class Resource$Operations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * ml.operations.delete
    * @desc Deletes a long-running operation. This method indicates that the
    * client is no longer interested in the operation result. It does not
    * cancel the operation. If the server doesn't support this method, it
    * returns `google.rpc.Code.UNIMPLEMENTED`.
    * @alias ml.operations.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the operation resource to be deleted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$GoogleProtobuf__Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$GoogleProtobuf__Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarOperationsDollarDelete): GaxiosPromise[Schema$GoogleProtobuf__Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarOperationsDollarDelete,
    callback: BodyResponseCallback[Schema$GoogleProtobuf__Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarOperationsDollarDelete,
    options: BodyResponseCallback[Schema$GoogleProtobuf__Empty],
    callback: BodyResponseCallback[Schema$GoogleProtobuf__Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarOperationsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$GoogleProtobuf__Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarOperationsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleProtobuf__Empty]
  ): Unit = js.native
}

