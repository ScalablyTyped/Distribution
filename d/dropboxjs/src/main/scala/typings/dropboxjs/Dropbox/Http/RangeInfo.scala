package typings.dropboxjs.Dropbox.Http

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeInfo extends js.Object {
  var end: Double
  var size: Double
  var start: Double
}

object RangeInfo {
  @scala.inline
  def apply(end: Double, size: Double, start: Double): RangeInfo = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeInfo]
  }
}

