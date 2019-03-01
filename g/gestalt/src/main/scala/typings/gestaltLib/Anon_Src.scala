package typings
package gestaltLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Src extends js.Object {
  var src: java.lang.String
  var `type`: gestaltLib.gestaltLibStrings.`video/m3u8` | gestaltLib.gestaltLibStrings.`video/mp4` | gestaltLib.gestaltLibStrings.`video/ogg`
}

object Anon_Src {
  @scala.inline
  def apply(
    src: java.lang.String,
    `type`: gestaltLib.gestaltLibStrings.`video/m3u8` | gestaltLib.gestaltLibStrings.`video/mp4` | gestaltLib.gestaltLibStrings.`video/ogg`
  ): Anon_Src = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[Anon_Src]
  }
}

