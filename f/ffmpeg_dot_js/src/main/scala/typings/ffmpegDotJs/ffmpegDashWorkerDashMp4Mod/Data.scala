package typings.ffmpegDotJs.ffmpegDashWorkerDashMp4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: String
  var `type`: String
}

object Data {
  @scala.inline
  def apply(data: String, `type`: String): Data = {
    val __obj = js.Dynamic.literal(data = data)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Data]
  }
}

