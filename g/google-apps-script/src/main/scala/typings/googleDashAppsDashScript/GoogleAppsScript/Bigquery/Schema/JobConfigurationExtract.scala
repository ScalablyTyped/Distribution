package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobConfigurationExtract extends js.Object {
  var compression: js.UndefOr[String] = js.undefined
  var destinationFormat: js.UndefOr[String] = js.undefined
  var destinationUri: js.UndefOr[String] = js.undefined
  var destinationUris: js.UndefOr[js.Array[String]] = js.undefined
  var fieldDelimiter: js.UndefOr[String] = js.undefined
  var printHeader: js.UndefOr[Boolean] = js.undefined
  var sourceTable: js.UndefOr[TableReference] = js.undefined
}

object JobConfigurationExtract {
  @scala.inline
  def apply(
    compression: String = null,
    destinationFormat: String = null,
    destinationUri: String = null,
    destinationUris: js.Array[String] = null,
    fieldDelimiter: String = null,
    printHeader: js.UndefOr[Boolean] = js.undefined,
    sourceTable: TableReference = null
  ): JobConfigurationExtract = {
    val __obj = js.Dynamic.literal()
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (destinationFormat != null) __obj.updateDynamic("destinationFormat")(destinationFormat)
    if (destinationUri != null) __obj.updateDynamic("destinationUri")(destinationUri)
    if (destinationUris != null) __obj.updateDynamic("destinationUris")(destinationUris)
    if (fieldDelimiter != null) __obj.updateDynamic("fieldDelimiter")(fieldDelimiter)
    if (!js.isUndefined(printHeader)) __obj.updateDynamic("printHeader")(printHeader)
    if (sourceTable != null) __obj.updateDynamic("sourceTable")(sourceTable)
    __obj.asInstanceOf[JobConfigurationExtract]
  }
}

