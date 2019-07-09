package typings
package expressDashValidatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorMessage extends js.Object {
  var errorMessage: js.UndefOr[expressDashValidatorLib.srcBaseMod.DynamicMessageCreator | js.Any] = js.undefined
  var in: js.UndefOr[
    expressDashValidatorLib.srcBaseMod.Location | js.Array[expressDashValidatorLib.srcBaseMod.Location]
  ] = js.undefined
  var optional: js.UndefOr[
    stdLib.Partial[expressDashValidatorLib.srcContextMod.Optional] | expressDashValidatorLib.expressDashValidatorLibNumbers.`true`
  ] = js.undefined
}

object Anon_ErrorMessage {
  @scala.inline
  def apply(
    errorMessage: expressDashValidatorLib.srcBaseMod.DynamicMessageCreator | js.Any = null,
    in: expressDashValidatorLib.srcBaseMod.Location | js.Array[expressDashValidatorLib.srcBaseMod.Location] = null,
    optional: stdLib.Partial[expressDashValidatorLib.srcContextMod.Optional] | expressDashValidatorLib.expressDashValidatorLibNumbers.`true` = null
  ): Anon_ErrorMessage = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorMessage]
  }
}

