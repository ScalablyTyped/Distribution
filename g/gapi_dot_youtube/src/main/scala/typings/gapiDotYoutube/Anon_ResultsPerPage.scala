package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ResultsPerPage extends js.Object {
  /**
    * The number of results included in the API response.
    */
  var resultsPerPage: Double
  /**
    * The total number of results in the result set.
    */
  var totalResults: Double
}

object Anon_ResultsPerPage {
  @scala.inline
  def apply(resultsPerPage: Double, totalResults: Double): Anon_ResultsPerPage = {
    val __obj = js.Dynamic.literal(resultsPerPage = resultsPerPage, totalResults = totalResults)
  
    __obj.asInstanceOf[Anon_ResultsPerPage]
  }
}

