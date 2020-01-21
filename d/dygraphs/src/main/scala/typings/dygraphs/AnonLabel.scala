package typings.dygraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  var label: String
  var v: Double
}

object AnonLabel {
  @scala.inline
  def apply(label: String, v: Double): AnonLabel = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLabel]
  }
}

