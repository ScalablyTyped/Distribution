package typings.devtoolsProtocol.mod.Protocol.Browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHistogramsResponse extends js.Object {
  /**
    * Histograms.
    */
  var histograms: js.Array[Histogram] = js.native
}

object GetHistogramsResponse {
  @scala.inline
  def apply(histograms: js.Array[Histogram]): GetHistogramsResponse = {
    val __obj = js.Dynamic.literal(histograms = histograms.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHistogramsResponse]
  }
  @scala.inline
  implicit class GetHistogramsResponseOps[Self <: GetHistogramsResponse] (val x: Self) extends AnyVal {
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
    def setHistogramsVarargs(value: Histogram*): Self = this.set("histograms", js.Array(value :_*))
    @scala.inline
    def setHistograms(value: js.Array[Histogram]): Self = this.set("histograms", value.asInstanceOf[js.Any])
  }
  
}

