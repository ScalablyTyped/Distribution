package typings.dropboxjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cancelable extends js.Object {
  var cancelable: Boolean = js.native
}

object Cancelable {
  @scala.inline
  def apply(cancelable: Boolean): Cancelable = {
    val __obj = js.Dynamic.literal(cancelable = cancelable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancelable]
  }
  @scala.inline
  implicit class CancelableOps[Self <: Cancelable] (val x: Self) extends AnyVal {
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
    def setCancelable(value: Boolean): Self = this.set("cancelable", value.asInstanceOf[js.Any])
  }
  
}

