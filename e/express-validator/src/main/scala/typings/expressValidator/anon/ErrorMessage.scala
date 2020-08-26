package typings.expressValidator.anon

import typings.expressValidator.baseMod.DynamicMessageCreator
import typings.expressValidator.baseMod.Meta
import typings.expressValidator.schemaMod.ValidatorSchemaOptions
import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorMessage[K /* <: /* keyof express-validator.express-validator/src/chain/validators.Validators<any> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 82 */ js.Any */] extends ValidatorSchemaOptions[K] {
  var errorMessage: js.UndefOr[DynamicMessageCreator | js.Any] = js.native
  var negated: js.UndefOr[Boolean] = js.native
  var options: js.UndefOr[
    (Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: express-validator.express-validator/src/chain/validators.Validators<any>[K] */ js.Any
    ]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/validators.Validators<any>[K]>[0] */ js.Any)
  ] = js.native
}

object ErrorMessage {
  @scala.inline
  def apply[/* <: / * keyof express-validator.express-validator/src/chain/validators.Validators<any> * / / * import warning: LimitUnionLength.leaveTypeRef Was union type with length 82 * / js.Any */ K](): ErrorMessage[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorMessage[K]]
  }
  @scala.inline
  implicit class ErrorMessageOps[Self <: ErrorMessage[_], /* <: / * keyof express-validator.express-validator/src/chain/validators.Validators<any> * / / * import warning: LimitUnionLength.leaveTypeRef Was union type with length 82 * / js.Any */ K] (val x: Self with ErrorMessage[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorMessageFunction2(value: (/* value */ js.Any, /* meta */ Meta) => js.Any): Self = this.set("errorMessage", js.Any.fromFunction2(value))
    @scala.inline
    def setErrorMessage(value: DynamicMessageCreator | js.Any): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setNegated(value: Boolean): Self = this.set("negated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegated: Self = this.set("negated", js.undefined)
    @scala.inline
    def setOptions(
      value: (Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: express-validator.express-validator/src/chain/validators.Validators<any>[K] */ js.Any
        ]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/validators.Validators<any>[K]>[0] */ js.Any)
    ): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

