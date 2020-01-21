package typings.dropboxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPort extends js.Object {
  var port: Double
  var tls: js.UndefOr[js.Object] = js.undefined
}

object AnonPort {
  @scala.inline
  def apply(port: Double, tls: js.Object = null): AnonPort = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (tls != null) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPort]
  }
}

