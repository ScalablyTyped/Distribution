package typings.googleapis.buildSrcApisReplicapoolV1beta1Mod.replicapool_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/replicapool/v1beta1", "replicapool_v1beta1.Resource$Replicas")
@js.native
class Resource$Replicas protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * replicapool.replicas.delete
    * @desc Deletes a replica from the pool.
    * @alias replicapool.replicas.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.poolName The replica pool name for this request.
    * @param {string} params.projectName The project ID for this request.
    * @param {string} params.replicaName The name of the replica for this request.
    * @param {string} params.zone The zone where the replica lives.
    * @param {().ReplicasDeleteRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Replica] = js.native
  def delete(callback: BodyResponseCallback[Schema$Replica]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarReplicasDollarDelete): GaxiosPromise[Schema$Replica] = js.native
  def delete(
    params: ParamsDollarResourceDollarReplicasDollarDelete,
    callback: BodyResponseCallback[Schema$Replica]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarReplicasDollarDelete,
    options: BodyResponseCallback[Schema$Replica],
    callback: BodyResponseCallback[Schema$Replica]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarReplicasDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Replica] = js.native
  def delete(
    params: ParamsDollarResourceDollarReplicasDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Replica]
  ): Unit = js.native
  /**
    * replicapool.replicas.get
    * @desc Gets information about a specific replica.
    * @alias replicapool.replicas.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.poolName The replica pool name for this request.
    * @param {string} params.projectName The project ID for this request.
    * @param {string} params.replicaName The name of the replica for this request.
    * @param {string} params.zone The zone where the replica lives.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Replica] = js.native
  def get(callback: BodyResponseCallback[Schema$Replica]): Unit = js.native
  def get(params: ParamsDollarResourceDollarReplicasDollarGet): GaxiosPromise[Schema$Replica] = js.native
  def get(
    params: ParamsDollarResourceDollarReplicasDollarGet,
    callback: BodyResponseCallback[Schema$Replica]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarReplicasDollarGet,
    options: BodyResponseCallback[Schema$Replica],
    callback: BodyResponseCallback[Schema$Replica]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarReplicasDollarGet, options: MethodOptions): GaxiosPromise[Schema$Replica] = js.native
  def get(
    params: ParamsDollarResourceDollarReplicasDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Replica]
  ): Unit = js.native
  /**
    * replicapool.replicas.list
    * @desc Lists all replicas in a pool.
    * @alias replicapool.replicas.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum count of results to be returned. Acceptable values are 0 to 100, inclusive. (Default: 50)
    * @param {string=} params.pageToken Set this to the nextPageToken value returned by a previous list request to obtain the next page of results from the previous list request.
    * @param {string} params.poolName The replica pool name for this request.
    * @param {string} params.projectName The project ID for this request.
    * @param {string} params.zone The zone where the replica pool lives.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ReplicasListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ReplicasListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarReplicasDollarList): GaxiosPromise[Schema$ReplicasListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarReplicasDollarList,
    callback: BodyResponseCallback[Schema$ReplicasListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarReplicasDollarList,
    options: BodyResponseCallback[Schema$ReplicasListResponse],
    callback: BodyResponseCallback[Schema$ReplicasListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarReplicasDollarList, options: MethodOptions): GaxiosPromise[Schema$ReplicasListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarReplicasDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ReplicasListResponse]
  ): Unit = js.native
  /**
    * replicapool.replicas.restart
    * @desc Restarts a replica in a pool.
    * @alias replicapool.replicas.restart
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.poolName The replica pool name for this request.
    * @param {string} params.projectName The project ID for this request.
    * @param {string} params.replicaName The name of the replica for this request.
    * @param {string} params.zone The zone where the replica lives.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def restart(): GaxiosPromise[Schema$Replica] = js.native
  def restart(callback: BodyResponseCallback[Schema$Replica]): Unit = js.native
  def restart(params: ParamsDollarResourceDollarReplicasDollarRestart): GaxiosPromise[Schema$Replica] = js.native
  def restart(
    params: ParamsDollarResourceDollarReplicasDollarRestart,
    callback: BodyResponseCallback[Schema$Replica]
  ): Unit = js.native
  def restart(
    params: ParamsDollarResourceDollarReplicasDollarRestart,
    options: BodyResponseCallback[Schema$Replica],
    callback: BodyResponseCallback[Schema$Replica]
  ): Unit = js.native
  def restart(params: ParamsDollarResourceDollarReplicasDollarRestart, options: MethodOptions): GaxiosPromise[Schema$Replica] = js.native
  def restart(
    params: ParamsDollarResourceDollarReplicasDollarRestart,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Replica]
  ): Unit = js.native
}

