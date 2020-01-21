package typings.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobConfigurationExtract extends js.Object {
  /** [Optional] The compression type to use for exported files. Possible values include GZIP and NONE. The default value is NONE. */
  var compression: js.UndefOr[String] = js.undefined
  /**
    * [Optional] The exported file format. Possible values include CSV, NEWLINE_DELIMITED_JSON and AVRO. The default value is CSV. Tables with nested or
    * repeated fields cannot be exported as CSV.
    */
  var destinationFormat: js.UndefOr[String] = js.undefined
  /**
    * [Pick one] DEPRECATED: Use destinationUris instead, passing only one URI as necessary. The fully-qualified Google Cloud Storage URI where the extracted
    * table should be written.
    */
  var destinationUri: js.UndefOr[String] = js.undefined
  /** [Pick one] A list of fully-qualified Google Cloud Storage URIs where the extracted table should be written. */
  var destinationUris: js.UndefOr[js.Array[String]] = js.undefined
  /** [Optional] Delimiter to use between fields in the exported data. Default is ',' */
  var fieldDelimiter: js.UndefOr[String] = js.undefined
  /** [Optional] Whether to print out a header row in the results. Default is true. */
  var printHeader: js.UndefOr[Boolean] = js.undefined
  /** [Required] A reference to the table being exported. */
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
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (destinationFormat != null) __obj.updateDynamic("destinationFormat")(destinationFormat.asInstanceOf[js.Any])
    if (destinationUri != null) __obj.updateDynamic("destinationUri")(destinationUri.asInstanceOf[js.Any])
    if (destinationUris != null) __obj.updateDynamic("destinationUris")(destinationUris.asInstanceOf[js.Any])
    if (fieldDelimiter != null) __obj.updateDynamic("fieldDelimiter")(fieldDelimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(printHeader)) __obj.updateDynamic("printHeader")(printHeader.asInstanceOf[js.Any])
    if (sourceTable != null) __obj.updateDynamic("sourceTable")(sourceTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobConfigurationExtract]
  }
}

