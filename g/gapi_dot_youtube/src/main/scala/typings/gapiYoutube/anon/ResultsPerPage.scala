package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultsPerPage extends js.Object {
  /**
    * The number of results included in the API response.
    */
  var resultsPerPage: Double
  /**
    * The total number of results in the result set.
    */
  var totalResults: Double
}

object ResultsPerPage {
  @scala.inline
  def apply(resultsPerPage: Double, totalResults: Double): ResultsPerPage = {
    val __obj = js.Dynamic.literal(resultsPerPage = resultsPerPage.asInstanceOf[js.Any], totalResults = totalResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultsPerPage]
  }
}

