package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for Binary Authorization.
  */
@js.native
trait Schema$BinaryAuthorization extends js.Object {
  /**
    * Enable Binary Authorization for this cluster. If enabled, all container
    * images will be validated by Google Binauthz.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object Schema$BinaryAuthorization {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): Schema$BinaryAuthorization = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BinaryAuthorization]
  }
}

