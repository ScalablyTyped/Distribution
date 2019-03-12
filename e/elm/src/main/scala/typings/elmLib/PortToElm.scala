package typings
package elmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortToElm[V] extends js.Object {
  def send(value: V): scala.Unit
}

object PortToElm {
  @scala.inline
  def apply[V](send: V => scala.Unit): PortToElm[V] = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
  
    __obj.asInstanceOf[PortToElm[V]]
  }
}

