package typings.gapiDotClientDotBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResponse extends js.Object {
  /** Whether the query result was fetched from the query cache. */
  var cacheHit: js.UndefOr[Boolean] = js.undefined
  /**
    * [Output-only] The first errors or warnings encountered during the running of the job. The final message includes the number of errors that caused the
    * process to stop. Errors here do not necessarily mean that the job has completed or was unsuccessful.
    */
  var errors: js.UndefOr[js.Array[ErrorProto]] = js.undefined
  /** Whether the query has completed or not. If rows or totalRows are present, this will always be true. If this is false, totalRows will not be available. */
  var jobComplete: js.UndefOr[Boolean] = js.undefined
  /**
    * Reference to the Job that was created to run the query. This field will be present even if the original request timed out, in which case
    * GetQueryResults can be used to read the results once the query has completed. Since this API only returns the first page of results, subsequent pages
    * can be fetched via the same mechanism (GetQueryResults).
    */
  var jobReference: js.UndefOr[JobReference] = js.undefined
  /** The resource type. */
  var kind: js.UndefOr[String] = js.undefined
  /** [Output-only] The number of rows affected by a DML statement. Present only for DML statements INSERT, UPDATE or DELETE. */
  var numDmlAffectedRows: js.UndefOr[String] = js.undefined
  /** A token used for paging results. */
  var pageToken: js.UndefOr[String] = js.undefined
  /**
    * An object with as many results as can be contained within the maximum permitted reply size. To get any additional rows, you can call GetQueryResults
    * and specify the jobReference returned above.
    */
  var rows: js.UndefOr[js.Array[TableRow]] = js.undefined
  /** The schema of the results. Present only when the query completes successfully. */
  var schema: js.UndefOr[TableSchema] = js.undefined
  /**
    * The total number of bytes processed for this query. If this query was a dry run, this is the number of bytes that would be processed if the query were
    * run.
    */
  var totalBytesProcessed: js.UndefOr[String] = js.undefined
  /** The total number of rows in the complete query result set, which can be more than the number of rows in this single page of results. */
  var totalRows: js.UndefOr[String] = js.undefined
}

object QueryResponse {
  @scala.inline
  def apply(
    cacheHit: js.UndefOr[Boolean] = js.undefined,
    errors: js.Array[ErrorProto] = null,
    jobComplete: js.UndefOr[Boolean] = js.undefined,
    jobReference: JobReference = null,
    kind: String = null,
    numDmlAffectedRows: String = null,
    pageToken: String = null,
    rows: js.Array[TableRow] = null,
    schema: TableSchema = null,
    totalBytesProcessed: String = null,
    totalRows: String = null
  ): QueryResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheHit)) __obj.updateDynamic("cacheHit")(cacheHit)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (!js.isUndefined(jobComplete)) __obj.updateDynamic("jobComplete")(jobComplete)
    if (jobReference != null) __obj.updateDynamic("jobReference")(jobReference)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (numDmlAffectedRows != null) __obj.updateDynamic("numDmlAffectedRows")(numDmlAffectedRows)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (totalBytesProcessed != null) __obj.updateDynamic("totalBytesProcessed")(totalBytesProcessed)
    if (totalRows != null) __obj.updateDynamic("totalRows")(totalRows)
    __obj.asInstanceOf[QueryResponse]
  }
}

