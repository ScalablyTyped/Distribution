package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResponse extends js.Object {
  var cacheHit: js.UndefOr[scala.Boolean] = js.undefined
  var errors: js.UndefOr[js.Array[ErrorProto]] = js.undefined
  var jobComplete: js.UndefOr[scala.Boolean] = js.undefined
  var jobReference: js.UndefOr[JobReference] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var numDmlAffectedRows: js.UndefOr[java.lang.String] = js.undefined
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  var rows: js.UndefOr[js.Array[TableRow]] = js.undefined
  var schema: js.UndefOr[TableSchema] = js.undefined
  var totalBytesProcessed: js.UndefOr[java.lang.String] = js.undefined
  var totalRows: js.UndefOr[java.lang.String] = js.undefined
}

object QueryResponse {
  @scala.inline
  def apply(
    cacheHit: js.UndefOr[scala.Boolean] = js.undefined,
    errors: js.Array[ErrorProto] = null,
    jobComplete: js.UndefOr[scala.Boolean] = js.undefined,
    jobReference: JobReference = null,
    kind: java.lang.String = null,
    numDmlAffectedRows: java.lang.String = null,
    pageToken: java.lang.String = null,
    rows: js.Array[TableRow] = null,
    schema: TableSchema = null,
    totalBytesProcessed: java.lang.String = null,
    totalRows: java.lang.String = null
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

