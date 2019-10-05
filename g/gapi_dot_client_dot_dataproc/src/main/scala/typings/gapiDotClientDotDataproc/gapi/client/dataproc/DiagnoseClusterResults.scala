package typings.gapiDotClientDotDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagnoseClusterResults extends js.Object {
  /** Output-only. The Google Cloud Storage URI of the diagnostic output. The output report is a plain text file with a summary of collected diagnostics. */
  var outputUri: js.UndefOr[String] = js.undefined
}

object DiagnoseClusterResults {
  @scala.inline
  def apply(outputUri: String = null): DiagnoseClusterResults = {
    val __obj = js.Dynamic.literal()
    if (outputUri != null) __obj.updateDynamic("outputUri")(outputUri)
    __obj.asInstanceOf[DiagnoseClusterResults]
  }
}

