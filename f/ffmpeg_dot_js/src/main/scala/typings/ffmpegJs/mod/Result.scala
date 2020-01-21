package typings.ffmpegJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var MEMFS: js.Array[Video]
}

object Result {
  @scala.inline
  def apply(MEMFS: js.Array[Video]): Result = {
    val __obj = js.Dynamic.literal(MEMFS = MEMFS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
}

