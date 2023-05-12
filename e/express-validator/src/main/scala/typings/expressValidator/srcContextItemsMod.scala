package typings.expressValidator

import typings.expressValidator.srcBaseMod.CustomValidator
import typings.expressValidator.srcBaseMod.StandardValidator
import typings.expressValidator.srcChainContextRunnerMod.ContextRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcContextItemsMod {
  
  @JSImport("express-validator/src/context-items", "ChainCondition")
  @js.native
  open class ChainCondition protected ()
    extends typings.expressValidator.srcContextItemsChainConditionMod.ChainCondition {
    def this(chain: ContextRunner) = this()
  }
  
  @JSImport("express-validator/src/context-items", "CustomCondition")
  @js.native
  open class CustomCondition protected ()
    extends typings.expressValidator.srcContextItemsCustomConditionMod.CustomCondition {
    def this(condition: CustomValidator) = this()
  }
  
  @JSImport("express-validator/src/context-items", "CustomValidation")
  @js.native
  open class CustomValidation protected ()
    extends typings.expressValidator.srcContextItemsCustomValidationMod.CustomValidation {
    def this(validator: CustomValidator, negated: Boolean) = this()
  }
  
  @JSImport("express-validator/src/context-items", "StandardValidation")
  @js.native
  open class StandardValidation protected ()
    extends typings.expressValidator.srcContextItemsStandardValidationMod.StandardValidation {
    def this(validator: StandardValidator, negated: Boolean) = this()
    def this(validator: StandardValidator, negated: Boolean, options: js.Array[Any]) = this()
    def this(
      validator: StandardValidator,
      negated: Boolean,
      options: js.Array[Any],
      stringify: js.Function1[/* value */ Any, String]
    ) = this()
    def this(
      validator: StandardValidator,
      negated: Boolean,
      options: Unit,
      stringify: js.Function1[/* value */ Any, String]
    ) = this()
  }
}
