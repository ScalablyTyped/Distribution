package typings
package fluxDashStandardDashActionLib.fluxDashStandardDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorFluxStandardAction[CustomError /* <: stdLib.Error */, Meta] extends FluxStandardAction[CustomError, Meta] {
  @JSName("error")
  var error_ErrorFluxStandardAction: fluxDashStandardDashActionLib.fluxDashStandardDashActionLibNumbers.`true`
}

object ErrorFluxStandardAction {
  @scala.inline
  def apply[CustomError /* <: stdLib.Error */, Meta](
    error: fluxDashStandardDashActionLib.fluxDashStandardDashActionLibNumbers.`true`,
    `type`: java.lang.String,
    meta: Meta = null,
    payload: CustomError = null
  ): ErrorFluxStandardAction[CustomError, Meta] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("error")(error)
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorFluxStandardAction[CustomError, Meta]]
  }
}

