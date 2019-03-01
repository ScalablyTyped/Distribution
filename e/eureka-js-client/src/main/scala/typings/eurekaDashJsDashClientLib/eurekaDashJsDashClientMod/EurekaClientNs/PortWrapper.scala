package typings
package eurekaDashJsDashClientLib.eurekaDashJsDashClientMod.EurekaClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortWrapper extends js.Object {
  var enabled: scala.Boolean
  var port: scala.Double
}

object PortWrapper {
  @scala.inline
  def apply(enabled: scala.Boolean, port: scala.Double): PortWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("port")(port)
    __obj.asInstanceOf[PortWrapper]
  }
}

