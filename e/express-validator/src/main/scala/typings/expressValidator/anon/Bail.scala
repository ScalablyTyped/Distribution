package typings.expressValidator.anon

import typings.expressValidator.srcBaseMod.CustomValidator
import typings.expressValidator.srcBaseMod.DynamicMessageCreator
import typings.expressValidator.srcBaseMod.Meta
import typings.expressValidator.srcChainValidationChainMod.ValidationChain
import typings.expressValidator.srcMiddlewaresSchemaMod.ValidatorSchemaOptions
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bail[K /* <: /* keyof express-validator.express-validator/src/chain/validators.Validators<any> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 88, starting with typings.expressValidator.expressValidatorStrings.not, typings.expressValidator.expressValidatorStrings.withMessage, typings.expressValidator.expressValidatorStrings.custom */ Any */]
  extends StObject
     with ValidatorSchemaOptions[K] {
  
  var bail: js.UndefOr[Boolean] = js.undefined
  
  var errorMessage: js.UndefOr[DynamicMessageCreator | Any] = js.undefined
  
  var `if`: js.UndefOr[CustomValidator | ValidationChain] = js.undefined
  
  var negated: js.UndefOr[Boolean] = js.undefined
  
  var options: js.UndefOr[
    (Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: express-validator.express-validator/src/chain/validators.Validators<any>[K] */ js.Any
    ]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/validators.Validators<any>[K]>[0] */ js.Any)
  ] = js.undefined
}
object Bail {
  
  inline def apply[K /* <: /* keyof express-validator.express-validator/src/chain/validators.Validators<any> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 88, starting with typings.expressValidator.expressValidatorStrings.not, typings.expressValidator.expressValidatorStrings.withMessage, typings.expressValidator.expressValidatorStrings.custom */ Any */](): Bail[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bail[K]]
  }
  
  extension [Self <: Bail[?], K /* <: /* keyof express-validator.express-validator/src/chain/validators.Validators<any> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 88, starting with typings.expressValidator.expressValidatorStrings.not, typings.expressValidator.expressValidatorStrings.withMessage, typings.expressValidator.expressValidatorStrings.custom */ Any */](x: Self & Bail[K]) {
    
    inline def setBail(value: Boolean): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
    
    inline def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
    
    inline def setErrorMessage(value: DynamicMessageCreator | Any): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageFunction2(value: (/* value */ Any, /* meta */ Meta) => Any): Self = StObject.set(x, "errorMessage", js.Any.fromFunction2(value))
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setIf(value: CustomValidator | ValidationChain): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
    
    inline def setIfFunction2(value: (/* input */ Any, /* meta */ Meta) => Any): Self = StObject.set(x, "if", js.Any.fromFunction2(value))
    
    inline def setIfUndefined: Self = StObject.set(x, "if", js.undefined)
    
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
