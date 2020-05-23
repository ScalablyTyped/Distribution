package typings.gapiTranslate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Detections extends js.Object {
  var detections: js.Array[js.Array[Confidence]]
}

object Detections {
  @scala.inline
  def apply(detections: js.Array[js.Array[Confidence]]): Detections = {
    val __obj = js.Dynamic.literal(detections = detections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Detections]
  }
}

