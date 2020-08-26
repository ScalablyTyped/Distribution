package typings.dplayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DPlayerDanmakuItem extends js.Object {
  var color: String = js.native
  var text: String = js.native
  var `type`: DirectionType = js.native
}

object DPlayerDanmakuItem {
  @scala.inline
  def apply(color: String, text: String, `type`: DirectionType): DPlayerDanmakuItem = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DPlayerDanmakuItem]
  }
  @scala.inline
  implicit class DPlayerDanmakuItemOps[Self <: DPlayerDanmakuItem] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: DirectionType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

