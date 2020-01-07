package typings.googleapis.buildSrcApisCloudassetV1beta1Mod.cloudasset_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudasset/v1beta1", "cloudasset_v1beta1.Resource$Projects")
@js.native
class Resource$Projects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var operations: ResourceDollarProjectsDollarOperations = js.native
  /**
    * cloudasset.projects.batchGetAssetsHistory
    * @desc Batch gets the update history of assets that overlap a time window.
    * For RESOURCE content, this API outputs history with asset in both
    * non-delete or deleted status. For IAM_POLICY content, this API outputs
    * history when the asset and its attached IAM POLICY both exist. This can
    * create gaps in the output history. If a specified asset does not exist,
    * this API returns an INVALID_ARGUMENT error.
    * @alias cloudasset.projects.batchGetAssetsHistory
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.assetNames A list of the full names of the assets. For example: `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. See [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for more info.  The request becomes a no-op if the asset name list is empty, and the max size of the asset name list is 100 in one request.
    * @param {string=} params.contentType Required. The content type.
    * @param {string} params.parent Required. The relative name of the root asset. It can only be an organization number (such as "organizations/123"), a project ID (such as "projects/my-project-id")", or a project number (such as "projects/12345").
    * @param {string=} params.readTimeWindow.endTime End time of the time window (inclusive). Current timestamp if not specified.
    * @param {string=} params.readTimeWindow.startTime Start time of the time window (exclusive).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchGetAssetsHistory(): GaxiosPromise[Schema$BatchGetAssetsHistoryResponse] = js.native
  def batchGetAssetsHistory(callback: BodyResponseCallback[Schema$BatchGetAssetsHistoryResponse]): Unit = js.native
  def batchGetAssetsHistory(params: ParamsDollarResourceDollarProjectsDollarBatchgetassetshistory): GaxiosPromise[Schema$BatchGetAssetsHistoryResponse] = js.native
  def batchGetAssetsHistory(
    params: ParamsDollarResourceDollarProjectsDollarBatchgetassetshistory,
    callback: BodyResponseCallback[Schema$BatchGetAssetsHistoryResponse]
  ): Unit = js.native
  def batchGetAssetsHistory(
    params: ParamsDollarResourceDollarProjectsDollarBatchgetassetshistory,
    options: BodyResponseCallback[Schema$BatchGetAssetsHistoryResponse],
    callback: BodyResponseCallback[Schema$BatchGetAssetsHistoryResponse]
  ): Unit = js.native
  def batchGetAssetsHistory(params: ParamsDollarResourceDollarProjectsDollarBatchgetassetshistory, options: MethodOptions): GaxiosPromise[Schema$BatchGetAssetsHistoryResponse] = js.native
  def batchGetAssetsHistory(
    params: ParamsDollarResourceDollarProjectsDollarBatchgetassetshistory,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BatchGetAssetsHistoryResponse]
  ): Unit = js.native
  /**
    * cloudasset.projects.exportAssets
    * @desc Exports assets with time and resource types to a given Cloud
    * Storage location. The output format is newline-delimited JSON. This API
    * implements the google.longrunning.Operation API allowing you to keep
    * track of the export.
    * @alias cloudasset.projects.exportAssets
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The relative name of the root asset. This can only be an organization number (such as "organizations/123"), a project ID (such as "projects/my-project-id"), a project number (such as "projects/12345"), or a folder number (such as "folders/123").
    * @param {().ExportAssetsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def exportAssets(): GaxiosPromise[Schema$Operation] = js.native
  def exportAssets(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def exportAssets(params: ParamsDollarResourceDollarProjectsDollarExportassets): GaxiosPromise[Schema$Operation] = js.native
  def exportAssets(
    params: ParamsDollarResourceDollarProjectsDollarExportassets,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def exportAssets(
    params: ParamsDollarResourceDollarProjectsDollarExportassets,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def exportAssets(params: ParamsDollarResourceDollarProjectsDollarExportassets, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def exportAssets(
    params: ParamsDollarResourceDollarProjectsDollarExportassets,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

