package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Edits")
@js.native
open class ResourceEdits protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var apks: ResourceEditsApks = js.native
  
  var bundles: ResourceEditsBundles = js.native
  
  def commit(): GaxiosPromise[SchemaAppEdit] = js.native
  def commit(callback: BodyResponseCallback[SchemaAppEdit]): Unit = js.native
  def commit(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAppEdit] = js.native
  def commit(params: ParamsResourceEditsCommit): GaxiosPromise[SchemaAppEdit] = js.native
  def commit(params: ParamsResourceEditsCommit, callback: BodyResponseCallback[SchemaAppEdit]): Unit = js.native
  def commit(
    params: ParamsResourceEditsCommit,
    options: BodyResponseCallback[Readable | SchemaAppEdit],
    callback: BodyResponseCallback[Readable | SchemaAppEdit]
  ): Unit = js.native
  def commit(params: ParamsResourceEditsCommit, options: MethodOptions): GaxiosPromise[SchemaAppEdit] = js.native
  def commit(
    params: ParamsResourceEditsCommit,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAppEdit]
  ): Unit = js.native
  /**
    * Commits an app edit.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidpublisher.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidpublisher = google.androidpublisher('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidpublisher.edits.commit({
    *     // Indicates that the changes in this edit will not be reviewed until they are explicitly sent for review from the Google Play Console UI. These changes will be added to any other changes that are not yet sent for review.
    *     changesNotSentForReview: 'placeholder-value',
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "expiryTimeSeconds": "my_expiryTimeSeconds",
    *   //   "id": "my_id"
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
  def commit(params: ParamsResourceEditsCommit, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def commit(
    params: ParamsResourceEditsCommit,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  var countryavailability: ResourceEditsCountryavailability = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEditsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEditsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceEditsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceEditsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEditsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes an app edit.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidpublisher.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidpublisher = google.androidpublisher('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidpublisher.edits.delete({
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
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
  def delete(params: ParamsResourceEditsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceEditsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var deobfuscationfiles: ResourceEditsDeobfuscationfiles = js.native
  
  var details: ResourceEditsDetails = js.native
  
  var expansionfiles: ResourceEditsExpansionfiles = js.native
  
  def get(): GaxiosPromise[SchemaAppEdit] = js.native
  def get(callback: BodyResponseCallback[SchemaAppEdit]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAppEdit] = js.native
  def get(params: ParamsResourceEditsGet): GaxiosPromise[SchemaAppEdit] = js.native
  def get(params: ParamsResourceEditsGet, callback: BodyResponseCallback[SchemaAppEdit]): Unit = js.native
  def get(
    params: ParamsResourceEditsGet,
    options: BodyResponseCallback[Readable | SchemaAppEdit],
    callback: BodyResponseCallback[Readable | SchemaAppEdit]
  ): Unit = js.native
  def get(params: ParamsResourceEditsGet, options: MethodOptions): GaxiosPromise[SchemaAppEdit] = js.native
  def get(
    params: ParamsResourceEditsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAppEdit]
  ): Unit = js.native
  /**
    * Gets an app edit.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidpublisher.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidpublisher = google.androidpublisher('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidpublisher.edits.get({
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "expiryTimeSeconds": "my_expiryTimeSeconds",
    *   //   "id": "my_id"
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
  def get(params: ParamsResourceEditsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceEditsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var images: ResourceEditsImages = js.native
  
  def insert(): GaxiosPromise[SchemaAppEdit] = js.native
  def insert(callback: BodyResponseCallback[SchemaAppEdit]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAppEdit] = js.native
  def insert(params: ParamsResourceEditsInsert): GaxiosPromise[SchemaAppEdit] = js.native
  def insert(params: ParamsResourceEditsInsert, callback: BodyResponseCallback[SchemaAppEdit]): Unit = js.native
  def insert(
    params: ParamsResourceEditsInsert,
    options: BodyResponseCallback[Readable | SchemaAppEdit],
    callback: BodyResponseCallback[Readable | SchemaAppEdit]
  ): Unit = js.native
  def insert(params: ParamsResourceEditsInsert, options: MethodOptions): GaxiosPromise[SchemaAppEdit] = js.native
  def insert(
    params: ParamsResourceEditsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAppEdit]
  ): Unit = js.native
  /**
    * Creates a new edit for an app.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidpublisher.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidpublisher = google.androidpublisher('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidpublisher.edits.insert({
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "expiryTimeSeconds": "my_expiryTimeSeconds",
    *       //   "id": "my_id"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "expiryTimeSeconds": "my_expiryTimeSeconds",
    *   //   "id": "my_id"
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
  def insert(params: ParamsResourceEditsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceEditsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var listings: ResourceEditsListings = js.native
  
  var testers: ResourceEditsTesters = js.native
  
  var tracks: ResourceEditsTracks = js.native
  
  def validate(): GaxiosPromise[SchemaAppEdit] = js.native
  def validate(callback: BodyResponseCallback[SchemaAppEdit]): Unit = js.native
  def validate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAppEdit] = js.native
  def validate(params: ParamsResourceEditsValidate): GaxiosPromise[SchemaAppEdit] = js.native
  def validate(params: ParamsResourceEditsValidate, callback: BodyResponseCallback[SchemaAppEdit]): Unit = js.native
  def validate(
    params: ParamsResourceEditsValidate,
    options: BodyResponseCallback[Readable | SchemaAppEdit],
    callback: BodyResponseCallback[Readable | SchemaAppEdit]
  ): Unit = js.native
  def validate(params: ParamsResourceEditsValidate, options: MethodOptions): GaxiosPromise[SchemaAppEdit] = js.native
  def validate(
    params: ParamsResourceEditsValidate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAppEdit]
  ): Unit = js.native
  /**
    * Validates an app edit.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidpublisher.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidpublisher = google.androidpublisher('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidpublisher.edits.validate({
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "expiryTimeSeconds": "my_expiryTimeSeconds",
    *   //   "id": "my_id"
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
  def validate(params: ParamsResourceEditsValidate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def validate(
    params: ParamsResourceEditsValidate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
