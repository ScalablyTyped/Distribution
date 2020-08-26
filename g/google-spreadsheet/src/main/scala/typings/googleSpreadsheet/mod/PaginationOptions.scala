package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationOptions extends js.Object {
  var limit: Double = js.native
  var offset: Double = js.native
}

object PaginationOptions {
  @scala.inline
  def apply(limit: Double, offset: Double): PaginationOptions = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
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
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
  }
  
}

