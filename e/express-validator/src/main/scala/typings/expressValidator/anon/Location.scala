package typings.expressValidator.anon

import typings.expressValidator.baseMod.ValidationError
import typings.expressValidator.expressValidatorStrings._error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location
  extends StObject
     with ValidationError {
  
  var location: Unit
  
  var msg: js.Any
  
  var nestedErrors: js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias express-validator.express-validator/src/base.ValidationError */ js.Object
  ]
  
  var param: _error
  
  var value: Unit
}
object Location {
  
  @scala.inline
  def apply(
    location: Unit,
    msg: js.Any,
    nestedErrors: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias express-validator.express-validator/src/base.ValidationError */ js.Object
    ],
    value: Unit
  ): Location = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], nestedErrors = nestedErrors.asInstanceOf[js.Any], param = "_error", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: Unit): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
