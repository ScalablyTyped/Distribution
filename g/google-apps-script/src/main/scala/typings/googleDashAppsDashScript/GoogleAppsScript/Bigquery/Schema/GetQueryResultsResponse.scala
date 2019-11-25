package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetQueryResultsResponse extends js.Object {
  var cacheHit: js.UndefOr[Boolean] = js.undefined
  var errors: js.UndefOr[js.Array[ErrorProto]] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var jobComplete: js.UndefOr[Boolean] = js.undefined
  var jobReference: js.UndefOr[JobReference] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var numDmlAffectedRows: js.UndefOr[String] = js.undefined
  var pageToken: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[js.Array[TableRow]] = js.undefined
  var schema: js.UndefOr[TableSchema] = js.undefined
  var totalBytesProcessed: js.UndefOr[String] = js.undefined
  var totalRows: js.UndefOr[String] = js.undefined
}

object GetQueryResultsResponse {
  @scala.inline
  def apply(
    cacheHit: js.UndefOr[Boolean] = js.undefined,
    errors: js.Array[ErrorProto] = null,
    etag: String = null,
    jobComplete: js.UndefOr[Boolean] = js.undefined,
    jobReference: JobReference = null,
    kind: String = null,
    numDmlAffectedRows: String = null,
    pageToken: String = null,
    rows: js.Array[TableRow] = null,
    schema: TableSchema = null,
    totalBytesProcessed: String = null,
    totalRows: String = null
  ): GetQueryResultsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheHit)) __obj.updateDynamic("cacheHit")(cacheHit.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (!js.isUndefined(jobComplete)) __obj.updateDynamic("jobComplete")(jobComplete.asInstanceOf[js.Any])
    if (jobReference != null) __obj.updateDynamic("jobReference")(jobReference.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (numDmlAffectedRows != null) __obj.updateDynamic("numDmlAffectedRows")(numDmlAffectedRows.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (totalBytesProcessed != null) __obj.updateDynamic("totalBytesProcessed")(totalBytesProcessed.asInstanceOf[js.Any])
    if (totalRows != null) __obj.updateDynamic("totalRows")(totalRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueryResultsResponse]
  }
}

