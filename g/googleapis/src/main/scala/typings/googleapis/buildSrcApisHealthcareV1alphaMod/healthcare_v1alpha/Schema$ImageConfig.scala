package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies how de-identification of image pixel should be handled.
  */
@js.native
trait Schema$ImageConfig extends js.Object {
  /**
    * If true, all text found in the image is redacted.
    */
  var redactAllText: js.UndefOr[Boolean] = js.native
}

object Schema$ImageConfig {
  @scala.inline
  def apply(redactAllText: js.UndefOr[Boolean] = js.undefined): Schema$ImageConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(redactAllText)) __obj.updateDynamic("redactAllText")(redactAllText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ImageConfig]
  }
}

