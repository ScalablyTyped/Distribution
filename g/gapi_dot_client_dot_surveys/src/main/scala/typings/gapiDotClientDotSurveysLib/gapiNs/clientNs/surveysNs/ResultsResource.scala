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
  def get(request: gapiDotClientDotSurveysLib.Anon_SurveyUrlId): gapiDotClientLib.gapiNs.clientNs.Request[SurveyResults]
}

