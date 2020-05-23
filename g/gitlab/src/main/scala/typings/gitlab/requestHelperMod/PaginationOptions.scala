package typings.gitlab.requestHelperMod

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
    next: Double = null.asInstanceOf[Double],
    previous: Double = null.asInstanceOf[Double]
  ): PaginationOptions = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], perPage = perPage.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationOptions]
  }
}

