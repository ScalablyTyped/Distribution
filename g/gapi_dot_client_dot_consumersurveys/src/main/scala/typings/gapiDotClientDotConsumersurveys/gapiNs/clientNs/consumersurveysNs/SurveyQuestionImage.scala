package typings.gapiDotClientDotConsumersurveys.gapiNs.clientNs.consumersurveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveyQuestionImage extends js.Object {
  var altText: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object SurveyQuestionImage {
  @scala.inline
  def apply(altText: String = null, data: String = null, url: String = null): SurveyQuestionImage = {
    val __obj = js.Dynamic.literal()
    if (altText != null) __obj.updateDynamic("altText")(altText)
    if (data != null) __obj.updateDynamic("data")(data)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[SurveyQuestionImage]
  }
}

