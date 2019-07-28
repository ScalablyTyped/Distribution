package typings.dos2unix.dos2unixMod

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
    val __obj = js.Dynamic.literal(error = error, fix = fix, skip = skip)
  
    __obj.asInstanceOf[Stats]
  }
}

