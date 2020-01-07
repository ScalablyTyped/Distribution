package typings.googleapis.buildSrcApisDatastoreV1beta1Mod.datastore_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/datastore/v1beta1", "datastore_v1beta1.Resource$Projects")
@js.native
class Resource$Projects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * datastore.projects.export
    * @desc Exports a copy of all or a subset of entities from Google Cloud
    * Datastore to another storage system, such as Google Cloud Storage. Recent
    * updates to entities may not be reflected in the export. The export occurs
    * in the background and its progress can be monitored and managed via the
    * Operation resource that is created. The output of an export may only be
    * used once the associated operation is done. If an export operation is
    * cancelled before completion it may leave partial data behind in Google
    * Cloud Storage.
    * @alias datastore.projects.export
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId Project ID against which to make the request.
    * @param {().GoogleDatastoreAdminV1beta1ExportEntitiesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def export(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def export(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def export(params: ParamsDollarResourceDollarProjectsDollarExport): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def export(
    params: ParamsDollarResourceDollarProjectsDollarExport,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def export(
    params: ParamsDollarResourceDollarProjectsDollarExport,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def export(params: ParamsDollarResourceDollarProjectsDollarExport, options: MethodOptions): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def export(
    params: ParamsDollarResourceDollarProjectsDollarExport,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * datastore.projects.import
    * @desc Imports entities into Google Cloud Datastore. Existing entities with
    * the same key are overwritten. The import occurs in the background and its
    * progress can be monitored and managed via the Operation resource that is
    * created. If an ImportEntities operation is cancelled, it is possible that a
    * subset of the data has already been imported to Cloud Datastore.
    * @alias datastore.projects.import
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId Project ID against which to make the request.
    * @param {().GoogleDatastoreAdminV1beta1ImportEntitiesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def `import`(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def `import`(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def `import`(params: ParamsDollarResourceDollarProjectsDollarImport): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def `import`(
    params: ParamsDollarResourceDollarProjectsDollarImport,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def `import`(
    params: ParamsDollarResourceDollarProjectsDollarImport,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def `import`(params: ParamsDollarResourceDollarProjectsDollarImport, options: MethodOptions): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def `import`(
    params: ParamsDollarResourceDollarProjectsDollarImport,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
}

