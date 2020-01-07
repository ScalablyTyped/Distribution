package typings.googleapis.buildSrcApisFileV1Mod.file_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/file/v1", "file_v1.Resource$Projects$Locations$Instances")
@js.native
class ResourceDollarProjectsDollarLocationsDollarInstances protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * file.projects.locations.instances.create
    * @desc Creates an instance.
    * @alias file.projects.locations.instances.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.instanceId The name of the instance to create. The name must be unique for the specified project and location.
    * @param {string} params.parent The instance's project and location, in the format projects/{project_id}/locations/{location}. In Cloud Filestore, locations map to GCP zones, for example **us-west1-b**.
    * @param {().Instance} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Operation] = js.native
  def create(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarCreate): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarCreate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarCreate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * file.projects.locations.instances.delete
    * @desc Deletes an instance.
    * @alias file.projects.locations.instances.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The instance resource name, in the format projects/{project_id}/locations/{location}/instances/{instance_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * file.projects.locations.instances.get
    * @desc Gets the details of a specific instance.
    * @alias file.projects.locations.instances.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The instance resource name, in the format projects/{project_id}/locations/{location}/instances/{instance_id}.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Instance] = js.native
  def get(callback: BodyResponseCallback[Schema$Instance]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarGet): GaxiosPromise[Schema$Instance] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarGet,
    callback: BodyResponseCallback[Schema$Instance]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarGet,
    options: BodyResponseCallback[Schema$Instance],
    callback: BodyResponseCallback[Schema$Instance]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Instance] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Instance]
  ): Unit = js.native
  /**
    * file.projects.locations.instances.list
    * @desc Lists all instances in a project for either a specified location or
    * for all locations.
    * @alias file.projects.locations.instances.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter List filter.
    * @param {string=} params.orderBy Sort results. Supported values are "name", "name desc" or "" (unsorted).
    * @param {integer=} params.pageSize The maximum number of items to return.
    * @param {string=} params.pageToken The next_page_token value to use if there are additional results to retrieve for this list request.
    * @param {string} params.parent The project and location for which to retrieve instance information, in the format projects/{project_id}/locations/{location}. In Cloud Filestore, locations map to GCP zones, for example **us-west1-b**. To retrieve instance information for all locations, use "-" for the {location} value.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListInstancesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListInstancesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarList): GaxiosPromise[Schema$ListInstancesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarList,
    callback: BodyResponseCallback[Schema$ListInstancesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarList,
    options: BodyResponseCallback[Schema$ListInstancesResponse],
    callback: BodyResponseCallback[Schema$ListInstancesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListInstancesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListInstancesResponse]
  ): Unit = js.native
  /**
    * file.projects.locations.instances.patch
    * @desc Updates the settings of a specific instance.
    * @alias file.projects.locations.instances.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output only. The resource name of the instance, in the format projects/{project_id}/locations/{location_id}/instances/{instance_id}.
    * @param {string=} params.updateMask Mask of fields to update.  At least one path must be supplied in this field.  The elements of the repeated paths field may only include these fields: "description"
    * @param {().Instance} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarPatch): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarPatch,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarPatch,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarInstancesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

