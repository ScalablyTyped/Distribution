package typings.eurekaDashJsDashClient.eurekaDashJsDashClientMod.EurekaClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortWrapper extends js.Object {
  var enabled: Boolean
  var port: Double
}

object PortWrapper {
  @scala.inline
  def apply(enabled: Boolean, port: Double): PortWrapper = {
    val __obj = js.Dynamic.literal(enabled = enabled, port = port)
  
    __obj.asInstanceOf[PortWrapper]
  }
}

