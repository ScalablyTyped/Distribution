package typings.exceljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFrom extends js.Object {
  var from: String | AnonColumn
  var to: String | AnonColumn
}

object AnonFrom {
  @scala.inline
  def apply(from: String | AnonColumn, to: String | AnonColumn): AnonFrom = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFrom]
  }
}

