package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompositeFilter extends js.Object {
  /**
    * The list of filters to combine.
    * Must contain at least one filter.
    */
  var filters: js.UndefOr[js.Array[Filter]] = js.native
  /** The operator for combining multiple filters. */
  var op: js.UndefOr[String] = js.native
}

object CompositeFilter {
  @scala.inline
  def apply(): CompositeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositeFilter]
  }
  @scala.inline
  implicit class CompositeFilterOps[Self <: CompositeFilter] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: Filter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[Filter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setOp(value: String): Self = this.set("op", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOp: Self = this.set("op", js.undefined)
  }
  
}

