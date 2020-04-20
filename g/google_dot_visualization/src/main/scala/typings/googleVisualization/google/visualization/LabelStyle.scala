package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelStyle extends js.Object {
  var color: String
  var fontName: String
  var fontSize: String
}

object LabelStyle {
  @scala.inline
  def apply(color: String, fontName: String, fontSize: String): LabelStyle = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontName = fontName.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelStyle]
  }
}

