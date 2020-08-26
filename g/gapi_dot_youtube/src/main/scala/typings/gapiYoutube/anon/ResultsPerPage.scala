package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultsPerPage extends js.Object {
  /**
    * The number of results included in the API response.
    */
  var resultsPerPage: Double = js.native
  /**
    * The total number of results in the result set.
    */
  var totalResults: Double = js.native
}

object ResultsPerPage {
  @scala.inline
  def apply(resultsPerPage: Double, totalResults: Double): ResultsPerPage = {
    val __obj = js.Dynamic.literal(resultsPerPage = resultsPerPage.asInstanceOf[js.Any], totalResults = totalResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultsPerPage]
  }
  @scala.inline
  implicit class ResultsPerPageOps[Self <: ResultsPerPage] (val x: Self) extends AnyVal {
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
    def setResultsPerPage(value: Double): Self = this.set("resultsPerPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalResults(value: Double): Self = this.set("totalResults", value.asInstanceOf[js.Any])
  }
  
}

