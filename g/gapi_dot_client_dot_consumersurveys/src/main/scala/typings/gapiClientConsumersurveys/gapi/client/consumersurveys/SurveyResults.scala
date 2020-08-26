package typings.gapiClientConsumersurveys.gapi.client.consumersurveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurveyResults extends js.Object {
  var status: js.UndefOr[String] = js.native
  var surveyUrlId: js.UndefOr[String] = js.native
}

object SurveyResults {
  @scala.inline
  def apply(): SurveyResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SurveyResults]
  }
  @scala.inline
  implicit class SurveyResultsOps[Self <: SurveyResults] (val x: Self) extends AnyVal {
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
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setSurveyUrlId(value: String): Self = this.set("surveyUrlId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSurveyUrlId: Self = this.set("surveyUrlId", js.undefined)
  }
  
}

