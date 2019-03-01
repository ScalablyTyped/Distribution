package typings
package gapiDotTranslateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Detections extends js.Object {
  var detections: js.Array[js.Array[Anon_Confidence]]
}

object Anon_Detections {
  @scala.inline
  def apply(detections: js.Array[js.Array[Anon_Confidence]]): Anon_Detections = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("detections")(detections)
    __obj.asInstanceOf[Anon_Detections]
  }
}

