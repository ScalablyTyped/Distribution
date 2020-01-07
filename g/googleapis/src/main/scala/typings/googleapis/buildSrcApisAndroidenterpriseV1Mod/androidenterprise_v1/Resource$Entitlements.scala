package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Entitlements")
@js.native
class Resource$Entitlements protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidenterprise.entitlements.delete
    * @desc Removes an entitlement to an app for a user.
    * @alias androidenterprise.entitlements.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.entitlementId The ID of the entitlement (a product ID), e.g. "app:com.google.android.gm".
    * @param {string} params.userId The ID of the user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarEntitlementsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarEntitlementsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarEntitlementsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarEntitlementsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarEntitlementsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * androidenterprise.entitlements.get
    * @desc Retrieves details of an entitlement.
    * @alias androidenterprise.entitlements.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.entitlementId The ID of the entitlement (a product ID), e.g. "app:com.google.android.gm".
    * @param {string} params.userId The ID of the user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Entitlement] = js.native
  def get(callback: BodyResponseCallback[Schema$Entitlement]): Unit = js.native
  def get(params: ParamsDollarResourceDollarEntitlementsDollarGet): GaxiosPromise[Schema$Entitlement] = js.native
  def get(
    params: ParamsDollarResourceDollarEntitlementsDollarGet,
    callback: BodyResponseCallback[Schema$Entitlement]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarEntitlementsDollarGet,
    options: BodyResponseCallback[Schema$Entitlement],
    callback: BodyResponseCallback[Schema$Entitlement]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarEntitlementsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Entitlement] = js.native
  def get(
    params: ParamsDollarResourceDollarEntitlementsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Entitlement]
  ): Unit = js.native
  /**
    * androidenterprise.entitlements.list
    * @desc Lists all entitlements for the specified user. Only the ID is set.
    * @alias androidenterprise.entitlements.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.userId The ID of the user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$EntitlementsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$EntitlementsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarEntitlementsDollarList): GaxiosPromise[Schema$EntitlementsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarEntitlementsDollarList,
    callback: BodyResponseCallback[Schema$EntitlementsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarEntitlementsDollarList,
    options: BodyResponseCallback[Schema$EntitlementsListResponse],
    callback: BodyResponseCallback[Schema$EntitlementsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarEntitlementsDollarList, options: MethodOptions): GaxiosPromise[Schema$EntitlementsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarEntitlementsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$EntitlementsListResponse]
  ): Unit = js.native
  /**
    * androidenterprise.entitlements.patch
    * @desc Adds or updates an entitlement to an app for a user. This method
    * supports patch semantics.
    * @alias androidenterprise.entitlements.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.entitlementId The ID of the entitlement (a product ID), e.g. "app:com.google.android.gm".
    * @param {boolean=} params.install Set to true to also install the product on all the user's devices where possible. Failure to install on one or more devices will not prevent this operation from returning successfully, as long as the entitlement was successfully assigned to the user.
    * @param {string} params.userId The ID of the user.
    * @param {().Entitlement} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Entitlement] = js.native
  def patch(callback: BodyResponseCallback[Schema$Entitlement]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarEntitlementsDollarPatch): GaxiosPromise[Schema$Entitlement] = js.native
  def patch(
    params: ParamsDollarResourceDollarEntitlementsDollarPatch,
    callback: BodyResponseCallback[Schema$Entitlement]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarEntitlementsDollarPatch,
    options: BodyResponseCallback[Schema$Entitlement],
    callback: BodyResponseCallback[Schema$Entitlement]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarEntitlementsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Entitlement] = js.native
  def patch(
    params: ParamsDollarResourceDollarEntitlementsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Entitlement]
  ): Unit = js.native
  /**
    * androidenterprise.entitlements.update
    * @desc Adds or updates an entitlement to an app for a user.
    * @alias androidenterprise.entitlements.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.entitlementId The ID of the entitlement (a product ID), e.g. "app:com.google.android.gm".
    * @param {boolean=} params.install Set to true to also install the product on all the user's devices where possible. Failure to install on one or more devices will not prevent this operation from returning successfully, as long as the entitlement was successfully assigned to the user.
    * @param {string} params.userId The ID of the user.
    * @param {().Entitlement} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Entitlement] = js.native
  def update(callback: BodyResponseCallback[Schema$Entitlement]): Unit = js.native
  def update(params: ParamsDollarResourceDollarEntitlementsDollarUpdate): GaxiosPromise[Schema$Entitlement] = js.native
  def update(
    params: ParamsDollarResourceDollarEntitlementsDollarUpdate,
    callback: BodyResponseCallback[Schema$Entitlement]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarEntitlementsDollarUpdate,
    options: BodyResponseCallback[Schema$Entitlement],
    callback: BodyResponseCallback[Schema$Entitlement]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarEntitlementsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Entitlement] = js.native
  def update(
    params: ParamsDollarResourceDollarEntitlementsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Entitlement]
  ): Unit = js.native
}

