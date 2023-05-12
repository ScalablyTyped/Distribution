package typings.expressValidator.anon

import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options[K /* <: /* keyof express-validator.express-validator/src/chain/validators.Validators<any> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 91, starting with typings.expressValidator.expressValidatorStrings.not, typings.expressValidator.expressValidatorStrings.withMessage, typings.expressValidator.expressValidatorStrings.custom */ Any */] extends StObject {
  
  /**
    * Options to pass to the validator.
    */
  var options: js.UndefOr[
    (Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: express-validator.express-validator/src/chain/validators.Validators<any>[K] */ js.Any
    ]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/validators.Validators<any>[K]>[0] */ js.Any)
  ] = js.undefined
}
object Options {
  
  inline def apply[K /* <: /* keyof express-validator.express-validator/src/chain/validators.Validators<any> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 91, starting with typings.expressValidator.expressValidatorStrings.not, typings.expressValidator.expressValidatorStrings.withMessage, typings.expressValidator.expressValidatorStrings.custom */ Any */](): Options[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[K]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options[?], K /* <: /* keyof express-validator.express-validator/src/chain/validators.Validators<any> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 91, starting with typings.expressValidator.expressValidatorStrings.not, typings.expressValidator.expressValidatorStrings.withMessage, typings.expressValidator.expressValidatorStrings.custom */ Any */] (val x: Self & Options[K]) extends AnyVal {
    
    inline def setOptions(
      value: (Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: express-validator.express-validator/src/chain/validators.Validators<any>[K] */ js.Any
        ]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/validators.Validators<any>[K]>[0] */ js.Any)
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
