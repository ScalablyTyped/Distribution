package typings.gapiDotClientDotConsumersurveys.gapi.client.consumersurveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Survey extends js.Object {
  var audience: js.UndefOr[SurveyAudience] = js.undefined
  var cost: js.UndefOr[SurveyCost] = js.undefined
  var customerData: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var owners: js.UndefOr[js.Array[String]] = js.undefined
  var questions: js.UndefOr[js.Array[SurveyQuestion]] = js.undefined
  var rejectionReason: js.UndefOr[SurveyRejection] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var surveyUrlId: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var wantedResponseCount: js.UndefOr[Double] = js.undefined
}

object Survey {
  @scala.inline
  def apply(
    audience: SurveyAudience = null,
    cost: SurveyCost = null,
    customerData: String = null,
    description: String = null,
    owners: js.Array[String] = null,
    questions: js.Array[SurveyQuestion] = null,
    rejectionReason: SurveyRejection = null,
    state: String = null,
    surveyUrlId: String = null,
    title: String = null,
    wantedResponseCount: Int | Double = null
  ): Survey = {
    val __obj = js.Dynamic.literal()
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (cost != null) __obj.updateDynamic("cost")(cost)
    if (customerData != null) __obj.updateDynamic("customerData")(customerData)
    if (description != null) __obj.updateDynamic("description")(description)
    if (owners != null) __obj.updateDynamic("owners")(owners)
    if (questions != null) __obj.updateDynamic("questions")(questions)
    if (rejectionReason != null) __obj.updateDynamic("rejectionReason")(rejectionReason)
    if (state != null) __obj.updateDynamic("state")(state)
    if (surveyUrlId != null) __obj.updateDynamic("surveyUrlId")(surveyUrlId)
    if (title != null) __obj.updateDynamic("title")(title)
    if (wantedResponseCount != null) __obj.updateDynamic("wantedResponseCount")(wantedResponseCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Survey]
  }
}

