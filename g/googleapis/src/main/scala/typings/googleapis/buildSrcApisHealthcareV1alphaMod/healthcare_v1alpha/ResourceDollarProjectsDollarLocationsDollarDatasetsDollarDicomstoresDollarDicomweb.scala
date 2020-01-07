package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1alpha", "healthcare_v1alpha.Resource$Projects$Locations$Datasets$Dicomstores$Dicomweb")
@js.native
class ResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomweb protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.dicomWebDelete
    * @desc Handles DELETE requests equivalent to the GET requests specified in
    * the WADO-RS standard. Since this implements an industry standard API, the
    * dicom_web_path is interpreted directly by the serving binary. For
    * example, if the request is for
    * `/v1alpha/projects/{project_id}/locations/{location_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}/dicomWeb/studies/1.2`,
    * then `/studies/1.2` is passed to the serving binary as the
    * dicom_web_path.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.dicomWebDelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the WADO-RS standard.
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def dicomWebDelete(): GaxiosPromise[Schema$Empty] = js.native
  def dicomWebDelete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def dicomWebDelete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarDicomwebdelete
  ): GaxiosPromise[Schema$Empty] = js.native
  def dicomWebDelete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarDicomwebdelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def dicomWebDelete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarDicomwebdelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def dicomWebDelete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarDicomwebdelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def dicomWebDelete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarDicomwebdelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.dicomWebGet
    * @desc Handles the GET requests specified in the STOW-RS, WADO-RS, or
    * QIDO-RS standard. Since this implements an industry standard API, the
    * dicom_web_path is interpreted directly by the serving binary. For
    * example, if the request is for
    * `/v1alpha/projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}/dicomWeb/studies/{study_id}/series?PatientName={patient_name}`,
    * then `studies/{study_id}/series` is passed to the serving binary as the
    * dicom_web_path.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.dicomWebGet
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., studies/{study_id}/series`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def dicomWebGet(): GaxiosPromise[Schema$HttpBody] = js.native
  def dicomWebGet(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def dicomWebGet(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarDicomwebget
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def dicomWebGet(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarDicomwebget,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def dicomWebGet(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarDicomwebget,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def dicomWebGet(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarDicomwebget,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def dicomWebGet(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarDicomwebget,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.dicomWebPost
    * @desc Handles the POST requests specified in the STOW-RS, WADO-RS, or
    * QIDO-RS standard. Since this implements an industry standard API, the
    * dicom_web_path is interpreted directly by the serving binary. For
    * example, if the request is for
    * `/v1alpha/projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}/dicomWeb/studies/{study_id}`,
    * then `/studies/{study_id}` is passed to the serving binary as the
    * dicom_web_path.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.dicomWebPost
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., studies/{study_id}`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {().HttpBody} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def dicomWebPost(): GaxiosPromise[Schema$HttpBody] = js.native
  def dicomWebPost(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def dicomWebPost(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarDicomwebpost
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def dicomWebPost(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarDicomwebpost,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def dicomWebPost(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarDicomwebpost,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def dicomWebPost(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarDicomwebpost,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def dicomWebPost(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomwebDollarDicomwebpost,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
}

