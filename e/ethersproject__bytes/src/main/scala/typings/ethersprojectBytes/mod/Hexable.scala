package typings.ethersprojectBytes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hexable extends js.Object {
  def toHexString(): String = js.native
}

object Hexable {
  @scala.inline
  def apply(toHexString: () => String): Hexable = {
    val __obj = js.Dynamic.literal(toHexString = js.Any.fromFunction0(toHexString))
    __obj.asInstanceOf[Hexable]
  }
  @scala.inline
  implicit class HexableOps[Self <: Hexable] (val x: Self) extends AnyVal {
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
    def setToHexString(value: () => String): Self = this.set("toHexString", js.Any.fromFunction0(value))
  }
  
}

