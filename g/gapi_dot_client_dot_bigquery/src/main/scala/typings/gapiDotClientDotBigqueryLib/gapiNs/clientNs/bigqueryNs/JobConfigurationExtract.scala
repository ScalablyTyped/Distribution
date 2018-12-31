package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobConfigurationExtract extends js.Object {
  /** [Optional] The compression type to use for exported files. Possible values include GZIP and NONE. The default value is NONE. */
  var compression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Optional] The exported file format. Possible values include CSV, NEWLINE_DELIMITED_JSON and AVRO. The default value is CSV. Tables with nested or
    * repeated fields cannot be exported as CSV.
    */
  var destinationFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Pick one] DEPRECATED: Use destinationUris instead, passing only one URI as necessary. The fully-qualified Google Cloud Storage URI where the extracted
    * table should be written.
    */
  var destinationUri: js.UndefOr[java.lang.String] = js.undefined
  /** [Pick one] A list of fully-qualified Google Cloud Storage URIs where the extracted table should be written. */
  var destinationUris: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** [Optional] Delimiter to use between fields in the exported data. Default is ',' */
  var fieldDelimiter: js.UndefOr[java.lang.String] = js.undefined
  /** [Optional] Whether to print out a header row in the results. Default is true. */
  var printHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** [Required] A reference to the table being exported. */
  var sourceTable: js.UndefOr[TableReference] = js.undefined
}

