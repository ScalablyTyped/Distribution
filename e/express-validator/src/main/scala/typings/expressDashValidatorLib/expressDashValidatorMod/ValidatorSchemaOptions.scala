package typings
package expressDashValidatorLib.expressDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorSchemaOptions extends js.Object {
  var errorMessage: js.UndefOr[js.Any] = js.undefined
  var options: js.UndefOr[js.Array[_]] = js.undefined
}

object ValidatorSchemaOptions {
  @scala.inline
  def apply(errorMessage: js.Any = null, options: js.Array[_] = null): ValidatorSchemaOptions = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[ValidatorSchemaOptions]
  }
}

