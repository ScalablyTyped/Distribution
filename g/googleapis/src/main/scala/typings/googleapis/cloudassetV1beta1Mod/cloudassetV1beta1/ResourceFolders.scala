package typings.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudasset/v1beta1", "cloudasset_v1beta1.Resource$Folders")
@js.native
class ResourceFolders protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
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
  def exportAssets(): GaxiosPromise[SchemaOperation] = js.native
  def exportAssets(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def exportAssets(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def exportAssets(params: ParamsResourceFoldersExportassets): GaxiosPromise[SchemaOperation] = js.native
  def exportAssets(params: ParamsResourceFoldersExportassets, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def exportAssets(
    params: ParamsResourceFoldersExportassets,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def exportAssets(params: ParamsResourceFoldersExportassets, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def exportAssets(
    params: ParamsResourceFoldersExportassets,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  var operations: ResourceFoldersOperations = js.native
}
