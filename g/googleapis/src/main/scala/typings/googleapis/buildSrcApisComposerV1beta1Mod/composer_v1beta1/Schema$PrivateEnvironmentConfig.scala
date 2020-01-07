package typings.googleapis.buildSrcApisComposerV1beta1Mod.composer_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration information for configuring a Private IP Cloud Composer
  * environment.
  */
@js.native
trait Schema$PrivateEnvironmentConfig extends js.Object {
  /**
    * Optional. If `true`, a Private IP Cloud Composer environment is created.
    * If this field is true, `use_ip_aliases` must be true.
    */
  var enablePrivateEnvironment: js.UndefOr[Boolean] = js.native
  /**
    * Optional. Configuration for the private GKE cluster for a Private IP
    * Cloud Composer environment.
    */
  var privateClusterConfig: js.UndefOr[Schema$PrivateClusterConfig] = js.native
}

object Schema$PrivateEnvironmentConfig {
  @scala.inline
  def apply(
    enablePrivateEnvironment: js.UndefOr[Boolean] = js.undefined,
    privateClusterConfig: Schema$PrivateClusterConfig = null
  ): Schema$PrivateEnvironmentConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enablePrivateEnvironment)) __obj.updateDynamic("enablePrivateEnvironment")(enablePrivateEnvironment.asInstanceOf[js.Any])
    if (privateClusterConfig != null) __obj.updateDynamic("privateClusterConfig")(privateClusterConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PrivateEnvironmentConfig]
  }
}

