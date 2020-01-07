package typings.googleapis.buildSrcApisReplicapoolV1beta1Mod.replicapool_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/replicapool/v1beta1", "replicapool_v1beta1.Resource$Pools")
@js.native
class Resource$Pools protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * replicapool.pools.delete
    * @desc Deletes a replica pool.
    * @alias replicapool.pools.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.poolName The name of the replica pool for this request.
    * @param {string} params.projectName The project ID for this replica pool.
    * @param {string} params.zone The zone for this replica pool.
    * @param {().PoolsDeleteRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarPoolsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarPoolsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarPoolsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarPoolsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarPoolsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * replicapool.pools.get
    * @desc Gets information about a single replica pool.
    * @alias replicapool.pools.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.poolName The name of the replica pool for this request.
    * @param {string} params.projectName The project ID for this replica pool.
    * @param {string} params.zone The zone for this replica pool.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Pool] = js.native
  def get(callback: BodyResponseCallback[Schema$Pool]): Unit = js.native
  def get(params: ParamsDollarResourceDollarPoolsDollarGet): GaxiosPromise[Schema$Pool] = js.native
  def get(params: ParamsDollarResourceDollarPoolsDollarGet, callback: BodyResponseCallback[Schema$Pool]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarPoolsDollarGet,
    options: BodyResponseCallback[Schema$Pool],
    callback: BodyResponseCallback[Schema$Pool]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarPoolsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Pool] = js.native
  def get(
    params: ParamsDollarResourceDollarPoolsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Pool]
  ): Unit = js.native
  /**
    * replicapool.pools.insert
    * @desc Inserts a new replica pool.
    * @alias replicapool.pools.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectName The project ID for this replica pool.
    * @param {string} params.zone The zone for this replica pool.
    * @param {().Pool} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Pool] = js.native
  def insert(callback: BodyResponseCallback[Schema$Pool]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarPoolsDollarInsert): GaxiosPromise[Schema$Pool] = js.native
  def insert(params: ParamsDollarResourceDollarPoolsDollarInsert, callback: BodyResponseCallback[Schema$Pool]): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarPoolsDollarInsert,
    options: BodyResponseCallback[Schema$Pool],
    callback: BodyResponseCallback[Schema$Pool]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarPoolsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Pool] = js.native
  def insert(
    params: ParamsDollarResourceDollarPoolsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Pool]
  ): Unit = js.native
  /**
    * replicapool.pools.list
    * @desc List all replica pools.
    * @alias replicapool.pools.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum count of results to be returned. Acceptable values are 0 to 100, inclusive. (Default: 50)
    * @param {string=} params.pageToken Set this to the nextPageToken value returned by a previous list request to obtain the next page of results from the previous list request.
    * @param {string} params.projectName The project ID for this request.
    * @param {string} params.zone The zone for this replica pool.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$PoolsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$PoolsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarPoolsDollarList): GaxiosPromise[Schema$PoolsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPoolsDollarList,
    callback: BodyResponseCallback[Schema$PoolsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarPoolsDollarList,
    options: BodyResponseCallback[Schema$PoolsListResponse],
    callback: BodyResponseCallback[Schema$PoolsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarPoolsDollarList, options: MethodOptions): GaxiosPromise[Schema$PoolsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPoolsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PoolsListResponse]
  ): Unit = js.native
  /**
    * replicapool.pools.resize
    * @desc Resize a pool. This is an asynchronous operation, and multiple
    * overlapping resize requests can be made. Replica Pools will use the
    * information from the last resize request.
    * @alias replicapool.pools.resize
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.numReplicas The desired number of replicas to resize to. If this number is larger than the existing number of replicas, new replicas will be added. If the number is smaller, then existing replicas will be deleted.
    * @param {string} params.poolName The name of the replica pool for this request.
    * @param {string} params.projectName The project ID for this replica pool.
    * @param {string} params.zone The zone for this replica pool.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resize(): GaxiosPromise[Schema$Pool] = js.native
  def resize(callback: BodyResponseCallback[Schema$Pool]): Unit = js.native
  def resize(params: ParamsDollarResourceDollarPoolsDollarResize): GaxiosPromise[Schema$Pool] = js.native
  def resize(params: ParamsDollarResourceDollarPoolsDollarResize, callback: BodyResponseCallback[Schema$Pool]): Unit = js.native
  def resize(
    params: ParamsDollarResourceDollarPoolsDollarResize,
    options: BodyResponseCallback[Schema$Pool],
    callback: BodyResponseCallback[Schema$Pool]
  ): Unit = js.native
  def resize(params: ParamsDollarResourceDollarPoolsDollarResize, options: MethodOptions): GaxiosPromise[Schema$Pool] = js.native
  def resize(
    params: ParamsDollarResourceDollarPoolsDollarResize,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Pool]
  ): Unit = js.native
  /**
    * replicapool.pools.updatetemplate
    * @desc Update the template used by the pool.
    * @alias replicapool.pools.updatetemplate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.poolName The name of the replica pool for this request.
    * @param {string} params.projectName The project ID for this replica pool.
    * @param {string} params.zone The zone for this replica pool.
    * @param {().Template} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updatetemplate(): GaxiosPromise[Unit] = js.native
  def updatetemplate(callback: BodyResponseCallback[Unit]): Unit = js.native
  def updatetemplate(params: ParamsDollarResourceDollarPoolsDollarUpdatetemplate): GaxiosPromise[Unit] = js.native
  def updatetemplate(params: ParamsDollarResourceDollarPoolsDollarUpdatetemplate, callback: BodyResponseCallback[Unit]): Unit = js.native
  def updatetemplate(
    params: ParamsDollarResourceDollarPoolsDollarUpdatetemplate,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def updatetemplate(params: ParamsDollarResourceDollarPoolsDollarUpdatetemplate, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def updatetemplate(
    params: ParamsDollarResourceDollarPoolsDollarUpdatetemplate,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

