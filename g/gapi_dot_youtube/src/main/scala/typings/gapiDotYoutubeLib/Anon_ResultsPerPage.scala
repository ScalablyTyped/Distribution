package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ResultsPerPage extends js.Object {
  /**
    * The number of results included in the API response.
    */
  var resultsPerPage: scala.Double
  /**
    * The total number of results in the result set.
    */
  var totalResults: scala.Double
}

object Anon_ResultsPerPage {
  @scala.inline
  def apply(resultsPerPage: scala.Double, totalResults: scala.Double): Anon_ResultsPerPage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resultsPerPage")(resultsPerPage)
    __obj.updateDynamic("totalResults")(totalResults)
    __obj.asInstanceOf[Anon_ResultsPerPage]
  }
}

