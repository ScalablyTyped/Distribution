package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/bigtableadmin/v2", "bigtableadmin_v2.Resource$Projects$Instances$Clusters")
@js.native
class ResourceDollarProjectsDollarInstancesDollarClusters protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * bigtableadmin.projects.instances.clusters.create
    * @desc Creates a cluster within an instance.
    * @alias bigtableadmin.projects.instances.clusters.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clusterId The ID to be used when referring to the new cluster within its instance, e.g., just `mycluster` rather than `projects/myproject/instances/myinstance/clusters/mycluster`.
    * @param {string} params.parent The unique name of the instance in which to create the new cluster. Values are of the form `projects/<project>/instances/<instance>`.
    * @param {().Cluster} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Operation] = js.native
  def create(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarClustersDollarCreate): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarClustersDollarCreate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarClustersDollarCreate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarClustersDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarClustersDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * bigtableadmin.projects.instances.clusters.delete
    * @desc Deletes a cluster from an instance.
    * @alias bigtableadmin.projects.instances.clusters.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The unique name of the cluster to be deleted. Values are of the form `projects/<project>/instances/<instance>/clusters/<cluster>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarClustersDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarClustersDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarClustersDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarClustersDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarClustersDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * bigtableadmin.projects.instances.clusters.get
    * @desc Gets information about a cluster.
    * @alias bigtableadmin.projects.instances.clusters.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The unique name of the requested cluster. Values are of the form `projects/<project>/instances/<instance>/clusters/<cluster>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Cluster] = js.native
  def get(callback: BodyResponseCallback[Schema$Cluster]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarClustersDollarGet): GaxiosPromise[Schema$Cluster] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarClustersDollarGet,
    callback: BodyResponseCallback[Schema$Cluster]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarClustersDollarGet,
    options: BodyResponseCallback[Schema$Cluster],
    callback: BodyResponseCallback[Schema$Cluster]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarClustersDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Cluster] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarClustersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Cluster]
  ): Unit = js.native
  /**
    * bigtableadmin.projects.instances.clusters.list
    * @desc Lists information about clusters in an instance.
    * @alias bigtableadmin.projects.instances.clusters.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pageToken DEPRECATED: This field is unused and ignored.
    * @param {string} params.parent The unique name of the instance for which a list of clusters is requested. Values are of the form `projects/<project>/instances/<instance>`. Use `<instance> = '-'` to list Clusters for all Instances in a project, e.g., `projects/myproject/instances/-`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListClustersResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListClustersResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarClustersDollarList): GaxiosPromise[Schema$ListClustersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarClustersDollarList,
    callback: BodyResponseCallback[Schema$ListClustersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarClustersDollarList,
    options: BodyResponseCallback[Schema$ListClustersResponse],
    callback: BodyResponseCallback[Schema$ListClustersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarClustersDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListClustersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarClustersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListClustersResponse]
  ): Unit = js.native
  /**
    * bigtableadmin.projects.instances.clusters.update
    * @desc Updates a cluster within an instance.
    * @alias bigtableadmin.projects.instances.clusters.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name (`OutputOnly`) The unique name of the cluster. Values are of the form `projects/<project>/instances/<instance>/clusters/a-z*`.
    * @param {().Cluster} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Operation] = js.native
  def update(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def update(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarClustersDollarUpdate): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarClustersDollarUpdate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarClustersDollarUpdate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarClustersDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarClustersDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

