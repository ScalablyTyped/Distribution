package typings.googleGax

import typings.googleGax.pathTemplateMod.Segment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSegments extends js.Object {
  var segments: js.Array[Segment]
  var size: Double
}

object AnonSegments {
  @scala.inline
  def apply(segments: js.Array[Segment], size: Double): AnonSegments = {
    val __obj = js.Dynamic.literal(segments = segments.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSegments]
  }
}

