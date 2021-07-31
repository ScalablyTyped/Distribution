package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultsPerPage extends StObject {
  
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
  
  @scala.inline
  implicit class ResultsPerPageMutableBuilder[Self <: ResultsPerPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResultsPerPage(value: Double): Self = StObject.set(x, "resultsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalResults(value: Double): Self = StObject.set(x, "totalResults", value.asInstanceOf[js.Any])
  }
}
