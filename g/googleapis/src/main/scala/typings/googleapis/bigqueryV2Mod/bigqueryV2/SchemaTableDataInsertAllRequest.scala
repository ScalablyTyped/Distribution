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
  def apply(
    ignoreUnknownValues: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    rows: js.Array[InsertId] = null,
    skipInvalidRows: js.UndefOr[Boolean] = js.undefined,
    templateSuffix: String = null
  ): SchemaTableDataInsertAllRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreUnknownValues)) __obj.updateDynamic("ignoreUnknownValues")(ignoreUnknownValues.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (!js.isUndefined(skipInvalidRows)) __obj.updateDynamic("skipInvalidRows")(skipInvalidRows.get.asInstanceOf[js.Any])
    if (templateSuffix != null) __obj.updateDynamic("templateSuffix")(templateSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTableDataInsertAllRequest]
  }
}

