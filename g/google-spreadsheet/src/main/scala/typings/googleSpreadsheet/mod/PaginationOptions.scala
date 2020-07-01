package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationOptions extends js.Object {
  var limit: Double
  var offset: Double
}

object PaginationOptions {
  @scala.inline
  def apply(limit: Double, offset: Double): PaginationOptions = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationOptions]
  }
}

