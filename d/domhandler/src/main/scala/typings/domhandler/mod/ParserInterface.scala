package typings.domhandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParserInterface extends js.Object {
  var endIndex: Double | Null = js.native
  var startIndex: Double | Null = js.native
}

object ParserInterface {
  @scala.inline
  def apply(): ParserInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserInterface]
  }
  @scala.inline
  implicit class ParserInterfaceOps[Self <: ParserInterface] (val x: Self) extends AnyVal {
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
    def setEndIndex(value: Double): Self = this.set("endIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndIndexNull: Self = this.set("endIndex", null)
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartIndexNull: Self = this.set("startIndex", null)
  }
  
}

