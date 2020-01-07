package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The named port. For example: .
  */
@js.native
trait Schema$NamedPort extends js.Object {
  /**
    * The name for this named port. The name must be 1-63 characters long, and
    * comply with RFC1035.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The port number, which can be a value between 1 and 65535.
    */
  var port: js.UndefOr[Double] = js.native
}

object Schema$NamedPort {
  @scala.inline
  def apply(name: String = null, port: Int | Double = null): Schema$NamedPort = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NamedPort]
  }
}

