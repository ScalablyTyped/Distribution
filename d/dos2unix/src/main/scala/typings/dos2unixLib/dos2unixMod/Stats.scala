package typings
package dos2unixLib.dos2unixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  var error: scala.Double
  var fix: scala.Double
  var skip: scala.Double
}

object Stats {
  @scala.inline
  def apply(error: scala.Double, fix: scala.Double, skip: scala.Double): Stats = {
    val __obj = js.Dynamic.literal(error = error, fix = fix, skip = skip)
  
    __obj.asInstanceOf[Stats]
  }
}

