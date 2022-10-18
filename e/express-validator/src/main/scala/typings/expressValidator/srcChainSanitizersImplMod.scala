package typings.expressValidator

import typings.expressValidator.srcChainSanitizersMod.Sanitizers
import typings.expressValidator.srcContextBuilderMod.ContextBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcChainSanitizersImplMod {
  
  @JSImport("express-validator/src/chain/sanitizers-impl", "SanitizersImpl")
  @js.native
  open class SanitizersImpl[Chain] protected ()
    extends StObject
       with Sanitizers[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
    
    /* private */ var addStandardSanitization: Any = js.native
    
    /* private */ val builder: Any = js.native
    
    /* private */ val chain: Any = js.native
  }
}
