package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/bigtableadmin/v2", "bigtableadmin_v2.Resource$Projects$Instances$Appprofiles")
@js.native
class ResourceProjectsInstancesAppprofiles protected () extends StObject {
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
  def create(): GaxiosPromise[SchemaAppProfile] = js.native
  def create(callback: BodyResponseCallback[SchemaAppProfile]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAppProfile] = js.native
  def create(params: ParamsResourceProjectsInstancesAppprofilesCreate): GaxiosPromise[SchemaAppProfile] = js.native
  def create(
    params: ParamsResourceProjectsInstancesAppprofilesCreate,
    callback: BodyResponseCallback[SchemaAppProfile]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsInstancesAppprofilesCreate,
    options: BodyResponseCallback[SchemaAppProfile],
    callback: BodyResponseCallback[SchemaAppProfile]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsInstancesAppprofilesCreate, options: MethodOptions): GaxiosPromise[SchemaAppProfile] = js.native
  def create(
    params: ParamsResourceProjectsInstancesAppprofilesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAppProfile]
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
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsInstancesAppprofilesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsInstancesAppprofilesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsInstancesAppprofilesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsInstancesAppprofilesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsInstancesAppprofilesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
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
  def get(): GaxiosPromise[SchemaAppProfile] = js.native
  def get(callback: BodyResponseCallback[SchemaAppProfile]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAppProfile] = js.native
  def get(params: ParamsResourceProjectsInstancesAppprofilesGet): GaxiosPromise[SchemaAppProfile] = js.native
  def get(
    params: ParamsResourceProjectsInstancesAppprofilesGet,
    callback: BodyResponseCallback[SchemaAppProfile]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsInstancesAppprofilesGet,
    options: BodyResponseCallback[SchemaAppProfile],
    callback: BodyResponseCallback[SchemaAppProfile]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsInstancesAppprofilesGet, options: MethodOptions): GaxiosPromise[SchemaAppProfile] = js.native
  def get(
    params: ParamsResourceProjectsInstancesAppprofilesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAppProfile]
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
  def list(): GaxiosPromise[SchemaListAppProfilesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAppProfilesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAppProfilesResponse] = js.native
  def list(params: ParamsResourceProjectsInstancesAppprofilesList): GaxiosPromise[SchemaListAppProfilesResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstancesAppprofilesList,
    callback: BodyResponseCallback[SchemaListAppProfilesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsInstancesAppprofilesList,
    options: BodyResponseCallback[SchemaListAppProfilesResponse],
    callback: BodyResponseCallback[SchemaListAppProfilesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsInstancesAppprofilesList, options: MethodOptions): GaxiosPromise[SchemaListAppProfilesResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstancesAppprofilesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAppProfilesResponse]
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
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsInstancesAppprofilesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsInstancesAppprofilesPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsInstancesAppprofilesPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsInstancesAppprofilesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsInstancesAppprofilesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
