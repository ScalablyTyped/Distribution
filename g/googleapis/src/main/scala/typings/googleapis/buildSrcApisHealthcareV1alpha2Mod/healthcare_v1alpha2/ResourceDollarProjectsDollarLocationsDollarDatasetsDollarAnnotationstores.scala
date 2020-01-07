package typings.googleapis.buildSrcApisHealthcareV1alpha2Mod.healthcare_v1alpha2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1alpha2", "healthcare_v1alpha2.Resource$Projects$Locations$Datasets$Annotationstores")
@js.native
class ResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstores protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var annotations: ResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarAnnotations = js.native
  var context: APIRequestContext = js.native
  /**
    * healthcare.projects.locations.datasets.annotationStores.create
    * @desc Creates a new Annotation store within the parent dataset.
    * @alias healthcare.projects.locations.datasets.annotationStores.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.annotationStoreId The ID of the Annotation store that is being created. The string must match the following regex: `[\p{L}\p{N}_\-\.]{1,256}`.
    * @param {string} params.parent The name of the dataset this Annotation store belongs to.
    * @param {().AnnotationStore} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$AnnotationStore] = js.native
  def create(callback: BodyResponseCallback[Schema$AnnotationStore]): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarCreate
  ): GaxiosPromise[Schema$AnnotationStore] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarCreate,
    callback: BodyResponseCallback[Schema$AnnotationStore]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarCreate,
    options: BodyResponseCallback[Schema$AnnotationStore],
    callback: BodyResponseCallback[Schema$AnnotationStore]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$AnnotationStore] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AnnotationStore]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.annotationStores.delete
    * @desc Deletes the specified Annotation store and removes all annotations
    * that are contained within it.
    * @alias healthcare.projects.locations.datasets.annotationStores.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the Annotation store to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarDelete
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.annotationStores.get
    * @desc Gets the specified Annotation store or returns NOT_FOUND if it does
    * not exist.
    * @alias healthcare.projects.locations.datasets.annotationStores.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the Annotation store to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$AnnotationStore] = js.native
  def get(callback: BodyResponseCallback[Schema$AnnotationStore]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarGet
  ): GaxiosPromise[Schema$AnnotationStore] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarGet,
    callback: BodyResponseCallback[Schema$AnnotationStore]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarGet,
    options: BodyResponseCallback[Schema$AnnotationStore],
    callback: BodyResponseCallback[Schema$AnnotationStore]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$AnnotationStore] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AnnotationStore]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.annotationStores.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns NOT_FOUND
    * error if the resource does not exist. Returns an empty policy if the
    * resource exists but does not have a policy set.  Authorization requires
    * the Google IAM permission `healthcare.AnnotationStores.getIamPolicy` on
    * the specified resource
    * @alias
    * healthcare.projects.locations.datasets.annotationStores.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().GetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarGetiampolicy
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarGetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.annotationStores.list
    * @desc Lists the Annotation stores in the given dataset for a source
    * store.
    * @alias healthcare.projects.locations.datasets.annotationStores.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Restricts stores returned to those matching a filter. Syntax: https://cloud.google.com/appengine/docs/standard/python/search/query_strings Only filtering on labels is supported, for example `labels.key=value`.
    * @param {integer=} params.pageSize Limit on the number of Annotation stores to return in a single response. If zero the default page size of 100 is used.
    * @param {string=} params.pageToken The next_page_token value returned from the previous List request, if any.
    * @param {string} params.parent Name of the dataset.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListAnnotationStoresResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListAnnotationStoresResponse]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarList
  ): GaxiosPromise[Schema$ListAnnotationStoresResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarList,
    callback: BodyResponseCallback[Schema$ListAnnotationStoresResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarList,
    options: BodyResponseCallback[Schema$ListAnnotationStoresResponse],
    callback: BodyResponseCallback[Schema$ListAnnotationStoresResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListAnnotationStoresResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListAnnotationStoresResponse]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.annotationStores.patch
    * @desc Updates the specified Annotation store.
    * @alias healthcare.projects.locations.datasets.annotationStores.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output only. Resource name of the Annotation store, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/annotationStores/{annotation_store_id}`.
    * @param {string=} params.updateMask The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    * @param {().AnnotationStore} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$AnnotationStore] = js.native
  def patch(callback: BodyResponseCallback[Schema$AnnotationStore]): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarPatch
  ): GaxiosPromise[Schema$AnnotationStore] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarPatch,
    callback: BodyResponseCallback[Schema$AnnotationStore]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarPatch,
    options: BodyResponseCallback[Schema$AnnotationStore],
    callback: BodyResponseCallback[Schema$AnnotationStore]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$AnnotationStore] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AnnotationStore]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.annotationStores.setIamPolicy
    * @desc POLICIES Sets the access control policy for a resource. Replaces
    * any existing policy.  Authorization requires the Google IAM permission
    * 'healthcare.annotationStores.setIamPolicy' on the specified resource
    * @alias
    * healthcare.projects.locations.datasets.annotationStores.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarSetiampolicy
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarSetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.annotationStores.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  There is no permission required to
    * make this API call.
    * @alias
    * healthcare.projects.locations.datasets.annotationStores.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarTestiampermissions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstoresDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
}

