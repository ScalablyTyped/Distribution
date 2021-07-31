package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudbuild/v1", "cloudbuild_v1.Resource$Projects$Triggers")
@js.native
class ResourceProjectsTriggers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * cloudbuild.projects.triggers.create
    * @desc Creates a new `BuildTrigger`.  This API is experimental.
    * @alias cloudbuild.projects.triggers.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId ID of the project for which to configure automatic builds.
    * @param {().BuildTrigger} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaBuildTrigger] = js.native
  def create(callback: BodyResponseCallback[SchemaBuildTrigger]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBuildTrigger] = js.native
  def create(params: ParamsResourceProjectsTriggersCreate): GaxiosPromise[SchemaBuildTrigger] = js.native
  def create(params: ParamsResourceProjectsTriggersCreate, callback: BodyResponseCallback[SchemaBuildTrigger]): Unit = js.native
  def create(
    params: ParamsResourceProjectsTriggersCreate,
    options: BodyResponseCallback[SchemaBuildTrigger],
    callback: BodyResponseCallback[SchemaBuildTrigger]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsTriggersCreate, options: MethodOptions): GaxiosPromise[SchemaBuildTrigger] = js.native
  def create(
    params: ParamsResourceProjectsTriggersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuildTrigger]
  ): Unit = js.native
  
  /**
    * cloudbuild.projects.triggers.delete
    * @desc Deletes a `BuildTrigger` by its project ID and trigger ID.  This
    * API is experimental.
    * @alias cloudbuild.projects.triggers.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId ID of the project that owns the trigger.
    * @param {string} params.triggerId ID of the `BuildTrigger` to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsTriggersDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsTriggersDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsTriggersDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsTriggersDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsTriggersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * cloudbuild.projects.triggers.get
    * @desc Returns information about a `BuildTrigger`.  This API is
    * experimental.
    * @alias cloudbuild.projects.triggers.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId ID of the project that owns the trigger.
    * @param {string} params.triggerId ID of the `BuildTrigger` to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaBuildTrigger] = js.native
  def get(callback: BodyResponseCallback[SchemaBuildTrigger]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBuildTrigger] = js.native
  def get(params: ParamsResourceProjectsTriggersGet): GaxiosPromise[SchemaBuildTrigger] = js.native
  def get(params: ParamsResourceProjectsTriggersGet, callback: BodyResponseCallback[SchemaBuildTrigger]): Unit = js.native
  def get(
    params: ParamsResourceProjectsTriggersGet,
    options: BodyResponseCallback[SchemaBuildTrigger],
    callback: BodyResponseCallback[SchemaBuildTrigger]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsTriggersGet, options: MethodOptions): GaxiosPromise[SchemaBuildTrigger] = js.native
  def get(
    params: ParamsResourceProjectsTriggersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuildTrigger]
  ): Unit = js.native
  
  /**
    * cloudbuild.projects.triggers.list
    * @desc Lists existing `BuildTrigger`s.  This API is experimental.
    * @alias cloudbuild.projects.triggers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Number of results to return in the list.
    * @param {string=} params.pageToken Token to provide to skip to a particular spot in the list.
    * @param {string} params.projectId ID of the project for which to list BuildTriggers.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListBuildTriggersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListBuildTriggersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListBuildTriggersResponse] = js.native
  def list(params: ParamsResourceProjectsTriggersList): GaxiosPromise[SchemaListBuildTriggersResponse] = js.native
  def list(
    params: ParamsResourceProjectsTriggersList,
    callback: BodyResponseCallback[SchemaListBuildTriggersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsTriggersList,
    options: BodyResponseCallback[SchemaListBuildTriggersResponse],
    callback: BodyResponseCallback[SchemaListBuildTriggersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsTriggersList, options: MethodOptions): GaxiosPromise[SchemaListBuildTriggersResponse] = js.native
  def list(
    params: ParamsResourceProjectsTriggersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListBuildTriggersResponse]
  ): Unit = js.native
  
  /**
    * cloudbuild.projects.triggers.patch
    * @desc Updates a `BuildTrigger` by its project ID and trigger ID.  This
    * API is experimental.
    * @alias cloudbuild.projects.triggers.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId ID of the project that owns the trigger.
    * @param {string} params.triggerId ID of the `BuildTrigger` to update.
    * @param {().BuildTrigger} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaBuildTrigger] = js.native
  def patch(callback: BodyResponseCallback[SchemaBuildTrigger]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBuildTrigger] = js.native
  def patch(params: ParamsResourceProjectsTriggersPatch): GaxiosPromise[SchemaBuildTrigger] = js.native
  def patch(params: ParamsResourceProjectsTriggersPatch, callback: BodyResponseCallback[SchemaBuildTrigger]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsTriggersPatch,
    options: BodyResponseCallback[SchemaBuildTrigger],
    callback: BodyResponseCallback[SchemaBuildTrigger]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsTriggersPatch, options: MethodOptions): GaxiosPromise[SchemaBuildTrigger] = js.native
  def patch(
    params: ParamsResourceProjectsTriggersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuildTrigger]
  ): Unit = js.native
  
  /**
    * cloudbuild.projects.triggers.run
    * @desc Runs a `BuildTrigger` at a particular source revision.
    * @alias cloudbuild.projects.triggers.run
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId ID of the project.
    * @param {string} params.triggerId ID of the trigger.
    * @param {().RepoSource} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def run(): GaxiosPromise[SchemaOperation] = js.native
  def run(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def run(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def run(params: ParamsResourceProjectsTriggersRun): GaxiosPromise[SchemaOperation] = js.native
  def run(params: ParamsResourceProjectsTriggersRun, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def run(
    params: ParamsResourceProjectsTriggersRun,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def run(params: ParamsResourceProjectsTriggersRun, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def run(
    params: ParamsResourceProjectsTriggersRun,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
