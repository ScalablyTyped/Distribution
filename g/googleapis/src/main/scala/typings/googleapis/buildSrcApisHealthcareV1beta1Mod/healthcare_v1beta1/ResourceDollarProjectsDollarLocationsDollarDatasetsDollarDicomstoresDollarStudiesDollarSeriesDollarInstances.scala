package typings.googleapis.buildSrcApisHealthcareV1beta1Mod.healthcare_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1beta1", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Dicomstores$Studies$Series$Instances")
@js.native
class ResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSeriesDollarInstances protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var frames: ResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSeriesDollarInstancesDollarFrames = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.studies.series.instances.delete
    * @desc DeleteInstance deletes an instance associated with the given study,
    * series, and SOP Instance UID. Delete requests are equivalent to the GET
    * requests specified in the WADO-RS standard.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.studies.series.instances.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies/{study_id}/series/{series_id}/instances/{instance_id}`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSeriesDollarInstancesDollarDelete
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSeriesDollarInstancesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSeriesDollarInstancesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSeriesDollarInstancesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSeriesDollarInstancesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.studies.series.instances.retrieveInstance
    * @desc RetrieveInstance returns instance associated with the given study,
    * series, and SOP Instance UID. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.5.3.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.studies.series.instances.retrieveInstance
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies/{study_id}/series/{series_id}/instance/{instance_id}`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def retrieveInstance(): GaxiosPromise[Schema$HttpBody] = js.native
  def retrieveInstance(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def retrieveInstance(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSeriesDollarInstancesDollarRetrieveinstance
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def retrieveInstance(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSeriesDollarInstancesDollarRetrieveinstance,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def retrieveInstance(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSeriesDollarInstancesDollarRetrieveinstance,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def retrieveInstance(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSeriesDollarInstancesDollarRetrieveinstance,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def retrieveInstance(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSeriesDollarInstancesDollarRetrieveinstance,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.studies.series.instances.retrieveMetadata
    * @desc RetrieveInstanceMetadata returns instance associated with the given
    * study, series, and SOP Instance UID presented as metadata with the bulk
    * data removed. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.5.6.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.studies.series.instances.retrieveMetadata
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies/{study_id}/series/{series_id}/instances/{instance_id}/metadata`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def retrieveMetadata(): GaxiosPromise[Schema$HttpBody] = js.native
  def retrieveMetadata(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def retrieveMetadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSeriesDollarInstancesDollarRetrievemetadata
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def retrieveMetadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSeriesDollarInstancesDollarRetrievemetadata,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def retrieveMetadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSeriesDollarInstancesDollarRetrievemetadata,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def retrieveMetadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSeriesDollarInstancesDollarRetrievemetadata,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def retrieveMetadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSeriesDollarInstancesDollarRetrievemetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.studies.series.instances.retrieveRendered
    * @desc RetrieveRenderedInstance returns instance associated with the given
    * study, series, and SOP Instance UID in an acceptable Rendered Media Type.
    * See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.5.8.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.studies.series.instances.retrieveRendered
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies/{study_id}/series/{series_id}/instance/{instance_id}/rendered`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def retrieveRendered(): GaxiosPromise[Schema$HttpBody] = js.native
  def retrieveRendered(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def retrieveRendered(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSeriesDollarInstancesDollarRetrieverendered
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def retrieveRendered(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSeriesDollarInstancesDollarRetrieverendered,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def retrieveRendered(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSeriesDollarInstancesDollarRetrieverendered,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def retrieveRendered(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSeriesDollarInstancesDollarRetrieverendered,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def retrieveRendered(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSeriesDollarInstancesDollarRetrieverendered,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
}

