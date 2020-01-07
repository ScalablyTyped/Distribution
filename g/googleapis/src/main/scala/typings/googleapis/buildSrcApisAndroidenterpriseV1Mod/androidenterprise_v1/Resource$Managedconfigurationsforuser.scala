package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Managedconfigurationsforuser")
@js.native
class Resource$Managedconfigurationsforuser protected () extends js.Object {
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
  def delete(params: ParamsDollarResourceDollarManagedconfigurationsforuserDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarManagedconfigurationsforuserDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarManagedconfigurationsforuserDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarManagedconfigurationsforuserDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarManagedconfigurationsforuserDollarDelete,
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
  def get(): GaxiosPromise[Schema$ManagedConfiguration] = js.native
  def get(callback: BodyResponseCallback[Schema$ManagedConfiguration]): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagedconfigurationsforuserDollarGet): GaxiosPromise[Schema$ManagedConfiguration] = js.native
  def get(
    params: ParamsDollarResourceDollarManagedconfigurationsforuserDollarGet,
    callback: BodyResponseCallback[Schema$ManagedConfiguration]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarManagedconfigurationsforuserDollarGet,
    options: BodyResponseCallback[Schema$ManagedConfiguration],
    callback: BodyResponseCallback[Schema$ManagedConfiguration]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagedconfigurationsforuserDollarGet, options: MethodOptions): GaxiosPromise[Schema$ManagedConfiguration] = js.native
  def get(
    params: ParamsDollarResourceDollarManagedconfigurationsforuserDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ManagedConfiguration]
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
  def list(): GaxiosPromise[Schema$ManagedConfigurationsForUserListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ManagedConfigurationsForUserListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagedconfigurationsforuserDollarList): GaxiosPromise[Schema$ManagedConfigurationsForUserListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarManagedconfigurationsforuserDollarList,
    callback: BodyResponseCallback[Schema$ManagedConfigurationsForUserListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagedconfigurationsforuserDollarList,
    options: BodyResponseCallback[Schema$ManagedConfigurationsForUserListResponse],
    callback: BodyResponseCallback[Schema$ManagedConfigurationsForUserListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagedconfigurationsforuserDollarList, options: MethodOptions): GaxiosPromise[Schema$ManagedConfigurationsForUserListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarManagedconfigurationsforuserDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ManagedConfigurationsForUserListResponse]
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
  def patch(): GaxiosPromise[Schema$ManagedConfiguration] = js.native
  def patch(callback: BodyResponseCallback[Schema$ManagedConfiguration]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarManagedconfigurationsforuserDollarPatch): GaxiosPromise[Schema$ManagedConfiguration] = js.native
  def patch(
    params: ParamsDollarResourceDollarManagedconfigurationsforuserDollarPatch,
    callback: BodyResponseCallback[Schema$ManagedConfiguration]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarManagedconfigurationsforuserDollarPatch,
    options: BodyResponseCallback[Schema$ManagedConfiguration],
    callback: BodyResponseCallback[Schema$ManagedConfiguration]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarManagedconfigurationsforuserDollarPatch, options: MethodOptions): GaxiosPromise[Schema$ManagedConfiguration] = js.native
  def patch(
    params: ParamsDollarResourceDollarManagedconfigurationsforuserDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ManagedConfiguration]
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
  def update(): GaxiosPromise[Schema$ManagedConfiguration] = js.native
  def update(callback: BodyResponseCallback[Schema$ManagedConfiguration]): Unit = js.native
  def update(params: ParamsDollarResourceDollarManagedconfigurationsforuserDollarUpdate): GaxiosPromise[Schema$ManagedConfiguration] = js.native
  def update(
    params: ParamsDollarResourceDollarManagedconfigurationsforuserDollarUpdate,
    callback: BodyResponseCallback[Schema$ManagedConfiguration]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarManagedconfigurationsforuserDollarUpdate,
    options: BodyResponseCallback[Schema$ManagedConfiguration],
    callback: BodyResponseCallback[Schema$ManagedConfiguration]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarManagedconfigurationsforuserDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$ManagedConfiguration] = js.native
  def update(
    params: ParamsDollarResourceDollarManagedconfigurationsforuserDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ManagedConfiguration]
  ): Unit = js.native
}

