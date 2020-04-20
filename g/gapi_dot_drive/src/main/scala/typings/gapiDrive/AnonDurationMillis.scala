package typings.gapiDrive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDurationMillis extends js.Object {
  var durationMillis: Double
  var height: Double
  var width: Double
}

object AnonDurationMillis {
  @scala.inline
  def apply(durationMillis: Double, height: Double, width: Double): AnonDurationMillis = {
    val __obj = js.Dynamic.literal(durationMillis = durationMillis.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDurationMillis]
  }
}

