package typings.expressValidator

import typings.expressValidator.srcChainValidatorsMod.Validators
import typings.expressValidator.srcContextBuilderMod.ContextBuilder
import typings.expressValidator.srcOptionsMod.MinMaxOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcChainValidatorsImplMod {
  
  @JSImport("express-validator/src/chain/validators-impl", "ValidatorsImpl")
  @js.native
  open class ValidatorsImpl[Chain] protected ()
    extends StObject
       with Validators[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
    
    /* private */ var addItem: Any = js.native
    
    /* private */ var addStandardValidation: Any = js.native
    
    /* private */ val builder: Any = js.native
    
    /* private */ val chain: Any = js.native
    
    def isByteLength(options: MinMaxOptions): Chain = js.native
    
    /* private */ var lastValidator: Any = js.native
    
    /* private */ var negateNext: Any = js.native
  }
}
