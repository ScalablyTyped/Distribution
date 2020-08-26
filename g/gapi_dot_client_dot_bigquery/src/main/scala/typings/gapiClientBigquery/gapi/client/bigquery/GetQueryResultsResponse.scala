package typings.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQueryResultsResponse extends js.Object {
  /** Whether the query result was fetched from the query cache. */
  var cacheHit: js.UndefOr[Boolean] = js.native
  /**
    * [Output-only] The first errors or warnings encountered during the running of the job. The final message includes the number of errors that caused the
    * process to stop. Errors here do not necessarily mean that the job has completed or was unsuccessful.
    */
  var errors: js.UndefOr[js.Array[ErrorProto]] = js.native
  /** A hash of this response. */
  var etag: js.UndefOr[String] = js.native
  /** Whether the query has completed or not. If rows or totalRows are present, this will always be true. If this is false, totalRows will not be available. */
  var jobComplete: js.UndefOr[Boolean] = js.native
  /**
    * Reference to the BigQuery Job that was created to run the query. This field will be present even if the original request timed out, in which case
    * GetQueryResults can be used to read the results once the query has completed. Since this API only returns the first page of results, subsequent pages
    * can be fetched via the same mechanism (GetQueryResults).
    */
  var jobReference: js.UndefOr[JobReference] = js.native
  /** The resource type of the response. */
  var kind: js.UndefOr[String] = js.native
  /** [Output-only] The number of rows affected by a DML statement. Present only for DML statements INSERT, UPDATE or DELETE. */
  var numDmlAffectedRows: js.UndefOr[String] = js.native
  /** A token used for paging results. */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * An object with as many results as can be contained within the maximum permitted reply size. To get any additional rows, you can call GetQueryResults
    * and specify the jobReference returned above. Present only when the query completes successfully.
    */
  var rows: js.UndefOr[js.Array[TableRow]] = js.native
  /** The schema of the results. Present only when the query completes successfully. */
  var schema: js.UndefOr[TableSchema] = js.native
  /** The total number of bytes processed for this query. */
  var totalBytesProcessed: js.UndefOr[String] = js.native
  /**
    * The total number of rows in the complete query result set, which can be more than the number of rows in this single page of results. Present only when
    * the query completes successfully.
    */
  var totalRows: js.UndefOr[String] = js.native
}

object GetQueryResultsResponse {
  @scala.inline
  def apply(): GetQueryResultsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQueryResultsResponse]
  }
  @scala.inline
  implicit class GetQueryResultsResponseOps[Self <: GetQueryResultsResponse] (val x: Self) extends AnyVal {
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
    def setCacheHit(value: Boolean): Self = this.set("cacheHit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheHit: Self = this.set("cacheHit", js.undefined)
    @scala.inline
    def setErrorsVarargs(value: ErrorProto*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[ErrorProto]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setJobComplete(value: Boolean): Self = this.set("jobComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobComplete: Self = this.set("jobComplete", js.undefined)
    @scala.inline
    def setJobReference(value: JobReference): Self = this.set("jobReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobReference: Self = this.set("jobReference", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNumDmlAffectedRows(value: String): Self = this.set("numDmlAffectedRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumDmlAffectedRows: Self = this.set("numDmlAffectedRows", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setRowsVarargs(value: TableRow*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[TableRow]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setSchema(value: TableSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    @scala.inline
    def setTotalBytesProcessed(value: String): Self = this.set("totalBytesProcessed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalBytesProcessed: Self = this.set("totalBytesProcessed", js.undefined)
    @scala.inline
    def setTotalRows(value: String): Self = this.set("totalRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalRows: Self = this.set("totalRows", js.undefined)
  }
  
}

