package typings.googleapis.buildSrcApisHealthcareV1beta1Mod.healthcare_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TextConfig extends js.Object {
  /**
    * The transformations to apply to the detected data.
    */
  var transformations: js.UndefOr[js.Array[Schema$InfoTypeTransformation]] = js.native
}

object Schema$TextConfig {
  @scala.inline
  def apply(transformations: js.Array[Schema$InfoTypeTransformation] = null): Schema$TextConfig = {
    val __obj = js.Dynamic.literal()
    if (transformations != null) __obj.updateDynamic("transformations")(transformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TextConfig]
  }
}

