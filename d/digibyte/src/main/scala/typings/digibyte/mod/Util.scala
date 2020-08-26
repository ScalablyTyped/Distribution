package typings.digibyte.mod

import typings.digibyte.anon.Reverse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Util extends js.Object {
  val buffer: Reverse = js.native
}

object Util {
  @scala.inline
  def apply(buffer: Reverse): Util = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Util]
  }
  @scala.inline
  implicit class UtilOps[Self <: Util] (val x: Self) extends AnyVal {
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
    def setBuffer(value: Reverse): Self = this.set("buffer", value.asInstanceOf[js.Any])
  }
  
}

