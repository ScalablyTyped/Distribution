package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidmanagement/v1", "androidmanagement_v1.Resource$Enterprises$Enrollmenttokens")
@js.native
open class ResourceEnterprisesEnrollmenttokens protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaEnrollmentToken] = js.native
  def create(callback: BodyResponseCallback[SchemaEnrollmentToken]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEnrollmentToken] = js.native
  def create(params: ParamsResourceEnterprisesEnrollmenttokensCreate): GaxiosPromise[SchemaEnrollmentToken] = js.native
  def create(
    params: ParamsResourceEnterprisesEnrollmenttokensCreate,
    callback: BodyResponseCallback[SchemaEnrollmentToken]
  ): Unit = js.native
  def create(
    params: ParamsResourceEnterprisesEnrollmenttokensCreate,
    options: BodyResponseCallback[Readable | SchemaEnrollmentToken],
    callback: BodyResponseCallback[Readable | SchemaEnrollmentToken]
  ): Unit = js.native
  def create(params: ParamsResourceEnterprisesEnrollmenttokensCreate, options: MethodOptions): GaxiosPromise[SchemaEnrollmentToken] = js.native
  def create(
    params: ParamsResourceEnterprisesEnrollmenttokensCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnrollmentToken]
  ): Unit = js.native
  /**
    * Creates an enrollment token for a given enterprise. It's up to the caller's responsibility to manage the lifecycle of newly created tokens and deleting them when they're not intended to be used anymore. Once an enrollment token has been created, it's not possible to retrieve the token's content anymore using AM API. It is recommended for EMMs to securely store the token if it's intended to be reused.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidmanagement = google.androidmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidmanagement'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidmanagement.enterprises.enrollmentTokens.create({
    *     // The name of the enterprise in the form enterprises/{enterpriseId\}.
    *     parent: 'enterprises/my-enterprise',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "additionalData": "my_additionalData",
    *       //   "allowPersonalUsage": "my_allowPersonalUsage",
    *       //   "duration": "my_duration",
    *       //   "expirationTimestamp": "my_expirationTimestamp",
    *       //   "name": "my_name",
    *       //   "oneTimeOnly": false,
    *       //   "policyName": "my_policyName",
    *       //   "qrCode": "my_qrCode",
    *       //   "user": {},
    *       //   "value": "my_value"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "additionalData": "my_additionalData",
    *   //   "allowPersonalUsage": "my_allowPersonalUsage",
    *   //   "duration": "my_duration",
    *   //   "expirationTimestamp": "my_expirationTimestamp",
    *   //   "name": "my_name",
    *   //   "oneTimeOnly": false,
    *   //   "policyName": "my_policyName",
    *   //   "qrCode": "my_qrCode",
    *   //   "user": {},
    *   //   "value": "my_value"
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
  def create(params: ParamsResourceEnterprisesEnrollmenttokensCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceEnterprisesEnrollmenttokensCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceEnterprisesEnrollmenttokensDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceEnterprisesEnrollmenttokensDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceEnterprisesEnrollmenttokensDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceEnterprisesEnrollmenttokensDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceEnterprisesEnrollmenttokensDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an enrollment token. This operation invalidates the token, preventing its future use.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidmanagement = google.androidmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidmanagement'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidmanagement.enterprises.enrollmentTokens.delete({
    *     // The name of the enrollment token in the form enterprises/{enterpriseId\}/enrollmentTokens/{enrollmentTokenId\}.
    *     name: 'enterprises/my-enterprise/enrollmentTokens/my-enrollmentToken',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceEnterprisesEnrollmenttokensDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceEnterprisesEnrollmenttokensDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaEnrollmentToken] = js.native
  def get(callback: BodyResponseCallback[SchemaEnrollmentToken]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEnrollmentToken] = js.native
  def get(params: ParamsResourceEnterprisesEnrollmenttokensGet): GaxiosPromise[SchemaEnrollmentToken] = js.native
  def get(
    params: ParamsResourceEnterprisesEnrollmenttokensGet,
    callback: BodyResponseCallback[SchemaEnrollmentToken]
  ): Unit = js.native
  def get(
    params: ParamsResourceEnterprisesEnrollmenttokensGet,
    options: BodyResponseCallback[Readable | SchemaEnrollmentToken],
    callback: BodyResponseCallback[Readable | SchemaEnrollmentToken]
  ): Unit = js.native
  def get(params: ParamsResourceEnterprisesEnrollmenttokensGet, options: MethodOptions): GaxiosPromise[SchemaEnrollmentToken] = js.native
  def get(
    params: ParamsResourceEnterprisesEnrollmenttokensGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnrollmentToken]
  ): Unit = js.native
  /**
    * Gets an active, unexpired enrollment token. Only a partial view of EnrollmentToken is returned: all the fields but name and expiration_timestamp are empty. This method is meant to help manage active enrollment tokens lifecycle. For security reasons, it's recommended to delete active enrollment tokens as soon as they're not intended to be used anymore.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidmanagement = google.androidmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidmanagement'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidmanagement.enterprises.enrollmentTokens.get({
    *     // Required. The name of the enrollment token in the form enterprises/{enterpriseId\}/enrollmentTokens/{enrollmentTokenId\}.
    *     name: 'enterprises/my-enterprise/enrollmentTokens/my-enrollmentToken',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "additionalData": "my_additionalData",
    *   //   "allowPersonalUsage": "my_allowPersonalUsage",
    *   //   "duration": "my_duration",
    *   //   "expirationTimestamp": "my_expirationTimestamp",
    *   //   "name": "my_name",
    *   //   "oneTimeOnly": false,
    *   //   "policyName": "my_policyName",
    *   //   "qrCode": "my_qrCode",
    *   //   "user": {},
    *   //   "value": "my_value"
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
  def get(params: ParamsResourceEnterprisesEnrollmenttokensGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceEnterprisesEnrollmenttokensGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListEnrollmentTokensResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListEnrollmentTokensResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListEnrollmentTokensResponse] = js.native
  def list(params: ParamsResourceEnterprisesEnrollmenttokensList): GaxiosPromise[SchemaListEnrollmentTokensResponse] = js.native
  def list(
    params: ParamsResourceEnterprisesEnrollmenttokensList,
    callback: BodyResponseCallback[SchemaListEnrollmentTokensResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceEnterprisesEnrollmenttokensList,
    options: BodyResponseCallback[Readable | SchemaListEnrollmentTokensResponse],
    callback: BodyResponseCallback[Readable | SchemaListEnrollmentTokensResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEnterprisesEnrollmenttokensList, options: MethodOptions): GaxiosPromise[SchemaListEnrollmentTokensResponse] = js.native
  def list(
    params: ParamsResourceEnterprisesEnrollmenttokensList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListEnrollmentTokensResponse]
  ): Unit = js.native
  /**
    * Lists active, unexpired enrollment tokens for a given enterprise. The list items contain only a partial view of EnrollmentToken: all the fields but name and expiration_timestamp are empty. This method is meant to help manage active enrollment tokens lifecycle. For security reasons, it's recommended to delete active enrollment tokens as soon as they're not intended to be used anymore.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidmanagement = google.androidmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidmanagement'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidmanagement.enterprises.enrollmentTokens.list({
    *     // The requested page size. The service may return fewer than this value. If unspecified, at most 10 items will be returned. The maximum value is 100; values above 100 will be coerced to 100.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results returned by the server.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the enterprise in the form enterprises/{enterpriseId\}.
    *     parent: 'enterprises/my-enterprise',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "enrollmentTokens": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceEnterprisesEnrollmenttokensList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceEnterprisesEnrollmenttokensList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
