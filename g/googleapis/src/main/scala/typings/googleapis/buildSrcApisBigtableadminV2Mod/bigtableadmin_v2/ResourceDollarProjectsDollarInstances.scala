package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/bigtableadmin/v2", "bigtableadmin_v2.Resource$Projects$Instances")
@js.native
class ResourceDollarProjectsDollarInstances protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var appProfiles: ResourceDollarProjectsDollarInstancesDollarAppprofiles = js.native
  var clusters: ResourceDollarProjectsDollarInstancesDollarClusters = js.native
  var context: APIRequestContext = js.native
  var tables: ResourceDollarProjectsDollarInstancesDollarTables = js.native
  /**
    * bigtableadmin.projects.instances.create
    * @desc Create an instance within a project.
    * @alias bigtableadmin.projects.instances.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The unique name of the project in which to create the new instance. Values are of the form `projects/<project>`.
    * @param {().CreateInstanceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Operation] = js.native
  def create(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarCreate): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarCreate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarCreate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * bigtableadmin.projects.instances.delete
    * @desc Delete an instance from a project.
    * @alias bigtableadmin.projects.instances.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The unique name of the instance to be deleted. Values are of the form `projects/<project>/instances/<instance>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * bigtableadmin.projects.instances.get
    * @desc Gets information about an instance.
    * @alias bigtableadmin.projects.instances.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The unique name of the requested instance. Values are of the form `projects/<project>/instances/<instance>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Instance] = js.native
  def get(callback: BodyResponseCallback[Schema$Instance]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarGet): GaxiosPromise[Schema$Instance] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarGet,
    callback: BodyResponseCallback[Schema$Instance]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarGet,
    options: BodyResponseCallback[Schema$Instance],
    callback: BodyResponseCallback[Schema$Instance]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Instance] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Instance]
  ): Unit = js.native
  /**
    * bigtableadmin.projects.instances.getIamPolicy
    * @desc Gets the access control policy for an instance resource. Returns an
    * empty policy if an instance exists but does not have a policy set.
    * @alias bigtableadmin.projects.instances.getIamPolicy
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
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarGetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * bigtableadmin.projects.instances.list
    * @desc Lists information about instances in a project.
    * @alias bigtableadmin.projects.instances.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pageToken DEPRECATED: This field is unused and ignored.
    * @param {string} params.parent The unique name of the project for which a list of instances is requested. Values are of the form `projects/<project>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListInstancesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListInstancesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarList): GaxiosPromise[Schema$ListInstancesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarList,
    callback: BodyResponseCallback[Schema$ListInstancesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarList,
    options: BodyResponseCallback[Schema$ListInstancesResponse],
    callback: BodyResponseCallback[Schema$ListInstancesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListInstancesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListInstancesResponse]
  ): Unit = js.native
  /**
    * bigtableadmin.projects.instances.partialUpdateInstance
    * @desc Partially updates an instance within a project. This method can
    * modify all fields of an Instance and is the preferred way to update an
    * Instance.
    * @alias bigtableadmin.projects.instances.partialUpdateInstance
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name (`OutputOnly`) The unique name of the instance. Values are of the form `projects/<project>/instances/a-z+[a-z0-9]`.
    * @param {string=} params.updateMask The subset of Instance fields which should be replaced. Must be explicitly set.
    * @param {().Instance} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def partialUpdateInstance(): GaxiosPromise[Schema$Operation] = js.native
  def partialUpdateInstance(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def partialUpdateInstance(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarPartialupdateinstance): GaxiosPromise[Schema$Operation] = js.native
  def partialUpdateInstance(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarPartialupdateinstance,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def partialUpdateInstance(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarPartialupdateinstance,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def partialUpdateInstance(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarPartialupdateinstance,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def partialUpdateInstance(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarPartialupdateinstance,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * bigtableadmin.projects.instances.setIamPolicy
    * @desc Sets the access control policy on an instance resource. Replaces
    * any existing policy.
    * @alias bigtableadmin.projects.instances.setIamPolicy
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
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarSetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * bigtableadmin.projects.instances.testIamPermissions
    * @desc Returns permissions that the caller has on the specified instance
    * resource.
    * @alias bigtableadmin.projects.instances.testIamPermissions
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
  def testIamPermissions(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTestiampermissions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * bigtableadmin.projects.instances.update
    * @desc Updates an instance within a project. This method updates only the
    * display name and type for an Instance. To update other Instance
    * properties, such as labels, use PartialUpdateInstance.
    * @alias bigtableadmin.projects.instances.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name (`OutputOnly`) The unique name of the instance. Values are of the form `projects/<project>/instances/a-z+[a-z0-9]`.
    * @param {().Instance} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Instance] = js.native
  def update(callback: BodyResponseCallback[Schema$Instance]): Unit = js.native
  def update(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarUpdate): GaxiosPromise[Schema$Instance] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarUpdate,
    callback: BodyResponseCallback[Schema$Instance]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarUpdate,
    options: BodyResponseCallback[Schema$Instance],
    callback: BodyResponseCallback[Schema$Instance]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Instance] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Instance]
  ): Unit = js.native
}

