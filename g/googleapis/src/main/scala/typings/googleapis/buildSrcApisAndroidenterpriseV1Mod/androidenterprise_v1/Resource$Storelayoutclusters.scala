package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Storelayoutclusters")
@js.native
class Resource$Storelayoutclusters protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidenterprise.storelayoutclusters.delete
    * @desc Deletes a cluster.
    * @alias androidenterprise.storelayoutclusters.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId The ID of the cluster.
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.pageId The ID of the page.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarStorelayoutclustersDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarStorelayoutclustersDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarStorelayoutclustersDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarStorelayoutclustersDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarStorelayoutclustersDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * androidenterprise.storelayoutclusters.get
    * @desc Retrieves details of a cluster.
    * @alias androidenterprise.storelayoutclusters.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId The ID of the cluster.
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.pageId The ID of the page.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$StoreCluster] = js.native
  def get(callback: BodyResponseCallback[Schema$StoreCluster]): Unit = js.native
  def get(params: ParamsDollarResourceDollarStorelayoutclustersDollarGet): GaxiosPromise[Schema$StoreCluster] = js.native
  def get(
    params: ParamsDollarResourceDollarStorelayoutclustersDollarGet,
    callback: BodyResponseCallback[Schema$StoreCluster]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarStorelayoutclustersDollarGet,
    options: BodyResponseCallback[Schema$StoreCluster],
    callback: BodyResponseCallback[Schema$StoreCluster]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarStorelayoutclustersDollarGet, options: MethodOptions): GaxiosPromise[Schema$StoreCluster] = js.native
  def get(
    params: ParamsDollarResourceDollarStorelayoutclustersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$StoreCluster]
  ): Unit = js.native
  /**
    * androidenterprise.storelayoutclusters.insert
    * @desc Inserts a new cluster in a page.
    * @alias androidenterprise.storelayoutclusters.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.pageId The ID of the page.
    * @param {().StoreCluster} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$StoreCluster] = js.native
  def insert(callback: BodyResponseCallback[Schema$StoreCluster]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarStorelayoutclustersDollarInsert): GaxiosPromise[Schema$StoreCluster] = js.native
  def insert(
    params: ParamsDollarResourceDollarStorelayoutclustersDollarInsert,
    callback: BodyResponseCallback[Schema$StoreCluster]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarStorelayoutclustersDollarInsert,
    options: BodyResponseCallback[Schema$StoreCluster],
    callback: BodyResponseCallback[Schema$StoreCluster]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarStorelayoutclustersDollarInsert, options: MethodOptions): GaxiosPromise[Schema$StoreCluster] = js.native
  def insert(
    params: ParamsDollarResourceDollarStorelayoutclustersDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$StoreCluster]
  ): Unit = js.native
  /**
    * androidenterprise.storelayoutclusters.list
    * @desc Retrieves the details of all clusters on the specified page.
    * @alias androidenterprise.storelayoutclusters.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.pageId The ID of the page.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$StoreLayoutClustersListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$StoreLayoutClustersListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarStorelayoutclustersDollarList): GaxiosPromise[Schema$StoreLayoutClustersListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarStorelayoutclustersDollarList,
    callback: BodyResponseCallback[Schema$StoreLayoutClustersListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarStorelayoutclustersDollarList,
    options: BodyResponseCallback[Schema$StoreLayoutClustersListResponse],
    callback: BodyResponseCallback[Schema$StoreLayoutClustersListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarStorelayoutclustersDollarList, options: MethodOptions): GaxiosPromise[Schema$StoreLayoutClustersListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarStorelayoutclustersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$StoreLayoutClustersListResponse]
  ): Unit = js.native
  /**
    * androidenterprise.storelayoutclusters.patch
    * @desc Updates a cluster. This method supports patch semantics.
    * @alias androidenterprise.storelayoutclusters.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId The ID of the cluster.
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.pageId The ID of the page.
    * @param {().StoreCluster} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$StoreCluster] = js.native
  def patch(callback: BodyResponseCallback[Schema$StoreCluster]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarStorelayoutclustersDollarPatch): GaxiosPromise[Schema$StoreCluster] = js.native
  def patch(
    params: ParamsDollarResourceDollarStorelayoutclustersDollarPatch,
    callback: BodyResponseCallback[Schema$StoreCluster]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarStorelayoutclustersDollarPatch,
    options: BodyResponseCallback[Schema$StoreCluster],
    callback: BodyResponseCallback[Schema$StoreCluster]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarStorelayoutclustersDollarPatch, options: MethodOptions): GaxiosPromise[Schema$StoreCluster] = js.native
  def patch(
    params: ParamsDollarResourceDollarStorelayoutclustersDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$StoreCluster]
  ): Unit = js.native
  /**
    * androidenterprise.storelayoutclusters.update
    * @desc Updates a cluster.
    * @alias androidenterprise.storelayoutclusters.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId The ID of the cluster.
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.pageId The ID of the page.
    * @param {().StoreCluster} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$StoreCluster] = js.native
  def update(callback: BodyResponseCallback[Schema$StoreCluster]): Unit = js.native
  def update(params: ParamsDollarResourceDollarStorelayoutclustersDollarUpdate): GaxiosPromise[Schema$StoreCluster] = js.native
  def update(
    params: ParamsDollarResourceDollarStorelayoutclustersDollarUpdate,
    callback: BodyResponseCallback[Schema$StoreCluster]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarStorelayoutclustersDollarUpdate,
    options: BodyResponseCallback[Schema$StoreCluster],
    callback: BodyResponseCallback[Schema$StoreCluster]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarStorelayoutclustersDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$StoreCluster] = js.native
  def update(
    params: ParamsDollarResourceDollarStorelayoutclustersDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$StoreCluster]
  ): Unit = js.native
}

