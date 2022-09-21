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

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Products")
@js.native
open class ResourceProducts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def approve(): GaxiosPromise[Unit] = js.native
  def approve(callback: BodyResponseCallback[Unit]): Unit = js.native
  def approve(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def approve(params: ParamsResourceProductsApprove): GaxiosPromise[Unit] = js.native
  def approve(params: ParamsResourceProductsApprove, callback: BodyResponseCallback[Unit]): Unit = js.native
  def approve(
    params: ParamsResourceProductsApprove,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def approve(params: ParamsResourceProductsApprove, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def approve(
    params: ParamsResourceProductsApprove,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    *  Approves the specified product and the relevant app permissions, if any. The maximum number of products that you can approve per enterprise customer is 1,000. To learn how to use managed Google Play to design and create a store layout to display approved products to your users, see Store Layout Design.
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
    *   const res = await androidenterprise.products.approve({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the product.
    *     productId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "approvalUrlInfo": {},
    *       //   "approvedPermissions": "my_approvedPermissions"
    *       // }
    *     },
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
  def approve(params: ParamsResourceProductsApprove, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def approve(
    params: ParamsResourceProductsApprove,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def generateApprovalUrl(): GaxiosPromise[SchemaProductsGenerateApprovalUrlResponse] = js.native
  def generateApprovalUrl(callback: BodyResponseCallback[SchemaProductsGenerateApprovalUrlResponse]): Unit = js.native
  def generateApprovalUrl(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProductsGenerateApprovalUrlResponse] = js.native
  def generateApprovalUrl(params: ParamsResourceProductsGenerateapprovalurl): GaxiosPromise[SchemaProductsGenerateApprovalUrlResponse] = js.native
  def generateApprovalUrl(
    params: ParamsResourceProductsGenerateapprovalurl,
    callback: BodyResponseCallback[SchemaProductsGenerateApprovalUrlResponse]
  ): Unit = js.native
  def generateApprovalUrl(
    params: ParamsResourceProductsGenerateapprovalurl,
    options: BodyResponseCallback[Readable | SchemaProductsGenerateApprovalUrlResponse],
    callback: BodyResponseCallback[Readable | SchemaProductsGenerateApprovalUrlResponse]
  ): Unit = js.native
  def generateApprovalUrl(params: ParamsResourceProductsGenerateapprovalurl, options: MethodOptions): GaxiosPromise[SchemaProductsGenerateApprovalUrlResponse] = js.native
  def generateApprovalUrl(
    params: ParamsResourceProductsGenerateapprovalurl,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProductsGenerateApprovalUrlResponse]
  ): Unit = js.native
  /**
    * Generates a URL that can be rendered in an iframe to display the permissions (if any) of a product. An enterprise admin must view these permissions and accept them on behalf of their organization in order to approve that product. Admins should accept the displayed permissions by interacting with a separate UI element in the EMM console, which in turn should trigger the use of this URL as the approvalUrlInfo.approvalUrl property in a Products.approve call to approve the product. This URL can only be used to display permissions for up to 1 day.
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
    *   const res = await androidenterprise.products.generateApprovalUrl({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The BCP 47 language code used for permission names and descriptions in the returned iframe, for instance "en-US".
    *     languageCode: 'placeholder-value',
    *     // The ID of the product.
    *     productId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "url": "my_url"
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
  def generateApprovalUrl(params: ParamsResourceProductsGenerateapprovalurl, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def generateApprovalUrl(
    params: ParamsResourceProductsGenerateapprovalurl,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaProduct] = js.native
  def get(callback: BodyResponseCallback[SchemaProduct]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def get(params: ParamsResourceProductsGet): GaxiosPromise[SchemaProduct] = js.native
  def get(params: ParamsResourceProductsGet, callback: BodyResponseCallback[SchemaProduct]): Unit = js.native
  def get(
    params: ParamsResourceProductsGet,
    options: BodyResponseCallback[Readable | SchemaProduct],
    callback: BodyResponseCallback[Readable | SchemaProduct]
  ): Unit = js.native
  def get(params: ParamsResourceProductsGet, options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def get(
    params: ParamsResourceProductsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProduct]
  ): Unit = js.native
  /**
    * Retrieves details of a product for display to an enterprise admin.
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
    *   const res = await androidenterprise.products.get({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The BCP47 tag for the user's preferred language (e.g. "en-US", "de").
    *     language: 'placeholder-value',
    *     // The ID of the product, e.g. "app:com.google.android.gm".
    *     productId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appRestrictionsSchema": {},
    *   //   "appTracks": [],
    *   //   "appVersion": [],
    *   //   "authorName": "my_authorName",
    *   //   "availableCountries": [],
    *   //   "availableTracks": [],
    *   //   "category": "my_category",
    *   //   "contentRating": "my_contentRating",
    *   //   "description": "my_description",
    *   //   "detailsUrl": "my_detailsUrl",
    *   //   "distributionChannel": "my_distributionChannel",
    *   //   "features": [],
    *   //   "iconUrl": "my_iconUrl",
    *   //   "lastUpdatedTimestampMillis": "my_lastUpdatedTimestampMillis",
    *   //   "minAndroidSdkVersion": 0,
    *   //   "permissions": [],
    *   //   "productId": "my_productId",
    *   //   "productPricing": "my_productPricing",
    *   //   "recentChanges": "my_recentChanges",
    *   //   "requiresContainerApp": false,
    *   //   "screenshotUrls": [],
    *   //   "signingCertificate": {},
    *   //   "smallIconUrl": "my_smallIconUrl",
    *   //   "title": "my_title",
    *   //   "workDetailsUrl": "my_workDetailsUrl"
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
  def get(params: ParamsResourceProductsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProductsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getAppRestrictionsSchema(): GaxiosPromise[SchemaAppRestrictionsSchema] = js.native
  def getAppRestrictionsSchema(callback: BodyResponseCallback[SchemaAppRestrictionsSchema]): Unit = js.native
  def getAppRestrictionsSchema(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAppRestrictionsSchema] = js.native
  def getAppRestrictionsSchema(params: ParamsResourceProductsGetapprestrictionsschema): GaxiosPromise[SchemaAppRestrictionsSchema] = js.native
  def getAppRestrictionsSchema(
    params: ParamsResourceProductsGetapprestrictionsschema,
    callback: BodyResponseCallback[SchemaAppRestrictionsSchema]
  ): Unit = js.native
  def getAppRestrictionsSchema(
    params: ParamsResourceProductsGetapprestrictionsschema,
    options: BodyResponseCallback[Readable | SchemaAppRestrictionsSchema],
    callback: BodyResponseCallback[Readable | SchemaAppRestrictionsSchema]
  ): Unit = js.native
  def getAppRestrictionsSchema(params: ParamsResourceProductsGetapprestrictionsschema, options: MethodOptions): GaxiosPromise[SchemaAppRestrictionsSchema] = js.native
  def getAppRestrictionsSchema(
    params: ParamsResourceProductsGetapprestrictionsschema,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAppRestrictionsSchema]
  ): Unit = js.native
  /**
    * Retrieves the schema that defines the configurable properties for this product. All products have a schema, but this schema may be empty if no managed configurations have been defined. This schema can be used to populate a UI that allows an admin to configure the product. To apply a managed configuration based on the schema obtained using this API, see Managed Configurations through Play.
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
    *   const res = await androidenterprise.products.getAppRestrictionsSchema({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The BCP47 tag for the user's preferred language (e.g. "en-US", "de").
    *     language: 'placeholder-value',
    *     // The ID of the product.
    *     productId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "restrictions": []
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
  def getAppRestrictionsSchema(params: ParamsResourceProductsGetapprestrictionsschema, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getAppRestrictionsSchema(
    params: ParamsResourceProductsGetapprestrictionsschema,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getPermissions(): GaxiosPromise[SchemaProductPermissions] = js.native
  def getPermissions(callback: BodyResponseCallback[SchemaProductPermissions]): Unit = js.native
  def getPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProductPermissions] = js.native
  def getPermissions(params: ParamsResourceProductsGetpermissions): GaxiosPromise[SchemaProductPermissions] = js.native
  def getPermissions(
    params: ParamsResourceProductsGetpermissions,
    callback: BodyResponseCallback[SchemaProductPermissions]
  ): Unit = js.native
  def getPermissions(
    params: ParamsResourceProductsGetpermissions,
    options: BodyResponseCallback[Readable | SchemaProductPermissions],
    callback: BodyResponseCallback[Readable | SchemaProductPermissions]
  ): Unit = js.native
  def getPermissions(params: ParamsResourceProductsGetpermissions, options: MethodOptions): GaxiosPromise[SchemaProductPermissions] = js.native
  def getPermissions(
    params: ParamsResourceProductsGetpermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProductPermissions]
  ): Unit = js.native
  /**
    * Retrieves the Android app permissions required by this app.
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
    *   const res = await androidenterprise.products.getPermissions({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the product.
    *     productId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "permission": [],
    *   //   "productId": "my_productId"
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
  def getPermissions(params: ParamsResourceProductsGetpermissions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getPermissions(
    params: ParamsResourceProductsGetpermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaProductsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaProductsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProductsListResponse] = js.native
  def list(params: ParamsResourceProductsList): GaxiosPromise[SchemaProductsListResponse] = js.native
  def list(params: ParamsResourceProductsList, callback: BodyResponseCallback[SchemaProductsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceProductsList,
    options: BodyResponseCallback[Readable | SchemaProductsListResponse],
    callback: BodyResponseCallback[Readable | SchemaProductsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProductsList, options: MethodOptions): GaxiosPromise[SchemaProductsListResponse] = js.native
  def list(
    params: ParamsResourceProductsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProductsListResponse]
  ): Unit = js.native
  /**
    * Finds approved products that match a query, or all approved products if there is no query.
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
    *   const res = await androidenterprise.products.list({
    *     // Specifies whether to search among all products (false) or among only products that have been approved (true). Only "true" is supported, and should be specified.
    *     approved: 'placeholder-value',
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The BCP47 tag for the user's preferred language (e.g. "en-US", "de"). Results are returned in the language best matching the preferred language.
    *     language: 'placeholder-value',
    *     // Defines how many results the list operation should return. The default number depends on the resource collection.
    *     maxResults: 'placeholder-value',
    *     // The search query as typed in the Google Play store search box. If omitted, all approved apps will be returned (using the pagination parameters), including apps that are not available in the store (e.g. unpublished apps).
    *     query: 'placeholder-value',
    *     // Defines the token of the page to return, usually taken from TokenPagination. This can only be used if token paging is enabled.
    *     token: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "pageInfo": {},
    *   //   "product": [],
    *   //   "tokenPagination": {}
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
  def list(params: ParamsResourceProductsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProductsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def unapprove(): GaxiosPromise[Unit] = js.native
  def unapprove(callback: BodyResponseCallback[Unit]): Unit = js.native
  def unapprove(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def unapprove(params: ParamsResourceProductsUnapprove): GaxiosPromise[Unit] = js.native
  def unapprove(params: ParamsResourceProductsUnapprove, callback: BodyResponseCallback[Unit]): Unit = js.native
  def unapprove(
    params: ParamsResourceProductsUnapprove,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def unapprove(params: ParamsResourceProductsUnapprove, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def unapprove(
    params: ParamsResourceProductsUnapprove,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Unapproves the specified product (and the relevant app permissions, if any)
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
    *   const res = await androidenterprise.products.unapprove({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the product.
    *     productId: 'placeholder-value',
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
  def unapprove(params: ParamsResourceProductsUnapprove, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def unapprove(
    params: ParamsResourceProductsUnapprove,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
