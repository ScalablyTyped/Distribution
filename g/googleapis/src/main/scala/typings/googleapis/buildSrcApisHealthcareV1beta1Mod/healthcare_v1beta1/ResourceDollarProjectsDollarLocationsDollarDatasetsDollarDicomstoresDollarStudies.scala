package typings.googleapis.buildSrcApisHealthcareV1beta1Mod.healthcare_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1beta1", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Dicomstores$Studies")
@js.native
class ResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var series: ResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSeries = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.studies.delete
    * @desc DeleteStudy deletes all instances within the given study. Delete
    * requests are equivalent to the GET requests specified in the WADO-RS
    * standard.
    * @alias healthcare.projects.locations.datasets.dicomStores.studies.delete
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
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarDelete
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.studies.retrieveMetadata
    * @desc RetrieveStudyMetadata returns instance associated with the given
    * study presented as metadata with the bulk data removed. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.5.6.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.studies.retrieveMetadata
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies/{study_id}/metadata`.
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def retrieveMetadata(): GaxiosPromise[Schema$HttpBody] = js.native
  def retrieveMetadata(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def retrieveMetadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarRetrievemetadata
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def retrieveMetadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarRetrievemetadata,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def retrieveMetadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarRetrievemetadata,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def retrieveMetadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarRetrievemetadata,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def retrieveMetadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarRetrievemetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.studies.retrieveStudy
    * @desc RetrieveStudy returns all instances within the given study. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.5.1.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.studies.retrieveStudy
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
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarRetrievestudy
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def retrieveStudy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarRetrievestudy,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def retrieveStudy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarRetrievestudy,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def retrieveStudy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarRetrievestudy,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def retrieveStudy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarRetrievestudy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.studies.searchForInstances
    * @desc SearchForInstances returns a list of matching instances. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.7
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.studies.searchForInstances
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
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSearchforinstances
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def searchForInstances(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSearchforinstances,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def searchForInstances(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSearchforinstances,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def searchForInstances(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSearchforinstances,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def searchForInstances(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSearchforinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.studies.searchForSeries
    * @desc SearchForSeries returns a list of matching series. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.7
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.studies.searchForSeries
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
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSearchforseries
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def searchForSeries(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSearchforseries,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def searchForSeries(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSearchforseries,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def searchForSeries(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSearchforseries,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def searchForSeries(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSearchforseries,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.studies.storeInstances
    * @desc StoreInstances stores DICOM instances associated with study
    * instance unique identifiers (SUID). See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.6.1.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.studies.storeInstances
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
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarStoreinstances
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def storeInstances(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarStoreinstances,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def storeInstances(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarStoreinstances,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def storeInstances(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarStoreinstances,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def storeInstances(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarStoreinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
}

