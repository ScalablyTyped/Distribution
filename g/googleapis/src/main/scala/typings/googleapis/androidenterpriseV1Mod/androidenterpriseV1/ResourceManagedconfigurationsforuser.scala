package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Managedconfigurationsforuser")
@js.native
class ResourceManagedconfigurationsforuser protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * androidenterprise.managedconfigurationsforuser.delete
    * @desc Removes a per-user managed configuration for an app for the
    * specified user.
    * @alias androidenterprise.managedconfigurationsforuser.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.managedConfigurationForUserId The ID of the managed configuration (a product ID), e.g. "app:com.google.android.gm".
    * @param {string} params.userId The ID of the user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagedconfigurationsforuserDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagedconfigurationsforuserDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceManagedconfigurationsforuserDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceManagedconfigurationsforuserDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceManagedconfigurationsforuserDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * androidenterprise.managedconfigurationsforuser.get
    * @desc Retrieves details of a per-user managed configuration for an app
    * for the specified user.
    * @alias androidenterprise.managedconfigurationsforuser.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.managedConfigurationForUserId The ID of the managed configuration (a product ID), e.g. "app:com.google.android.gm".
    * @param {string} params.userId The ID of the user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def get(callback: BodyResponseCallback[SchemaManagedConfiguration]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def get(params: ParamsResourceManagedconfigurationsforuserGet): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def get(
    params: ParamsResourceManagedconfigurationsforuserGet,
    callback: BodyResponseCallback[SchemaManagedConfiguration]
  ): Unit = js.native
  def get(
    params: ParamsResourceManagedconfigurationsforuserGet,
    options: BodyResponseCallback[SchemaManagedConfiguration],
    callback: BodyResponseCallback[SchemaManagedConfiguration]
  ): Unit = js.native
  def get(params: ParamsResourceManagedconfigurationsforuserGet, options: MethodOptions): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def get(
    params: ParamsResourceManagedconfigurationsforuserGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedConfiguration]
  ): Unit = js.native
  
  /**
    * androidenterprise.managedconfigurationsforuser.list
    * @desc Lists all the per-user managed configurations for the specified
    * user. Only the ID is set.
    * @alias androidenterprise.managedconfigurationsforuser.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.userId The ID of the user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaManagedConfigurationsForUserListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaManagedConfigurationsForUserListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaManagedConfigurationsForUserListResponse] = js.native
  def list(params: ParamsResourceManagedconfigurationsforuserList): GaxiosPromise[SchemaManagedConfigurationsForUserListResponse] = js.native
  def list(
    params: ParamsResourceManagedconfigurationsforuserList,
    callback: BodyResponseCallback[SchemaManagedConfigurationsForUserListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagedconfigurationsforuserList,
    options: BodyResponseCallback[SchemaManagedConfigurationsForUserListResponse],
    callback: BodyResponseCallback[SchemaManagedConfigurationsForUserListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceManagedconfigurationsforuserList, options: MethodOptions): GaxiosPromise[SchemaManagedConfigurationsForUserListResponse] = js.native
  def list(
    params: ParamsResourceManagedconfigurationsforuserList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedConfigurationsForUserListResponse]
  ): Unit = js.native
  
  /**
    * androidenterprise.managedconfigurationsforuser.patch
    * @desc Adds or updates the managed configuration settings for an app for
    * the specified user. If you support the Managed configurations iframe, you
    * can apply managed configurations to a user by specifying an mcmId and its
    * associated configuration variables (if any) in the request.
    * Alternatively, all EMMs can apply managed configurations by passing a
    * list of managed properties. This method supports patch semantics.
    * @alias androidenterprise.managedconfigurationsforuser.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.managedConfigurationForUserId The ID of the managed configuration (a product ID), e.g. "app:com.google.android.gm".
    * @param {string} params.userId The ID of the user.
    * @param {().ManagedConfiguration} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def patch(callback: BodyResponseCallback[SchemaManagedConfiguration]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def patch(params: ParamsResourceManagedconfigurationsforuserPatch): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def patch(
    params: ParamsResourceManagedconfigurationsforuserPatch,
    callback: BodyResponseCallback[SchemaManagedConfiguration]
  ): Unit = js.native
  def patch(
    params: ParamsResourceManagedconfigurationsforuserPatch,
    options: BodyResponseCallback[SchemaManagedConfiguration],
    callback: BodyResponseCallback[SchemaManagedConfiguration]
  ): Unit = js.native
  def patch(params: ParamsResourceManagedconfigurationsforuserPatch, options: MethodOptions): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def patch(
    params: ParamsResourceManagedconfigurationsforuserPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedConfiguration]
  ): Unit = js.native
  
  /**
    * androidenterprise.managedconfigurationsforuser.update
    * @desc Adds or updates the managed configuration settings for an app for
    * the specified user. If you support the Managed configurations iframe, you
    * can apply managed configurations to a user by specifying an mcmId and its
    * associated configuration variables (if any) in the request.
    * Alternatively, all EMMs can apply managed configurations by passing a
    * list of managed properties.
    * @alias androidenterprise.managedconfigurationsforuser.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.managedConfigurationForUserId The ID of the managed configuration (a product ID), e.g. "app:com.google.android.gm".
    * @param {string} params.userId The ID of the user.
    * @param {().ManagedConfiguration} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def update(callback: BodyResponseCallback[SchemaManagedConfiguration]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def update(params: ParamsResourceManagedconfigurationsforuserUpdate): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def update(
    params: ParamsResourceManagedconfigurationsforuserUpdate,
    callback: BodyResponseCallback[SchemaManagedConfiguration]
  ): Unit = js.native
  def update(
    params: ParamsResourceManagedconfigurationsforuserUpdate,
    options: BodyResponseCallback[SchemaManagedConfiguration],
    callback: BodyResponseCallback[SchemaManagedConfiguration]
  ): Unit = js.native
  def update(params: ParamsResourceManagedconfigurationsforuserUpdate, options: MethodOptions): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def update(
    params: ParamsResourceManagedconfigurationsforuserUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedConfiguration]
  ): Unit = js.native
}
