package typings.gapiDotClientDotContainer.gapiNs.clientNs.containerNs

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
    if (defaultClusterVersion != null) __obj.updateDynamic("defaultClusterVersion")(defaultClusterVersion)
    if (defaultImageType != null) __obj.updateDynamic("defaultImageType")(defaultImageType)
    if (validImageTypes != null) __obj.updateDynamic("validImageTypes")(validImageTypes)
    if (validMasterVersions != null) __obj.updateDynamic("validMasterVersions")(validMasterVersions)
    if (validNodeVersions != null) __obj.updateDynamic("validNodeVersions")(validNodeVersions)
    __obj.asInstanceOf[ServerConfig]
  }
}

