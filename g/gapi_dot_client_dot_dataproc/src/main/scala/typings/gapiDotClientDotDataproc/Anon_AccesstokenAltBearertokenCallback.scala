package typings.gapiDotClientDotDataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AccesstokenAltBearertokenCallback extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.native
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  /** Required. The cluster name. */
  var clusterName: String = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Required. The ID of the Google Cloud Platform project the cluster belongs to. */
  var projectId: String = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /** Required. The Cloud Dataproc region in which to handle the request. */
  var region: String = js.native
  /**
    * Required. Specifies the path, relative to Cluster, of the field to update. For example, to change the number of workers in a cluster to 5, the
    * update_mask parameter would be specified as config.worker_config.num_instances, and the PATCH request body would specify the new value, as follows:
    * {
    * "config":{
    * "workerConfig":{
    * "numInstances":"5"
    * }
    * }
    * }
    * Similarly, to change the number of preemptible workers in a cluster to 5, the update_mask parameter would be
    * config.secondary_worker_config.num_instances, and the PATCH request body would be set as follows:
    * {
    * "config":{
    * "secondaryWorkerConfig":{
    * "numInstances":"5"
    * }
    * }
    * }
    * <strong>Note:</strong> Currently, only the following fields can be updated:<table>  <tbody>  <tr>  <td><strong>Mask</strong></td>
    * <td><strong>Purpose</strong></td>  </tr>  <tr>  <td><strong><em>labels</em></strong></td>  <td>Update labels</td>  </tr>  <tr>
    * <td><strong><em>config.worker_config.num_instances</em></strong></td>  <td>Resize primary worker group</td>  </tr>  <tr>
    * <td><strong><em>config.secondary_worker_config.num_instances</em></strong></td>  <td>Resize secondary worker group</td>  </tr>  </tbody>  </table>
    */
  var updateMask: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}

