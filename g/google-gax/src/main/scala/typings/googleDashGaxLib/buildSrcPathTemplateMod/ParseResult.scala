package typings
package googleDashGaxLib.buildSrcPathTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseResult extends js.Object {
  var segments: js.Array[Segment]
  var size: scala.Double
}

object ParseResult {
  @scala.inline
  def apply(segments: js.Array[Segment], size: scala.Double): ParseResult = {
    val __obj = js.Dynamic.literal(segments = segments, size = size)
  
    __obj.asInstanceOf[ParseResult]
  }
}

