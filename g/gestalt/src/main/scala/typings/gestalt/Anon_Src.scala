package typings.gestalt

import typings.gestalt.gestaltStrings.`video/m3u8`
import typings.gestalt.gestaltStrings.`video/mp4`
import typings.gestalt.gestaltStrings.`video/ogg`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Src extends js.Object {
  var src: String
  var `type`: `video/m3u8` | `video/mp4` | `video/ogg`
}

object Anon_Src {
  @scala.inline
  def apply(src: String, `type`: `video/m3u8` | `video/mp4` | `video/ogg`): Anon_Src = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Src]
  }
}

