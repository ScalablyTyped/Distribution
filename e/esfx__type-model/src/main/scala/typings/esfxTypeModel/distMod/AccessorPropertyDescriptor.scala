package typings.esfxTypeModel.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessorPropertyDescriptor[T] extends js.Object {
  var configurable: js.UndefOr[Boolean] = js.native
  var enumerable: js.UndefOr[Boolean] = js.native
  var get: js.UndefOr[js.Function0[T]] = js.native
  var set: js.UndefOr[js.Function1[/* v */ T, Unit]] = js.native
}

object AccessorPropertyDescriptor {
  @scala.inline
  def apply[T](): AccessorPropertyDescriptor[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessorPropertyDescriptor[T]]
  }
  @scala.inline
  implicit class AccessorPropertyDescriptorOps[Self <: AccessorPropertyDescriptor[_], T] (val x: Self with AccessorPropertyDescriptor[T]) extends AnyVal {
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
    def setConfigurable(value: Boolean): Self = this.set("configurable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurable: Self = this.set("configurable", js.undefined)
    @scala.inline
    def setEnumerable(value: Boolean): Self = this.set("enumerable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnumerable: Self = this.set("enumerable", js.undefined)
    @scala.inline
    def setGet(value: () => T): Self = this.set("get", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    @scala.inline
    def setSet(value: /* v */ T => Unit): Self = this.set("set", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
  }
  
}

