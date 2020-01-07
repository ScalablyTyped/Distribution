package typings.googleapis.buildSrcApisFirestoreV1beta1Mod.firestore_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/firestore/v1beta1", "firestore_v1beta1.Resource$Projects$Databases")
@js.native
class ResourceDollarProjectsDollarDatabases protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var documents: ResourceDollarProjectsDollarDatabasesDollarDocuments = js.native
  var indexes: ResourceDollarProjectsDollarDatabasesDollarIndexes = js.native
  /**
    * firestore.projects.databases.exportDocuments
    * @desc Exports a copy of all or a subset of documents from Google Cloud
    * Firestore to another storage system, such as Google Cloud Storage. Recent
    * updates to documents may not be reflected in the export. The export
    * occurs in the background and its progress can be monitored and managed
    * via the Operation resource that is created. The output of an export may
    * only be used once the associated operation is done. If an export
    * operation is cancelled before completion it may leave partial data behind
    * in Google Cloud Storage.
    * @alias firestore.projects.databases.exportDocuments
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Database to export. Should be of the form: `projects/{project_id}/databases/{database_id}`.
    * @param {().GoogleFirestoreAdminV1beta1ExportDocumentsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def exportDocuments(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def exportDocuments(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def exportDocuments(params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarExportdocuments): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def exportDocuments(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarExportdocuments,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def exportDocuments(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarExportdocuments,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def exportDocuments(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarExportdocuments,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def exportDocuments(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarExportdocuments,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * firestore.projects.databases.importDocuments
    * @desc Imports documents into Google Cloud Firestore. Existing documents
    * with the same name are overwritten. The import occurs in the background
    * and its progress can be monitored and managed via the Operation resource
    * that is created. If an ImportDocuments operation is cancelled, it is
    * possible that a subset of the data has already been imported to Cloud
    * Firestore.
    * @alias firestore.projects.databases.importDocuments
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Database to import into. Should be of the form: `projects/{project_id}/databases/{database_id}`.
    * @param {().GoogleFirestoreAdminV1beta1ImportDocumentsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def importDocuments(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def importDocuments(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def importDocuments(params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarImportdocuments): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def importDocuments(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarImportdocuments,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def importDocuments(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarImportdocuments,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def importDocuments(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarImportdocuments,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def importDocuments(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarImportdocuments,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
}

