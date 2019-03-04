package typings
package freedomLib.freedomNs.TcpSocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadInfo extends js.Object {
  var data: stdLib.ArrayBuffer
}

object ReadInfo {
  @scala.inline
  def apply(data: stdLib.ArrayBuffer): ReadInfo = {
    val __obj = js.Dynamic.literal(data = data)
  
    __obj.asInstanceOf[ReadInfo]
  }
}

