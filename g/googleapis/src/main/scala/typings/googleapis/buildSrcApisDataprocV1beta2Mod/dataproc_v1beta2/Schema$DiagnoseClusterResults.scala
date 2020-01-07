package typings.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The location of diagnostic output.
  */
@js.native
trait Schema$DiagnoseClusterResults extends js.Object {
  /**
    * Output only. The Cloud Storage URI of the diagnostic output. The output
    * report is a plain text file with a summary of collected diagnostics.
    */
  var outputUri: js.UndefOr[String] = js.native
}

object Schema$DiagnoseClusterResults {
  @scala.inline
  def apply(outputUri: String = null): Schema$DiagnoseClusterResults = {
    val __obj = js.Dynamic.literal()
    if (outputUri != null) __obj.updateDynamic("outputUri")(outputUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DiagnoseClusterResults]
  }
}

