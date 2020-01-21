package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaJobConfigurationTableCopy extends js.Object {
  /**
    * [Optional] Specifies whether the job is allowed to create new tables. The
    * following values are supported: CREATE_IF_NEEDED: If the table does not
    * exist, BigQuery creates the table. CREATE_NEVER: The table must already
    * exist. If it does not, a &#39;notFound&#39; error is returned in the job
    * result. The default value is CREATE_IF_NEEDED. Creation, truncation and
    * append actions occur as one atomic update upon job completion.
    */
  var createDisposition: js.UndefOr[String] = js.native
  /**
    * Custom encryption configuration (e.g., Cloud KMS keys).
    */
  var destinationEncryptionConfiguration: js.UndefOr[SchemaEncryptionConfiguration] = js.native
  /**
    * [Required] The destination table
    */
  var destinationTable: js.UndefOr[SchemaTableReference] = js.native
  /**
    * [Pick one] Source table to copy.
    */
  var sourceTable: js.UndefOr[SchemaTableReference] = js.native
  /**
    * [Pick one] Source tables to copy.
    */
  var sourceTables: js.UndefOr[js.Array[SchemaTableReference]] = js.native
  /**
    * [Optional] Specifies the action that occurs if the destination table
    * already exists. The following values are supported: WRITE_TRUNCATE: If
    * the table already exists, BigQuery overwrites the table data.
    * WRITE_APPEND: If the table already exists, BigQuery appends the data to
    * the table. WRITE_EMPTY: If the table already exists and contains data, a
    * &#39;duplicate&#39; error is returned in the job result. The default
    * value is WRITE_EMPTY. Each action is atomic and only occurs if BigQuery
    * is able to complete the job successfully. Creation, truncation and append
    * actions occur as one atomic update upon job completion.
    */
  var writeDisposition: js.UndefOr[String] = js.native
}

object SchemaJobConfigurationTableCopy {
  @scala.inline
  def apply(
    createDisposition: String = null,
    destinationEncryptionConfiguration: SchemaEncryptionConfiguration = null,
    destinationTable: SchemaTableReference = null,
    sourceTable: SchemaTableReference = null,
    sourceTables: js.Array[SchemaTableReference] = null,
    writeDisposition: String = null
  ): SchemaJobConfigurationTableCopy = {
    val __obj = js.Dynamic.literal()
    if (createDisposition != null) __obj.updateDynamic("createDisposition")(createDisposition.asInstanceOf[js.Any])
    if (destinationEncryptionConfiguration != null) __obj.updateDynamic("destinationEncryptionConfiguration")(destinationEncryptionConfiguration.asInstanceOf[js.Any])
    if (destinationTable != null) __obj.updateDynamic("destinationTable")(destinationTable.asInstanceOf[js.Any])
    if (sourceTable != null) __obj.updateDynamic("sourceTable")(sourceTable.asInstanceOf[js.Any])
    if (sourceTables != null) __obj.updateDynamic("sourceTables")(sourceTables.asInstanceOf[js.Any])
    if (writeDisposition != null) __obj.updateDynamic("writeDisposition")(writeDisposition.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaJobConfigurationTableCopy]
  }
}

