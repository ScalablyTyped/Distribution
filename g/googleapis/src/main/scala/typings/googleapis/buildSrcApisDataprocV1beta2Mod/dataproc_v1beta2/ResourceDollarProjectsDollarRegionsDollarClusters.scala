package typings.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dataproc/v1beta2", "dataproc_v1beta2.Resource$Projects$Regions$Clusters")
@js.native
class ResourceDollarProjectsDollarRegionsDollarClusters protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dataproc.projects.regions.clusters.create
    * @desc Creates a cluster in a project.
    * @alias dataproc.projects.regions.clusters.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId Required. The ID of the Google Cloud Platform project that the cluster belongs to.
    * @param {string} params.region Required. The Cloud Dataproc region in which to handle the request.
    * @param {string=} params.requestId Optional. A unique id used to identify the request. If the server receives two CreateClusterRequest requests with the same id, then the second request will be ignored and the first google.longrunning.Operation created and stored in the backend is returned.It is recommended to always set this value to a UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier).The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
    * @param {().Cluster} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Operation] = js.native
  def create(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarCreate): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarCreate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarCreate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.clusters.delete
    * @desc Deletes a cluster in a project.
    * @alias dataproc.projects.regions.clusters.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterName Required. The cluster name.
    * @param {string=} params.clusterUuid Optional. Specifying the cluster_uuid means the RPC should fail (with error NOT_FOUND) if cluster with specified UUID does not exist.
    * @param {string} params.projectId Required. The ID of the Google Cloud Platform project that the cluster belongs to.
    * @param {string} params.region Required. The Cloud Dataproc region in which to handle the request.
    * @param {string=} params.requestId Optional. A unique id used to identify the request. If the server receives two DeleteClusterRequest requests with the same id, then the second request will be ignored and the first google.longrunning.Operation created and stored in the backend is returned.It is recommended to always set this value to a UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier).The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.clusters.diagnose
    * @desc Gets cluster diagnostic information. After the operation completes,
    * the Operation.response field contains DiagnoseClusterOutputLocation.
    * @alias dataproc.projects.regions.clusters.diagnose
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterName Required. The cluster name.
    * @param {string} params.projectId Required. The ID of the Google Cloud Platform project that the cluster belongs to.
    * @param {string} params.region Required. The Cloud Dataproc region in which to handle the request.
    * @param {().DiagnoseClusterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def diagnose(): GaxiosPromise[Schema$Operation] = js.native
  def diagnose(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def diagnose(params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarDiagnose): GaxiosPromise[Schema$Operation] = js.native
  def diagnose(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarDiagnose,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def diagnose(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarDiagnose,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def diagnose(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarDiagnose,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def diagnose(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarDiagnose,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.clusters.get
    * @desc Gets the resource representation for a cluster in a project.
    * @alias dataproc.projects.regions.clusters.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterName Required. The cluster name.
    * @param {string} params.projectId Required. The ID of the Google Cloud Platform project that the cluster belongs to.
    * @param {string} params.region Required. The Cloud Dataproc region in which to handle the request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Cluster] = js.native
  def get(callback: BodyResponseCallback[Schema$Cluster]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarGet): GaxiosPromise[Schema$Cluster] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarGet,
    callback: BodyResponseCallback[Schema$Cluster]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarGet,
    options: BodyResponseCallback[Schema$Cluster],
    callback: BodyResponseCallback[Schema$Cluster]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Cluster] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Cluster]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.clusters.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias dataproc.projects.regions.clusters.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarGetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.clusters.list
    * @desc Lists all regions/{region}/clusters in a project.
    * @alias dataproc.projects.regions.clusters.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Optional. A filter constraining the clusters to list. Filters are case-sensitive and have the following syntax:field = value AND field = value ...where field is one of status.state, clusterName, or labels.[KEY], and [KEY] is a label key. value can be * to match all values. status.state can be one of the following: ACTIVE, INACTIVE, CREATING, RUNNING, ERROR, DELETING, or UPDATING. ACTIVE contains the CREATING, UPDATING, and RUNNING states. INACTIVE contains the DELETING and ERROR states. clusterName is the name of the cluster provided at creation time. Only the logical AND operator is supported; space-separated items are treated as having an implicit AND operator.Example filter:status.state = ACTIVE AND clusterName = mycluster AND labels.env = staging AND labels.starred = *
    * @param {integer=} params.pageSize Optional. The standard List page size.
    * @param {string=} params.pageToken Optional. The standard List page token.
    * @param {string} params.projectId Required. The ID of the Google Cloud Platform project that the cluster belongs to.
    * @param {string} params.region Required. The Cloud Dataproc region in which to handle the request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListClustersResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListClustersResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarList): GaxiosPromise[Schema$ListClustersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarList,
    callback: BodyResponseCallback[Schema$ListClustersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarList,
    options: BodyResponseCallback[Schema$ListClustersResponse],
    callback: BodyResponseCallback[Schema$ListClustersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListClustersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListClustersResponse]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.clusters.patch
    * @desc Updates a cluster in a project.
    * @alias dataproc.projects.regions.clusters.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterName Required. The cluster name.
    * @param {string=} params.gracefulDecommissionTimeout Optional. Timeout for graceful YARN decomissioning. Graceful decommissioning allows removing nodes from the cluster without interrupting jobs in progress. Timeout specifies how long to wait for jobs in progress to finish before forcefully removing nodes (and potentially interrupting jobs). Default timeout is 0 (for forceful decommission), and the maximum allowed timeout is 1 day.Only supported on Dataproc image versions 1.2 and higher.
    * @param {string} params.projectId Required. The ID of the Google Cloud Platform project the cluster belongs to.
    * @param {string} params.region Required. The Cloud Dataproc region in which to handle the request.
    * @param {string=} params.requestId Optional. A unique id used to identify the request. If the server receives two UpdateClusterRequest requests with the same id, then the second request will be ignored and the first google.longrunning.Operation created and stored in the backend is returned.It is recommended to always set this value to a UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier).The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
    * @param {string=} params.updateMask Required. Specifies the path, relative to Cluster, of the field to update. For example, to change the number of workers in a cluster to 5, the update_mask parameter would be specified as config.worker_config.num_instances, and the PATCH request body would specify the new value, as follows: {   "config":{     "workerConfig":{       "numInstances":"5"     }   } } Similarly, to change the number of preemptible workers in a cluster to 5, the update_mask parameter would be config.secondary_worker_config.num_instances, and the PATCH request body would be set as follows: {   "config":{     "secondaryWorkerConfig":{       "numInstances":"5"     }   } } <strong>Note:</strong> currently only the following fields can be updated: <table> <tr> <td><strong>Mask</strong></td><td><strong>Purpose</strong></td> </tr> <tr> <td>labels</td><td>Updates labels</td> </tr> <tr> <td>config.worker_config.num_instances</td><td>Resize primary worker group</td> </tr> <tr> <td>config.secondary_worker_config.num_instances</td><td>Resize secondary worker group</td> </tr> <tr> <td>config.lifecycle_config.auto_delete_ttl</td><td>Reset MAX TTL duration</td> </tr> <tr> <td>config.lifecycle_config.auto_delete_time</td><td>Update MAX TTL deletion timestamp</td> </tr> <tr> <td>config.lifecycle_config.idle_delete_ttl</td><td>Update Idle TTL duration</td> </tr> <tr> <td>config.autoscaling_config.policy_uri</td><td>Use, stop using, or change autoscaling policies</td> </tr> </table>
    * @param {().Cluster} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarPatch): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarPatch,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarPatch,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.clusters.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias dataproc.projects.regions.clusters.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarSetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.clusters.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.Note: This operation is designed to be
    * used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias dataproc.projects.regions.clusters.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarTestiampermissions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarClustersDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
}

