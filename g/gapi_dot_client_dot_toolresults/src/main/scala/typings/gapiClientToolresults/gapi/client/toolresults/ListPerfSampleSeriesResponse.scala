package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPerfSampleSeriesResponse extends js.Object {
  /** The resulting PerfSampleSeries sorted by id */
  var perfSampleSeries: js.UndefOr[js.Array[PerfSampleSeries]] = js.native
}

object ListPerfSampleSeriesResponse {
  @scala.inline
  def apply(): ListPerfSampleSeriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPerfSampleSeriesResponse]
  }
  @scala.inline
  implicit class ListPerfSampleSeriesResponseOps[Self <: ListPerfSampleSeriesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPerfSampleSeriesVarargs(value: PerfSampleSeries*): Self = this.set("perfSampleSeries", js.Array(value :_*))
    @scala.inline
    def setPerfSampleSeries(value: js.Array[PerfSampleSeries]): Self = this.set("perfSampleSeries", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerfSampleSeries: Self = this.set("perfSampleSeries", js.undefined)
  }
  
}

