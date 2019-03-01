package typings
package expressDashValidatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorMessage[T]
  extends expressDashValidatorLib.checkSchemaMod.ValidatorSchemaOptions[T] {
  var errorMessage: js.UndefOr[js.Any] = js.undefined
  var negated: js.UndefOr[scala.Boolean] = js.undefined
  var options: js.UndefOr[T | js.Array[T]] = js.undefined
}

object Anon_ErrorMessage {
  @scala.inline
  def apply[T](
    errorMessage: js.Any = null,
    negated: js.UndefOr[scala.Boolean] = js.undefined,
    options: T | js.Array[T] = null
  ): Anon_ErrorMessage[T] = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (!js.isUndefined(negated)) __obj.updateDynamic("negated")(negated)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorMessage[T]]
  }
}

