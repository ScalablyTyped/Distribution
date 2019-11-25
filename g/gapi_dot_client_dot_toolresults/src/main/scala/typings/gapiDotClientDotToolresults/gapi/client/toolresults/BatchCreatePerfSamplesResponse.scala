package typings.gapiDotClientDotToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchCreatePerfSamplesResponse extends js.Object {
  var perfSamples: js.UndefOr[js.Array[PerfSample]] = js.undefined
}

object BatchCreatePerfSamplesResponse {
  @scala.inline
  def apply(perfSamples: js.Array[PerfSample] = null): BatchCreatePerfSamplesResponse = {
    val __obj = js.Dynamic.literal()
    if (perfSamples != null) __obj.updateDynamic("perfSamples")(perfSamples.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreatePerfSamplesResponse]
  }
}

