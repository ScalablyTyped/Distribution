package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedPort extends js.Object {
  /** The name for this named port. The name must be 1-63 characters long, and comply with RFC1035. */
  var name: js.UndefOr[String] = js.undefined
  /** The port number, which can be a value between 1 and 65535. */
  var port: js.UndefOr[Double] = js.undefined
}

object NamedPort {
  @scala.inline
  def apply(name: String = null, port: js.UndefOr[Double] = js.undefined): NamedPort = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedPort]
  }
}

