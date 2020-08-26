package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvocationListener extends js.Object {
  /**
    * Detaches listener previously attached through `Interceptor#attach()`.
    */
  def detach(): Unit = js.native
}

object InvocationListener {
  @scala.inline
  def apply(detach: () => Unit): InvocationListener = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach))
    __obj.asInstanceOf[InvocationListener]
  }
  @scala.inline
  implicit class InvocationListenerOps[Self <: InvocationListener] (val x: Self) extends AnyVal {
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
    def setDetach(value: () => Unit): Self = this.set("detach", js.Any.fromFunction0(value))
  }
  
}

