package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$BatchCreatePerfSamplesResponse extends js.Object {
  var perfSamples: js.UndefOr[js.Array[Schema$PerfSample]] = js.native
}

object Schema$BatchCreatePerfSamplesResponse {
  @scala.inline
  def apply(perfSamples: js.Array[Schema$PerfSample] = null): Schema$BatchCreatePerfSamplesResponse = {
    val __obj = js.Dynamic.literal()
    if (perfSamples != null) __obj.updateDynamic("perfSamples")(perfSamples.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchCreatePerfSamplesResponse]
  }
}

