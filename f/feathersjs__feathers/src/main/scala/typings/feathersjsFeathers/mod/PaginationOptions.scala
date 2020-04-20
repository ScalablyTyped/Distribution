package typings.feathersjsFeathers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationOptions extends js.Object {
  var default: Double
  var max: Double
}

object PaginationOptions {
  @scala.inline
  def apply(default: Double, max: Double): PaginationOptions = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationOptions]
  }
}

