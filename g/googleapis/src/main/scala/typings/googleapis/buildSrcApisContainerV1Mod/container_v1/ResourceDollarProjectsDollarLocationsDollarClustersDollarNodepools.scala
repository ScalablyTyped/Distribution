package typings.googleapis.buildSrcApisContainerV1Mod.container_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/container/v1", "container_v1.Resource$Projects$Locations$Clusters$Nodepools")
@js.native
class ResourceDollarProjectsDollarLocationsDollarClustersDollarNodepools protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * container.projects.locations.clusters.nodePools.create
    * @desc Creates a node pool for a cluster.
    * @alias container.projects.locations.clusters.nodePools.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The parent (project, location, cluster id) where the node pool will be created. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().CreateNodePoolRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Operation] = js.native
  def create(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarCreate): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarCreate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarCreate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.nodePools.delete
    * @desc Deletes a node pool from a cluster.
    * @alias container.projects.locations.clusters.nodePools.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clusterId Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field.
    * @param {string} params.name The name (project, location, cluster, node pool id) of the node pool to delete. Specified in the format 'projects/x/locations/x/clusters/x/nodePools/x'.
    * @param {string=} params.nodePoolId Deprecated. The name of the node pool to delete. This field has been deprecated and replaced by the name field.
    * @param {string=} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the name field.
    * @param {string=} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.nodePools.get
    * @desc Retrieves the node pool requested.
    * @alias container.projects.locations.clusters.nodePools.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clusterId Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field.
    * @param {string} params.name The name (project, location, cluster, node pool id) of the node pool to get. Specified in the format 'projects/x/locations/x/clusters/x/nodePools/x'.
    * @param {string=} params.nodePoolId Deprecated. The name of the node pool. This field has been deprecated and replaced by the name field.
    * @param {string=} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the name field.
    * @param {string=} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$NodePool] = js.native
  def get(callback: BodyResponseCallback[Schema$NodePool]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarGet): GaxiosPromise[Schema$NodePool] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarGet,
    callback: BodyResponseCallback[Schema$NodePool]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarGet,
    options: BodyResponseCallback[Schema$NodePool],
    callback: BodyResponseCallback[Schema$NodePool]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$NodePool] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$NodePool]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.nodePools.list
    * @desc Lists the node pools for a cluster.
    * @alias container.projects.locations.clusters.nodePools.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clusterId Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field.
    * @param {string} params.parent The parent (project, location, cluster id) where the node pools will be listed. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {string=} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the parent field.
    * @param {string=} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListNodePoolsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListNodePoolsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarList): GaxiosPromise[Schema$ListNodePoolsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarList,
    callback: BodyResponseCallback[Schema$ListNodePoolsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarList,
    options: BodyResponseCallback[Schema$ListNodePoolsResponse],
    callback: BodyResponseCallback[Schema$ListNodePoolsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListNodePoolsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListNodePoolsResponse]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.nodePools.rollback
    * @desc Roll back the previously Aborted or Failed NodePool upgrade. This
    * will be an no-op if the last upgrade successfully completed.
    * @alias container.projects.locations.clusters.nodePools.rollback
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster, node pool id) of the node poll to rollback upgrade. Specified in the format 'projects/x/locations/x/clusters/x/nodePools/x'.
    * @param {().RollbackNodePoolUpgradeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def rollback(): GaxiosPromise[Schema$Operation] = js.native
  def rollback(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def rollback(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarRollback
  ): GaxiosPromise[Schema$Operation] = js.native
  def rollback(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarRollback,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def rollback(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarRollback,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def rollback(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarRollback,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def rollback(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarRollback,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.nodePools.setAutoscaling
    * @desc Sets the autoscaling settings for a specific node pool.
    * @alias container.projects.locations.clusters.nodePools.setAutoscaling
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster, node pool) of the node pool to set autoscaler settings. Specified in the format 'projects/x/locations/x/clusters/x/nodePools/x'.
    * @param {().SetNodePoolAutoscalingRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setAutoscaling(): GaxiosPromise[Schema$Operation] = js.native
  def setAutoscaling(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setAutoscaling(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarSetautoscaling
  ): GaxiosPromise[Schema$Operation] = js.native
  def setAutoscaling(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarSetautoscaling,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setAutoscaling(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarSetautoscaling,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setAutoscaling(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarSetautoscaling,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def setAutoscaling(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarSetautoscaling,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.nodePools.setManagement
    * @desc Sets the NodeManagement options for a node pool.
    * @alias container.projects.locations.clusters.nodePools.setManagement
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster, node pool id) of the node pool to set management properties. Specified in the format 'projects/x/locations/x/clusters/x/nodePools/x'.
    * @param {().SetNodePoolManagementRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setManagement(): GaxiosPromise[Schema$Operation] = js.native
  def setManagement(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setManagement(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarSetmanagement
  ): GaxiosPromise[Schema$Operation] = js.native
  def setManagement(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarSetmanagement,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setManagement(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarSetmanagement,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setManagement(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarSetmanagement,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def setManagement(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarSetmanagement,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.nodePools.setSize
    * @desc Sets the size for a specific node pool.
    * @alias container.projects.locations.clusters.nodePools.setSize
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster, node pool id) of the node pool to set size. Specified in the format 'projects/x/locations/x/clusters/x/nodePools/x'.
    * @param {().SetNodePoolSizeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setSize(): GaxiosPromise[Schema$Operation] = js.native
  def setSize(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setSize(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarSetsize
  ): GaxiosPromise[Schema$Operation] = js.native
  def setSize(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarSetsize,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setSize(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarSetsize,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setSize(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarSetsize,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def setSize(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarSetsize,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.nodePools.update
    * @desc Updates the version and/or image type for a specific node pool.
    * @alias container.projects.locations.clusters.nodePools.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster, node pool) of the node pool to update. Specified in the format 'projects/x/locations/x/clusters/x/nodePools/x'.
    * @param {().UpdateNodePoolRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Operation] = js.native
  def update(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def update(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarUpdate): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarUpdate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarUpdate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarNodepoolsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

