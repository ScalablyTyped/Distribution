package typings.expressValidator.anon

import typings.expressValidator.baseMod.DynamicMessageCreator
import typings.expressValidator.baseMod.Meta
import typings.expressValidator.schemaMod.ValidatorSchemaOptions
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorMessage[K /* <: /* keyof express-validator.express-validator/src/chain/validators.Validators<any> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 82 */ js.Any */]
  extends StObject
     with ValidatorSchemaOptions[K] {
  
  var errorMessage: js.UndefOr[DynamicMessageCreator | js.Any] = js.undefined
  
  var negated: js.UndefOr[Boolean] = js.undefined
  
  var options: js.UndefOr[
    (Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: express-validator.express-validator/src/chain/validators.Validators<any>[K] */ js.Any
    ]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/validators.Validators<any>[K]>[0] */ js.Any)
  ] = js.undefined
}
object ErrorMessage {
  
  inline def apply[K /* <: /* keyof express-validator.express-validator/src/chain/validators.Validators<any> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 82 */ js.Any */](): ErrorMessage[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorMessage[K]]
  }
  
  extension [Self <: ErrorMessage[?], K /* <: /* keyof express-validator.express-validator/src/chain/validators.Validators<any> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 82 */ js.Any */](x: Self & ErrorMessage[K]) {
    
    inline def setErrorMessage(value: DynamicMessageCreator | js.Any): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageFunction2(value: (/* value */ js.Any, /* meta */ Meta) => js.Any): Self = StObject.set(x, "errorMessage", js.Any.fromFunction2(value))
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setNegated(value: Boolean): Self = StObject.set(x, "negated", value.asInstanceOf[js.Any])
    
    inline def setNegatedUndefined: Self = StObject.set(x, "negated", js.undefined)
    
    inline def setOptions(
      value: (Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: express-validator.express-validator/src/chain/validators.Validators<any>[K] */ js.Any
        ]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/validators.Validators<any>[K]>[0] */ js.Any)
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
