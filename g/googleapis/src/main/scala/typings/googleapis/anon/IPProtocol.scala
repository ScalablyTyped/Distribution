package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPProtocol extends js.Object {
  var IPProtocol: js.UndefOr[String] = js.native
  var ports: js.UndefOr[js.Array[String]] = js.native
}

object IPProtocol {
  @scala.inline
  def apply(IPProtocol: String = null, ports: js.Array[String] = null): IPProtocol = {
    val __obj = js.Dynamic.literal()
    if (IPProtocol != null) __obj.updateDynamic("IPProtocol")(IPProtocol.asInstanceOf[js.Any])
    if (ports != null) __obj.updateDynamic("ports")(ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPProtocol]
  }
}

