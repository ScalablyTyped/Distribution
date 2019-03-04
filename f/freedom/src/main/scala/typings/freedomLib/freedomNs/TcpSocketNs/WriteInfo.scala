package typings
package freedomLib.freedomNs.TcpSocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteInfo extends js.Object {
  var bytesWritten: scala.Double
}

object WriteInfo {
  @scala.inline
  def apply(bytesWritten: scala.Double): WriteInfo = {
    val __obj = js.Dynamic.literal(bytesWritten = bytesWritten)
  
    __obj.asInstanceOf[WriteInfo]
  }
}

