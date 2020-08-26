package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterCriteria extends js.Object {
  var excludeChats: js.UndefOr[Boolean] = js.native
  var from: js.UndefOr[String] = js.native
  var hasAttachment: js.UndefOr[Boolean] = js.native
  var negatedQuery: js.UndefOr[String] = js.native
  var query: js.UndefOr[String] = js.native
  var size: js.UndefOr[Double] = js.native
  var sizeComparison: js.UndefOr[String] = js.native
  var subject: js.UndefOr[String] = js.native
  var to: js.UndefOr[String] = js.native
}

object FilterCriteria {
  @scala.inline
  def apply(): FilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterCriteria]
  }
  @scala.inline
  implicit class FilterCriteriaOps[Self <: FilterCriteria] (val x: Self) extends AnyVal {
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
    def setExcludeChats(value: Boolean): Self = this.set("excludeChats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeChats: Self = this.set("excludeChats", js.undefined)
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setHasAttachment(value: Boolean): Self = this.set("hasAttachment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasAttachment: Self = this.set("hasAttachment", js.undefined)
    @scala.inline
    def setNegatedQuery(value: String): Self = this.set("negatedQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegatedQuery: Self = this.set("negatedQuery", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSizeComparison(value: String): Self = this.set("sizeComparison", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeComparison: Self = this.set("sizeComparison", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

