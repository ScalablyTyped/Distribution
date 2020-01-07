package typings.googleapis.buildSrcApisCloudassetV1beta1Mod.cloudasset_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudasset/v1beta1", "cloudasset_v1beta1.Resource$Folders")
@js.native
class Resource$Folders protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var operations: ResourceDollarFoldersDollarOperations = js.native
  /**
    * cloudasset.folders.exportAssets
    * @desc Exports assets with time and resource types to a given Cloud
    * Storage location. The output format is newline-delimited JSON. This API
    * implements the google.longrunning.Operation API allowing you to keep
    * track of the export.
    * @alias cloudasset.folders.exportAssets
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
  def exportAssets(params: ParamsDollarResourceDollarFoldersDollarExportassets): GaxiosPromise[Schema$Operation] = js.native
  def exportAssets(
    params: ParamsDollarResourceDollarFoldersDollarExportassets,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def exportAssets(
    params: ParamsDollarResourceDollarFoldersDollarExportassets,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def exportAssets(params: ParamsDollarResourceDollarFoldersDollarExportassets, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def exportAssets(
    params: ParamsDollarResourceDollarFoldersDollarExportassets,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

