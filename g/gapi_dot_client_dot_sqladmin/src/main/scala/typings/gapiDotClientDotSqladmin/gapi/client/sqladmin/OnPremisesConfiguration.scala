package typings.gapiDotClientDotSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPremisesConfiguration extends js.Object {
  /** The host and port of the on-premises instance in host:port format */
  var hostPort: js.UndefOr[String] = js.undefined
  /** This is always sql#onPremisesConfiguration. */
  var kind: js.UndefOr[String] = js.undefined
}

object OnPremisesConfiguration {
  @scala.inline
  def apply(hostPort: String = null, kind: String = null): OnPremisesConfiguration = {
    val __obj = js.Dynamic.literal()
    if (hostPort != null) __obj.updateDynamic("hostPort")(hostPort)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[OnPremisesConfiguration]
  }
}

