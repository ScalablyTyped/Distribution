package typings.ffmpegJs.mod.Worker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMessageOptions extends js.Object {
  var data: Data
}

object OnMessageOptions {
  @scala.inline
  def apply(data: Data): OnMessageOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnMessageOptions]
  }
}

