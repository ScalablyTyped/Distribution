package typings.expressDashValidator

import typings.expressDashValidator.srcBaseMod.DynamicMessageCreator
import typings.expressDashValidator.srcMiddlewaresSchemaMod.ValidatorSchemaOptions
import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0[K /* <: String */] extends ValidatorSchemaOptions[K] {
  var errorMessage: js.UndefOr[DynamicMessageCreator | js.Any] = js.undefined
  var negated: js.UndefOr[Boolean] = js.undefined
  var options: js.UndefOr[
    (Parameters[
      /* import warning: ImportType.apply Failed type conversion: express-validator.express-validator/src/chain/validators.Validators<any>[K] */ js.Any
    ]) | (/* import warning: ImportType.apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/validators.Validators<any>[K]>[0] */ js.Any)
  ] = js.undefined
}

object Anon_0 {
  @scala.inline
  def apply[K /* <: String */](
    errorMessage: DynamicMessageCreator | js.Any = null,
    negated: js.UndefOr[Boolean] = js.undefined,
    options: (Parameters[
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

