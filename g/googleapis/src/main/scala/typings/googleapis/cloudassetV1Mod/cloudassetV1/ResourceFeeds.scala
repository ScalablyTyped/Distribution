package typings.googleapis.cloudassetV1Mod.cloudassetV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudasset/v1", "cloudasset_v1.Resource$Feeds")
@js.native
open class ResourceFeeds protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaFeed] = js.native
  def create(callback: BodyResponseCallback[SchemaFeed]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFeed] = js.native
  def create(params: ParamsResourceFeedsCreate): GaxiosPromise[SchemaFeed] = js.native
  def create(params: ParamsResourceFeedsCreate, callback: BodyResponseCallback[SchemaFeed]): Unit = js.native
  def create(
    params: ParamsResourceFeedsCreate,
    options: BodyResponseCallback[Readable | SchemaFeed],
    callback: BodyResponseCallback[Readable | SchemaFeed]
  ): Unit = js.native
  def create(params: ParamsResourceFeedsCreate, options: MethodOptions): GaxiosPromise[SchemaFeed] = js.native
  def create(
    params: ParamsResourceFeedsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFeed]
  ): Unit = js.native
  /**
    * Creates a feed in a parent project/folder/organization to listen to its asset updates.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudasset.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudasset = google.cloudasset('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudasset.feeds.create({
    *     // Required. The name of the project/folder/organization where this feed should be created in. It can only be an organization number (such as "organizations/123"), a folder number (such as "folders/123"), a project ID (such as "projects/my-project-id")", or a project number (such as "projects/12345").
    *     parent: '[^/]+/[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "feed": {},
    *       //   "feedId": "my_feedId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assetNames": [],
    *   //   "assetTypes": [],
    *   //   "condition": {},
    *   //   "contentType": "my_contentType",
    *   //   "feedOutputConfig": {},
    *   //   "name": "my_name",
    *   //   "relationshipTypes": []
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
  def create(params: ParamsResourceFeedsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceFeedsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceFeedsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceFeedsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceFeedsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceFeedsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceFeedsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an asset feed.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudasset.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudasset = google.cloudasset('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudasset.feeds.delete({
    *     // Required. The name of the feed and it must be in the format of: projects/project_number/feeds/feed_id folders/folder_number/feeds/feed_id organizations/organization_number/feeds/feed_id
    *     name: '[^/]+/[^/]+/feeds/my-feed',
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
  def delete(params: ParamsResourceFeedsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceFeedsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaFeed] = js.native
  def get(callback: BodyResponseCallback[SchemaFeed]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFeed] = js.native
  def get(params: ParamsResourceFeedsGet): GaxiosPromise[SchemaFeed] = js.native
  def get(params: ParamsResourceFeedsGet, callback: BodyResponseCallback[SchemaFeed]): Unit = js.native
  def get(
    params: ParamsResourceFeedsGet,
    options: BodyResponseCallback[Readable | SchemaFeed],
    callback: BodyResponseCallback[Readable | SchemaFeed]
  ): Unit = js.native
  def get(params: ParamsResourceFeedsGet, options: MethodOptions): GaxiosPromise[SchemaFeed] = js.native
  def get(params: ParamsResourceFeedsGet, options: MethodOptions, callback: BodyResponseCallback[SchemaFeed]): Unit = js.native
  /**
    * Gets details about an asset feed.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudasset.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudasset = google.cloudasset('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudasset.feeds.get({
    *     // Required. The name of the Feed and it must be in the format of: projects/project_number/feeds/feed_id folders/folder_number/feeds/feed_id organizations/organization_number/feeds/feed_id
    *     name: '[^/]+/[^/]+/feeds/my-feed',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assetNames": [],
    *   //   "assetTypes": [],
    *   //   "condition": {},
    *   //   "contentType": "my_contentType",
    *   //   "feedOutputConfig": {},
    *   //   "name": "my_name",
    *   //   "relationshipTypes": []
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
  def get(params: ParamsResourceFeedsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceFeedsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListFeedsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListFeedsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListFeedsResponse] = js.native
  def list(params: ParamsResourceFeedsList): GaxiosPromise[SchemaListFeedsResponse] = js.native
  def list(params: ParamsResourceFeedsList, callback: BodyResponseCallback[SchemaListFeedsResponse]): Unit = js.native
  def list(
    params: ParamsResourceFeedsList,
    options: BodyResponseCallback[Readable | SchemaListFeedsResponse],
    callback: BodyResponseCallback[Readable | SchemaListFeedsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceFeedsList, options: MethodOptions): GaxiosPromise[SchemaListFeedsResponse] = js.native
  def list(
    params: ParamsResourceFeedsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListFeedsResponse]
  ): Unit = js.native
  /**
    * Lists all asset feeds in a parent project/folder/organization.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudasset.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudasset = google.cloudasset('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudasset.feeds.list({
    *     // Required. The parent project/folder/organization whose feeds are to be listed. It can only be using project/folder/organization number (such as "folders/12345")", or a project ID (such as "projects/my-project-id").
    *     parent: '[^/]+/[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "feeds": []
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
  def list(params: ParamsResourceFeedsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceFeedsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaFeed] = js.native
  def patch(callback: BodyResponseCallback[SchemaFeed]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFeed] = js.native
  def patch(params: ParamsResourceFeedsPatch): GaxiosPromise[SchemaFeed] = js.native
  def patch(params: ParamsResourceFeedsPatch, callback: BodyResponseCallback[SchemaFeed]): Unit = js.native
  def patch(
    params: ParamsResourceFeedsPatch,
    options: BodyResponseCallback[Readable | SchemaFeed],
    callback: BodyResponseCallback[Readable | SchemaFeed]
  ): Unit = js.native
  def patch(params: ParamsResourceFeedsPatch, options: MethodOptions): GaxiosPromise[SchemaFeed] = js.native
  def patch(
    params: ParamsResourceFeedsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFeed]
  ): Unit = js.native
  /**
    * Updates an asset feed configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudasset.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudasset = google.cloudasset('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudasset.feeds.patch({
    *     // Required. The format will be projects/{project_number\}/feeds/{client-assigned_feed_identifier\} or folders/{folder_number\}/feeds/{client-assigned_feed_identifier\} or organizations/{organization_number\}/feeds/{client-assigned_feed_identifier\} The client-assigned feed identifier must be unique within the parent project/folder/organization.
    *     name: '[^/]+/[^/]+/feeds/my-feed',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "feed": {},
    *       //   "updateMask": "my_updateMask"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assetNames": [],
    *   //   "assetTypes": [],
    *   //   "condition": {},
    *   //   "contentType": "my_contentType",
    *   //   "feedOutputConfig": {},
    *   //   "name": "my_name",
    *   //   "relationshipTypes": []
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
  def patch(params: ParamsResourceFeedsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceFeedsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
