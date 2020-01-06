package typings.figma.figmaMod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorStop extends js.Object {
  val color: RGBA
  val position: Double
}

object ColorStop {
  @scala.inline
  def apply(color: RGBA, position: Double): ColorStop = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ColorStop]
  }
}

