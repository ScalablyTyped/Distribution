package typings.dygraphs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorPlotter extends js.Object {
  var errorPlotter: js.Any
  var fillPlotter: js.Any
  var linePlotter: js.Any
}

object ErrorPlotter {
  @scala.inline
  def apply(errorPlotter: js.Any, fillPlotter: js.Any, linePlotter: js.Any): ErrorPlotter = {
    val __obj = js.Dynamic.literal(errorPlotter = errorPlotter.asInstanceOf[js.Any], fillPlotter = fillPlotter.asInstanceOf[js.Any], linePlotter = linePlotter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorPlotter]
  }
}

