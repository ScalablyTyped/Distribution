package typings.fastify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  trait FastifyContext[ContextConfig] extends StObject {
    
    var config: FastifyContextConfig & ContextConfig
  }
  object FastifyContext {
    
    inline def apply[ContextConfig](config: FastifyContextConfig & ContextConfig): FastifyContext[ContextConfig] = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastifyContext[ContextConfig]]
    }
    
    extension [Self <: FastifyContext[?], ContextConfig](x: Self & FastifyContext[ContextConfig]) {
      
      inline def setConfig(value: FastifyContextConfig & ContextConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
  
  trait FastifyContextConfig extends StObject
}
