package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Kubernetes Engine service configuration.
  */
@js.native
trait Schema$ServerConfig extends js.Object {
  /**
    * Version of Kubernetes the service deploys by default.
    */
  var defaultClusterVersion: js.UndefOr[String] = js.native
  /**
    * Default image type.
    */
  var defaultImageType: js.UndefOr[String] = js.native
  /**
    * List of valid image types.
    */
  var validImageTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of valid master versions.
    */
  var validMasterVersions: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of valid node upgrade target versions.
    */
  var validNodeVersions: js.UndefOr[js.Array[String]] = js.native
}

object Schema$ServerConfig {
  @scala.inline
  def apply(
    defaultClusterVersion: String = null,
    defaultImageType: String = null,
    validImageTypes: js.Array[String] = null,
    validMasterVersions: js.Array[String] = null,
    validNodeVersions: js.Array[String] = null
  ): Schema$ServerConfig = {
    val __obj = js.Dynamic.literal()
    if (defaultClusterVersion != null) __obj.updateDynamic("defaultClusterVersion")(defaultClusterVersion.asInstanceOf[js.Any])
    if (defaultImageType != null) __obj.updateDynamic("defaultImageType")(defaultImageType.asInstanceOf[js.Any])
    if (validImageTypes != null) __obj.updateDynamic("validImageTypes")(validImageTypes.asInstanceOf[js.Any])
    if (validMasterVersions != null) __obj.updateDynamic("validMasterVersions")(validMasterVersions.asInstanceOf[js.Any])
    if (validNodeVersions != null) __obj.updateDynamic("validNodeVersions")(validNodeVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ServerConfig]
  }
}

