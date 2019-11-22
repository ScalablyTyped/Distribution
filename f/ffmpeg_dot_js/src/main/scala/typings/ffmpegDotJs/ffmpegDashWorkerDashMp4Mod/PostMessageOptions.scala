package typings.ffmpegDotJs.ffmpegDashWorkerDashMp4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostMessageOptions extends js.Object {
  var arguments: js.Array[String]
  var `type`: String
}

object PostMessageOptions {
  @scala.inline
  def apply(arguments: js.Array[String], `type`: String): PostMessageOptions = {
    val __obj = js.Dynamic.literal(arguments = arguments)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PostMessageOptions]
  }
}

