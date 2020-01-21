package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Storelayoutclusters")
@js.native
class ResourceStorelayoutclusters protected () extends js.Object {
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
  def delete(params: ParamsResourceStorelayoutclustersDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceStorelayoutclustersDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceStorelayoutclustersDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceStorelayoutclustersDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceStorelayoutclustersDelete,
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
  def get(): GaxiosPromise[SchemaStoreCluster] = js.native
  def get(callback: BodyResponseCallback[SchemaStoreCluster]): Unit = js.native
  def get(params: ParamsResourceStorelayoutclustersGet): GaxiosPromise[SchemaStoreCluster] = js.native
  def get(params: ParamsResourceStorelayoutclustersGet, callback: BodyResponseCallback[SchemaStoreCluster]): Unit = js.native
  def get(
    params: ParamsResourceStorelayoutclustersGet,
    options: BodyResponseCallback[SchemaStoreCluster],
    callback: BodyResponseCallback[SchemaStoreCluster]
  ): Unit = js.native
  def get(params: ParamsResourceStorelayoutclustersGet, options: MethodOptions): GaxiosPromise[SchemaStoreCluster] = js.native
  def get(
    params: ParamsResourceStorelayoutclustersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStoreCluster]
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
  def insert(): GaxiosPromise[SchemaStoreCluster] = js.native
  def insert(callback: BodyResponseCallback[SchemaStoreCluster]): Unit = js.native
  def insert(params: ParamsResourceStorelayoutclustersInsert): GaxiosPromise[SchemaStoreCluster] = js.native
  def insert(
    params: ParamsResourceStorelayoutclustersInsert,
    callback: BodyResponseCallback[SchemaStoreCluster]
  ): Unit = js.native
  def insert(
    params: ParamsResourceStorelayoutclustersInsert,
    options: BodyResponseCallback[SchemaStoreCluster],
    callback: BodyResponseCallback[SchemaStoreCluster]
  ): Unit = js.native
  def insert(params: ParamsResourceStorelayoutclustersInsert, options: MethodOptions): GaxiosPromise[SchemaStoreCluster] = js.native
  def insert(
    params: ParamsResourceStorelayoutclustersInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStoreCluster]
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
  def list(): GaxiosPromise[SchemaStoreLayoutClustersListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaStoreLayoutClustersListResponse]): Unit = js.native
  def list(params: ParamsResourceStorelayoutclustersList): GaxiosPromise[SchemaStoreLayoutClustersListResponse] = js.native
  def list(
    params: ParamsResourceStorelayoutclustersList,
    callback: BodyResponseCallback[SchemaStoreLayoutClustersListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceStorelayoutclustersList,
    options: BodyResponseCallback[SchemaStoreLayoutClustersListResponse],
    callback: BodyResponseCallback[SchemaStoreLayoutClustersListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceStorelayoutclustersList, options: MethodOptions): GaxiosPromise[SchemaStoreLayoutClustersListResponse] = js.native
  def list(
    params: ParamsResourceStorelayoutclustersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStoreLayoutClustersListResponse]
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
  def patch(): GaxiosPromise[SchemaStoreCluster] = js.native
  def patch(callback: BodyResponseCallback[SchemaStoreCluster]): Unit = js.native
  def patch(params: ParamsResourceStorelayoutclustersPatch): GaxiosPromise[SchemaStoreCluster] = js.native
  def patch(params: ParamsResourceStorelayoutclustersPatch, callback: BodyResponseCallback[SchemaStoreCluster]): Unit = js.native
  def patch(
    params: ParamsResourceStorelayoutclustersPatch,
    options: BodyResponseCallback[SchemaStoreCluster],
    callback: BodyResponseCallback[SchemaStoreCluster]
  ): Unit = js.native
  def patch(params: ParamsResourceStorelayoutclustersPatch, options: MethodOptions): GaxiosPromise[SchemaStoreCluster] = js.native
  def patch(
    params: ParamsResourceStorelayoutclustersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStoreCluster]
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
  def update(): GaxiosPromise[SchemaStoreCluster] = js.native
  def update(callback: BodyResponseCallback[SchemaStoreCluster]): Unit = js.native
  def update(params: ParamsResourceStorelayoutclustersUpdate): GaxiosPromise[SchemaStoreCluster] = js.native
  def update(
    params: ParamsResourceStorelayoutclustersUpdate,
    callback: BodyResponseCallback[SchemaStoreCluster]
  ): Unit = js.native
  def update(
    params: ParamsResourceStorelayoutclustersUpdate,
    options: BodyResponseCallback[SchemaStoreCluster],
    callback: BodyResponseCallback[SchemaStoreCluster]
  ): Unit = js.native
  def update(params: ParamsResourceStorelayoutclustersUpdate, options: MethodOptions): GaxiosPromise[SchemaStoreCluster] = js.native
  def update(
    params: ParamsResourceStorelayoutclustersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStoreCluster]
  ): Unit = js.native
}

