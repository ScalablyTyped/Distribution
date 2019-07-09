package typings
package expressDashValidatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0[K /* <: java.lang.String */]
  extends expressDashValidatorLib.srcMiddlewaresSchemaMod.ValidatorSchemaOptions[K] {
  var errorMessage: js.UndefOr[expressDashValidatorLib.srcBaseMod.DynamicMessageCreator | js.Any] = js.undefined
  var negated: js.UndefOr[scala.Boolean] = js.undefined
  var options: js.UndefOr[
    (stdLib.Parameters[
      /* import warning: ImportType.apply Failed type conversion: express-validator.express-validator/src/chain/validators.Validators<any>[K] */ js.Any
    ]) | (/* import warning: ImportType.apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/validators.Validators<any>[K]>[0] */ js.Any)
  ] = js.undefined
}

object Anon_0 {
  @scala.inline
  def apply[K /* <: java.lang.String */](
    errorMessage: expressDashValidatorLib.srcBaseMod.DynamicMessageCreator | js.Any = null,
    negated: js.UndefOr[scala.Boolean] = js.undefined,
    options: (stdLib.Parameters[
      /* import warning: ImportType.apply Failed type conversion: express-validator.express-validator/src/chain/validators.Validators<any>[K] */ js.Any
    ]) | (/* import warning: ImportType.apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/validators.Validators<any>[K]>[0] */ js.Any) = null
  ): Anon_0[K] = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(negated)) __obj.updateDynamic("negated")(negated)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_0[K]]
  }
}

