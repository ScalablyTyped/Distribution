package typings.expressValidator

import typings.expressValidator.contextBuilderMod.ContextBuilder
import typings.expressValidator.contextHandlerMod.ContextHandler
import typings.expressValidator.contextMod.Optional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextHandlerImplMod {
  
  @JSImport("express-validator/src/chain/context-handler-impl", "ContextHandlerImpl")
  @js.native
  class ContextHandlerImpl[Chain] protected ()
    extends StObject
       with ContextHandler[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
    
    /* private */ val builder: js.Any = js.native
    
    /* private */ val chain: js.Any = js.native
    
    def optional(options: Optional): Chain = js.native
  }
}
