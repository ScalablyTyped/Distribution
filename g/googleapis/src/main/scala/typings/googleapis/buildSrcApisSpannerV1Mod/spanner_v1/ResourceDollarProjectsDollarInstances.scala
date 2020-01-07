package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/spanner/v1", "spanner_v1.Resource$Projects$Instances")
@js.native
class ResourceDollarProjectsDollarInstances protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var databases: ResourceDollarProjectsDollarInstancesDollarDatabases = js.native
  var operations: ResourceDollarProjectsDollarInstancesDollarOperations = js.native
  /**
    * spanner.projects.instances.create
    * @desc Creates an instance and begins preparing it to begin serving. The
    * returned long-running operation can be used to track the progress of
    * preparing the new instance. The instance name is assigned by the caller.
    * If the named instance already exists, `CreateInstance` returns
    * `ALREADY_EXISTS`.  Immediately upon completion of this request:    * The
    * instance is readable via the API, with all requested attributes     but
    * no allocated resources. Its state is `CREATING`.  Until completion of the
    * returned operation:    * Cancelling the operation renders the instance
    * immediately unreadable     via the API.   * The instance can be deleted.
    * * All other attempts to modify the instance are rejected.  Upon
    * completion of the returned operation:    * Billing for all
    * successfully-allocated resources begins (some types     may have lower
    * than the requested levels).   * Databases can be created in the instance.
    * * The instance's allocated resource levels are readable via the API.   *
    * The instance's state becomes `READY`.  The returned long-running
    * operation will have a name of the format
    * `<instance_name>/operations/<operation_id>` and can be used to track
    * creation of the instance.  The metadata field type is
    * CreateInstanceMetadata. The response field type is Instance, if
    * successful.
    * @alias spanner.projects.instances.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The name of the project in which to create the instance. Values are of the form `projects/<project>`.
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
    * spanner.projects.instances.delete
    * @desc Deletes an instance.  Immediately upon completion of the request:
    * * Billing ceases for all of the instance's reserved resources.  Soon
    * afterward:    * The instance and *all of its databases* immediately and
    * irrevocably disappear from the API. All data in the databases     is
    * permanently deleted.
    * @alias spanner.projects.instances.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the instance to be deleted. Values are of the form `projects/<project>/instances/<instance>`
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
    * spanner.projects.instances.get
    * @desc Gets information about a particular instance.
    * @alias spanner.projects.instances.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the requested instance. Values are of the form `projects/<project>/instances/<instance>`.
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
    * spanner.projects.instances.getIamPolicy
    * @desc Gets the access control policy for an instance resource. Returns an
    * empty policy if an instance exists but does not have a policy set.
    * Authorization requires `spanner.instances.getIamPolicy` on resource.
    * @alias spanner.projects.instances.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The Cloud Spanner resource for which the policy is being retrieved. The format is `projects/<project ID>/instances/<instance ID>` for instance resources and `projects/<project ID>/instances/<instance ID>/databases/<database ID>` for database resources.
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
    * spanner.projects.instances.list
    * @desc Lists all instances in the given project.
    * @alias spanner.projects.instances.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter An expression for filtering the results of the request. Filter rules are case insensitive. The fields eligible for filtering are:    * `name`   * `display_name`   * `labels.key` where key is the name of a label  Some examples of using filters are:    * `name:*` --> The instance has a name.   * `name:Howl` --> The instance's name contains the string "howl".   * `name:HOWL` --> Equivalent to above.   * `NAME:howl` --> Equivalent to above.   * `labels.env:*` --> The instance has the label "env".   * `labels.env:dev` --> The instance has the label "env" and the value of                        the label contains the string "dev".   * `name:howl labels.env:dev` --> The instance's name contains "howl" and                                  it has the label "env" with its value                                  containing "dev".
    * @param {integer=} params.pageSize Number of instances to be returned in the response. If 0 or less, defaults to the server's maximum allowed page size.
    * @param {string=} params.pageToken If non-empty, `page_token` should contain a next_page_token from a previous ListInstancesResponse.
    * @param {string} params.parent Required. The name of the project for which a list of instances is requested. Values are of the form `projects/<project>`.
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
    * spanner.projects.instances.patch
    * @desc Updates an instance, and begins allocating or releasing resources
    * as requested. The returned long-running operation can be used to track
    * the progress of updating the instance. If the named instance does not
    * exist, returns `NOT_FOUND`.  Immediately upon completion of this request:
    * * For resource types for which a decrease in the instance's allocation
    * has been requested, billing is based on the newly-requested level.  Until
    * completion of the returned operation:    * Cancelling the operation sets
    * its metadata's     cancel_time, and begins     restoring resources to
    * their pre-request values. The operation     is guaranteed to succeed at
    * undoing all resource changes,     after which point it terminates with a
    * `CANCELLED` status.   * All other attempts to modify the instance are
    * rejected.   * Reading the instance via the API continues to give the
    * pre-request     resource levels.  Upon completion of the returned
    * operation:    * Billing begins for all successfully-allocated resources
    * (some types     may have lower than the requested levels).   * All
    * newly-reserved resources are available for serving the instance's tables.
    * * The instance's new resource levels are readable via the API.  The
    * returned long-running operation will have a name of the format
    * `<instance_name>/operations/<operation_id>` and can be used to track the
    * instance modification.  The metadata field type is
    * UpdateInstanceMetadata. The response field type is Instance, if
    * successful.  Authorization requires `spanner.instances.update` permission
    * on resource name.
    * @alias spanner.projects.instances.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. A unique identifier for the instance, which cannot be changed after the instance is created. Values are of the form `projects/<project>/instances/a-z*[a-z0-9]`. The final segment of the name must be between 6 and 30 characters in length.
    * @param {().UpdateInstanceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarPatch): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarPatch,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarPatch,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * spanner.projects.instances.setIamPolicy
    * @desc Sets the access control policy on an instance resource. Replaces
    * any existing policy.  Authorization requires
    * `spanner.instances.setIamPolicy` on resource.
    * @alias spanner.projects.instances.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The Cloud Spanner resource for which the policy is being set. The format is `projects/<project ID>/instances/<instance ID>` for instance resources and `projects/<project ID>/instances/<instance ID>/databases/<database ID>` for databases resources.
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
    * spanner.projects.instances.testIamPermissions
    * @desc Returns permissions that the caller has on the specified instance
    * resource.  Attempting this RPC on a non-existent Cloud Spanner instance
    * resource will result in a NOT_FOUND error if the user has
    * `spanner.instances.list` permission on the containing Google Cloud
    * Project. Otherwise returns an empty set of permissions.
    * @alias spanner.projects.instances.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The Cloud Spanner resource for which permissions are being tested. The format is `projects/<project ID>/instances/<instance ID>` for instance resources and `projects/<project ID>/instances/<instance ID>/databases/<database ID>` for database resources.
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
}

