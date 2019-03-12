package typings
package atFeathersjsSocketDashCommonsLib.atFeathersjsSocketDashCommonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  def filter(callback: js.Function1[/* connection */ Connection, scala.Boolean]): Channel
  def join(connections: Connection*): this.type
  def leave(connections: Connection*): this.type
  def send(data: js.Any): this.type
}

object Channel {
  @scala.inline
  def apply(
    filter: js.Function1[/* connection */ Connection, scala.Boolean] => Channel,
    join: /* repeated */ Connection => Channel,
    leave: /* repeated */ Connection => Channel,
    send: js.Any => Channel
  ): Channel = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), join = js.Any.fromFunction1(join), leave = js.Any.fromFunction1(leave), send = js.Any.fromFunction1(send))
  
    __obj.asInstanceOf[Channel]
  }
}

