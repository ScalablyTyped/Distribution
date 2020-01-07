package typings.googleapis.buildSrcApisVisionV1p2beta1Mod.vision_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Label to provide extra metadata for the web detection.
  */
@js.native
trait Schema$GoogleCloudVisionV1p2beta1WebDetectionWebLabel extends js.Object {
  /**
    * Label for extra metadata.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The BCP-47 language code for `label`, such as &quot;en-US&quot; or
    * &quot;sr-Latn&quot;. For more information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
    */
  var languageCode: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudVisionV1p2beta1WebDetectionWebLabel {
  @scala.inline
  def apply(label: String = null, languageCode: String = null): Schema$GoogleCloudVisionV1p2beta1WebDetectionWebLabel = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p2beta1WebDetectionWebLabel]
  }
}

