package typings.dndCore.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitCoordsPayload extends js.Object {
  var clientOffset: XYCoord | Null = js.native
  var sourceClientOffset: XYCoord | Null = js.native
}

object InitCoordsPayload {
  @scala.inline
  def apply(): InitCoordsPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitCoordsPayload]
  }
  @scala.inline
  implicit class InitCoordsPayloadOps[Self <: InitCoordsPayload] (val x: Self) extends AnyVal {
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
    def setClientOffset(value: XYCoord): Self = this.set("clientOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientOffsetNull: Self = this.set("clientOffset", null)
    @scala.inline
    def setSourceClientOffset(value: XYCoord): Self = this.set("sourceClientOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceClientOffsetNull: Self = this.set("sourceClientOffset", null)
  }
  
}

