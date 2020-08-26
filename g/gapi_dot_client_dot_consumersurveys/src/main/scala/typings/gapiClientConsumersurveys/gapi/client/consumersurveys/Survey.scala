package typings.gapiClientConsumersurveys.gapi.client.consumersurveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Survey extends js.Object {
  var audience: js.UndefOr[SurveyAudience] = js.native
  var cost: js.UndefOr[SurveyCost] = js.native
  var customerData: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var owners: js.UndefOr[js.Array[String]] = js.native
  var questions: js.UndefOr[js.Array[SurveyQuestion]] = js.native
  var rejectionReason: js.UndefOr[SurveyRejection] = js.native
  var state: js.UndefOr[String] = js.native
  var surveyUrlId: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var wantedResponseCount: js.UndefOr[Double] = js.native
}

object Survey {
  @scala.inline
  def apply(): Survey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Survey]
  }
  @scala.inline
  implicit class SurveyOps[Self <: Survey] (val x: Self) extends AnyVal {
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
    def setAudience(value: SurveyAudience): Self = this.set("audience", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    @scala.inline
    def setCost(value: SurveyCost): Self = this.set("cost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCost: Self = this.set("cost", js.undefined)
    @scala.inline
    def setCustomerData(value: String): Self = this.set("customerData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerData: Self = this.set("customerData", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setOwnersVarargs(value: String*): Self = this.set("owners", js.Array(value :_*))
    @scala.inline
    def setOwners(value: js.Array[String]): Self = this.set("owners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwners: Self = this.set("owners", js.undefined)
    @scala.inline
    def setQuestionsVarargs(value: SurveyQuestion*): Self = this.set("questions", js.Array(value :_*))
    @scala.inline
    def setQuestions(value: js.Array[SurveyQuestion]): Self = this.set("questions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuestions: Self = this.set("questions", js.undefined)
    @scala.inline
    def setRejectionReason(value: SurveyRejection): Self = this.set("rejectionReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectionReason: Self = this.set("rejectionReason", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setSurveyUrlId(value: String): Self = this.set("surveyUrlId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSurveyUrlId: Self = this.set("surveyUrlId", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setWantedResponseCount(value: Double): Self = this.set("wantedResponseCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWantedResponseCount: Self = this.set("wantedResponseCount", js.undefined)
  }
  
}

