package typings.gitlab.distTypesCoreInfrastructureRequestHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationOptions extends js.Object {
  var current: Double
  var next: Double | Null
  var perPage: Double
  var previous: Double | Null
  var total: Double
  var totalPages: Double
}

object PaginationOptions {
  @scala.inline
  def apply(
    current: Double,
    perPage: Double,
    total: Double,
    totalPages: Double,
    next: Int | Double = null,
    previous: Int | Double = null
  ): PaginationOptions = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], perPage = perPage.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationOptions]
  }
}

