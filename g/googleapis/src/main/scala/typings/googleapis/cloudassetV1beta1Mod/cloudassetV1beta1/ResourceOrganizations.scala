package typings.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudasset/v1beta1", "cloudasset_v1beta1.Resource$Organizations")
@js.native
class ResourceOrganizations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var operations: ResourceOrganizationsOperations = js.native
  /**
    * cloudasset.organizations.batchGetAssetsHistory
    * @desc Batch gets the update history of assets that overlap a time window.
    * For RESOURCE content, this API outputs history with asset in both
    * non-delete or deleted status. For IAM_POLICY content, this API outputs
    * history when the asset and its attached IAM POLICY both exist. This can
    * create gaps in the output history. If a specified asset does not exist,
    * this API returns an INVALID_ARGUMENT error.
    * @alias cloudasset.organizations.batchGetAssetsHistory
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
  def batchGetAssetsHistory(): GaxiosPromise[SchemaBatchGetAssetsHistoryResponse] = js.native
  def batchGetAssetsHistory(callback: BodyResponseCallback[SchemaBatchGetAssetsHistoryResponse]): Unit = js.native
  def batchGetAssetsHistory(params: ParamsResourceOrganizationsBatchgetassetshistory): GaxiosPromise[SchemaBatchGetAssetsHistoryResponse] = js.native
  def batchGetAssetsHistory(
    params: ParamsResourceOrganizationsBatchgetassetshistory,
    callback: BodyResponseCallback[SchemaBatchGetAssetsHistoryResponse]
  ): Unit = js.native
  def batchGetAssetsHistory(
    params: ParamsResourceOrganizationsBatchgetassetshistory,
    options: BodyResponseCallback[SchemaBatchGetAssetsHistoryResponse],
    callback: BodyResponseCallback[SchemaBatchGetAssetsHistoryResponse]
  ): Unit = js.native
  def batchGetAssetsHistory(params: ParamsResourceOrganizationsBatchgetassetshistory, options: MethodOptions): GaxiosPromise[SchemaBatchGetAssetsHistoryResponse] = js.native
  def batchGetAssetsHistory(
    params: ParamsResourceOrganizationsBatchgetassetshistory,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchGetAssetsHistoryResponse]
  ): Unit = js.native
  /**
    * cloudasset.organizations.exportAssets
    * @desc Exports assets with time and resource types to a given Cloud
    * Storage location. The output format is newline-delimited JSON. This API
    * implements the google.longrunning.Operation API allowing you to keep
    * track of the export.
    * @alias cloudasset.organizations.exportAssets
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The relative name of the root asset. This can only be an organization number (such as "organizations/123"), a project ID (such as "projects/my-project-id"), a project number (such as "projects/12345"), or a folder number (such as "folders/123").
    * @param {().ExportAssetsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def exportAssets(): GaxiosPromise[SchemaOperation] = js.native
  def exportAssets(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def exportAssets(params: ParamsResourceOrganizationsExportassets): GaxiosPromise[SchemaOperation] = js.native
  def exportAssets(params: ParamsResourceOrganizationsExportassets, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def exportAssets(
    params: ParamsResourceOrganizationsExportassets,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def exportAssets(params: ParamsResourceOrganizationsExportassets, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def exportAssets(
    params: ParamsResourceOrganizationsExportassets,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}

