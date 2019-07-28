package typings.gapiDotClientDotToolresults.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchCreatePerfSamplesRequest extends js.Object {
  /** The set of PerfSamples to create should not include existing timestamps */
  var perfSamples: js.UndefOr[js.Array[PerfSample]] = js.undefined
}

object BatchCreatePerfSamplesRequest {
  @scala.inline
  def apply(perfSamples: js.Array[PerfSample] = null): BatchCreatePerfSamplesRequest = {
    val __obj = js.Dynamic.literal()
    if (perfSamples != null) __obj.updateDynamic("perfSamples")(perfSamples)
    __obj.asInstanceOf[BatchCreatePerfSamplesRequest]
  }
}

