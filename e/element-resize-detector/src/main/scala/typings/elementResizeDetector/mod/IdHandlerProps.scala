package typings.elementResizeDetector.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdHandlerProps extends js.Object {
  def get(element: HTMLElement, readonly: Boolean): String = js.native
  def set(element: HTMLElement): String = js.native
}

object IdHandlerProps {
  @scala.inline
  def apply(get: (HTMLElement, Boolean) => String, set: HTMLElement => String): IdHandlerProps = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[IdHandlerProps]
  }
  @scala.inline
  implicit class IdHandlerPropsOps[Self <: IdHandlerProps] (val x: Self) extends AnyVal {
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
    def setGet(value: (HTMLElement, Boolean) => String): Self = this.set("get", js.Any.fromFunction2(value))
    @scala.inline
    def setSet(value: HTMLElement => String): Self = this.set("set", js.Any.fromFunction1(value))
  }
  
}

