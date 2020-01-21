package typings.googleGax.pathTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseResult extends js.Object {
  var segments: js.Array[Segment]
  var size: Double
}

object ParseResult {
  @scala.inline
  def apply(segments: js.Array[Segment], size: Double): ParseResult = {
    val __obj = js.Dynamic.literal(segments = segments.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParseResult]
  }
}

