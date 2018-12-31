package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobConfigurationTableCopy extends js.Object {
  /**
    * [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not
    * exist, BigQuery creates the table. CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result. The
    * default value is CREATE_IF_NEEDED. Creation, truncation and append actions occur as one atomic update upon job completion.
    */
  var createDisposition: js.UndefOr[java.lang.String] = js.undefined
  /** [Experimental] Custom encryption configuration (e.g., Cloud KMS keys). */
  var destinationEncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
  /** [Required] The destination table */
  var destinationTable: js.UndefOr[TableReference] = js.undefined
  /** [Pick one] Source table to copy. */
  var sourceTable: js.UndefOr[TableReference] = js.undefined
  /** [Pick one] Source tables to copy. */
  var sourceTables: js.UndefOr[js.Array[TableReference]] = js.undefined
  /**
    * [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table
    * already exists, BigQuery overwrites the table data. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If
    * the table already exists and contains data, a 'duplicate' error is returned in the job result. The default value is WRITE_EMPTY. Each action is atomic
    * and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and append actions occur as one atomic update upon job
    * completion.
    */
  var writeDisposition: js.UndefOr[java.lang.String] = js.undefined
}

