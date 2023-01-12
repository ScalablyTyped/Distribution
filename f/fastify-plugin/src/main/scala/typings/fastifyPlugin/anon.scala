package typings.fastifyPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Fastify extends StObject {
    
    var fastify: js.UndefOr[js.Array[String | js.Symbol]] = js.undefined
    
    var reply: js.UndefOr[js.Array[String | js.Symbol]] = js.undefined
    
    var request: js.UndefOr[js.Array[String | js.Symbol]] = js.undefined
  }
  object Fastify {
    
    inline def apply(): Fastify = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fastify]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fastify] (val x: Self) extends AnyVal {
      
      inline def setFastify(value: js.Array[String | js.Symbol]): Self = StObject.set(x, "fastify", value.asInstanceOf[js.Any])
      
      inline def setFastifyUndefined: Self = StObject.set(x, "fastify", js.undefined)
      
      inline def setFastifyVarargs(value: (String | js.Symbol)*): Self = StObject.set(x, "fastify", js.Array(value*))
      
      inline def setReply(value: js.Array[String | js.Symbol]): Self = StObject.set(x, "reply", value.asInstanceOf[js.Any])
      
      inline def setReplyUndefined: Self = StObject.set(x, "reply", js.undefined)
      
      inline def setReplyVarargs(value: (String | js.Symbol)*): Self = StObject.set(x, "reply", js.Array(value*))
      
      inline def setRequest(value: js.Array[String | js.Symbol]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setRequestVarargs(value: (String | js.Symbol)*): Self = StObject.set(x, "request", js.Array(value*))
    }
  }
}
