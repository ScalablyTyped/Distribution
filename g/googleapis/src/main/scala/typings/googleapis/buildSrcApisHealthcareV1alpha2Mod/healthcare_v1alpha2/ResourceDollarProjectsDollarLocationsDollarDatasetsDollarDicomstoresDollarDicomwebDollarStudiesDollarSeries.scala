package typings.googleapis.buildSrcApisHealthcareV1alpha2Mod.healthcare_v1alpha2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1alpha2", "healthcare_v1alpha2.Resource$Projects$Locations$Datasets$Dicomstores$Dicomweb$Studies$Series")
@js.native
class ResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSeries protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var instances: ResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSeriesDollarInstances = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.delete
    * @desc DeleteSeries deletes all instances within the given study and
    * series. Delete requests are equivalent to the GET requests specified in
    * the WADO-RS standard.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies/{study_id}/series/{series_id}`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSeriesDollarDelete
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSeriesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSeriesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSeriesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSeriesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.metadata
    * @desc RetrieveSeriesMetadata returns instance associated with the given
    * study and series, presented as metadata with the bulk data removed. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.5.6.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.metadata
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies/{study_id}/series/{series_id}/metadata`.
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def metadata(): GaxiosPromise[Schema$HttpBody] = js.native
  def metadata(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def metadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSeriesDollarMetadata
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def metadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSeriesDollarMetadata,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def metadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSeriesDollarMetadata,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def metadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSeriesDollarMetadata,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def metadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSeriesDollarMetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.retrieveSeries
    * @desc RetrieveSeries returns all instances within the given study and
    * series. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.5.2.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.retrieveSeries
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies/{study_id}/series/{series_id}`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def retrieveSeries(): GaxiosPromise[Schema$HttpBody] = js.native
  def retrieveSeries(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def retrieveSeries(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSeriesDollarRetrieveseries
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def retrieveSeries(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSeriesDollarRetrieveseries,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def retrieveSeries(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSeriesDollarRetrieveseries,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def retrieveSeries(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSeriesDollarRetrieveseries,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def retrieveSeries(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSeriesDollarRetrieveseries,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.searchForInstances
    * @desc SearchForInstances returns a list of matching instances. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.7
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.searchForInstances
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `instances`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def searchForInstances(): GaxiosPromise[Schema$HttpBody] = js.native
  def searchForInstances(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def searchForInstances(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSeriesDollarSearchforinstances
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def searchForInstances(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSeriesDollarSearchforinstances,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def searchForInstances(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSeriesDollarSearchforinstances,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def searchForInstances(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSeriesDollarSearchforinstances,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def searchForInstances(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSeriesDollarSearchforinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
}

