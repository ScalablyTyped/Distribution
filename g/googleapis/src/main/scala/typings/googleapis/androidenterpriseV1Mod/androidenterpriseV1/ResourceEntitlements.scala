package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Entitlements")
@js.native
open class ResourceEntitlements protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEntitlementsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEntitlementsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceEntitlementsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceEntitlementsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceEntitlementsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Removes an entitlement to an app for a user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidenterprise = google.androidenterprise('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidenterprise'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidenterprise.entitlements.delete({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the entitlement (a product ID), e.g. "app:com.google.android.gm".
    *     entitlementId: 'placeholder-value',
    *     // The ID of the user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def delete(params: ParamsResourceEntitlementsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceEntitlementsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaEntitlement] = js.native
  def get(callback: BodyResponseCallback[SchemaEntitlement]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEntitlement] = js.native
  def get(params: ParamsResourceEntitlementsGet): GaxiosPromise[SchemaEntitlement] = js.native
  def get(params: ParamsResourceEntitlementsGet, callback: BodyResponseCallback[SchemaEntitlement]): Unit = js.native
  def get(
    params: ParamsResourceEntitlementsGet,
    options: BodyResponseCallback[Readable | SchemaEntitlement],
    callback: BodyResponseCallback[Readable | SchemaEntitlement]
  ): Unit = js.native
  def get(params: ParamsResourceEntitlementsGet, options: MethodOptions): GaxiosPromise[SchemaEntitlement] = js.native
  def get(
    params: ParamsResourceEntitlementsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntitlement]
  ): Unit = js.native
  /**
    * Retrieves details of an entitlement.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidenterprise = google.androidenterprise('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidenterprise'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidenterprise.entitlements.get({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the entitlement (a product ID), e.g. "app:com.google.android.gm".
    *     entitlementId: 'placeholder-value',
    *     // The ID of the user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "productId": "my_productId",
    *   //   "reason": "my_reason"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def get(params: ParamsResourceEntitlementsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceEntitlementsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaEntitlementsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaEntitlementsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEntitlementsListResponse] = js.native
  def list(params: ParamsResourceEntitlementsList): GaxiosPromise[SchemaEntitlementsListResponse] = js.native
  def list(
    params: ParamsResourceEntitlementsList,
    callback: BodyResponseCallback[SchemaEntitlementsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceEntitlementsList,
    options: BodyResponseCallback[Readable | SchemaEntitlementsListResponse],
    callback: BodyResponseCallback[Readable | SchemaEntitlementsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEntitlementsList, options: MethodOptions): GaxiosPromise[SchemaEntitlementsListResponse] = js.native
  def list(
    params: ParamsResourceEntitlementsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntitlementsListResponse]
  ): Unit = js.native
  /**
    * Lists all entitlements for the specified user. Only the ID is set.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidenterprise = google.androidenterprise('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidenterprise'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidenterprise.entitlements.list({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "entitlement": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourceEntitlementsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceEntitlementsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaEntitlement] = js.native
  def update(callback: BodyResponseCallback[SchemaEntitlement]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEntitlement] = js.native
  def update(params: ParamsResourceEntitlementsUpdate): GaxiosPromise[SchemaEntitlement] = js.native
  def update(params: ParamsResourceEntitlementsUpdate, callback: BodyResponseCallback[SchemaEntitlement]): Unit = js.native
  def update(
    params: ParamsResourceEntitlementsUpdate,
    options: BodyResponseCallback[Readable | SchemaEntitlement],
    callback: BodyResponseCallback[Readable | SchemaEntitlement]
  ): Unit = js.native
  def update(params: ParamsResourceEntitlementsUpdate, options: MethodOptions): GaxiosPromise[SchemaEntitlement] = js.native
  def update(
    params: ParamsResourceEntitlementsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntitlement]
  ): Unit = js.native
  /**
    * Adds or updates an entitlement to an app for a user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidenterprise = google.androidenterprise('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidenterprise'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidenterprise.entitlements.update({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the entitlement (a product ID), e.g. "app:com.google.android.gm".
    *     entitlementId: 'placeholder-value',
    *     // Set to true to also install the product on all the user's devices where possible. Failure to install on one or more devices will not prevent this operation from returning successfully, as long as the entitlement was successfully assigned to the user.
    *     install: 'placeholder-value',
    *     // The ID of the user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "productId": "my_productId",
    *       //   "reason": "my_reason"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "productId": "my_productId",
    *   //   "reason": "my_reason"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def update(params: ParamsResourceEntitlementsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceEntitlementsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
