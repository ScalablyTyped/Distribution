package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Children extends js.Object {
  var children: js.UndefOr[js.Array[_]] = js.native
  var value: js.UndefOr[String | Double] = js.native
}

object Children {
  @scala.inline
  def apply(): Children = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Children]
  }
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: js.Any*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[_]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

