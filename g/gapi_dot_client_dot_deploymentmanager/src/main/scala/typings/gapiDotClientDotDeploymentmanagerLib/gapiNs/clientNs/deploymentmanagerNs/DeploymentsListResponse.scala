package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DeploymentsListResponse extends js.Object {
  /** Output only. The deployments contained in this response. */
  var deployments: js.UndefOr[js.Array[Deployment]] = js.undefined
  /** Output only. A token used to continue a truncated list request. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

