package typings.expressValidator.anon

import typings.expressValidator.baseMod.DynamicMessageCreator
import typings.expressValidator.schemaMod.ValidatorSchemaOptions
import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorMessage[K /* <: /* keyof express-validator.express-validator/src/chain/validators.Validators<any> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 82 */ js.Any */] extends ValidatorSchemaOptions[K] {
  var errorMessage: js.UndefOr[DynamicMessageCreator | js.Any] = js.undefined
  var negated: js.UndefOr[Boolean] = js.undefined
  var options: js.UndefOr[
    (Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: express-validator.express-validator/src/chain/validators.Validators<any>[K] */ js.Any
    ]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/validators.Validators<any>[K]>[0] */ js.Any)
  ] = js.undefined
}

object ErrorMessage {
  @scala.inline
  def apply[/* <: / * keyof express-validator.express-validator/src/chain/validators.Validators<any> * / / * import warning: LimitUnionLength.leaveTypeRef Was union type with length 82 * / js.Any */ K](
    errorMessage: DynamicMessageCreator | js.Any = null,
    negated: js.UndefOr[Boolean] = js.undefined,
    options: (Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: express-validator.express-validator/src/chain/validators.Validators<any>[K] */ js.Any
    ]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/validators.Validators<any>[K]>[0] */ js.Any) = null
  ): ErrorMessage[K] = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(negated)) __obj.updateDynamic("negated")(negated.get.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorMessage[K]]
  }
}

