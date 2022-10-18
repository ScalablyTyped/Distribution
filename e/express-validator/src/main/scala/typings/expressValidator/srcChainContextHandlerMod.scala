package typings.expressValidator

import typings.expressValidator.expressValidatorBooleans.`true`
import typings.expressValidator.srcBaseMod.CustomValidator
import typings.expressValidator.srcChainValidationChainMod.ValidationChain
import typings.expressValidator.srcContextMod.Optional
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcChainContextHandlerMod {
  
  @js.native
  trait ContextHandler[Chain] extends StObject {
    
    def bail(): Chain = js.native
    
    def `if`(condition: CustomValidator): Chain = js.native
    def `if`(condition: ValidationChain): Chain = js.native
    
    def optional(): Chain = js.native
    def optional(options: Partial[Optional]): Chain = js.native
    @JSName("optional")
    def optional_true(options: `true`): Chain = js.native
  }
}
