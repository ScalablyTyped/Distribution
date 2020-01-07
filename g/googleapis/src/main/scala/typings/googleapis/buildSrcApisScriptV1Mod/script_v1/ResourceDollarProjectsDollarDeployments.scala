package typings.googleapis.buildSrcApisScriptV1Mod.script_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/script/v1", "script_v1.Resource$Projects$Deployments")
@js.native
class ResourceDollarProjectsDollarDeployments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * script.projects.deployments.create
    * @desc Creates a deployment of an Apps Script project.
    * @alias script.projects.deployments.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.scriptId The script project's Drive ID.
    * @param {().DeploymentConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Deployment] = js.native
  def create(callback: BodyResponseCallback[Schema$Deployment]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarDeploymentsDollarCreate): GaxiosPromise[Schema$Deployment] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarDeploymentsDollarCreate,
    callback: BodyResponseCallback[Schema$Deployment]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarDeploymentsDollarCreate,
    options: BodyResponseCallback[Schema$Deployment],
    callback: BodyResponseCallback[Schema$Deployment]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarDeploymentsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Deployment] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarDeploymentsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Deployment]
  ): Unit = js.native
  /**
    * script.projects.deployments.delete
    * @desc Deletes a deployment of an Apps Script project.
    * @alias script.projects.deployments.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deploymentId The deployment ID to be undeployed.
    * @param {string} params.scriptId The script project's Drive ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarDeploymentsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarDeploymentsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarDeploymentsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarDeploymentsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarDeploymentsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * script.projects.deployments.get
    * @desc Gets a deployment of an Apps Script project.
    * @alias script.projects.deployments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deploymentId The deployment ID.
    * @param {string} params.scriptId The script project's Drive ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Deployment] = js.native
  def get(callback: BodyResponseCallback[Schema$Deployment]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarDeploymentsDollarGet): GaxiosPromise[Schema$Deployment] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarDeploymentsDollarGet,
    callback: BodyResponseCallback[Schema$Deployment]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarDeploymentsDollarGet,
    options: BodyResponseCallback[Schema$Deployment],
    callback: BodyResponseCallback[Schema$Deployment]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarDeploymentsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Deployment] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarDeploymentsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Deployment]
  ): Unit = js.native
  /**
    * script.projects.deployments.list
    * @desc Lists the deployments of an Apps Script project.
    * @alias script.projects.deployments.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of deployments on each returned page. Defaults to 50.
    * @param {string=} params.pageToken The token for continuing a previous list request on the next page. This should be set to the value of `nextPageToken` from a previous response.
    * @param {string} params.scriptId The script project's Drive ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListDeploymentsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListDeploymentsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarDeploymentsDollarList): GaxiosPromise[Schema$ListDeploymentsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarDeploymentsDollarList,
    callback: BodyResponseCallback[Schema$ListDeploymentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarDeploymentsDollarList,
    options: BodyResponseCallback[Schema$ListDeploymentsResponse],
    callback: BodyResponseCallback[Schema$ListDeploymentsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarDeploymentsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListDeploymentsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarDeploymentsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListDeploymentsResponse]
  ): Unit = js.native
  /**
    * script.projects.deployments.update
    * @desc Updates a deployment of an Apps Script project.
    * @alias script.projects.deployments.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deploymentId The deployment ID for this deployment.
    * @param {string} params.scriptId The script project's Drive ID.
    * @param {().UpdateDeploymentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Deployment] = js.native
  def update(callback: BodyResponseCallback[Schema$Deployment]): Unit = js.native
  def update(params: ParamsDollarResourceDollarProjectsDollarDeploymentsDollarUpdate): GaxiosPromise[Schema$Deployment] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarDeploymentsDollarUpdate,
    callback: BodyResponseCallback[Schema$Deployment]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarDeploymentsDollarUpdate,
    options: BodyResponseCallback[Schema$Deployment],
    callback: BodyResponseCallback[Schema$Deployment]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarProjectsDollarDeploymentsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Deployment] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarDeploymentsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Deployment]
  ): Unit = js.native
}

