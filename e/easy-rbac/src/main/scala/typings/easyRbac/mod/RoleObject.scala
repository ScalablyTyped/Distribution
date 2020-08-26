package typings.easyRbac.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleObject extends js.Object {
  var name: String = js.native
  def when(params: js.Object): js.Promise[Boolean] = js.native
}

object RoleObject {
  @scala.inline
  def apply(name: String, when: js.Object => js.Promise[Boolean]): RoleObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], when = js.Any.fromFunction1(when))
    __obj.asInstanceOf[RoleObject]
  }
  @scala.inline
  implicit class RoleObjectOps[Self <: RoleObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhen(value: js.Object => js.Promise[Boolean]): Self = this.set("when", js.Any.fromFunction1(value))
  }
  
}

