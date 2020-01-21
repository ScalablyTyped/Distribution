package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegacyAbac extends js.Object {
  /**
    * Whether the ABAC authorizer is enabled for this cluster. When enabled,
    * identities in the system, including service accounts, nodes, and
    * controllers, will have statically granted permissions beyond those
    * provided by the RBAC configuration or IAM.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object LegacyAbac {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): LegacyAbac = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacyAbac]
  }
}

