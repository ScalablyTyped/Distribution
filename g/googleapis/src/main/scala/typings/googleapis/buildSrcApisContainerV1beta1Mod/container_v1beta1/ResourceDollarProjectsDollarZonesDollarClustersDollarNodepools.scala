package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/container/v1beta1", "container_v1beta1.Resource$Projects$Zones$Clusters$Nodepools")
@js.native
class ResourceDollarProjectsDollarZonesDollarClustersDollarNodepools protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * container.projects.zones.clusters.nodePools.autoscaling
    * @desc Sets the autoscaling settings of a specific node pool.
    * @alias container.projects.zones.clusters.nodePools.autoscaling
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    * @param {string} params.nodePoolId Deprecated. The name of the node pool to upgrade. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().SetNodePoolAutoscalingRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def autoscaling(): GaxiosPromise[Schema$Operation] = js.native
  def autoscaling(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def autoscaling(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarAutoscaling
  ): GaxiosPromise[Schema$Operation] = js.native
  def autoscaling(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarAutoscaling,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def autoscaling(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarAutoscaling,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def autoscaling(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarAutoscaling,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def autoscaling(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarAutoscaling,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.nodePools.create
    * @desc Creates a node pool for a cluster.
    * @alias container.projects.zones.clusters.nodePools.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the parent field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field.
    * @param {().CreateNodePoolRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Operation] = js.native
  def create(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarCreate): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarCreate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarCreate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.nodePools.delete
    * @desc Deletes a node pool from a cluster.
    * @alias container.projects.zones.clusters.nodePools.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field.
    * @param {string=} params.name The name (project, location, cluster, node pool id) of the node pool to delete. Specified in the format 'projects/x/locations/x/clusters/x/nodePools/x'.
    * @param {string} params.nodePoolId Deprecated. The name of the node pool to delete. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.nodePools.get
    * @desc Retrieves the node pool requested.
    * @alias container.projects.zones.clusters.nodePools.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field.
    * @param {string=} params.name The name (project, location, cluster, node pool id) of the node pool to get. Specified in the format 'projects/x/locations/x/clusters/x/nodePools/x'.
    * @param {string} params.nodePoolId Deprecated. The name of the node pool. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$NodePool] = js.native
  def get(callback: BodyResponseCallback[Schema$NodePool]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarGet): GaxiosPromise[Schema$NodePool] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarGet,
    callback: BodyResponseCallback[Schema$NodePool]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarGet,
    options: BodyResponseCallback[Schema$NodePool],
    callback: BodyResponseCallback[Schema$NodePool]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$NodePool] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$NodePool]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.nodePools.list
    * @desc Lists the node pools for a cluster.
    * @alias container.projects.zones.clusters.nodePools.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field.
    * @param {string=} params.parent The parent (project, location, cluster id) where the node pools will be listed. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the parent field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListNodePoolsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListNodePoolsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarList): GaxiosPromise[Schema$ListNodePoolsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarList,
    callback: BodyResponseCallback[Schema$ListNodePoolsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarList,
    options: BodyResponseCallback[Schema$ListNodePoolsResponse],
    callback: BodyResponseCallback[Schema$ListNodePoolsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListNodePoolsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListNodePoolsResponse]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.nodePools.rollback
    * @desc Roll back the previously Aborted or Failed NodePool upgrade. This
    * will be an no-op if the last upgrade successfully completed.
    * @alias container.projects.zones.clusters.nodePools.rollback
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to rollback. This field has been deprecated and replaced by the name field.
    * @param {string} params.nodePoolId Deprecated. The name of the node pool to rollback. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().RollbackNodePoolUpgradeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def rollback(): GaxiosPromise[Schema$Operation] = js.native
  def rollback(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def rollback(params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarRollback): GaxiosPromise[Schema$Operation] = js.native
  def rollback(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarRollback,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def rollback(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarRollback,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def rollback(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarRollback,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def rollback(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarRollback,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.nodePools.setManagement
    * @desc Sets the NodeManagement options for a node pool.
    * @alias container.projects.zones.clusters.nodePools.setManagement
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to update. This field has been deprecated and replaced by the name field.
    * @param {string} params.nodePoolId Deprecated. The name of the node pool to update. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().SetNodePoolManagementRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setManagement(): GaxiosPromise[Schema$Operation] = js.native
  def setManagement(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setManagement(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarSetmanagement
  ): GaxiosPromise[Schema$Operation] = js.native
  def setManagement(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarSetmanagement,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setManagement(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarSetmanagement,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setManagement(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarSetmanagement,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def setManagement(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarSetmanagement,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.nodePools.setSize
    * @desc Sets the size for a specific node pool.
    * @alias container.projects.zones.clusters.nodePools.setSize
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to update. This field has been deprecated and replaced by the name field.
    * @param {string} params.nodePoolId Deprecated. The name of the node pool to update. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().SetNodePoolSizeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setSize(): GaxiosPromise[Schema$Operation] = js.native
  def setSize(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setSize(params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarSetsize): GaxiosPromise[Schema$Operation] = js.native
  def setSize(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarSetsize,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setSize(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarSetsize,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setSize(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarSetsize,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def setSize(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarSetsize,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.nodePools.update
    * @desc Updates the version and/or image type of a specific node pool.
    * @alias container.projects.zones.clusters.nodePools.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    * @param {string} params.nodePoolId Deprecated. The name of the node pool to upgrade. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().UpdateNodePoolRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Operation] = js.native
  def update(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def update(params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarUpdate): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarUpdate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarUpdate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarNodepoolsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

