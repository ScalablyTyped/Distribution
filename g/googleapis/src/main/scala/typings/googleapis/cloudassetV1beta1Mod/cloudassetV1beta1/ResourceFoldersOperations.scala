package typings.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudasset/v1beta1", "cloudasset_v1beta1.Resource$Folders$Operations")
@js.native
class ResourceFoldersOperations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudasset.folders.operations.get
    * @desc Gets the latest state of a long-running operation.  Clients can use
    * this method to poll the operation result at intervals as recommended by
    * the API service.
    * @alias cloudasset.folders.operations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the operation resource.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaOperation] = js.native
  def get(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def get(params: ParamsResourceFoldersOperationsGet): GaxiosPromise[SchemaOperation] = js.native
  def get(params: ParamsResourceFoldersOperationsGet, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def get(
    params: ParamsResourceFoldersOperationsGet,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def get(params: ParamsResourceFoldersOperationsGet, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def get(
    params: ParamsResourceFoldersOperationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}

