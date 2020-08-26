package typings.googleCloudStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callback[T, U] extends js.Object {
  var callback: U = js.native
  var options: T = js.native
}

object Callback {
  @scala.inline
  def apply[T, U](callback: U, options: T): Callback[T, U] = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback[T, U]]
  }
  @scala.inline
  implicit class CallbackOps[Self <: Callback[_, _], T, U] (val x: Self with (Callback[T, U])) extends AnyVal {
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
    def setCallback(value: U): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: T): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

