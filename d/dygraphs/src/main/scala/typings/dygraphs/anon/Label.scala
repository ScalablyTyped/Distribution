package typings.dygraphs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var label: String
  var v: Double
}

object Label {
  @scala.inline
  def apply(label: String, v: Double): Label = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

