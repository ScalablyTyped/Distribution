package typings.gapiDotClientDotContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkPolicy extends js.Object {
  /** Whether network policy is enabled on the cluster. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** The selected network policy provider. */
  var provider: js.UndefOr[String] = js.undefined
}

object NetworkPolicy {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, provider: String = null): NetworkPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (provider != null) __obj.updateDynamic("provider")(provider)
    __obj.asInstanceOf[NetworkPolicy]
  }
}

