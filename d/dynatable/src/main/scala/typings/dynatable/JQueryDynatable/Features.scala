package typings.dynatable.JQueryDynatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Features extends js.Object {
  /**
    * Enable the pagination feature
    *
    * @default true
    */
  var paginate: js.UndefOr[Boolean] = js.native
  /**
    * Enable the perPageSelect feature
    * The perPageSelect will insert a form control filled with the options from `perPageOptions`
    *
    * @default true
    */
  var perPageSelect: js.UndefOr[Boolean] = js.native
  /**
    * Enable the pushState feature
    * Used to update the page URL parameters and cache the query result for the browser's forward- and back-buttons
    *
    * @default true
    */
  var pushState: js.UndefOr[Boolean] = js.native
  /**
    * Enable the recordCount feature
    * When pagination is enabled, dynatable will also show the currently displayed records and the total number of records
    *
    * @default true
    */
  var recordCount: js.UndefOr[Boolean] = js.native
  /**
    * Enable the search feature
    *
    * @default true
    */
  var search: js.UndefOr[Boolean] = js.native
  /**
    * Enable the sorting feature
    *
    * @default true
    */
  var sort: js.UndefOr[Boolean] = js.native
}

object Features {
  @scala.inline
  def apply(): Features = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Features]
  }
  @scala.inline
  implicit class FeaturesOps[Self <: Features] (val x: Self) extends AnyVal {
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
    def setPaginate(value: Boolean): Self = this.set("paginate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaginate: Self = this.set("paginate", js.undefined)
    @scala.inline
    def setPerPageSelect(value: Boolean): Self = this.set("perPageSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerPageSelect: Self = this.set("perPageSelect", js.undefined)
    @scala.inline
    def setPushState(value: Boolean): Self = this.set("pushState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePushState: Self = this.set("pushState", js.undefined)
    @scala.inline
    def setRecordCount(value: Boolean): Self = this.set("recordCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordCount: Self = this.set("recordCount", js.undefined)
    @scala.inline
    def setSearch(value: Boolean): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    @scala.inline
    def setSort(value: Boolean): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
  
}

