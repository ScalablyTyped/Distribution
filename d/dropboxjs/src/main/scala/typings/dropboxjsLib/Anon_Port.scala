package typings
package dropboxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Port extends js.Object {
  var port: scala.Double
  var tls: js.UndefOr[js.Object] = js.undefined
}

object Anon_Port {
  @scala.inline
  def apply(port: scala.Double, tls: js.Object = null): Anon_Port = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("port")(port)
    if (tls != null) __obj.updateDynamic("tls")(tls)
    __obj.asInstanceOf[Anon_Port]
  }
}

