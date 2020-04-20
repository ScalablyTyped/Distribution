package typings.elm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElmComponent[P] extends js.Object {
  var ports: P
}

object ElmComponent {
  @scala.inline
  def apply[P](ports: P): ElmComponent[P] = {
    val __obj = js.Dynamic.literal(ports = ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElmComponent[P]]
  }
}

