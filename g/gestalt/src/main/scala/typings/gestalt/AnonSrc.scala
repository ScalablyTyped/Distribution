package typings.gestalt

import typings.gestalt.gestaltStrings.videoSlashm3u8
import typings.gestalt.gestaltStrings.videoSlashmp4
import typings.gestalt.gestaltStrings.videoSlashogg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSrc extends js.Object {
  var src: String
  var `type`: videoSlashm3u8 | videoSlashmp4 | videoSlashogg
}

object AnonSrc {
  @scala.inline
  def apply(src: String, `type`: videoSlashm3u8 | videoSlashmp4 | videoSlashogg): AnonSrc = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSrc]
  }
}

