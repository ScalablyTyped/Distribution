package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KernedWidth extends js.Object {
  var kernedWidth: Double
  var width: Double
}

object KernedWidth {
  @scala.inline
  def apply(kernedWidth: Double, width: Double): KernedWidth = {
    val __obj = js.Dynamic.literal(kernedWidth = kernedWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernedWidth]
  }
}

