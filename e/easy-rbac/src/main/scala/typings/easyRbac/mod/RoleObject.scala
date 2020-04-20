package typings.easyRbac.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleObject extends js.Object {
  var name: String
  def when(params: js.Object): js.Promise[Boolean]
}

object RoleObject {
  @scala.inline
  def apply(name: String, when: js.Object => js.Promise[Boolean]): RoleObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], when = js.Any.fromFunction1(when))
    __obj.asInstanceOf[RoleObject]
  }
}

