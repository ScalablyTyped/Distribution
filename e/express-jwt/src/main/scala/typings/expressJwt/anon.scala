package typings.expressJwt

import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressUnless.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
    def apply(options: js.Function1[/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], Boolean]): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
    def apply(options: Options): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
  }
  
  trait Message extends StObject {
    
    var message: String
  }
  object Message {
    
    @scala.inline
    def apply(message: String): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
