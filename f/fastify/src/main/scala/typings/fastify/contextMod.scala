package typings.fastify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @js.native
  trait FastifyContext[ContextConfig] extends StObject {
    
    var config: ContextConfig = js.native
  }
  object FastifyContext {
    
    @scala.inline
    def apply[ContextConfig](config: ContextConfig): FastifyContext[ContextConfig] = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastifyContext[ContextConfig]]
    }
    
    @scala.inline
    implicit class FastifyContextMutableBuilder[Self <: FastifyContext[_], ContextConfig] (val x: Self with FastifyContext[ContextConfig]) extends AnyVal {
      
      @scala.inline
      def setConfig(value: ContextConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
}
