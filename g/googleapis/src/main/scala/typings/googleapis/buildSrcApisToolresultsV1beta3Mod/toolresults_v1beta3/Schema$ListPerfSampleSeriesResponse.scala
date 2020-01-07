package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ListPerfSampleSeriesResponse extends js.Object {
  /**
    * The resulting PerfSampleSeries sorted by id
    */
  var perfSampleSeries: js.UndefOr[js.Array[Schema$PerfSampleSeries]] = js.native
}

object Schema$ListPerfSampleSeriesResponse {
  @scala.inline
  def apply(perfSampleSeries: js.Array[Schema$PerfSampleSeries] = null): Schema$ListPerfSampleSeriesResponse = {
    val __obj = js.Dynamic.literal()
    if (perfSampleSeries != null) __obj.updateDynamic("perfSampleSeries")(perfSampleSeries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListPerfSampleSeriesResponse]
  }
}

