package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.anon.InsertId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTableDataInsertAllRequest extends js.Object {
  /**
    * [Optional] Accept rows that contain values that do not match the schema.
    * The unknown values are ignored. Default is false, which treats unknown
    * values as errors.
    */
  var ignoreUnknownValues: js.UndefOr[Boolean] = js.native
  /**
    * The resource type of the response.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The rows to insert.
    */
  var rows: js.UndefOr[js.Array[InsertId]] = js.native
  /**
    * [Optional] Insert all valid rows of a request, even if invalid rows
    * exist. The default value is false, which causes the entire request to
    * fail if any invalid rows exist.
    */
  var skipInvalidRows: js.UndefOr[Boolean] = js.native
  /**
    * If specified, treats the destination table as a base template, and
    * inserts the rows into an instance table named
    * &quot;{destination}{templateSuffix}&quot;. BigQuery will manage creation
    * of the instance table, using the schema of the base template table. See
    * https://cloud.google.com/bigquery/streaming-data-into-bigquery#template-tables
    * for considerations when working with templates tables.
    */
  var templateSuffix: js.UndefOr[String] = js.native
}

object SchemaTableDataInsertAllRequest {
  @scala.inline
  def apply(): SchemaTableDataInsertAllRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableDataInsertAllRequest]
  }
  @scala.inline
  implicit class SchemaTableDataInsertAllRequestOps[Self <: SchemaTableDataInsertAllRequest] (val x: Self) extends AnyVal {
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
    def setIgnoreUnknownValues(value: Boolean): Self = this.set("ignoreUnknownValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreUnknownValues: Self = this.set("ignoreUnknownValues", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setRowsVarargs(value: InsertId*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[InsertId]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setSkipInvalidRows(value: Boolean): Self = this.set("skipInvalidRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipInvalidRows: Self = this.set("skipInvalidRows", js.undefined)
    @scala.inline
    def setTemplateSuffix(value: String): Self = this.set("templateSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateSuffix: Self = this.set("templateSuffix", js.undefined)
  }
  
}

