package typings.expressDashValidator

import typings.expressDashValidator.expressDashValidatorNumbers.`true`
import typings.expressDashValidator.srcBaseMod.DynamicMessageCreator
import typings.expressDashValidator.srcBaseMod.Location
import typings.expressDashValidator.srcContextMod.Optional
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorMessage extends js.Object {
  var errorMessage: js.UndefOr[DynamicMessageCreator | js.Any] = js.undefined
  var in: js.UndefOr[Location | js.Array[Location]] = js.undefined
  var optional: js.UndefOr[Partial[Optional] | `true`] = js.undefined
}

object Anon_ErrorMessage {
  @scala.inline
  def apply(
    errorMessage: DynamicMessageCreator | js.Any = null,
    in: Location | js.Array[Location] = null,
    optional: Partial[Optional] | `true` = null
  ): Anon_ErrorMessage = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorMessage]
  }
}

