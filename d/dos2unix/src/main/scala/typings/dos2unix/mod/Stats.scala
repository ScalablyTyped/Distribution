package typings.dos2unix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  var error: Double
  var fix: Double
  var skip: Double
}

object Stats {
  @scala.inline
  def apply(error: Double, fix: Double, skip: Double): Stats = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], fix = fix.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
}

