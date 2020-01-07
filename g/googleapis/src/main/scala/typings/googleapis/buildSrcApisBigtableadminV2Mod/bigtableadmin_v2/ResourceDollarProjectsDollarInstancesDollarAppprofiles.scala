package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/bigtableadmin/v2", "bigtableadmin_v2.Resource$Projects$Instances$Appprofiles")
@js.native
class ResourceDollarProjectsDollarInstancesDollarAppprofiles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * bigtableadmin.projects.instances.appProfiles.create
    * @desc Creates an app profile within an instance.
    * @alias bigtableadmin.projects.instances.appProfiles.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.appProfileId The ID to be used when referring to the new app profile within its instance, e.g., just `myprofile` rather than `projects/myproject/instances/myinstance/appProfiles/myprofile`.
    * @param {boolean=} params.ignoreWarnings If true, ignore safety checks when creating the app profile.
    * @param {string} params.parent The unique name of the instance in which to create the new app profile. Values are of the form `projects/<project>/instances/<instance>`.
    * @param {().AppProfile} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$AppProfile] = js.native
  def create(callback: BodyResponseCallback[Schema$AppProfile]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarAppprofilesDollarCreate): GaxiosPromise[Schema$AppProfile] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarAppprofilesDollarCreate,
    callback: BodyResponseCallback[Schema$AppProfile]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarAppprofilesDollarCreate,
    options: BodyResponseCallback[Schema$AppProfile],
    callback: BodyResponseCallback[Schema$AppProfile]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarAppprofilesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$AppProfile] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarAppprofilesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AppProfile]
  ): Unit = js.native
  /**
    * bigtableadmin.projects.instances.appProfiles.delete
    * @desc Deletes an app profile from an instance.
    * @alias bigtableadmin.projects.instances.appProfiles.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.ignoreWarnings If true, ignore safety checks when deleting the app profile.
    * @param {string} params.name The unique name of the app profile to be deleted. Values are of the form `projects/<project>/instances/<instance>/appProfiles/<app_profile>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarAppprofilesDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarAppprofilesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarAppprofilesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarAppprofilesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarAppprofilesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * bigtableadmin.projects.instances.appProfiles.get
    * @desc Gets information about an app profile.
    * @alias bigtableadmin.projects.instances.appProfiles.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The unique name of the requested app profile. Values are of the form `projects/<project>/instances/<instance>/appProfiles/<app_profile>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$AppProfile] = js.native
  def get(callback: BodyResponseCallback[Schema$AppProfile]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarAppprofilesDollarGet): GaxiosPromise[Schema$AppProfile] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarAppprofilesDollarGet,
    callback: BodyResponseCallback[Schema$AppProfile]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarAppprofilesDollarGet,
    options: BodyResponseCallback[Schema$AppProfile],
    callback: BodyResponseCallback[Schema$AppProfile]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarAppprofilesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$AppProfile] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarAppprofilesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AppProfile]
  ): Unit = js.native
  /**
    * bigtableadmin.projects.instances.appProfiles.list
    * @desc Lists information about app profiles in an instance.
    * @alias bigtableadmin.projects.instances.appProfiles.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Maximum number of results per page. CURRENTLY UNIMPLEMENTED AND IGNORED.
    * @param {string=} params.pageToken The value of `next_page_token` returned by a previous call.
    * @param {string} params.parent The unique name of the instance for which a list of app profiles is requested. Values are of the form `projects/<project>/instances/<instance>`. Use `<instance> = '-'` to list AppProfiles for all Instances in a project, e.g., `projects/myproject/instances/-`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListAppProfilesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListAppProfilesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarAppprofilesDollarList): GaxiosPromise[Schema$ListAppProfilesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarAppprofilesDollarList,
    callback: BodyResponseCallback[Schema$ListAppProfilesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarAppprofilesDollarList,
    options: BodyResponseCallback[Schema$ListAppProfilesResponse],
    callback: BodyResponseCallback[Schema$ListAppProfilesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarAppprofilesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListAppProfilesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarAppprofilesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListAppProfilesResponse]
  ): Unit = js.native
  /**
    * bigtableadmin.projects.instances.appProfiles.patch
    * @desc Updates an app profile within an instance.
    * @alias bigtableadmin.projects.instances.appProfiles.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.ignoreWarnings If true, ignore safety checks when updating the app profile.
    * @param {string} params.name (`OutputOnly`) The unique name of the app profile. Values are of the form `projects/<project>/instances/<instance>/appProfiles/_a-zA-Z0-9*`.
    * @param {string=} params.updateMask The subset of app profile fields which should be replaced. If unset, all fields will be replaced.
    * @param {().AppProfile} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarAppprofilesDollarPatch): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarAppprofilesDollarPatch,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarAppprofilesDollarPatch,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarAppprofilesDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarAppprofilesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

