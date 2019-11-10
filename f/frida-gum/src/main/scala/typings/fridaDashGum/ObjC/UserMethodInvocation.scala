package typings.fridaDashGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserMethodInvocation[D, T, S] extends js.Object {
  var data: D
  var self: T
  var `super`: S
}

object UserMethodInvocation {
  @scala.inline
  def apply[D, T, S](data: D, self: T, `super`: S): UserMethodInvocation[D, T, S] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.updateDynamic("super")(`super`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserMethodInvocation[D, T, S]]
  }
}

