package typings.ffmpegJs.ffmpegWebmMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Video extends js.Object {
  var data: Uint8Array
  var name: String
}

object Video {
  @scala.inline
  def apply(data: Uint8Array, name: String): Video = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Video]
  }
}

