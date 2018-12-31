package typings
package atFeathersjsSocketDashCommonsLib.socketDashCommonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  def filter(callback: js.Function1[/* connection */ Connection, scala.Boolean]): Channel
  def join(connections: Connection*): this.type
  def leave(connections: Connection*): this.type
  def send(data: js.Any): this.type
}

