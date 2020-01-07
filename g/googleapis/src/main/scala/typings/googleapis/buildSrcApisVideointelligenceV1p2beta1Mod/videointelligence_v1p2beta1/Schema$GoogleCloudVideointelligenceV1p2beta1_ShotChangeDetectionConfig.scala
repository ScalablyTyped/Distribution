package typings.googleapis.buildSrcApisVideointelligenceV1p2beta1Mod.videointelligence_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Config for SHOT_CHANGE_DETECTION.
  */
@js.native
trait Schema$GoogleCloudVideointelligenceV1p2beta1_ShotChangeDetectionConfig extends js.Object {
  /**
    * Model to use for shot change detection. Supported values:
    * &quot;builtin/stable&quot; (the default if unset) and
    * &quot;builtin/latest&quot;.
    */
  var model: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudVideointelligenceV1p2beta1_ShotChangeDetectionConfig {
  @scala.inline
  def apply(model: String = null): Schema$GoogleCloudVideointelligenceV1p2beta1_ShotChangeDetectionConfig = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVideointelligenceV1p2beta1_ShotChangeDetectionConfig]
  }
}

