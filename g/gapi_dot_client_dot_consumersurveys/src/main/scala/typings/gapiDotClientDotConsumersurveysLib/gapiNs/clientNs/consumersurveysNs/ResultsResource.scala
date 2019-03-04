package typings
package gapiDotClientDotConsumersurveysLib.gapiNs.clientNs.consumersurveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultsResource extends js.Object {
  /**
    * Retrieves any survey results that have been produced so far. Results are formatted as an Excel file. You must add "?alt=media" to the URL as an
    * argument to get results.
    */
  def get(request: gapiDotClientDotConsumersurveysLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[SurveyResults]
}

object ResultsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotConsumersurveysLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[SurveyResults]
    ]
  ): ResultsResource = {
    val __obj = js.Dynamic.literal(get = get)
  
    __obj.asInstanceOf[ResultsResource]
  }
}

