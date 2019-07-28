package typings.gapiDotClientDotSurveys.gapiNs.clientNs.surveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveyQuestionImage extends js.Object {
  /** The alt text property used in image tags is required for all images. */
  var altText: js.UndefOr[String] = js.undefined
  /** Inline jpeg, gif, tiff, bmp, or png image raw bytes for an image question types. */
  var data: js.UndefOr[String] = js.undefined
  /** The read-only URL for the hosted images. */
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

