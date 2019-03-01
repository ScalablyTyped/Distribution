package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagnoseClusterResults extends js.Object {
  /** Output-only. The Google Cloud Storage URI of the diagnostic output. The output report is a plain text file with a summary of collected diagnostics. */
  var outputUri: js.UndefOr[java.lang.String] = js.undefined
}

object DiagnoseClusterResults {
  @scala.inline
  def apply(outputUri: java.lang.String = null): DiagnoseClusterResults = {
    val __obj = js.Dynamic.literal()
    if (outputUri != null) __obj.updateDynamic("outputUri")(outputUri)
    __obj.asInstanceOf[DiagnoseClusterResults]
  }
}

