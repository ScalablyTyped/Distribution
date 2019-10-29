package typings.exceljs.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Protection extends js.Object {
  var locked: Boolean
}

object Protection {
  @scala.inline
  def apply(locked: Boolean): Protection = {
    val __obj = js.Dynamic.literal(locked = locked)
  
    __obj.asInstanceOf[Protection]
  }
}

