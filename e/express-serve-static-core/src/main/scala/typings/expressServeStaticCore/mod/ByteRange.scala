package typings.expressServeStaticCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByteRange extends js.Object {
  var end: Double
  var start: Double
}

object ByteRange {
  @scala.inline
  def apply(end: Double, start: Double): ByteRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteRange]
  }
}

