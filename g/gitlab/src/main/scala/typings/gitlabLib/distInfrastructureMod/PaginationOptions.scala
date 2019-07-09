package typings
package gitlabLib.distInfrastructureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationOptions extends js.Object {
  var current: scala.Double
  var next: scala.Double | scala.Null
  var perPage: scala.Double
  var previous: scala.Double | scala.Null
  var total: scala.Double
  var totalPages: scala.Double
}

object PaginationOptions {
  @scala.inline
  def apply(
    current: scala.Double,
    perPage: scala.Double,
    total: scala.Double,
    totalPages: scala.Double,
    next: scala.Int | scala.Double = null,
    previous: scala.Int | scala.Double = null
  ): PaginationOptions = {
    val __obj = js.Dynamic.literal(current = current, perPage = perPage, total = total, totalPages = totalPages)
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationOptions]
  }
}

