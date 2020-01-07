package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1alpha", "healthcare_v1alpha.Resource$Projects$Locations$Datasets$Annotationstores$Annotations")
@js.native
class ResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * healthcare.projects.locations.datasets.annotationStores.annotations.create
    * @desc Creates a new Annotation record. It is valid to create Annotation
    * objects for the same source more than once since a unique ID is assigned
    * to each record by this service.
    * @alias
    * healthcare.projects.locations.datasets.annotationStores.annotations.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the Annotation store this annotation belongs to. For example, `projects/my-project/locations/us-central1/datasets/mydataset/annotationStores/myannotationstore`.
    * @param {().Annotation} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Annotation] = js.native
  def create(callback: BodyResponseCallback[Schema$Annotation]): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotationsDollarCreate
  ): GaxiosPromise[Schema$Annotation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotationsDollarCreate,
    callback: BodyResponseCallback[Schema$Annotation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotationsDollarCreate,
    options: BodyResponseCallback[Schema$Annotation],
    callback: BodyResponseCallback[Schema$Annotation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotationsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Annotation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotationsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Annotation]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.annotationStores.annotations.delete
    * @desc Deletes an Annotation or returns NOT_FOUND if it does not exist.
    * @alias
    * healthcare.projects.locations.datasets.annotationStores.annotations.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the Annotation to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotationsDollarDelete
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotationsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotationsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotationsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotationsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.annotationStores.annotations.get
    * @desc Gets an Annotation.
    * @alias
    * healthcare.projects.locations.datasets.annotationStores.annotations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the Annotation to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Annotation] = js.native
  def get(callback: BodyResponseCallback[Schema$Annotation]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotationsDollarGet
  ): GaxiosPromise[Schema$Annotation] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotationsDollarGet,
    callback: BodyResponseCallback[Schema$Annotation]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotationsDollarGet,
    options: BodyResponseCallback[Schema$Annotation],
    callback: BodyResponseCallback[Schema$Annotation]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotationsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Annotation] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Annotation]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.annotationStores.annotations.list
    * @desc Lists the Annotations in the given Annotation store for a source
    * resource.
    * @alias
    * healthcare.projects.locations.datasets.annotationStores.annotations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Restricts Annotations returned to those matching a filter. Syntax: https://cloud.google.com/appengine/docs/standard/python/search/query_strings Fields/functions available for filtering are: - source_version
    * @param {integer=} params.pageSize Limit on the number of Annotations to return in a single response. If zero the default page size of 100 is used.
    * @param {string=} params.pageToken The next_page_token value returned from the previous List request, if any.
    * @param {string} params.parent Name of the Annotation store to retrieve Annotations from.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListAnnotationsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListAnnotationsResponse]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotationsDollarList
  ): GaxiosPromise[Schema$ListAnnotationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotationsDollarList,
    callback: BodyResponseCallback[Schema$ListAnnotationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotationsDollarList,
    options: BodyResponseCallback[Schema$ListAnnotationsResponse],
    callback: BodyResponseCallback[Schema$ListAnnotationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotationsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListAnnotationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListAnnotationsResponse]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.annotationStores.annotations.patch
    * @desc Updates the Annotation.
    * @alias
    * healthcare.projects.locations.datasets.annotationStores.annotations.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output only. Resource name of the Annotation, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/annotationStores/{annotation_store_id}/annotations/{annotation_id}`.
    * @param {string=} params.updateMask The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    * @param {().Annotation} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Annotation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Annotation]): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotationsDollarPatch
  ): GaxiosPromise[Schema$Annotation] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotationsDollarPatch,
    callback: BodyResponseCallback[Schema$Annotation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotationsDollarPatch,
    options: BodyResponseCallback[Schema$Annotation],
    callback: BodyResponseCallback[Schema$Annotation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotationsDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$Annotation] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotationsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Annotation]
  ): Unit = js.native
}

