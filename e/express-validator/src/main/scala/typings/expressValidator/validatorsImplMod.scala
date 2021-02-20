package typings.expressValidator

import typings.expressValidator.contextBuilderMod.ContextBuilder
import typings.expressValidator.optionsMod.MinMaxOptions
import typings.expressValidator.validatorsMod.Validators
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatorsImplMod {
  
  @JSImport("express-validator/src/chain/validators-impl", "ValidatorsImpl")
  @js.native
  class ValidatorsImpl[Chain] protected () extends Validators[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
    
    var addItem: js.Any = js.native
    
    var addStandardValidation: js.Any = js.native
    
    val builder: js.Any = js.native
    
    val chain: js.Any = js.native
    
    def isByteLength(options: MinMaxOptions): Chain = js.native
    
    var lastValidator: js.Any = js.native
    
    var negateNext: js.Any = js.native
  }
}
