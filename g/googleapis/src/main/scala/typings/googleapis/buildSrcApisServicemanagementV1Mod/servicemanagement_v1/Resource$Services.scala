package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/servicemanagement/v1", "servicemanagement_v1.Resource$Services")
@js.native
class Resource$Services protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var configs: ResourceDollarServicesDollarConfigs = js.native
  var consumers: ResourceDollarServicesDollarConsumers = js.native
  var context: APIRequestContext = js.native
  var rollouts: ResourceDollarServicesDollarRollouts = js.native
  /**
    * servicemanagement.services.create
    * @desc Creates a new managed service. Please note one producer project can
    * own no more than 20 services.  Operation<response: ManagedService>
    * @alias servicemanagement.services.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().ManagedService} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Operation] = js.native
  def create(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarServicesDollarCreate): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarServicesDollarCreate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarServicesDollarCreate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarServicesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarServicesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * servicemanagement.services.delete
    * @desc Deletes a managed service. This method will change the service to
    * the `Soft-Delete` state for 30 days. Within this period, service
    * producers may call UndeleteService to restore the service. After 30 days,
    * the service will be permanently deleted.  Operation<response:
    * google.protobuf.Empty>
    * @alias servicemanagement.services.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.serviceName The name of the service.  See the [overview](/service-management/overview) for naming requirements.  For example: `example.googleapis.com`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarServicesDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarServicesDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarServicesDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarServicesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarServicesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * servicemanagement.services.disable
    * @desc Disables a service for a project, so it can no longer be be used
    * for the project. It prevents accidental usage that may cause unexpected
    * billing charges or security leaks.  Operation<response:
    * DisableServiceResponse>
    * @alias servicemanagement.services.disable
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.serviceName Name of the service to disable. Specifying an unknown service name will cause the request to fail.
    * @param {().DisableServiceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def disable(): GaxiosPromise[Schema$Operation] = js.native
  def disable(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def disable(params: ParamsDollarResourceDollarServicesDollarDisable): GaxiosPromise[Schema$Operation] = js.native
  def disable(
    params: ParamsDollarResourceDollarServicesDollarDisable,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def disable(
    params: ParamsDollarResourceDollarServicesDollarDisable,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def disable(params: ParamsDollarResourceDollarServicesDollarDisable, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def disable(
    params: ParamsDollarResourceDollarServicesDollarDisable,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * servicemanagement.services.enable
    * @desc Enables a service for a project, so it can be used for the project.
    * See [Cloud Auth Guide](https://cloud.google.com/docs/authentication) for
    * more information.  Operation<response: EnableServiceResponse>
    * @alias servicemanagement.services.enable
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.serviceName Name of the service to enable. Specifying an unknown service name will cause the request to fail.
    * @param {().EnableServiceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def enable(): GaxiosPromise[Schema$Operation] = js.native
  def enable(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def enable(params: ParamsDollarResourceDollarServicesDollarEnable): GaxiosPromise[Schema$Operation] = js.native
  def enable(
    params: ParamsDollarResourceDollarServicesDollarEnable,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def enable(
    params: ParamsDollarResourceDollarServicesDollarEnable,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def enable(params: ParamsDollarResourceDollarServicesDollarEnable, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def enable(
    params: ParamsDollarResourceDollarServicesDollarEnable,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * servicemanagement.services.generateConfigReport
    * @desc Generates and returns a report (errors, warnings and changes from
    * existing configurations) associated with
    * GenerateConfigReportRequest.new_value  If
    * GenerateConfigReportRequest.old_value is specified,
    * GenerateConfigReportRequest will contain a single ChangeReport based on
    * the comparison between GenerateConfigReportRequest.new_value and
    * GenerateConfigReportRequest.old_value. If
    * GenerateConfigReportRequest.old_value is not specified, this method will
    * compare GenerateConfigReportRequest.new_value with the last pushed
    * service configuration.
    * @alias servicemanagement.services.generateConfigReport
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().GenerateConfigReportRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generateConfigReport(): GaxiosPromise[Schema$GenerateConfigReportResponse] = js.native
  def generateConfigReport(callback: BodyResponseCallback[Schema$GenerateConfigReportResponse]): Unit = js.native
  def generateConfigReport(params: ParamsDollarResourceDollarServicesDollarGenerateconfigreport): GaxiosPromise[Schema$GenerateConfigReportResponse] = js.native
  def generateConfigReport(
    params: ParamsDollarResourceDollarServicesDollarGenerateconfigreport,
    callback: BodyResponseCallback[Schema$GenerateConfigReportResponse]
  ): Unit = js.native
  def generateConfigReport(
    params: ParamsDollarResourceDollarServicesDollarGenerateconfigreport,
    options: BodyResponseCallback[Schema$GenerateConfigReportResponse],
    callback: BodyResponseCallback[Schema$GenerateConfigReportResponse]
  ): Unit = js.native
  def generateConfigReport(params: ParamsDollarResourceDollarServicesDollarGenerateconfigreport, options: MethodOptions): GaxiosPromise[Schema$GenerateConfigReportResponse] = js.native
  def generateConfigReport(
    params: ParamsDollarResourceDollarServicesDollarGenerateconfigreport,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GenerateConfigReportResponse]
  ): Unit = js.native
  /**
    * servicemanagement.services.get
    * @desc Gets a managed service. Authentication is required unless the
    * service is public.
    * @alias servicemanagement.services.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.serviceName The name of the service.  See the `ServiceManager` overview for naming requirements.  For example: `example.googleapis.com`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ManagedService] = js.native
  def get(callback: BodyResponseCallback[Schema$ManagedService]): Unit = js.native
  def get(params: ParamsDollarResourceDollarServicesDollarGet): GaxiosPromise[Schema$ManagedService] = js.native
  def get(
    params: ParamsDollarResourceDollarServicesDollarGet,
    callback: BodyResponseCallback[Schema$ManagedService]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarServicesDollarGet,
    options: BodyResponseCallback[Schema$ManagedService],
    callback: BodyResponseCallback[Schema$ManagedService]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarServicesDollarGet, options: MethodOptions): GaxiosPromise[Schema$ManagedService] = js.native
  def get(
    params: ParamsDollarResourceDollarServicesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ManagedService]
  ): Unit = js.native
  /**
    * servicemanagement.services.getConfig
    * @desc Gets a service configuration (version) for a managed service.
    * @alias servicemanagement.services.getConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.configId The id of the service configuration resource.  This field must be specified for the server to return all fields, including `SourceInfo`.
    * @param {string} params.serviceName The name of the service.  See the [overview](/service-management/overview) for naming requirements.  For example: `example.googleapis.com`.
    * @param {string=} params.view Specifies which parts of the Service Config should be returned in the response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getConfig(): GaxiosPromise[Schema$Service] = js.native
  def getConfig(callback: BodyResponseCallback[Schema$Service]): Unit = js.native
  def getConfig(params: ParamsDollarResourceDollarServicesDollarGetconfig): GaxiosPromise[Schema$Service] = js.native
  def getConfig(
    params: ParamsDollarResourceDollarServicesDollarGetconfig,
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  def getConfig(
    params: ParamsDollarResourceDollarServicesDollarGetconfig,
    options: BodyResponseCallback[Schema$Service],
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  def getConfig(params: ParamsDollarResourceDollarServicesDollarGetconfig, options: MethodOptions): GaxiosPromise[Schema$Service] = js.native
  def getConfig(
    params: ParamsDollarResourceDollarServicesDollarGetconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  /**
    * servicemanagement.services.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias servicemanagement.services.getIamPolicy
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
  def getIamPolicy(params: ParamsDollarResourceDollarServicesDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarServicesDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarServicesDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarServicesDollarGetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarServicesDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * servicemanagement.services.list
    * @desc Lists managed services.  Returns all public services. For
    * authenticated users, also returns all services the calling user has
    * "servicemanagement.services.get" permission for.  **BETA:** If the caller
    * specifies the `consumer_id`, it returns only the services enabled on the
    * consumer. The `consumer_id` must have the format of
    * "project:{PROJECT-ID}".
    * @alias servicemanagement.services.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.consumerId Include services consumed by the specified consumer.  The Google Service Management implementation accepts the following forms: - project:<project_id>
    * @param {integer=} params.pageSize The max number of items to include in the response list. Page size is 50 if not specified. Maximum value is 100.
    * @param {string=} params.pageToken Token identifying which result to start with; returned by a previous list call.
    * @param {string=} params.producerProjectId Include services produced by the specified project.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListServicesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListServicesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarServicesDollarList): GaxiosPromise[Schema$ListServicesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarServicesDollarList,
    callback: BodyResponseCallback[Schema$ListServicesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarServicesDollarList,
    options: BodyResponseCallback[Schema$ListServicesResponse],
    callback: BodyResponseCallback[Schema$ListServicesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarServicesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListServicesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarServicesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListServicesResponse]
  ): Unit = js.native
  /**
    * servicemanagement.services.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias servicemanagement.services.setIamPolicy
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
  def setIamPolicy(params: ParamsDollarResourceDollarServicesDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarServicesDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarServicesDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarServicesDollarSetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarServicesDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * servicemanagement.services.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  Note: This operation is designed to
    * be used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias servicemanagement.services.testIamPermissions
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
  def testIamPermissions(params: ParamsDollarResourceDollarServicesDollarTestiampermissions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarServicesDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarServicesDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarServicesDollarTestiampermissions, options: MethodOptions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarServicesDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * servicemanagement.services.undelete
    * @desc Revives a previously deleted managed service. The method restores
    * the service using the configuration at the time the service was deleted.
    * The target service must exist and must have been deleted within the last
    * 30 days.  Operation<response: UndeleteServiceResponse>
    * @alias servicemanagement.services.undelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.serviceName The name of the service. See the [overview](/service-management/overview) for naming requirements. For example: `example.googleapis.com`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def undelete(): GaxiosPromise[Schema$Operation] = js.native
  def undelete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def undelete(params: ParamsDollarResourceDollarServicesDollarUndelete): GaxiosPromise[Schema$Operation] = js.native
  def undelete(
    params: ParamsDollarResourceDollarServicesDollarUndelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def undelete(
    params: ParamsDollarResourceDollarServicesDollarUndelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def undelete(params: ParamsDollarResourceDollarServicesDollarUndelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def undelete(
    params: ParamsDollarResourceDollarServicesDollarUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

