package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request must provide up to a maximum of 5000 samples to be created; a
  * larger sample size will cause an INVALID_ARGUMENT error
  */
@js.native
trait Schema$BatchCreatePerfSamplesRequest extends js.Object {
  /**
    * The set of PerfSamples to create should not include existing timestamps
    */
  var perfSamples: js.UndefOr[js.Array[Schema$PerfSample]] = js.native
}

object Schema$BatchCreatePerfSamplesRequest {
  @scala.inline
  def apply(perfSamples: js.Array[Schema$PerfSample] = null): Schema$BatchCreatePerfSamplesRequest = {
    val __obj = js.Dynamic.literal()
    if (perfSamples != null) __obj.updateDynamic("perfSamples")(perfSamples.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchCreatePerfSamplesRequest]
  }
}

