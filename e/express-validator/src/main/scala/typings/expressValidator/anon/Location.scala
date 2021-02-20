package typings.expressValidator.anon

import typings.expressValidator.baseMod.ValidationError
import typings.expressValidator.expressValidatorStrings._error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Location extends ValidationError {
  
  var location: js.UndefOr[scala.Nothing] = js.native
  
  var msg: js.Any = js.native
  
  var nestedErrors: js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias express-validator.express-validator/src/base.ValidationError */ js.Object
  ] = js.native
  
  var param: _error = js.native
  
  var value: js.UndefOr[scala.Nothing] = js.native
}
object Location {
  
  @scala.inline
  def apply(
    msg: js.Any,
    nestedErrors: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias express-validator.express-validator/src/base.ValidationError */ js.Object
    ],
    param: _error
  ): Location = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], nestedErrors = nestedErrors.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMsg(value: js.Any): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedErrors(
      value: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias express-validator.express-validator/src/base.ValidationError */ js.Object
        ]
    ): Self = StObject.set(x, "nestedErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedErrorsVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias express-validator.express-validator/src/base.ValidationError */ js.Object)*
    ): Self = StObject.set(x, "nestedErrors", js.Array(value :_*))
    
    @scala.inline
    def setParam(value: _error): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
  }
}
