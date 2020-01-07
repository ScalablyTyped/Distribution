package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/run/v1alpha1", "run_v1alpha1.Resource$Projects$Locations$Services")
@js.native
class ResourceDollarProjectsDollarLocationsDollarServices protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * run.projects.locations.services.create
    * @desc Rpc to create a service.
    * @alias run.projects.locations.services.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The project ID or project number in which this service should be created.
    * @param {().Service} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Service] = js.native
  def create(callback: BodyResponseCallback[Schema$Service]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarCreate): GaxiosPromise[Schema$Service] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarCreate,
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarCreate,
    options: BodyResponseCallback[Schema$Service],
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Service] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  /**
    * run.projects.locations.services.delete
    * @desc Rpc to delete a service. This will cause the Service to stop
    * serving traffic and will delete the child entities like Routes,
    * Configurations and Revisions.
    * @alias run.projects.locations.services.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.apiVersion Cloud Run currently ignores this parameter.
    * @param {string=} params.kind Cloud Run currently ignores this parameter.
    * @param {string} params.name The name of the service being deleted. If needed, replace {namespace_id} with the project ID.
    * @param {boolean=} params.orphanDependents Deprecated. Specifies the cascade behavior on delete. Cloud Run only supports cascading behavior, so this must be false. This attribute is deprecated, and is now replaced with PropagationPolicy See https://github.com/kubernetes/kubernetes/issues/46659 for more info.
    * @param {string=} params.propagationPolicy Specifies the propagation policy of delete. Cloud Run currently ignores this setting, and deletes in the background. Please see kubernetes.io/docs/concepts/workloads/controllers/garbage-collection/ for more information.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * run.projects.locations.services.get
    * @desc Rpc to get information about a service.
    * @alias run.projects.locations.services.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the service being retrieved. If needed, replace {namespace_id} with the project ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Service] = js.native
  def get(callback: BodyResponseCallback[Schema$Service]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarGet): GaxiosPromise[Schema$Service] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarGet,
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarGet,
    options: BodyResponseCallback[Schema$Service],
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Service] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  /**
    * run.projects.locations.services.getIamPolicy
    * @desc Get the IAM Access Control policy currently in effect for the given
    * Cloud Run service. This result does not include any inherited policies.
    * @alias run.projects.locations.services.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarGetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * run.projects.locations.services.list
    * @desc Rpc to list services.
    * @alias run.projects.locations.services.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.continue Optional encoded string to continue paging.
    * @param {string=} params.fieldSelector Allows to filter resources based on a specific value for a field name. Send this in a query string format. i.e. 'metadata.name%3Dlorem'. Not currently used by Cloud Run.
    * @param {boolean=} params.includeUninitialized Not currently used by Cloud Run.
    * @param {string=} params.labelSelector Allows to filter resources based on a label. Supported operations are =, !=, exists, in, and notIn.
    * @param {integer=} params.limit The maximum number of records that should be returned.
    * @param {string} params.parent The project ID or project number from which the services should be listed.
    * @param {string=} params.resourceVersion The baseline resource version from which the list or watch operation should start. Not currently used by Cloud Run.
    * @param {boolean=} params.watch Flag that indicates that the client expects to watch this resource as well. Not currently used by Cloud Run.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListServicesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListServicesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarList): GaxiosPromise[Schema$ListServicesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarList,
    callback: BodyResponseCallback[Schema$ListServicesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarList,
    options: BodyResponseCallback[Schema$ListServicesResponse],
    callback: BodyResponseCallback[Schema$ListServicesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListServicesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListServicesResponse]
  ): Unit = js.native
  /**
    * run.projects.locations.services.replaceService
    * @desc Rpc to replace a service.  Only the spec and metadata labels and
    * annotations are modifiable. After the Update request, Cloud Run will work
    * to make the 'status' match the requested 'spec'.  May provide
    * metadata.resourceVersion to enforce update from last read for optimistic
    * concurrency control.
    * @alias run.projects.locations.services.replaceService
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the service being replaced. If needed, replace {namespace_id} with the project ID.
    * @param {().Service} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def replaceService(): GaxiosPromise[Schema$Service] = js.native
  def replaceService(callback: BodyResponseCallback[Schema$Service]): Unit = js.native
  def replaceService(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarReplaceservice): GaxiosPromise[Schema$Service] = js.native
  def replaceService(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarReplaceservice,
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  def replaceService(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarReplaceservice,
    options: BodyResponseCallback[Schema$Service],
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  def replaceService(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarReplaceservice,
    options: MethodOptions
  ): GaxiosPromise[Schema$Service] = js.native
  def replaceService(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarReplaceservice,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  /**
    * run.projects.locations.services.setIamPolicy
    * @desc Sets the IAM Access control policy for the specified Service.
    * Overwrites any existing policy.
    * @alias run.projects.locations.services.setIamPolicy
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
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarSetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * run.projects.locations.services.testIamPermissions
    * @desc Returns permissions that a caller has on the specified Project.
    * There are no permissions required for making this API call.
    * @alias run.projects.locations.services.testIamPermissions
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
  def testIamPermissions(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarTestiampermissions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarServicesDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
}

