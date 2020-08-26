package typings.gapiClientSurveys.gapi.client.surveys

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSurveys.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultsResource extends js.Object {
  /**
    * Retrieves any survey results that have been produced so far. Results are formatted as an Excel file. You must add "?alt=media" to the URL as an
    * argument to get results.
    */
  def get(request: Key): Request[SurveyResults] = js.native
}

object ResultsResource {
  @scala.inline
  def apply(get: Key => Request[SurveyResults]): ResultsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[ResultsResource]
  }
  @scala.inline
  implicit class ResultsResourceOps[Self <: ResultsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Key => Request[SurveyResults]): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

