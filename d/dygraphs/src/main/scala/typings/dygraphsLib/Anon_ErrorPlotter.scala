package typings
package dygraphsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorPlotter extends js.Object {
  var errorPlotter: js.Any
  var fillPlotter: js.Any
  var linePlotter: js.Any
}

object Anon_ErrorPlotter {
  @scala.inline
  def apply(errorPlotter: js.Any, fillPlotter: js.Any, linePlotter: js.Any): Anon_ErrorPlotter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorPlotter")(errorPlotter)
    __obj.updateDynamic("fillPlotter")(fillPlotter)
    __obj.updateDynamic("linePlotter")(linePlotter)
    __obj.asInstanceOf[Anon_ErrorPlotter]
  }
}

