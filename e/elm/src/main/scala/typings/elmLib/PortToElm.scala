package typings
package elmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortToElm[V] extends js.Object {
  def send(value: V): scala.Unit
}

