package typings.expressValidator

import typings.expressValidator.baseMod.DynamicMessageCreator
import typings.expressValidator.schemaMod.ValidatorSchemaOptions
import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0[K /* <: String */] extends ValidatorSchemaOptions[K] {
  var errorMessage: js.UndefOr[DynamicMessageCreator | js.Any] = js.undefined
  var negated: js.UndefOr[Boolean] = js.undefined
  var options: js.UndefOr[
    (Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: express-validator.express-validator/src/chain/validators.Validators<any>[K] */ js.Any
    ]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/validators.Validators<any>[K]>[0] */ js.Any)
  ] = js.undefined
}

object Anon0 {
  @scala.inline
  def apply[K /* <: String */](
    errorMessage: DynamicMessageCreator | js.Any = null,
    negated: js.UndefOr[Boolean] = js.undefined,
    options: (Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: express-validator.express-validator/src/chain/validators.Validators<any>[K] */ js.Any
    ]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/validators.Validators<any>[K]>[0] */ js.Any) = null
  ): Anon0[K] = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(negated)) __obj.updateDynamic("negated")(negated.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0[K]]
  }
}

