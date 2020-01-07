package typings.googleapis.buildSrcApisVideointelligenceV1p3beta1Mod.videointelligence_v1p3beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Config for TEXT_DETECTION.
  */
@js.native
trait Schema$GoogleCloudVideointelligenceV1p3beta1_TextDetectionConfig extends js.Object {
  /**
    * Language hint can be specified if the language to be detected is known a
    * priori. It can increase the accuracy of the detection. Language hint must
    * be language code in BCP-47 format.  Automatic language detection is
    * performed if no hint is provided.
    */
  var languageHints: js.UndefOr[js.Array[String]] = js.native
}

object Schema$GoogleCloudVideointelligenceV1p3beta1_TextDetectionConfig {
  @scala.inline
  def apply(languageHints: js.Array[String] = null): Schema$GoogleCloudVideointelligenceV1p3beta1_TextDetectionConfig = {
    val __obj = js.Dynamic.literal()
    if (languageHints != null) __obj.updateDynamic("languageHints")(languageHints.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVideointelligenceV1p3beta1_TextDetectionConfig]
  }
}

