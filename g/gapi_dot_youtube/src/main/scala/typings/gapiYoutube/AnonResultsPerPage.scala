package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResultsPerPage extends js.Object {
  /**
    * The number of results included in the API response.
    */
  var resultsPerPage: Double
  /**
    * The total number of results in the result set.
    */
  var totalResults: Double
}

object AnonResultsPerPage {
  @scala.inline
  def apply(resultsPerPage: Double, totalResults: Double): AnonResultsPerPage = {
    val __obj = js.Dynamic.literal(resultsPerPage = resultsPerPage.asInstanceOf[js.Any], totalResults = totalResults.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonResultsPerPage]
  }
}

