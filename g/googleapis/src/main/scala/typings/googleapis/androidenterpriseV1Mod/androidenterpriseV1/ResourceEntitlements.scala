package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Entitlements")
@js.native
class ResourceEntitlements protected () extends StObject {
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
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEntitlementsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEntitlementsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceEntitlementsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceEntitlementsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceEntitlementsDelete,
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
  def get(): GaxiosPromise[SchemaEntitlement] = js.native
  def get(callback: BodyResponseCallback[SchemaEntitlement]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEntitlement] = js.native
  def get(params: ParamsResourceEntitlementsGet): GaxiosPromise[SchemaEntitlement] = js.native
  def get(params: ParamsResourceEntitlementsGet, callback: BodyResponseCallback[SchemaEntitlement]): Unit = js.native
  def get(
    params: ParamsResourceEntitlementsGet,
    options: BodyResponseCallback[SchemaEntitlement],
    callback: BodyResponseCallback[SchemaEntitlement]
  ): Unit = js.native
  def get(params: ParamsResourceEntitlementsGet, options: MethodOptions): GaxiosPromise[SchemaEntitlement] = js.native
  def get(
    params: ParamsResourceEntitlementsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntitlement]
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
  def list(): GaxiosPromise[SchemaEntitlementsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaEntitlementsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEntitlementsListResponse] = js.native
  def list(params: ParamsResourceEntitlementsList): GaxiosPromise[SchemaEntitlementsListResponse] = js.native
  def list(
    params: ParamsResourceEntitlementsList,
    callback: BodyResponseCallback[SchemaEntitlementsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceEntitlementsList,
    options: BodyResponseCallback[SchemaEntitlementsListResponse],
    callback: BodyResponseCallback[SchemaEntitlementsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEntitlementsList, options: MethodOptions): GaxiosPromise[SchemaEntitlementsListResponse] = js.native
  def list(
    params: ParamsResourceEntitlementsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntitlementsListResponse]
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
  def patch(): GaxiosPromise[SchemaEntitlement] = js.native
  def patch(callback: BodyResponseCallback[SchemaEntitlement]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEntitlement] = js.native
  def patch(params: ParamsResourceEntitlementsPatch): GaxiosPromise[SchemaEntitlement] = js.native
  def patch(params: ParamsResourceEntitlementsPatch, callback: BodyResponseCallback[SchemaEntitlement]): Unit = js.native
  def patch(
    params: ParamsResourceEntitlementsPatch,
    options: BodyResponseCallback[SchemaEntitlement],
    callback: BodyResponseCallback[SchemaEntitlement]
  ): Unit = js.native
  def patch(params: ParamsResourceEntitlementsPatch, options: MethodOptions): GaxiosPromise[SchemaEntitlement] = js.native
  def patch(
    params: ParamsResourceEntitlementsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntitlement]
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
  def update(): GaxiosPromise[SchemaEntitlement] = js.native
  def update(callback: BodyResponseCallback[SchemaEntitlement]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEntitlement] = js.native
  def update(params: ParamsResourceEntitlementsUpdate): GaxiosPromise[SchemaEntitlement] = js.native
  def update(params: ParamsResourceEntitlementsUpdate, callback: BodyResponseCallback[SchemaEntitlement]): Unit = js.native
  def update(
    params: ParamsResourceEntitlementsUpdate,
    options: BodyResponseCallback[SchemaEntitlement],
    callback: BodyResponseCallback[SchemaEntitlement]
  ): Unit = js.native
  def update(params: ParamsResourceEntitlementsUpdate, options: MethodOptions): GaxiosPromise[SchemaEntitlement] = js.native
  def update(
    params: ParamsResourceEntitlementsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntitlement]
  ): Unit = js.native
}
