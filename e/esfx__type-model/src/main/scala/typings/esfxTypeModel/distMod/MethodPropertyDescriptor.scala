package typings.esfxTypeModel.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodPropertyDescriptor[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends js.Object {
  var configurable: js.UndefOr[Boolean] = js.native
  var enumerable: js.UndefOr[Boolean] = js.native
  var value: T = js.native
  var writable: js.UndefOr[Boolean] = js.native
}

object MethodPropertyDescriptor {
  @scala.inline
  def apply[/* <: js.Function1[/ * repeated * / js.Any, _] */ T](value: T): MethodPropertyDescriptor[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodPropertyDescriptor[T]]
  }
  @scala.inline
  implicit class MethodPropertyDescriptorOps[Self <: MethodPropertyDescriptor[_], /* <: js.Function1[/ * repeated * / js.Any, _] */ T] (val x: Self with MethodPropertyDescriptor[T]) extends AnyVal {
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
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigurable(value: Boolean): Self = this.set("configurable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurable: Self = this.set("configurable", js.undefined)
    @scala.inline
    def setEnumerable(value: Boolean): Self = this.set("enumerable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnumerable: Self = this.set("enumerable", js.undefined)
    @scala.inline
    def setWritable(value: Boolean): Self = this.set("writable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWritable: Self = this.set("writable", js.undefined)
  }
  
}

