package typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobConfigurationTableCopy extends js.Object {
  var createDisposition: js.UndefOr[String] = js.undefined
  var destinationEncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
  var destinationTable: js.UndefOr[TableReference] = js.undefined
  var sourceTable: js.UndefOr[TableReference] = js.undefined
  var sourceTables: js.UndefOr[js.Array[TableReference]] = js.undefined
  var writeDisposition: js.UndefOr[String] = js.undefined
}

object JobConfigurationTableCopy {
  @scala.inline
  def apply(
    createDisposition: String = null,
    destinationEncryptionConfiguration: EncryptionConfiguration = null,
    destinationTable: TableReference = null,
    sourceTable: TableReference = null,
    sourceTables: js.Array[TableReference] = null,
    writeDisposition: String = null
  ): JobConfigurationTableCopy = {
    val __obj = js.Dynamic.literal()
    if (createDisposition != null) __obj.updateDynamic("createDisposition")(createDisposition)
    if (destinationEncryptionConfiguration != null) __obj.updateDynamic("destinationEncryptionConfiguration")(destinationEncryptionConfiguration)
    if (destinationTable != null) __obj.updateDynamic("destinationTable")(destinationTable)
    if (sourceTable != null) __obj.updateDynamic("sourceTable")(sourceTable)
    if (sourceTables != null) __obj.updateDynamic("sourceTables")(sourceTables)
    if (writeDisposition != null) __obj.updateDynamic("writeDisposition")(writeDisposition)
    __obj.asInstanceOf[JobConfigurationTableCopy]
  }
}

