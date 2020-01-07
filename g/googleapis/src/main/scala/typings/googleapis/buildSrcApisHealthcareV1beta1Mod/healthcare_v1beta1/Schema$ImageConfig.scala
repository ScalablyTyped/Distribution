package typings.googleapis.buildSrcApisHealthcareV1beta1Mod.healthcare_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies how de-identification of image pixel should be handled.
  */
@js.native
trait Schema$ImageConfig extends js.Object {
  /**
    * Determines how to redact text from image.
    */
  var textRedactionMode: js.UndefOr[String] = js.native
}

object Schema$ImageConfig {
  @scala.inline
  def apply(textRedactionMode: String = null): Schema$ImageConfig = {
    val __obj = js.Dynamic.literal()
    if (textRedactionMode != null) __obj.updateDynamic("textRedactionMode")(textRedactionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ImageConfig]
  }
}

