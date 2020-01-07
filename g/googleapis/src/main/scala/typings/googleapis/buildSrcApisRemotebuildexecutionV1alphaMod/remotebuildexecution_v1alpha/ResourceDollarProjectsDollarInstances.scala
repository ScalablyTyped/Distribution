package typings.googleapis.buildSrcApisRemotebuildexecutionV1alphaMod.remotebuildexecution_v1alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/remotebuildexecution/v1alpha", "remotebuildexecution_v1alpha.Resource$Projects$Instances")
@js.native
class ResourceDollarProjectsDollarInstances protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var workerpools: ResourceDollarProjectsDollarInstancesDollarWorkerpools = js.native
  /**
    * remotebuildexecution.projects.instances.create
    * @desc Creates a new instance in the specified region. Returns a long
    * running operation which contains an instance on completion. While the
    * long running operation is in progress, any call to `GetInstance` returns
    * an instance in state `CREATING`.
    * @alias remotebuildexecution.projects.instances.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Resource name of the project containing the instance. Format: `projects/[PROJECT_ID]`.
    * @param {().GoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateInstanceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def create(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarCreate): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarCreate,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarCreate,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * remotebuildexecution.projects.instances.delete
    * @desc Deletes the specified instance. Returns a long running operation
    * which contains a `google.protobuf.Empty` response on completion. Deleting
    * an instance with worker pools in it will delete these worker pools.
    * @alias remotebuildexecution.projects.instances.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the instance to delete. Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def delete(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDelete): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDelete,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDelete,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * remotebuildexecution.projects.instances.get
    * @desc Returns the specified instance.
    * @alias remotebuildexecution.projects.instances.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the instance to retrieve. Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance] = js.native
  def get(callback: BodyResponseCallback[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarGet): GaxiosPromise[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarGet,
    callback: BodyResponseCallback[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarGet,
    options: BodyResponseCallback[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance],
    callback: BodyResponseCallback[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarGet, options: MethodOptions): GaxiosPromise[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance]
  ): Unit = js.native
  /**
    * remotebuildexecution.projects.instances.list
    * @desc Lists instances in a project.
    * @alias remotebuildexecution.projects.instances.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Resource name of the project. Format: `projects/[PROJECT_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse] = js.native
  def list(
    callback: BodyResponseCallback[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarList): GaxiosPromise[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarList,
    callback: BodyResponseCallback[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarList,
    options: BodyResponseCallback[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse],
    callback: BodyResponseCallback[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarList, options: MethodOptions): GaxiosPromise[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse]
  ): Unit = js.native
}

