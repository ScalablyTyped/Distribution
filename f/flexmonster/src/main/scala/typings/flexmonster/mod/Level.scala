package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Level extends js.Object {
  var caption: String = js.native
  var uniqueName: String = js.native
}

object Level {
  @scala.inline
  def apply(caption: String, uniqueName: String): Level = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
  @scala.inline
  implicit class LevelOps[Self <: Level] (val x: Self) extends AnyVal {
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
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def setUniqueName(value: String): Self = this.set("uniqueName", value.asInstanceOf[js.Any])
  }
  
}

