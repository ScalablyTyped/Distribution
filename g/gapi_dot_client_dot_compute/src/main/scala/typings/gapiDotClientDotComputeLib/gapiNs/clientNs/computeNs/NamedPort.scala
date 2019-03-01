package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedPort extends js.Object {
  /** The name for this named port. The name must be 1-63 characters long, and comply with RFC1035. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The port number, which can be a value between 1 and 65535. */
  var port: js.UndefOr[scala.Double] = js.undefined
}

object NamedPort {
  @scala.inline
  def apply(name: java.lang.String = null, port: scala.Int | scala.Double = null): NamedPort = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedPort]
  }
}

