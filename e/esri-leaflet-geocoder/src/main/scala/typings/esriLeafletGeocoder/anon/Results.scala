package typings.esriLeafletGeocoder.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Results extends js.Object {
  var results: js.Array[_] = js.native
}

object Results {
  @scala.inline
  def apply(results: js.Array[_]): Results = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
  @scala.inline
  implicit class ResultsOps[Self <: Results] (val x: Self) extends AnyVal {
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
    def setResultsVarargs(value: js.Any*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[_]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
  
}

