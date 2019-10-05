package typings.gapiDotClientDotDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManifestsListResponse extends js.Object {
  /** Output only. Manifests contained in this list response. */
  var manifests: js.UndefOr[js.Array[Manifest]] = js.undefined
  /** Output only. A token used to continue a truncated list request. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ManifestsListResponse {
  @scala.inline
  def apply(manifests: js.Array[Manifest] = null, nextPageToken: String = null): ManifestsListResponse = {
    val __obj = js.Dynamic.literal()
    if (manifests != null) __obj.updateDynamic("manifests")(manifests)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ManifestsListResponse]
  }
}

