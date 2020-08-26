package typings.gapiClientCustomsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormattedSearchTime extends js.Object {
  var formattedSearchTime: js.UndefOr[String] = js.native
  var formattedTotalResults: js.UndefOr[String] = js.native
  var searchTime: js.UndefOr[Double] = js.native
  var totalResults: js.UndefOr[String] = js.native
}

object FormattedSearchTime {
  @scala.inline
  def apply(): FormattedSearchTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormattedSearchTime]
  }
  @scala.inline
  implicit class FormattedSearchTimeOps[Self <: FormattedSearchTime] (val x: Self) extends AnyVal {
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
    def setFormattedSearchTime(value: String): Self = this.set("formattedSearchTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattedSearchTime: Self = this.set("formattedSearchTime", js.undefined)
    @scala.inline
    def setFormattedTotalResults(value: String): Self = this.set("formattedTotalResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattedTotalResults: Self = this.set("formattedTotalResults", js.undefined)
    @scala.inline
    def setSearchTime(value: Double): Self = this.set("searchTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchTime: Self = this.set("searchTime", js.undefined)
    @scala.inline
    def setTotalResults(value: String): Self = this.set("totalResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalResults: Self = this.set("totalResults", js.undefined)
  }
  
}

