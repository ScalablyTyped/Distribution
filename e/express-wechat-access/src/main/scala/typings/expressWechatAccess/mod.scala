package typings.expressWechatAccess

import typings.express.mod.NextFunction
import typings.expressWechatAccess.anon.AccessTokenUrl
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.node.httpMod.ServerResponse
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(options: AccessTokenUrl): WeMiddleware = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[WeMiddleware]
  @scala.inline
  def apply(options: AccessTokenUrl, errorHandler: js.Function1[/* e */ js.Any, js.Any]): WeMiddleware = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any])).asInstanceOf[WeMiddleware]
  
  @JSImport("express-wechat-access", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait WeAccessMidOption extends StObject {
    
    var accessTokenUrl: js.UndefOr[String] = js.undefined
    
    var appId: String
    
    var appSecret: String
    
    var https: js.UndefOr[Boolean] = js.undefined
    
    var ticketUrl: js.UndefOr[String] = js.undefined
  }
  object WeAccessMidOption {
    
    @scala.inline
    def apply(appId: String, appSecret: String): WeAccessMidOption = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], appSecret = appSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[WeAccessMidOption]
    }
    
    @scala.inline
    implicit class WeAccessMidOptionMutableBuilder[Self <: WeAccessMidOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessTokenUrl(value: String): Self = StObject.set(x, "accessTokenUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessTokenUrlUndefined: Self = StObject.set(x, "accessTokenUrl", js.undefined)
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppSecret(value: String): Self = StObject.set(x, "appSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      @scala.inline
      def setTicketUrl(value: String): Self = StObject.set(x, "ticketUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicketUrlUndefined: Self = StObject.set(x, "ticketUrl", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.node.eventsMod.EventEmitter because Inheritance from two classes. Inlined  */ @js.native
  trait WeAccessMiddleware
    extends WeMiddleware
       with EventEmitter {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* req */ js.Any, arg2: /* res */ Response | ServerResponse, arg3: /* next */ NextFunction): js.Any = js.native
  }
  
  type WeMiddleware = js.Function3[/* req */ js.Any, /* res */ Response | ServerResponse, /* next */ NextFunction, js.Any]
}
