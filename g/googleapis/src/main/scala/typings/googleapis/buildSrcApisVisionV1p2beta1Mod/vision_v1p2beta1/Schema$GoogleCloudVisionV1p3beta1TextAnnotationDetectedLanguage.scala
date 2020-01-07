package typings.googleapis.buildSrcApisVisionV1p2beta1Mod.vision_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detected language for a structural component.
  */
@js.native
trait Schema$GoogleCloudVisionV1p3beta1TextAnnotationDetectedLanguage extends js.Object {
  /**
    * Confidence of detected language. Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * The BCP-47 language code, such as &quot;en-US&quot; or
    * &quot;sr-Latn&quot;. For more information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
    */
  var languageCode: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudVisionV1p3beta1TextAnnotationDetectedLanguage {
  @scala.inline
  def apply(confidence: Int | Double = null, languageCode: String = null): Schema$GoogleCloudVisionV1p3beta1TextAnnotationDetectedLanguage = {
    val __obj = js.Dynamic.literal()
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p3beta1TextAnnotationDetectedLanguage]
  }
}

