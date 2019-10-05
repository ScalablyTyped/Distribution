package typings.googleDotVisualization.google.visualization

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
    val __obj = js.Dynamic.literal(color = color, fontName = fontName, fontSize = fontSize)
  
    __obj.asInstanceOf[LabelStyle]
  }
}

