package typings.gestalt

import typings.gestalt.gestaltStrings.videoSlashm3u8
import typings.gestalt.gestaltStrings.videoSlashmp4
import typings.gestalt.gestaltStrings.videoSlashogg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Src extends js.Object {
  var src: String
  var `type`: videoSlashm3u8 | videoSlashmp4 | videoSlashogg
}

object Anon_Src {
  @scala.inline
  def apply(src: String, `type`: videoSlashm3u8 | videoSlashmp4 | videoSlashogg): Anon_Src = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Src]
  }
}

