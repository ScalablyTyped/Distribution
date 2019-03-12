package typings
package gapiDotClientDotSurveysLib.gapiNs.clientNs.surveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultsResource extends js.Object {
  /**
    * Retrieves any survey results that have been produced so far. Results are formatted as an Excel file. You must add "?alt=media" to the URL as an
    * argument to get results.
    */
  def get(request: gapiDotClientDotSurveysLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[SurveyResults]
}

object ResultsResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotSurveysLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[SurveyResults]
  ): ResultsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[ResultsResource]
  }
}

