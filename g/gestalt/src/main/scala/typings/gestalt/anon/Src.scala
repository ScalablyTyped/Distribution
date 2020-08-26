package typings.gestalt.anon

import typings.gestalt.gestaltStrings.videoSlashm3u8
import typings.gestalt.gestaltStrings.videoSlashmp4
import typings.gestalt.gestaltStrings.videoSlashogg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Src extends js.Object {
  var src: String = js.native
  var `type`: videoSlashm3u8 | videoSlashmp4 | videoSlashogg = js.native
}

object Src {
  @scala.inline
  def apply(src: String, `type`: videoSlashm3u8 | videoSlashmp4 | videoSlashogg): Src = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Src]
  }
  @scala.inline
  implicit class SrcOps[Self <: Src] (val x: Self) extends AnyVal {
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
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: videoSlashm3u8 | videoSlashmp4 | videoSlashogg): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

