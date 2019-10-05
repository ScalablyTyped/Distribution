package typings.expressDashValidator

import typings.expressDashValidator.srcBaseMod.CustomValidator
import typings.expressDashValidator.srcBaseMod.StandardValidator
import typings.expressDashValidator.srcChainValidationDashChainMod.ValidationChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context-items", JSImport.Namespace)
@js.native
object srcContextDashItemsMod extends js.Object {
  @js.native
  class ChainCondition protected ()
    extends typings.expressDashValidator.srcContextDashItemsChainDashConditionMod.ChainCondition {
    def this(chain: ValidationChain) = this()
  }
  
  @js.native
  class CustomCondition protected ()
    extends typings.expressDashValidator.srcContextDashItemsCustomDashConditionMod.CustomCondition {
    def this(condition: CustomValidator) = this()
  }
  
  @js.native
  class CustomValidation protected ()
    extends typings.expressDashValidator.srcContextDashItemsCustomDashValidationMod.CustomValidation {
    def this(validator: CustomValidator, negated: Boolean) = this()
  }
  
  @js.native
  class StandardValidation protected ()
    extends typings.expressDashValidator.srcContextDashItemsStandardDashValidationMod.StandardValidation {
    def this(validator: StandardValidator, negated: Boolean) = this()
    def this(validator: StandardValidator, negated: Boolean, options: js.Array[_]) = this()
  }
  
}

