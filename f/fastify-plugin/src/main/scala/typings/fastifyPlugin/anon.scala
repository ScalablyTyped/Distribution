package typings.fastifyPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Fastify extends StObject {
    
    var fastify: js.UndefOr[js.Array[String]] = js.undefined
    
    var reply: js.UndefOr[js.Array[String]] = js.undefined
    
    var request: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Fastify {
    
    @scala.inline
    def apply(): Fastify = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fastify]
    }
    
    @scala.inline
    implicit class FastifyMutableBuilder[Self <: Fastify] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFastify(value: js.Array[String]): Self = StObject.set(x, "fastify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFastifyUndefined: Self = StObject.set(x, "fastify", js.undefined)
      
      @scala.inline
      def setFastifyVarargs(value: String*): Self = StObject.set(x, "fastify", js.Array(value :_*))
      
      @scala.inline
      def setReply(value: js.Array[String]): Self = StObject.set(x, "reply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplyUndefined: Self = StObject.set(x, "reply", js.undefined)
      
      @scala.inline
      def setReplyVarargs(value: String*): Self = StObject.set(x, "reply", js.Array(value :_*))
      
      @scala.inline
      def setRequest(value: js.Array[String]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setRequestVarargs(value: String*): Self = StObject.set(x, "request", js.Array(value :_*))
    }
  }
}
