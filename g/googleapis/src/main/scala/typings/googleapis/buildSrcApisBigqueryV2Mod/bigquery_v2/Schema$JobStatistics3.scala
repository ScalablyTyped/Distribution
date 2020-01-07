package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$JobStatistics3 extends js.Object {
  /**
    * [Output-only] The number of bad records encountered. Note that if the job
    * has failed because of more bad records encountered than the maximum
    * allowed in the load job configuration, then this number can be less than
    * the total number of bad records present in the input data.
    */
  var badRecords: js.UndefOr[String] = js.native
  /**
    * [Output-only] Number of bytes of source data in a load job.
    */
  var inputFileBytes: js.UndefOr[String] = js.native
  /**
    * [Output-only] Number of source files in a load job.
    */
  var inputFiles: js.UndefOr[String] = js.native
  /**
    * [Output-only] Size of the loaded data in bytes. Note that while a load
    * job is in the running state, this value may change.
    */
  var outputBytes: js.UndefOr[String] = js.native
  /**
    * [Output-only] Number of rows imported in a load job. Note that while an
    * import job is in the running state, this value may change.
    */
  var outputRows: js.UndefOr[String] = js.native
}

object Schema$JobStatistics3 {
  @scala.inline
  def apply(
    badRecords: String = null,
    inputFileBytes: String = null,
    inputFiles: String = null,
    outputBytes: String = null,
    outputRows: String = null
  ): Schema$JobStatistics3 = {
    val __obj = js.Dynamic.literal()
    if (badRecords != null) __obj.updateDynamic("badRecords")(badRecords.asInstanceOf[js.Any])
    if (inputFileBytes != null) __obj.updateDynamic("inputFileBytes")(inputFileBytes.asInstanceOf[js.Any])
    if (inputFiles != null) __obj.updateDynamic("inputFiles")(inputFiles.asInstanceOf[js.Any])
    if (outputBytes != null) __obj.updateDynamic("outputBytes")(outputBytes.asInstanceOf[js.Any])
    if (outputRows != null) __obj.updateDynamic("outputRows")(outputRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$JobStatistics3]
  }
}

