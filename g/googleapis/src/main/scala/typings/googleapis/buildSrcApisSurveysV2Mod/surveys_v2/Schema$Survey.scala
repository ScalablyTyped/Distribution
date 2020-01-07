package typings.googleapis.buildSrcApisSurveysV2Mod.surveys_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of an individual survey object.
  */
@js.native
trait Schema$Survey extends js.Object {
  /**
    * Targeting-criteria message containing demographic information
    */
  var audience: js.UndefOr[Schema$SurveyAudience] = js.native
  /**
    * Cost to run the survey and collect the necessary number of responses.
    */
  var cost: js.UndefOr[Schema$SurveyCost] = js.native
  /**
    * Additional information to store on behalf of the API consumer and
    * associate with this question. This binary blob is treated as opaque. This
    * field is limited to 64K bytes.
    */
  var customerData: js.UndefOr[String] = js.native
  /**
    * Text description of the survey.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * List of email addresses for survey owners. Must contain at least the
    * address of the user making the API call.
    */
  var owners: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of questions defining the survey.
    */
  var questions: js.UndefOr[js.Array[Schema$SurveyQuestion]] = js.native
  /**
    * Reason for the survey being rejected. Only present if the survey state is
    * rejected.
    */
  var rejectionReason: js.UndefOr[Schema$SurveyRejection] = js.native
  /**
    * State that the survey is in.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Unique survey ID, that is viewable in the URL of the Survey Creator UI
    */
  var surveyUrlId: js.UndefOr[String] = js.native
  /**
    * Optional name that will be given to the survey.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Number of responses desired for the survey.
    */
  var wantedResponseCount: js.UndefOr[Double] = js.native
}

object Schema$Survey {
  @scala.inline
  def apply(
    audience: Schema$SurveyAudience = null,
    cost: Schema$SurveyCost = null,
    customerData: String = null,
    description: String = null,
    owners: js.Array[String] = null,
    questions: js.Array[Schema$SurveyQuestion] = null,
    rejectionReason: Schema$SurveyRejection = null,
    state: String = null,
    surveyUrlId: String = null,
    title: String = null,
    wantedResponseCount: Int | Double = null
  ): Schema$Survey = {
    val __obj = js.Dynamic.literal()
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (cost != null) __obj.updateDynamic("cost")(cost.asInstanceOf[js.Any])
    if (customerData != null) __obj.updateDynamic("customerData")(customerData.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (owners != null) __obj.updateDynamic("owners")(owners.asInstanceOf[js.Any])
    if (questions != null) __obj.updateDynamic("questions")(questions.asInstanceOf[js.Any])
    if (rejectionReason != null) __obj.updateDynamic("rejectionReason")(rejectionReason.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (surveyUrlId != null) __obj.updateDynamic("surveyUrlId")(surveyUrlId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (wantedResponseCount != null) __obj.updateDynamic("wantedResponseCount")(wantedResponseCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Survey]
  }
}

