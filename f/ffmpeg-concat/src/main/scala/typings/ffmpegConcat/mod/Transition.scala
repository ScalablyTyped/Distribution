package typings.ffmpegConcat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transition extends js.Object {
  var duration: Double
  var name: String
  var params: js.UndefOr[js.Any] = js.undefined
}

object Transition {
  @scala.inline
  def apply(duration: Double, name: String, params: js.Any = null): Transition = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transition]
  }
}

