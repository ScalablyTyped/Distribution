package typings.expressValidator

import typings.expressValidator.baseMod.CustomValidator
import typings.expressValidator.baseMod.StandardValidator
import typings.expressValidator.validationChainMod.ValidationChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextItemsMod {
  
  @JSImport("express-validator/src/context-items", "ChainCondition")
  @js.native
  open class ChainCondition protected ()
    extends typings.expressValidator.chainConditionMod.ChainCondition {
    def this(chain: ValidationChain) = this()
  }
  
  @JSImport("express-validator/src/context-items", "CustomCondition")
  @js.native
  open class CustomCondition protected ()
    extends typings.expressValidator.customConditionMod.CustomCondition {
    def this(condition: CustomValidator) = this()
  }
  
  @JSImport("express-validator/src/context-items", "CustomValidation")
  @js.native
  open class CustomValidation protected ()
    extends typings.expressValidator.customValidationMod.CustomValidation {
    def this(validator: CustomValidator, negated: Boolean) = this()
  }
  
  @JSImport("express-validator/src/context-items", "StandardValidation")
  @js.native
  open class StandardValidation protected ()
    extends typings.expressValidator.standardValidationMod.StandardValidation {
    def this(validator: StandardValidator, negated: Boolean) = this()
    def this(validator: StandardValidator, negated: Boolean, options: js.Array[Any]) = this()
  }
}
