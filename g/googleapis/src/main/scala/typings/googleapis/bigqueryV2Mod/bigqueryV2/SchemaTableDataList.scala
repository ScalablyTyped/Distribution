package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTableDataList extends js.Object {
  /**
    * A hash of this page of results.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The resource type of the response.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A token used for paging results. Providing this token instead of the
    * startIndex parameter can help you retrieve stable results when an
    * underlying table is changing.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Rows of results.
    */
  var rows: js.UndefOr[js.Array[SchemaTableRow]] = js.native
  /**
    * The total number of rows in the complete table.
    */
  var totalRows: js.UndefOr[String] = js.native
}

object SchemaTableDataList {
  @scala.inline
  def apply(): SchemaTableDataList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableDataList]
  }
  @scala.inline
  implicit class SchemaTableDataListOps[Self <: SchemaTableDataList] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setRowsVarargs(value: SchemaTableRow*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[SchemaTableRow]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setTotalRows(value: String): Self = this.set("totalRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalRows: Self = this.set("totalRows", js.undefined)
  }
  
}

