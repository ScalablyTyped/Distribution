package typings.googleapis.booksV1Mod.booksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Familysharing")
@js.native
open class ResourceFamilysharing protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def getFamilyInfo(): GaxiosPromise[SchemaFamilyInfo] = js.native
  def getFamilyInfo(callback: BodyResponseCallback[SchemaFamilyInfo]): Unit = js.native
  def getFamilyInfo(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFamilyInfo] = js.native
  def getFamilyInfo(params: ParamsResourceFamilysharingGetfamilyinfo): GaxiosPromise[SchemaFamilyInfo] = js.native
  def getFamilyInfo(params: ParamsResourceFamilysharingGetfamilyinfo, callback: BodyResponseCallback[SchemaFamilyInfo]): Unit = js.native
  def getFamilyInfo(
    params: ParamsResourceFamilysharingGetfamilyinfo,
    options: BodyResponseCallback[Readable | SchemaFamilyInfo],
    callback: BodyResponseCallback[Readable | SchemaFamilyInfo]
  ): Unit = js.native
  def getFamilyInfo(params: ParamsResourceFamilysharingGetfamilyinfo, options: MethodOptions): GaxiosPromise[SchemaFamilyInfo] = js.native
  def getFamilyInfo(
    params: ParamsResourceFamilysharingGetfamilyinfo,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFamilyInfo]
  ): Unit = js.native
  /**
    * Gets information regarding the family that the user is part of.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/books.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const books = google.books('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/books'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await books.familysharing.getFamilyInfo({
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "membership": {}
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
  def getFamilyInfo(params: ParamsResourceFamilysharingGetfamilyinfo, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getFamilyInfo(
    params: ParamsResourceFamilysharingGetfamilyinfo,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def share(): GaxiosPromise[SchemaEmpty] = js.native
  def share(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def share(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def share(params: ParamsResourceFamilysharingShare): GaxiosPromise[SchemaEmpty] = js.native
  def share(params: ParamsResourceFamilysharingShare, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def share(
    params: ParamsResourceFamilysharingShare,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def share(params: ParamsResourceFamilysharingShare, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def share(
    params: ParamsResourceFamilysharingShare,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Initiates sharing of the content with the user's family. Empty response indicates success.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/books.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const books = google.books('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/books'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await books.familysharing.share({
    *     // The docid to share.
    *     docId: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *     // The volume to share.
    *     volumeId: 'placeholder-value',
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
  def share(params: ParamsResourceFamilysharingShare, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def share(
    params: ParamsResourceFamilysharingShare,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def unshare(): GaxiosPromise[SchemaEmpty] = js.native
  def unshare(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def unshare(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def unshare(params: ParamsResourceFamilysharingUnshare): GaxiosPromise[SchemaEmpty] = js.native
  def unshare(params: ParamsResourceFamilysharingUnshare, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def unshare(
    params: ParamsResourceFamilysharingUnshare,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def unshare(params: ParamsResourceFamilysharingUnshare, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def unshare(
    params: ParamsResourceFamilysharingUnshare,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Initiates revoking content that has already been shared with the user's family. Empty response indicates success.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/books.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const books = google.books('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/books'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await books.familysharing.unshare({
    *     // The docid to unshare.
    *     docId: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *     // The volume to unshare.
    *     volumeId: 'placeholder-value',
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
  def unshare(params: ParamsResourceFamilysharingUnshare, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def unshare(
    params: ParamsResourceFamilysharingUnshare,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
