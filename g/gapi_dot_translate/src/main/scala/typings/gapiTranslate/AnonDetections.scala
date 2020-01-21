package typings.gapiTranslate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDetections extends js.Object {
  var detections: js.Array[js.Array[AnonConfidence]]
}

object AnonDetections {
  @scala.inline
  def apply(detections: js.Array[js.Array[AnonConfidence]]): AnonDetections = {
    val __obj = js.Dynamic.literal(detections = detections.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDetections]
  }
}

