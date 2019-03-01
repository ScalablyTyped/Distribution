package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerConfig extends js.Object {
  /** Version of Kubernetes the service deploys by default. */
  var defaultClusterVersion: js.UndefOr[java.lang.String] = js.undefined
  /** Default image type. */
  var defaultImageType: js.UndefOr[java.lang.String] = js.undefined
  /** List of valid image types. */
  var validImageTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** List of valid master versions. */
  var validMasterVersions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** List of valid node upgrade target versions. */
  var validNodeVersions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ServerConfig {
  @scala.inline
  def apply(
    defaultClusterVersion: java.lang.String = null,
    defaultImageType: java.lang.String = null,
    validImageTypes: js.Array[java.lang.String] = null,
    validMasterVersions: js.Array[java.lang.String] = null,
    validNodeVersions: js.Array[java.lang.String] = null
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

