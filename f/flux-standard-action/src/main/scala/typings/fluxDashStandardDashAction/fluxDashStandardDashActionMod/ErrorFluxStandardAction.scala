package typings.fluxDashStandardDashAction.fluxDashStandardDashActionMod

import typings.fluxDashStandardDashAction.fluxDashStandardDashActionNumbers.`true`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorFluxStandardAction[Type /* <: String */, CustomError /* <: Error */, Meta] extends FluxStandardAction[Type, CustomError, Meta] {
  /**
    * The required `error` property MUST be set to `true` if the action represents an error.
    */
  @JSName("error")
  var error_ErrorFluxStandardAction: `true`
}

object ErrorFluxStandardAction {
  @scala.inline
  def apply[Type /* <: String */, CustomError /* <: Error */, Meta](error: `true`, `type`: Type, meta: Meta = null, payload: CustomError = null): ErrorFluxStandardAction[Type, CustomError, Meta] = {
    val __obj = js.Dynamic.literal(error = error)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorFluxStandardAction[Type, CustomError, Meta]]
  }
}

