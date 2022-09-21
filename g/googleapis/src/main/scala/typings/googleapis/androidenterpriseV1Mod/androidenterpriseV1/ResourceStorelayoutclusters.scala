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

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Storelayoutclusters")
@js.native
open class ResourceStorelayoutclusters protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceStorelayoutclustersDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceStorelayoutclustersDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceStorelayoutclustersDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceStorelayoutclustersDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceStorelayoutclustersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a cluster.
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
    *   const res = await androidenterprise.storelayoutclusters.delete({
    *     // The ID of the cluster.
    *     clusterId: 'placeholder-value',
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the page.
    *     pageId: 'placeholder-value',
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
  def delete(params: ParamsResourceStorelayoutclustersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceStorelayoutclustersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaStoreCluster] = js.native
  def get(callback: BodyResponseCallback[SchemaStoreCluster]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStoreCluster] = js.native
  def get(params: ParamsResourceStorelayoutclustersGet): GaxiosPromise[SchemaStoreCluster] = js.native
  def get(params: ParamsResourceStorelayoutclustersGet, callback: BodyResponseCallback[SchemaStoreCluster]): Unit = js.native
  def get(
    params: ParamsResourceStorelayoutclustersGet,
    options: BodyResponseCallback[Readable | SchemaStoreCluster],
    callback: BodyResponseCallback[Readable | SchemaStoreCluster]
  ): Unit = js.native
  def get(params: ParamsResourceStorelayoutclustersGet, options: MethodOptions): GaxiosPromise[SchemaStoreCluster] = js.native
  def get(
    params: ParamsResourceStorelayoutclustersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStoreCluster]
  ): Unit = js.native
  /**
    * Retrieves details of a cluster.
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
    *   const res = await androidenterprise.storelayoutclusters.get({
    *     // The ID of the cluster.
    *     clusterId: 'placeholder-value',
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the page.
    *     pageId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "id": "my_id",
    *   //   "name": [],
    *   //   "orderInPage": "my_orderInPage",
    *   //   "productId": []
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
  def get(params: ParamsResourceStorelayoutclustersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceStorelayoutclustersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaStoreCluster] = js.native
  def insert(callback: BodyResponseCallback[SchemaStoreCluster]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStoreCluster] = js.native
  def insert(params: ParamsResourceStorelayoutclustersInsert): GaxiosPromise[SchemaStoreCluster] = js.native
  def insert(
    params: ParamsResourceStorelayoutclustersInsert,
    callback: BodyResponseCallback[SchemaStoreCluster]
  ): Unit = js.native
  def insert(
    params: ParamsResourceStorelayoutclustersInsert,
    options: BodyResponseCallback[Readable | SchemaStoreCluster],
    callback: BodyResponseCallback[Readable | SchemaStoreCluster]
  ): Unit = js.native
  def insert(params: ParamsResourceStorelayoutclustersInsert, options: MethodOptions): GaxiosPromise[SchemaStoreCluster] = js.native
  def insert(
    params: ParamsResourceStorelayoutclustersInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStoreCluster]
  ): Unit = js.native
  /**
    * Inserts a new cluster in a page.
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
    *   const res = await androidenterprise.storelayoutclusters.insert({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the page.
    *     pageId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "id": "my_id",
    *       //   "name": [],
    *       //   "orderInPage": "my_orderInPage",
    *       //   "productId": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "id": "my_id",
    *   //   "name": [],
    *   //   "orderInPage": "my_orderInPage",
    *   //   "productId": []
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
  def insert(params: ParamsResourceStorelayoutclustersInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceStorelayoutclustersInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaStoreLayoutClustersListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaStoreLayoutClustersListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStoreLayoutClustersListResponse] = js.native
  def list(params: ParamsResourceStorelayoutclustersList): GaxiosPromise[SchemaStoreLayoutClustersListResponse] = js.native
  def list(
    params: ParamsResourceStorelayoutclustersList,
    callback: BodyResponseCallback[SchemaStoreLayoutClustersListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceStorelayoutclustersList,
    options: BodyResponseCallback[Readable | SchemaStoreLayoutClustersListResponse],
    callback: BodyResponseCallback[Readable | SchemaStoreLayoutClustersListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceStorelayoutclustersList, options: MethodOptions): GaxiosPromise[SchemaStoreLayoutClustersListResponse] = js.native
  def list(
    params: ParamsResourceStorelayoutclustersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStoreLayoutClustersListResponse]
  ): Unit = js.native
  /**
    * Retrieves the details of all clusters on the specified page.
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
    *   const res = await androidenterprise.storelayoutclusters.list({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the page.
    *     pageId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cluster": []
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
  def list(params: ParamsResourceStorelayoutclustersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceStorelayoutclustersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaStoreCluster] = js.native
  def update(callback: BodyResponseCallback[SchemaStoreCluster]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStoreCluster] = js.native
  def update(params: ParamsResourceStorelayoutclustersUpdate): GaxiosPromise[SchemaStoreCluster] = js.native
  def update(
    params: ParamsResourceStorelayoutclustersUpdate,
    callback: BodyResponseCallback[SchemaStoreCluster]
  ): Unit = js.native
  def update(
    params: ParamsResourceStorelayoutclustersUpdate,
    options: BodyResponseCallback[Readable | SchemaStoreCluster],
    callback: BodyResponseCallback[Readable | SchemaStoreCluster]
  ): Unit = js.native
  def update(params: ParamsResourceStorelayoutclustersUpdate, options: MethodOptions): GaxiosPromise[SchemaStoreCluster] = js.native
  def update(
    params: ParamsResourceStorelayoutclustersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStoreCluster]
  ): Unit = js.native
  /**
    * Updates a cluster.
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
    *   const res = await androidenterprise.storelayoutclusters.update({
    *     // The ID of the cluster.
    *     clusterId: 'placeholder-value',
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the page.
    *     pageId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "id": "my_id",
    *       //   "name": [],
    *       //   "orderInPage": "my_orderInPage",
    *       //   "productId": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "id": "my_id",
    *   //   "name": [],
    *   //   "orderInPage": "my_orderInPage",
    *   //   "productId": []
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
  def update(params: ParamsResourceStorelayoutclustersUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceStorelayoutclustersUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
