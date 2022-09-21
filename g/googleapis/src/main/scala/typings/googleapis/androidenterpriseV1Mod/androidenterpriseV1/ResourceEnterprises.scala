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

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Enterprises")
@js.native
open class ResourceEnterprises protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def acknowledgeNotificationSet(): GaxiosPromise[Unit] = js.native
  def acknowledgeNotificationSet(callback: BodyResponseCallback[Unit]): Unit = js.native
  def acknowledgeNotificationSet(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def acknowledgeNotificationSet(params: ParamsResourceEnterprisesAcknowledgenotificationset): GaxiosPromise[Unit] = js.native
  def acknowledgeNotificationSet(params: ParamsResourceEnterprisesAcknowledgenotificationset, callback: BodyResponseCallback[Unit]): Unit = js.native
  def acknowledgeNotificationSet(
    params: ParamsResourceEnterprisesAcknowledgenotificationset,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def acknowledgeNotificationSet(params: ParamsResourceEnterprisesAcknowledgenotificationset, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def acknowledgeNotificationSet(
    params: ParamsResourceEnterprisesAcknowledgenotificationset,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Acknowledges notifications that were received from Enterprises.PullNotificationSet to prevent subsequent calls from returning the same notifications.
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
    *   const res = await androidenterprise.enterprises.acknowledgeNotificationSet({
    *     // The notification set ID as returned by Enterprises.PullNotificationSet. This must be provided.
    *     notificationSetId: 'placeholder-value',
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
  def acknowledgeNotificationSet(params: ParamsResourceEnterprisesAcknowledgenotificationset, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def acknowledgeNotificationSet(
    params: ParamsResourceEnterprisesAcknowledgenotificationset,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def completeSignup(): GaxiosPromise[SchemaEnterprise] = js.native
  def completeSignup(callback: BodyResponseCallback[SchemaEnterprise]): Unit = js.native
  def completeSignup(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEnterprise] = js.native
  def completeSignup(params: ParamsResourceEnterprisesCompletesignup): GaxiosPromise[SchemaEnterprise] = js.native
  def completeSignup(params: ParamsResourceEnterprisesCompletesignup, callback: BodyResponseCallback[SchemaEnterprise]): Unit = js.native
  def completeSignup(
    params: ParamsResourceEnterprisesCompletesignup,
    options: BodyResponseCallback[Readable | SchemaEnterprise],
    callback: BodyResponseCallback[Readable | SchemaEnterprise]
  ): Unit = js.native
  def completeSignup(params: ParamsResourceEnterprisesCompletesignup, options: MethodOptions): GaxiosPromise[SchemaEnterprise] = js.native
  def completeSignup(
    params: ParamsResourceEnterprisesCompletesignup,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnterprise]
  ): Unit = js.native
  /**
    * Completes the signup flow, by specifying the Completion token and Enterprise token. This request must not be called multiple times for a given Enterprise Token.
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
    *   const res = await androidenterprise.enterprises.completeSignup({
    *     // The Completion token initially returned by GenerateSignupUrl.
    *     completionToken: 'placeholder-value',
    *     // The Enterprise token appended to the Callback URL.
    *     enterpriseToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "administrator": [],
    *   //   "id": "my_id",
    *   //   "name": "my_name",
    *   //   "primaryDomain": "my_primaryDomain"
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
  def completeSignup(params: ParamsResourceEnterprisesCompletesignup, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def completeSignup(
    params: ParamsResourceEnterprisesCompletesignup,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def createWebToken(): GaxiosPromise[SchemaAdministratorWebToken] = js.native
  def createWebToken(callback: BodyResponseCallback[SchemaAdministratorWebToken]): Unit = js.native
  def createWebToken(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdministratorWebToken] = js.native
  def createWebToken(params: ParamsResourceEnterprisesCreatewebtoken): GaxiosPromise[SchemaAdministratorWebToken] = js.native
  def createWebToken(
    params: ParamsResourceEnterprisesCreatewebtoken,
    callback: BodyResponseCallback[SchemaAdministratorWebToken]
  ): Unit = js.native
  def createWebToken(
    params: ParamsResourceEnterprisesCreatewebtoken,
    options: BodyResponseCallback[Readable | SchemaAdministratorWebToken],
    callback: BodyResponseCallback[Readable | SchemaAdministratorWebToken]
  ): Unit = js.native
  def createWebToken(params: ParamsResourceEnterprisesCreatewebtoken, options: MethodOptions): GaxiosPromise[SchemaAdministratorWebToken] = js.native
  def createWebToken(
    params: ParamsResourceEnterprisesCreatewebtoken,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdministratorWebToken]
  ): Unit = js.native
  /**
    * Returns a unique token to access an embeddable UI. To generate a web UI, pass the generated token into the managed Google Play javascript API. Each token may only be used to start one UI session. See the javascript API documentation for further information.
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
    *   const res = await androidenterprise.enterprises.createWebToken({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "managedConfigurations": {},
    *       //   "parent": "my_parent",
    *       //   "permission": [],
    *       //   "playSearch": {},
    *       //   "privateApps": {},
    *       //   "storeBuilder": {},
    *       //   "webApps": {},
    *       //   "zeroTouch": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "token": "my_token"
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
  def createWebToken(params: ParamsResourceEnterprisesCreatewebtoken, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def createWebToken(
    params: ParamsResourceEnterprisesCreatewebtoken,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def enroll(): GaxiosPromise[SchemaEnterprise] = js.native
  def enroll(callback: BodyResponseCallback[SchemaEnterprise]): Unit = js.native
  def enroll(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEnterprise] = js.native
  def enroll(params: ParamsResourceEnterprisesEnroll): GaxiosPromise[SchemaEnterprise] = js.native
  def enroll(params: ParamsResourceEnterprisesEnroll, callback: BodyResponseCallback[SchemaEnterprise]): Unit = js.native
  def enroll(
    params: ParamsResourceEnterprisesEnroll,
    options: BodyResponseCallback[Readable | SchemaEnterprise],
    callback: BodyResponseCallback[Readable | SchemaEnterprise]
  ): Unit = js.native
  def enroll(params: ParamsResourceEnterprisesEnroll, options: MethodOptions): GaxiosPromise[SchemaEnterprise] = js.native
  def enroll(
    params: ParamsResourceEnterprisesEnroll,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnterprise]
  ): Unit = js.native
  /**
    * Enrolls an enterprise with the calling EMM.
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
    *   const res = await androidenterprise.enterprises.enroll({
    *     // Required. The token provided by the enterprise to register the EMM.
    *     token: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "administrator": [],
    *       //   "id": "my_id",
    *       //   "name": "my_name",
    *       //   "primaryDomain": "my_primaryDomain"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "administrator": [],
    *   //   "id": "my_id",
    *   //   "name": "my_name",
    *   //   "primaryDomain": "my_primaryDomain"
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
  def enroll(params: ParamsResourceEnterprisesEnroll, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def enroll(
    params: ParamsResourceEnterprisesEnroll,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def generateSignupUrl(): GaxiosPromise[SchemaSignupInfo] = js.native
  def generateSignupUrl(callback: BodyResponseCallback[SchemaSignupInfo]): Unit = js.native
  def generateSignupUrl(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSignupInfo] = js.native
  def generateSignupUrl(params: ParamsResourceEnterprisesGeneratesignupurl): GaxiosPromise[SchemaSignupInfo] = js.native
  def generateSignupUrl(
    params: ParamsResourceEnterprisesGeneratesignupurl,
    callback: BodyResponseCallback[SchemaSignupInfo]
  ): Unit = js.native
  def generateSignupUrl(
    params: ParamsResourceEnterprisesGeneratesignupurl,
    options: BodyResponseCallback[Readable | SchemaSignupInfo],
    callback: BodyResponseCallback[Readable | SchemaSignupInfo]
  ): Unit = js.native
  def generateSignupUrl(params: ParamsResourceEnterprisesGeneratesignupurl, options: MethodOptions): GaxiosPromise[SchemaSignupInfo] = js.native
  def generateSignupUrl(
    params: ParamsResourceEnterprisesGeneratesignupurl,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSignupInfo]
  ): Unit = js.native
  /**
    * Generates a sign-up URL.
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
    *   const res = await androidenterprise.enterprises.generateSignupUrl({
    *     // The callback URL to which the Admin will be redirected after successfully creating an enterprise. Before redirecting there the system will add a single query parameter to this URL named "enterpriseToken" which will contain an opaque token to be used for the CompleteSignup request. Beware that this means that the URL will be parsed, the parameter added and then a new URL formatted, i.e. there may be some minor formatting changes and, more importantly, the URL must be well-formed so that it can be parsed.
    *     callbackUrl: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "completionToken": "my_completionToken",
    *   //   "kind": "my_kind",
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
  def generateSignupUrl(params: ParamsResourceEnterprisesGeneratesignupurl, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def generateSignupUrl(
    params: ParamsResourceEnterprisesGeneratesignupurl,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaEnterprise] = js.native
  def get(callback: BodyResponseCallback[SchemaEnterprise]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEnterprise] = js.native
  def get(params: ParamsResourceEnterprisesGet): GaxiosPromise[SchemaEnterprise] = js.native
  def get(params: ParamsResourceEnterprisesGet, callback: BodyResponseCallback[SchemaEnterprise]): Unit = js.native
  def get(
    params: ParamsResourceEnterprisesGet,
    options: BodyResponseCallback[Readable | SchemaEnterprise],
    callback: BodyResponseCallback[Readable | SchemaEnterprise]
  ): Unit = js.native
  def get(params: ParamsResourceEnterprisesGet, options: MethodOptions): GaxiosPromise[SchemaEnterprise] = js.native
  def get(
    params: ParamsResourceEnterprisesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnterprise]
  ): Unit = js.native
  /**
    * Retrieves the name and domain of an enterprise.
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
    *   const res = await androidenterprise.enterprises.get({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "administrator": [],
    *   //   "id": "my_id",
    *   //   "name": "my_name",
    *   //   "primaryDomain": "my_primaryDomain"
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
  def get(params: ParamsResourceEnterprisesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceEnterprisesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getServiceAccount(): GaxiosPromise[SchemaServiceAccount] = js.native
  def getServiceAccount(callback: BodyResponseCallback[SchemaServiceAccount]): Unit = js.native
  def getServiceAccount(params: Unit, options: MethodOptions): GaxiosPromise[SchemaServiceAccount] = js.native
  def getServiceAccount(params: ParamsResourceEnterprisesGetserviceaccount): GaxiosPromise[SchemaServiceAccount] = js.native
  def getServiceAccount(
    params: ParamsResourceEnterprisesGetserviceaccount,
    callback: BodyResponseCallback[SchemaServiceAccount]
  ): Unit = js.native
  def getServiceAccount(
    params: ParamsResourceEnterprisesGetserviceaccount,
    options: BodyResponseCallback[Readable | SchemaServiceAccount],
    callback: BodyResponseCallback[Readable | SchemaServiceAccount]
  ): Unit = js.native
  def getServiceAccount(params: ParamsResourceEnterprisesGetserviceaccount, options: MethodOptions): GaxiosPromise[SchemaServiceAccount] = js.native
  def getServiceAccount(
    params: ParamsResourceEnterprisesGetserviceaccount,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaServiceAccount]
  ): Unit = js.native
  /**
    * Returns a service account and credentials. The service account can be bound to the enterprise by calling setAccount. The service account is unique to this enterprise and EMM, and will be deleted if the enterprise is unbound. The credentials contain private key data and are not stored server-side. This method can only be called after calling Enterprises.Enroll or Enterprises.CompleteSignup, and before Enterprises.SetAccount; at other times it will return an error. Subsequent calls after the first will generate a new, unique set of credentials, and invalidate the previously generated credentials. Once the service account is bound to the enterprise, it can be managed using the serviceAccountKeys resource.
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
    *   const res = await androidenterprise.enterprises.getServiceAccount({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The type of credential to return with the service account. Required.
    *     keyType: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "key": {},
    *   //   "name": "my_name"
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
  def getServiceAccount(params: ParamsResourceEnterprisesGetserviceaccount, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getServiceAccount(
    params: ParamsResourceEnterprisesGetserviceaccount,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getStoreLayout(): GaxiosPromise[SchemaStoreLayout] = js.native
  def getStoreLayout(callback: BodyResponseCallback[SchemaStoreLayout]): Unit = js.native
  def getStoreLayout(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStoreLayout] = js.native
  def getStoreLayout(params: ParamsResourceEnterprisesGetstorelayout): GaxiosPromise[SchemaStoreLayout] = js.native
  def getStoreLayout(params: ParamsResourceEnterprisesGetstorelayout, callback: BodyResponseCallback[SchemaStoreLayout]): Unit = js.native
  def getStoreLayout(
    params: ParamsResourceEnterprisesGetstorelayout,
    options: BodyResponseCallback[Readable | SchemaStoreLayout],
    callback: BodyResponseCallback[Readable | SchemaStoreLayout]
  ): Unit = js.native
  def getStoreLayout(params: ParamsResourceEnterprisesGetstorelayout, options: MethodOptions): GaxiosPromise[SchemaStoreLayout] = js.native
  def getStoreLayout(
    params: ParamsResourceEnterprisesGetstorelayout,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStoreLayout]
  ): Unit = js.native
  /**
    * Returns the store layout for the enterprise. If the store layout has not been set, returns "basic" as the store layout type and no homepage.
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
    *   const res = await androidenterprise.enterprises.getStoreLayout({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "homepageId": "my_homepageId",
    *   //   "storeLayoutType": "my_storeLayoutType"
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
  def getStoreLayout(params: ParamsResourceEnterprisesGetstorelayout, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getStoreLayout(
    params: ParamsResourceEnterprisesGetstorelayout,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaEnterprisesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaEnterprisesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEnterprisesListResponse] = js.native
  def list(params: ParamsResourceEnterprisesList): GaxiosPromise[SchemaEnterprisesListResponse] = js.native
  def list(
    params: ParamsResourceEnterprisesList,
    callback: BodyResponseCallback[SchemaEnterprisesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceEnterprisesList,
    options: BodyResponseCallback[Readable | SchemaEnterprisesListResponse],
    callback: BodyResponseCallback[Readable | SchemaEnterprisesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEnterprisesList, options: MethodOptions): GaxiosPromise[SchemaEnterprisesListResponse] = js.native
  def list(
    params: ParamsResourceEnterprisesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnterprisesListResponse]
  ): Unit = js.native
  /**
    * Looks up an enterprise by domain name. This is only supported for enterprises created via the Google-initiated creation flow. Lookup of the id is not needed for enterprises created via the EMM-initiated flow since the EMM learns the enterprise ID in the callback specified in the Enterprises.generateSignupUrl call.
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
    *   const res = await androidenterprise.enterprises.list({
    *     // Required. The exact primary domain name of the enterprise to look up.
    *     domain: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "enterprise": []
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
  def list(params: ParamsResourceEnterprisesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceEnterprisesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def pullNotificationSet(): GaxiosPromise[SchemaNotificationSet] = js.native
  def pullNotificationSet(callback: BodyResponseCallback[SchemaNotificationSet]): Unit = js.native
  def pullNotificationSet(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNotificationSet] = js.native
  def pullNotificationSet(params: ParamsResourceEnterprisesPullnotificationset): GaxiosPromise[SchemaNotificationSet] = js.native
  def pullNotificationSet(
    params: ParamsResourceEnterprisesPullnotificationset,
    callback: BodyResponseCallback[SchemaNotificationSet]
  ): Unit = js.native
  def pullNotificationSet(
    params: ParamsResourceEnterprisesPullnotificationset,
    options: BodyResponseCallback[Readable | SchemaNotificationSet],
    callback: BodyResponseCallback[Readable | SchemaNotificationSet]
  ): Unit = js.native
  def pullNotificationSet(params: ParamsResourceEnterprisesPullnotificationset, options: MethodOptions): GaxiosPromise[SchemaNotificationSet] = js.native
  def pullNotificationSet(
    params: ParamsResourceEnterprisesPullnotificationset,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNotificationSet]
  ): Unit = js.native
  /**
    * Pulls and returns a notification set for the enterprises associated with the service account authenticated for the request. The notification set may be empty if no notification are pending. A notification set returned needs to be acknowledged within 20 seconds by calling Enterprises.AcknowledgeNotificationSet, unless the notification set is empty. Notifications that are not acknowledged within the 20 seconds will eventually be included again in the response to another PullNotificationSet request, and those that are never acknowledged will ultimately be deleted according to the Google Cloud Platform Pub/Sub system policy. Multiple requests might be performed concurrently to retrieve notifications, in which case the pending notifications (if any) will be split among each caller, if any are pending. If no notifications are present, an empty notification list is returned. Subsequent requests may return more notifications once they become available.
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
    *   const res = await androidenterprise.enterprises.pullNotificationSet({
    *     // The request mode for pulling notifications. Specifying waitForNotifications will cause the request to block and wait until one or more notifications are present, or return an empty notification list if no notifications are present after some time. Speciying returnImmediately will cause the request to immediately return the pending notifications, or an empty list if no notifications are present. If omitted, defaults to waitForNotifications.
    *     requestMode: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "notification": [],
    *   //   "notificationSetId": "my_notificationSetId"
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
  def pullNotificationSet(params: ParamsResourceEnterprisesPullnotificationset, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def pullNotificationSet(
    params: ParamsResourceEnterprisesPullnotificationset,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def sendTestPushNotification(): GaxiosPromise[SchemaEnterprisesSendTestPushNotificationResponse] = js.native
  def sendTestPushNotification(callback: BodyResponseCallback[SchemaEnterprisesSendTestPushNotificationResponse]): Unit = js.native
  def sendTestPushNotification(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEnterprisesSendTestPushNotificationResponse] = js.native
  def sendTestPushNotification(params: ParamsResourceEnterprisesSendtestpushnotification): GaxiosPromise[SchemaEnterprisesSendTestPushNotificationResponse] = js.native
  def sendTestPushNotification(
    params: ParamsResourceEnterprisesSendtestpushnotification,
    callback: BodyResponseCallback[SchemaEnterprisesSendTestPushNotificationResponse]
  ): Unit = js.native
  def sendTestPushNotification(
    params: ParamsResourceEnterprisesSendtestpushnotification,
    options: BodyResponseCallback[Readable | SchemaEnterprisesSendTestPushNotificationResponse],
    callback: BodyResponseCallback[Readable | SchemaEnterprisesSendTestPushNotificationResponse]
  ): Unit = js.native
  def sendTestPushNotification(params: ParamsResourceEnterprisesSendtestpushnotification, options: MethodOptions): GaxiosPromise[SchemaEnterprisesSendTestPushNotificationResponse] = js.native
  def sendTestPushNotification(
    params: ParamsResourceEnterprisesSendtestpushnotification,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnterprisesSendTestPushNotificationResponse]
  ): Unit = js.native
  /**
    * Sends a test notification to validate the EMM integration with the Google Cloud Pub/Sub service for this enterprise.
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
    *   const res = await androidenterprise.enterprises.sendTestPushNotification({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "messageId": "my_messageId",
    *   //   "topicName": "my_topicName"
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
  def sendTestPushNotification(params: ParamsResourceEnterprisesSendtestpushnotification, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def sendTestPushNotification(
    params: ParamsResourceEnterprisesSendtestpushnotification,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setAccount(): GaxiosPromise[SchemaEnterpriseAccount] = js.native
  def setAccount(callback: BodyResponseCallback[SchemaEnterpriseAccount]): Unit = js.native
  def setAccount(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEnterpriseAccount] = js.native
  def setAccount(params: ParamsResourceEnterprisesSetaccount): GaxiosPromise[SchemaEnterpriseAccount] = js.native
  def setAccount(
    params: ParamsResourceEnterprisesSetaccount,
    callback: BodyResponseCallback[SchemaEnterpriseAccount]
  ): Unit = js.native
  def setAccount(
    params: ParamsResourceEnterprisesSetaccount,
    options: BodyResponseCallback[Readable | SchemaEnterpriseAccount],
    callback: BodyResponseCallback[Readable | SchemaEnterpriseAccount]
  ): Unit = js.native
  def setAccount(params: ParamsResourceEnterprisesSetaccount, options: MethodOptions): GaxiosPromise[SchemaEnterpriseAccount] = js.native
  def setAccount(
    params: ParamsResourceEnterprisesSetaccount,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnterpriseAccount]
  ): Unit = js.native
  /**
    * Sets the account that will be used to authenticate to the API as the enterprise.
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
    *   const res = await androidenterprise.enterprises.setAccount({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountEmail": "my_accountEmail"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountEmail": "my_accountEmail"
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
  def setAccount(params: ParamsResourceEnterprisesSetaccount, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setAccount(
    params: ParamsResourceEnterprisesSetaccount,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setStoreLayout(): GaxiosPromise[SchemaStoreLayout] = js.native
  def setStoreLayout(callback: BodyResponseCallback[SchemaStoreLayout]): Unit = js.native
  def setStoreLayout(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStoreLayout] = js.native
  def setStoreLayout(params: ParamsResourceEnterprisesSetstorelayout): GaxiosPromise[SchemaStoreLayout] = js.native
  def setStoreLayout(params: ParamsResourceEnterprisesSetstorelayout, callback: BodyResponseCallback[SchemaStoreLayout]): Unit = js.native
  def setStoreLayout(
    params: ParamsResourceEnterprisesSetstorelayout,
    options: BodyResponseCallback[Readable | SchemaStoreLayout],
    callback: BodyResponseCallback[Readable | SchemaStoreLayout]
  ): Unit = js.native
  def setStoreLayout(params: ParamsResourceEnterprisesSetstorelayout, options: MethodOptions): GaxiosPromise[SchemaStoreLayout] = js.native
  def setStoreLayout(
    params: ParamsResourceEnterprisesSetstorelayout,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStoreLayout]
  ): Unit = js.native
  /**
    * Sets the store layout for the enterprise. By default, storeLayoutType is set to "basic" and the basic store layout is enabled. The basic layout only contains apps approved by the admin, and that have been added to the available product set for a user (using the setAvailableProductSet call). Apps on the page are sorted in order of their product ID value. If you create a custom store layout (by setting storeLayoutType = "custom" and setting a homepage), the basic store layout is disabled.
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
    *   const res = await androidenterprise.enterprises.setStoreLayout({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "homepageId": "my_homepageId",
    *       //   "storeLayoutType": "my_storeLayoutType"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "homepageId": "my_homepageId",
    *   //   "storeLayoutType": "my_storeLayoutType"
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
  def setStoreLayout(params: ParamsResourceEnterprisesSetstorelayout, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setStoreLayout(
    params: ParamsResourceEnterprisesSetstorelayout,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def unenroll(): GaxiosPromise[Unit] = js.native
  def unenroll(callback: BodyResponseCallback[Unit]): Unit = js.native
  def unenroll(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def unenroll(params: ParamsResourceEnterprisesUnenroll): GaxiosPromise[Unit] = js.native
  def unenroll(params: ParamsResourceEnterprisesUnenroll, callback: BodyResponseCallback[Unit]): Unit = js.native
  def unenroll(
    params: ParamsResourceEnterprisesUnenroll,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def unenroll(params: ParamsResourceEnterprisesUnenroll, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def unenroll(
    params: ParamsResourceEnterprisesUnenroll,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Unenrolls an enterprise from the calling EMM.
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
    *   const res = await androidenterprise.enterprises.unenroll({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
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
  def unenroll(params: ParamsResourceEnterprisesUnenroll, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def unenroll(
    params: ParamsResourceEnterprisesUnenroll,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
