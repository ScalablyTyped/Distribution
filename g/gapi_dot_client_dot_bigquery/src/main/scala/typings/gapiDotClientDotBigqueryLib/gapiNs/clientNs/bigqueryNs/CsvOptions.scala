package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CsvOptions extends js.Object {
  /**
               * [Optional] Indicates if BigQuery should accept rows that are missing trailing optional columns. If true, BigQuery treats missing trailing columns as
               * null values. If false, records with missing trailing columns are treated as bad records, and if there are too many bad records, an invalid error is
               * returned in the job result. The default value is false.
               */
  var allowJaggedRows: js.UndefOr[scala.Boolean] = js.undefined
  /** [Optional] Indicates if BigQuery should allow quoted data sections that contain newline characters in a CSV file. The default value is false. */
  var allowQuotedNewlines: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * [Optional] The character encoding of the data. The supported values are UTF-8 or ISO-8859-1. The default value is UTF-8. BigQuery decodes the data
               * after the raw, binary data has been split using the values of the quote and fieldDelimiter properties.
               */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /**
               * [Optional] The separator for fields in a CSV file. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded
               * string to split the data in its raw, binary state. BigQuery also supports the escape sequence "\t" to specify a tab separator. The default value is a
               * comma (',').
               */
  var fieldDelimiter: js.UndefOr[java.lang.String] = js.undefined
  /**
               * [Optional] The value that is used to quote data sections in a CSV file. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first
               * byte of the encoded string to split the data in its raw, binary state. The default value is a double-quote ('"'). If your data does not contain quoted
               * sections, set the property value to an empty string. If your data contains quoted newline characters, you must also set the allowQuotedNewlines
               * property to true.
               */
  var quote: js.UndefOr[java.lang.String] = js.undefined
  /**
               * [Optional] The number of rows at the top of a CSV file that BigQuery will skip when reading the data. The default value is 0. This property is useful
               * if you have header rows in the file that should be skipped.
               */
  var skipLeadingRows: js.UndefOr[java.lang.String] = js.undefined
}

