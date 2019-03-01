package typings
package gapiDotClientDotSurveysLib.gapiNs.clientNs.surveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Survey extends js.Object {
  /** Targeting-criteria message containing demographic information */
  var audience: js.UndefOr[SurveyAudience] = js.undefined
  /** Cost to run the survey and collect the necessary number of responses. */
  var cost: js.UndefOr[SurveyCost] = js.undefined
  /**
    * Additional information to store on behalf of the API consumer and associate with this question. This binary blob is treated as opaque. This field is
    * limited to 64K bytes.
    */
  var customerData: js.UndefOr[java.lang.String] = js.undefined
  /** Text description of the survey. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** List of email addresses for survey owners. Must contain at least the address of the user making the API call. */
  var owners: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** List of questions defining the survey. */
  var questions: js.UndefOr[js.Array[SurveyQuestion]] = js.undefined
  /** Reason for the survey being rejected. Only present if the survey state is rejected. */
  var rejectionReason: js.UndefOr[SurveyRejection] = js.undefined
  /** State that the survey is in. */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** Unique survey ID, that is viewable in the URL of the Survey Creator UI */
  var surveyUrlId: js.UndefOr[java.lang.String] = js.undefined
  /** Optional name that will be given to the survey. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Number of responses desired for the survey. */
  var wantedResponseCount: js.UndefOr[scala.Double] = js.undefined
}

object Survey {
  @scala.inline
  def apply(
    audience: SurveyAudience = null,
    cost: SurveyCost = null,
    customerData: java.lang.String = null,
    description: java.lang.String = null,
    owners: js.Array[java.lang.String] = null,
    questions: js.Array[SurveyQuestion] = null,
    rejectionReason: SurveyRejection = null,
    state: java.lang.String = null,
    surveyUrlId: java.lang.String = null,
    title: java.lang.String = null,
    wantedResponseCount: scala.Int | scala.Double = null
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

