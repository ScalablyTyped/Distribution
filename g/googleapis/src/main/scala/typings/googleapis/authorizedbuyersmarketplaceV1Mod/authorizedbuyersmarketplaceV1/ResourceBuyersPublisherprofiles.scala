package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/authorizedbuyersmarketplace/v1", "authorizedbuyersmarketplace_v1.Resource$Buyers$Publisherprofiles")
@js.native
open class ResourceBuyersPublisherprofiles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaPublisherProfile] = js.native
  def get(callback: BodyResponseCallback[SchemaPublisherProfile]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPublisherProfile] = js.native
  def get(params: ParamsResourceBuyersPublisherprofilesGet): GaxiosPromise[SchemaPublisherProfile] = js.native
  def get(
    params: ParamsResourceBuyersPublisherprofilesGet,
    callback: BodyResponseCallback[SchemaPublisherProfile]
  ): Unit = js.native
  def get(
    params: ParamsResourceBuyersPublisherprofilesGet,
    options: BodyResponseCallback[Readable | SchemaPublisherProfile],
    callback: BodyResponseCallback[Readable | SchemaPublisherProfile]
  ): Unit = js.native
  def get(params: ParamsResourceBuyersPublisherprofilesGet, options: MethodOptions): GaxiosPromise[SchemaPublisherProfile] = js.native
  def get(
    params: ParamsResourceBuyersPublisherprofilesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPublisherProfile]
  ): Unit = js.native
  /**
    * Gets the requested publisher profile by name.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/authorizedbuyersmarketplace.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const authorizedbuyersmarketplace = google.authorizedbuyersmarketplace('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/authorized-buyers-marketplace'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await authorizedbuyersmarketplace.buyers.publisherProfiles.get({
    *     // Required. Name of the publisher profile. Format: `buyers/{buyerId\}/publisherProfiles/{publisherProfileId\}`
    *     name: 'buyers/my-buyer/publisherProfiles/my-publisherProfile',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "audienceDescription": "my_audienceDescription",
    *   //   "directDealsContact": "my_directDealsContact",
    *   //   "displayName": "my_displayName",
    *   //   "domains": [],
    *   //   "isParent": false,
    *   //   "logoUrl": "my_logoUrl",
    *   //   "mediaKitUrl": "my_mediaKitUrl",
    *   //   "mobileApps": [],
    *   //   "name": "my_name",
    *   //   "overview": "my_overview",
    *   //   "pitchStatement": "my_pitchStatement",
    *   //   "programmaticDealsContact": "my_programmaticDealsContact",
    *   //   "publisherCode": "my_publisherCode",
    *   //   "samplePageUrl": "my_samplePageUrl",
    *   //   "topHeadlines": []
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
  def get(params: ParamsResourceBuyersPublisherprofilesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBuyersPublisherprofilesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListPublisherProfilesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPublisherProfilesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListPublisherProfilesResponse] = js.native
  def list(params: ParamsResourceBuyersPublisherprofilesList): GaxiosPromise[SchemaListPublisherProfilesResponse] = js.native
  def list(
    params: ParamsResourceBuyersPublisherprofilesList,
    callback: BodyResponseCallback[SchemaListPublisherProfilesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBuyersPublisherprofilesList,
    options: BodyResponseCallback[Readable | SchemaListPublisherProfilesResponse],
    callback: BodyResponseCallback[Readable | SchemaListPublisherProfilesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBuyersPublisherprofilesList, options: MethodOptions): GaxiosPromise[SchemaListPublisherProfilesResponse] = js.native
  def list(
    params: ParamsResourceBuyersPublisherprofilesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPublisherProfilesResponse]
  ): Unit = js.native
  /**
    * Lists publisher profiles
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/authorizedbuyersmarketplace.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const authorizedbuyersmarketplace = google.authorizedbuyersmarketplace('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/authorized-buyers-marketplace'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await authorizedbuyersmarketplace.buyers.publisherProfiles.list({
    *     // Optional query string using the [Cloud API list filtering] (https://developers.google.com/authorized-buyers/apis/guides/v2/list-filters) syntax.
    *     filter: 'placeholder-value',
    *     // Requested page size. The server may return fewer results than requested. If requested more than 500, the server will return 500 results per page. If unspecified, the server will pick a default page size of 100.
    *     pageSize: 'placeholder-value',
    *     // The page token as returned from a previous ListPublisherProfilesResponse.
    *     pageToken: 'placeholder-value',
    *     // Required. Parent that owns the collection of publisher profiles Format: `buyers/{buyerId\}`
    *     parent: 'buyers/my-buyer',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "publisherProfiles": []
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
  def list(params: ParamsResourceBuyersPublisherprofilesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBuyersPublisherprofilesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
