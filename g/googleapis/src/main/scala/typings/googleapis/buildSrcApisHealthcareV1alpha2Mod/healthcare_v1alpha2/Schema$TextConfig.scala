package typings.googleapis.buildSrcApisHealthcareV1alpha2Mod.healthcare_v1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TextConfig extends js.Object {
  /**
    * Experimental de-identification config to use. For internal use only. If
    * not specified, it is ignored and standard DLP is used.
    */
  var experimentalConfig: js.UndefOr[String] = js.native
  /**
    * The transformations to apply to the detected data.
    */
  var transformations: js.UndefOr[js.Array[Schema$InfoTypeTransformation]] = js.native
}

object Schema$TextConfig {
  @scala.inline
  def apply(experimentalConfig: String = null, transformations: js.Array[Schema$InfoTypeTransformation] = null): Schema$TextConfig = {
    val __obj = js.Dynamic.literal()
    if (experimentalConfig != null) __obj.updateDynamic("experimentalConfig")(experimentalConfig.asInstanceOf[js.Any])
    if (transformations != null) __obj.updateDynamic("transformations")(transformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TextConfig]
  }
}

