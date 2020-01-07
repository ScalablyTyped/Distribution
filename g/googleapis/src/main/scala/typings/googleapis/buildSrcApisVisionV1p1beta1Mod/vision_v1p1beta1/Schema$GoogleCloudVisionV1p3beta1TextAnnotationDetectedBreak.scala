package typings.googleapis.buildSrcApisVisionV1p1beta1Mod.vision_v1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detected start or end of a structural component.
  */
@js.native
trait Schema$GoogleCloudVisionV1p3beta1TextAnnotationDetectedBreak extends js.Object {
  /**
    * True if break prepends the element.
    */
  var isPrefix: js.UndefOr[Boolean] = js.native
  /**
    * Detected break type.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudVisionV1p3beta1TextAnnotationDetectedBreak {
  @scala.inline
  def apply(isPrefix: js.UndefOr[Boolean] = js.undefined, `type`: String = null): Schema$GoogleCloudVisionV1p3beta1TextAnnotationDetectedBreak = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isPrefix)) __obj.updateDynamic("isPrefix")(isPrefix.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p3beta1TextAnnotationDetectedBreak]
  }
}

