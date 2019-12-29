package typings.expressDashValidator

import typings.expressDashValidator.expressDashValidatorBooleans.`true`
import typings.expressDashValidator.srcBaseMod.DynamicMessageCreator
import typings.expressDashValidator.srcBaseMod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorMessage extends js.Object {
  var errorMessage: js.UndefOr[DynamicMessageCreator | js.Any] = js.undefined
  var in: js.UndefOr[Location | js.Array[Location]] = js.undefined
  var optional: js.UndefOr[`true` | Anon_Options] = js.undefined
}

object Anon_ErrorMessage {
  @scala.inline
  def apply(
    errorMessage: DynamicMessageCreator | js.Any = null,
    in: Location | js.Array[Location] = null,
    optional: `true` | Anon_Options = null
  ): Anon_ErrorMessage = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorMessage]
  }
}

