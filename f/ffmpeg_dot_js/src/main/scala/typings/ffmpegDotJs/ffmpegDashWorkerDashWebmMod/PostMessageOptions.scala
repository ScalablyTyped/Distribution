package typings.ffmpegDotJs.ffmpegDashWorkerDashWebmMod

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
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostMessageOptions]
  }
}

