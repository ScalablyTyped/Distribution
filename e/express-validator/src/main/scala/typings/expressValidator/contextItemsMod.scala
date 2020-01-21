package typings.expressValidator

import typings.expressValidator.baseMod.CustomValidator
import typings.expressValidator.baseMod.StandardValidator
import typings.expressValidator.validationChainMod.ValidationChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context-items", JSImport.Namespace)
@js.native
object contextItemsMod extends js.Object {
  @js.native
  class ChainCondition protected ()
    extends typings.expressValidator.chainConditionMod.ChainCondition {
    def this(chain: ValidationChain) = this()
  }
  
  @js.native
  class CustomCondition protected ()
    extends typings.expressValidator.customConditionMod.CustomCondition {
    def this(condition: CustomValidator) = this()
  }
  
  @js.native
  class CustomValidation protected ()
    extends typings.expressValidator.customValidationMod.CustomValidation {
    def this(validator: CustomValidator, negated: Boolean) = this()
  }
  
  @js.native
  class StandardValidation protected ()
    extends typings.expressValidator.standardValidationMod.StandardValidation {
    def this(validator: StandardValidator, negated: Boolean) = this()
    def this(validator: StandardValidator, negated: Boolean, options: js.Array[_]) = this()
  }
  
}

