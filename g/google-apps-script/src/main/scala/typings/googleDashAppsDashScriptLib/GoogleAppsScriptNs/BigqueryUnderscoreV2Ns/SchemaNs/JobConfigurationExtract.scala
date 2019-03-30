package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobConfigurationExtract extends js.Object {
  var compression: js.UndefOr[java.lang.String] = js.undefined
  var destinationFormat: js.UndefOr[java.lang.String] = js.undefined
  var destinationUri: js.UndefOr[java.lang.String] = js.undefined
  var destinationUris: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var fieldDelimiter: js.UndefOr[java.lang.String] = js.undefined
  var printHeader: js.UndefOr[scala.Boolean] = js.undefined
  var sourceTable: js.UndefOr[TableReference] = js.undefined
}

object JobConfigurationExtract {
  @scala.inline
  def apply(
    compression: java.lang.String = null,
    destinationFormat: java.lang.String = null,
    destinationUri: java.lang.String = null,
    destinationUris: js.Array[java.lang.String] = null,
    fieldDelimiter: java.lang.String = null,
    printHeader: js.UndefOr[scala.Boolean] = js.undefined,
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

