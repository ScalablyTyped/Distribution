package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerConfig extends js.Object {
  /** Version of Kubernetes the service deploys by default. */
  var defaultClusterVersion: js.UndefOr[String] = js.undefined
  /** Default image type. */
  var defaultImageType: js.UndefOr[String] = js.undefined
  /** List of valid image types. */
  var validImageTypes: js.UndefOr[js.Array[String]] = js.undefined
  /** List of valid master versions. */
  var validMasterVersions: js.UndefOr[js.Array[String]] = js.undefined
  /** List of valid node upgrade target versions. */
  var validNodeVersions: js.UndefOr[js.Array[String]] = js.undefined
}

object ServerConfig {
  @scala.inline
  def apply(
    defaultClusterVersion: String = null,
    defaultImageType: String = null,
    validImageTypes: js.Array[String] = null,
    validMasterVersions: js.Array[String] = null,
    validNodeVersions: js.Array[String] = null
  ): ServerConfig = {
    val __obj = js.Dynamic.literal()
    if (defaultClusterVersion != null) __obj.updateDynamic("defaultClusterVersion")(defaultClusterVersion.asInstanceOf[js.Any])
    if (defaultImageType != null) __obj.updateDynamic("defaultImageType")(defaultImageType.asInstanceOf[js.Any])
    if (validImageTypes != null) __obj.updateDynamic("validImageTypes")(validImageTypes.asInstanceOf[js.Any])
    if (validMasterVersions != null) __obj.updateDynamic("validMasterVersions")(validMasterVersions.asInstanceOf[js.Any])
    if (validNodeVersions != null) __obj.updateDynamic("validNodeVersions")(validNodeVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerConfig]
  }
}

