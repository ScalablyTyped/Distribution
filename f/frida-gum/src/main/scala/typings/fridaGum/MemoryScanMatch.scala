package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryScanMatch extends js.Object {
  /**
    * Memory address where a match was found.
    */
  var address: NativePointer = js.native
  /**
    * Size of this match.
    */
  var size: Double = js.native
}

object MemoryScanMatch {
  @scala.inline
  def apply(address: NativePointer, size: Double): MemoryScanMatch = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryScanMatch]
  }
  @scala.inline
  implicit class MemoryScanMatchOps[Self <: MemoryScanMatch] (val x: Self) extends AnyVal {
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
    def setAddress(value: NativePointer): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

