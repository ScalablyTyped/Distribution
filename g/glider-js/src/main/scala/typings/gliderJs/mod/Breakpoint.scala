package typings.gliderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Breakpoint extends js.Object {
  var breakpoint: Double
  var settings: Options
}

object Breakpoint {
  @scala.inline
  def apply(breakpoint: Double, settings: Options): Breakpoint = {
    val __obj = js.Dynamic.literal(breakpoint = breakpoint.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breakpoint]
  }
}

