package typings
package gapiDotClientDotConsumersurveysLib.gapiNs.clientNs.consumersurveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveyQuestionImage extends js.Object {
  var altText: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object SurveyQuestionImage {
  @scala.inline
  def apply(altText: java.lang.String = null, data: java.lang.String = null, url: java.lang.String = null): SurveyQuestionImage = {
    val __obj = js.Dynamic.literal()
    if (altText != null) __obj.updateDynamic("altText")(altText)
    if (data != null) __obj.updateDynamic("data")(data)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[SurveyQuestionImage]
  }
}

