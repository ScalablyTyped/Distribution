package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseClass extends BaseNode {
  var body: ClassBody = js.native
  var superClass: js.UndefOr[Expression | Null] = js.native
}

object BaseClass {
  @scala.inline
  def apply(body: ClassBody, `type`: String): BaseClass = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseClass]
  }
  @scala.inline
  implicit class BaseClassOps[Self <: BaseClass] (val x: Self) extends AnyVal {
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
    def setBody(value: ClassBody): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuperClass(value: Expression): Self = this.set("superClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuperClass: Self = this.set("superClass", js.undefined)
    @scala.inline
    def setSuperClassNull: Self = this.set("superClass", null)
  }
  
}

