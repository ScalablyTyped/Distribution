package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobStatistics3 extends js.Object {
  /**
    * [Output-only] The number of bad records encountered. Note that if the job has failed because of more bad records encountered than the maximum allowed
    * in the load job configuration, then this number can be less than the total number of bad records present in the input data.
    */
  var badRecords: js.UndefOr[java.lang.String] = js.undefined
  /** [Output-only] Number of bytes of source data in a load job. */
  var inputFileBytes: js.UndefOr[java.lang.String] = js.undefined
  /** [Output-only] Number of source files in a load job. */
  var inputFiles: js.UndefOr[java.lang.String] = js.undefined
  /** [Output-only] Size of the loaded data in bytes. Note that while a load job is in the running state, this value may change. */
  var outputBytes: js.UndefOr[java.lang.String] = js.undefined
  /** [Output-only] Number of rows imported in a load job. Note that while an import job is in the running state, this value may change. */
  var outputRows: js.UndefOr[java.lang.String] = js.undefined
}

