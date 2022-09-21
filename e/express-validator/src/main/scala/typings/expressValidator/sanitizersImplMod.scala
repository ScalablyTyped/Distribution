package typings.expressValidator

import typings.expressValidator.contextBuilderMod.ContextBuilder
import typings.expressValidator.sanitizersMod.Sanitizers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sanitizersImplMod {
  
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
