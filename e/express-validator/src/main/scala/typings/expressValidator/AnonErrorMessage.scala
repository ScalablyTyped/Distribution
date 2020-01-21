package typings.expressValidator

import typings.expressValidator.baseMod.DynamicMessageCreator
import typings.expressValidator.baseMod.Location
import typings.expressValidator.expressValidatorBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorMessage extends js.Object {
  var errorMessage: js.UndefOr[DynamicMessageCreator | js.Any] = js.undefined
  var in: js.UndefOr[Location | js.Array[Location]] = js.undefined
  var optional: js.UndefOr[`true` | AnonOptions] = js.undefined
}

object AnonErrorMessage {
  @scala.inline
  def apply(
    errorMessage: DynamicMessageCreator | js.Any = null,
    in: Location | js.Array[Location] = null,
    optional: `true` | AnonOptions = null
  ): AnonErrorMessage = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorMessage]
  }
}

