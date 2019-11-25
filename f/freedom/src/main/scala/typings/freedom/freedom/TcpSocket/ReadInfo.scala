package typings.freedom.freedom.TcpSocket

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadInfo extends js.Object {
  var data: ArrayBuffer
}

object ReadInfo {
  @scala.inline
  def apply(data: ArrayBuffer): ReadInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadInfo]
  }
}

