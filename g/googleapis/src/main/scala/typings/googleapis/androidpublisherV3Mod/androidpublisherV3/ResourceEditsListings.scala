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

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Edits$Listings")
@js.native
open class ResourceEditsListings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEditsListingsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEditsListingsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceEditsListingsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceEditsListingsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceEditsListingsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a localized store listing.
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
    *   const res = await androidpublisher.edits.listings.delete({
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Language localization code (a BCP-47 language tag; for example, "de-AT" for Austrian German).
    *     language: 'placeholder-value',
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
  def delete(params: ParamsResourceEditsListingsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceEditsListingsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def deleteall(): GaxiosPromise[Unit] = js.native
  def deleteall(callback: BodyResponseCallback[Unit]): Unit = js.native
  def deleteall(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def deleteall(params: ParamsResourceEditsListingsDeleteall): GaxiosPromise[Unit] = js.native
  def deleteall(params: ParamsResourceEditsListingsDeleteall, callback: BodyResponseCallback[Unit]): Unit = js.native
  def deleteall(
    params: ParamsResourceEditsListingsDeleteall,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def deleteall(params: ParamsResourceEditsListingsDeleteall, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def deleteall(
    params: ParamsResourceEditsListingsDeleteall,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes all store listings.
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
    *   const res = await androidpublisher.edits.listings.deleteall({
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
  def deleteall(params: ParamsResourceEditsListingsDeleteall, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deleteall(
    params: ParamsResourceEditsListingsDeleteall,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaListing] = js.native
  def get(callback: BodyResponseCallback[SchemaListing]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListing] = js.native
  def get(params: ParamsResourceEditsListingsGet): GaxiosPromise[SchemaListing] = js.native
  def get(params: ParamsResourceEditsListingsGet, callback: BodyResponseCallback[SchemaListing]): Unit = js.native
  def get(
    params: ParamsResourceEditsListingsGet,
    options: BodyResponseCallback[Readable | SchemaListing],
    callback: BodyResponseCallback[Readable | SchemaListing]
  ): Unit = js.native
  def get(params: ParamsResourceEditsListingsGet, options: MethodOptions): GaxiosPromise[SchemaListing] = js.native
  def get(
    params: ParamsResourceEditsListingsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListing]
  ): Unit = js.native
  /**
    * Gets a localized store listing.
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
    *   const res = await androidpublisher.edits.listings.get({
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Language localization code (a BCP-47 language tag; for example, "de-AT" for Austrian German).
    *     language: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "fullDescription": "my_fullDescription",
    *   //   "language": "my_language",
    *   //   "shortDescription": "my_shortDescription",
    *   //   "title": "my_title",
    *   //   "video": "my_video"
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
  def get(params: ParamsResourceEditsListingsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceEditsListingsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListingsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListingsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListingsListResponse] = js.native
  def list(params: ParamsResourceEditsListingsList): GaxiosPromise[SchemaListingsListResponse] = js.native
  def list(
    params: ParamsResourceEditsListingsList,
    callback: BodyResponseCallback[SchemaListingsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceEditsListingsList,
    options: BodyResponseCallback[Readable | SchemaListingsListResponse],
    callback: BodyResponseCallback[Readable | SchemaListingsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEditsListingsList, options: MethodOptions): GaxiosPromise[SchemaListingsListResponse] = js.native
  def list(
    params: ParamsResourceEditsListingsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListingsListResponse]
  ): Unit = js.native
  /**
    * Lists all localized store listings.
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
    *   const res = await androidpublisher.edits.listings.list({
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "listings": []
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
  def list(params: ParamsResourceEditsListingsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceEditsListingsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaListing] = js.native
  def patch(callback: BodyResponseCallback[SchemaListing]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListing] = js.native
  def patch(params: ParamsResourceEditsListingsPatch): GaxiosPromise[SchemaListing] = js.native
  def patch(params: ParamsResourceEditsListingsPatch, callback: BodyResponseCallback[SchemaListing]): Unit = js.native
  def patch(
    params: ParamsResourceEditsListingsPatch,
    options: BodyResponseCallback[Readable | SchemaListing],
    callback: BodyResponseCallback[Readable | SchemaListing]
  ): Unit = js.native
  def patch(params: ParamsResourceEditsListingsPatch, options: MethodOptions): GaxiosPromise[SchemaListing] = js.native
  def patch(
    params: ParamsResourceEditsListingsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListing]
  ): Unit = js.native
  /**
    * Patches a localized store listing.
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
    *   const res = await androidpublisher.edits.listings.patch({
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Language localization code (a BCP-47 language tag; for example, "de-AT" for Austrian German).
    *     language: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "fullDescription": "my_fullDescription",
    *       //   "language": "my_language",
    *       //   "shortDescription": "my_shortDescription",
    *       //   "title": "my_title",
    *       //   "video": "my_video"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "fullDescription": "my_fullDescription",
    *   //   "language": "my_language",
    *   //   "shortDescription": "my_shortDescription",
    *   //   "title": "my_title",
    *   //   "video": "my_video"
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
  def patch(params: ParamsResourceEditsListingsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceEditsListingsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaListing] = js.native
  def update(callback: BodyResponseCallback[SchemaListing]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListing] = js.native
  def update(params: ParamsResourceEditsListingsUpdate): GaxiosPromise[SchemaListing] = js.native
  def update(params: ParamsResourceEditsListingsUpdate, callback: BodyResponseCallback[SchemaListing]): Unit = js.native
  def update(
    params: ParamsResourceEditsListingsUpdate,
    options: BodyResponseCallback[Readable | SchemaListing],
    callback: BodyResponseCallback[Readable | SchemaListing]
  ): Unit = js.native
  def update(params: ParamsResourceEditsListingsUpdate, options: MethodOptions): GaxiosPromise[SchemaListing] = js.native
  def update(
    params: ParamsResourceEditsListingsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListing]
  ): Unit = js.native
  /**
    * Creates or updates a localized store listing.
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
    *   const res = await androidpublisher.edits.listings.update({
    *     // Identifier of the edit.
    *     editId: 'placeholder-value',
    *     // Language localization code (a BCP-47 language tag; for example, "de-AT" for Austrian German).
    *     language: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "fullDescription": "my_fullDescription",
    *       //   "language": "my_language",
    *       //   "shortDescription": "my_shortDescription",
    *       //   "title": "my_title",
    *       //   "video": "my_video"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "fullDescription": "my_fullDescription",
    *   //   "language": "my_language",
    *   //   "shortDescription": "my_shortDescription",
    *   //   "title": "my_title",
    *   //   "video": "my_video"
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
  def update(params: ParamsResourceEditsListingsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceEditsListingsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
