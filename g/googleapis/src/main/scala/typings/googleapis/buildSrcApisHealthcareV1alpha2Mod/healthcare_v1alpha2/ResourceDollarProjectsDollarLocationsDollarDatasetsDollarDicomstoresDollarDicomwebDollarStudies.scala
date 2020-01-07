package typings.googleapis.buildSrcApisHealthcareV1alpha2Mod.healthcare_v1alpha2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1alpha2", "healthcare_v1alpha2.Resource$Projects$Locations$Datasets$Dicomstores$Dicomweb$Studies")
@js.native
class ResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var series: ResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSeries = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.delete
    * @desc DeleteStudy deletes all instances within the given study. Delete
    * requests are equivalent to the GET requests specified in the WADO-RS
    * standard.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies/{study_id}`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarDelete
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.metadata
    * @desc RetrieveStudyMetadata returns instance associated with the given
    * study presented as metadata with the bulk data removed. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.5.6.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.metadata
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies/{study_id}/metadata`.
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def metadata(): GaxiosPromise[Schema$HttpBody] = js.native
  def metadata(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def metadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarMetadata
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def metadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarMetadata,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def metadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarMetadata,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def metadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarMetadata,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def metadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarMetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.retrieveStudy
    * @desc RetrieveStudy returns all instances within the given study. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.5.1.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.retrieveStudy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies/{study_id}`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def retrieveStudy(): GaxiosPromise[Schema$HttpBody] = js.native
  def retrieveStudy(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def retrieveStudy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarRetrievestudy
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def retrieveStudy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarRetrievestudy,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def retrieveStudy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarRetrievestudy,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def retrieveStudy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarRetrievestudy,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def retrieveStudy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarRetrievestudy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.searchForInstances
    * @desc SearchForInstances returns a list of matching instances. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.7
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.searchForInstances
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
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSearchforinstances
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def searchForInstances(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSearchforinstances,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def searchForInstances(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSearchforinstances,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def searchForInstances(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSearchforinstances,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def searchForInstances(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSearchforinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.searchForSeries
    * @desc SearchForSeries returns a list of matching series. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.7
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.searchForSeries
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `series`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def searchForSeries(): GaxiosPromise[Schema$HttpBody] = js.native
  def searchForSeries(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def searchForSeries(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSearchforseries
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def searchForSeries(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSearchforseries,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def searchForSeries(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSearchforseries,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def searchForSeries(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSearchforseries,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def searchForSeries(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarSearchforseries,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.storeInstances
    * @desc StoreInstances stores DICOM instances associated with study
    * instance unique identifiers (SUID). See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.6.1.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.storeInstances
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies/{study_id}`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {().HttpBody} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def storeInstances(): GaxiosPromise[Schema$HttpBody] = js.native
  def storeInstances(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def storeInstances(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarStoreinstances
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def storeInstances(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarStoreinstances,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def storeInstances(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarStoreinstances,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def storeInstances(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarStoreinstances,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def storeInstances(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarStudiesDollarStoreinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
}

