package typings.dynatable.JQueryDynatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Params extends js.Object {
  /**
    * @default 'dynatable'
    */
  var dynatable: js.UndefOr[String] = js.native
  /**
    * @default 'offset'
    */
  var offset: js.UndefOr[String] = js.native
  /**
    * @default 'page'
    */
  var page: js.UndefOr[String] = js.native
  /**
    * @default 'perPage'
    */
  var perPage: js.UndefOr[String] = js.native
  /**
    * @default 'queries'
    */
  var queries: js.UndefOr[String] = js.native
  /**
    * @default 'queryRecordCount'
    */
  var queryRecordCount: js.UndefOr[String] = js.native
  /**
    * @default null
    */
  var record: js.UndefOr[js.Object] = js.native
  /**
    * @default 'records'
    */
  var records: js.UndefOr[String] = js.native
  /**
    * @default 'sorts'
    */
  var sorts: js.UndefOr[String] = js.native
  /**
    * @default 'totalRecordCount'
    */
  var totalRecordCount: js.UndefOr[String] = js.native
}

object Params {
  @scala.inline
  def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  @scala.inline
  implicit class ParamsOps[Self <: Params] (val x: Self) extends AnyVal {
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
    def setDynatable(value: String): Self = this.set("dynatable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynatable: Self = this.set("dynatable", js.undefined)
    @scala.inline
    def setOffset(value: String): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPage(value: String): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setPerPage(value: String): Self = this.set("perPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerPage: Self = this.set("perPage", js.undefined)
    @scala.inline
    def setQueries(value: String): Self = this.set("queries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueries: Self = this.set("queries", js.undefined)
    @scala.inline
    def setQueryRecordCount(value: String): Self = this.set("queryRecordCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryRecordCount: Self = this.set("queryRecordCount", js.undefined)
    @scala.inline
    def setRecord(value: js.Object): Self = this.set("record", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecord: Self = this.set("record", js.undefined)
    @scala.inline
    def setRecords(value: String): Self = this.set("records", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecords: Self = this.set("records", js.undefined)
    @scala.inline
    def setSorts(value: String): Self = this.set("sorts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSorts: Self = this.set("sorts", js.undefined)
    @scala.inline
    def setTotalRecordCount(value: String): Self = this.set("totalRecordCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalRecordCount: Self = this.set("totalRecordCount", js.undefined)
  }
  
}

