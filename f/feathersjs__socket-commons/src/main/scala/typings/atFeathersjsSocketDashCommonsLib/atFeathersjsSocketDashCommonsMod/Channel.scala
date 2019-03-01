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
    filter: js.Function1[js.Function1[/* connection */ Connection, scala.Boolean], Channel],
    join: js.Function1[/* repeated */ Connection, Channel],
    leave: js.Function1[/* repeated */ Connection, Channel],
    send: js.Function1[js.Any, Channel]
  ): Channel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("join")(join)
    __obj.updateDynamic("leave")(leave)
    __obj.updateDynamic("send")(send)
    __obj.asInstanceOf[Channel]
  }
}

