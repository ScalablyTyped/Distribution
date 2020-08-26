package typings.gitlab.requestHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationOptions extends js.Object {
  var current: Double = js.native
  var next: Double | Null = js.native
  var perPage: Double = js.native
  var previous: Double | Null = js.native
  var total: Double = js.native
  var totalPages: Double = js.native
}

object PaginationOptions {
  @scala.inline
  def apply(current: Double, perPage: Double, total: Double, totalPages: Double): PaginationOptions = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], perPage = perPage.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationOptions]
  }
  @scala.inline
  implicit class PaginationOptionsOps[Self <: PaginationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrent(value: Double): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setPerPage(value: Double): Self = this.set("perPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalPages(value: Double): Self = this.set("totalPages", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: Double): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextNull: Self = this.set("next", null)
    @scala.inline
    def setPrevious(value: Double): Self = this.set("previous", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousNull: Self = this.set("previous", null)
  }
  
}

