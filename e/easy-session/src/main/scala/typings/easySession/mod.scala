package typings.easySession

import typings.easySession.anon.FnCall
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("easy-session", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def checkRole(role: String): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkRole")(role.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  @scala.inline
  def checkRole(role: String, errorCallback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkRole")(role.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @scala.inline
  def isFresh(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("isFresh")().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  @scala.inline
  def isFresh(errorCallback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("isFresh")(errorCallback.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @scala.inline
  def isLoggedIn(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoggedIn")().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  @scala.inline
  def isLoggedIn(errorCallback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoggedIn")(errorCallback.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @scala.inline
  def main(session: FnCall): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("main")(session.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  @scala.inline
  def main(session: FnCall, options: SessionOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = (^.asInstanceOf[js.Dynamic].applyDynamic("main")(session.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  trait SessionOptions extends StObject {
    
    var freshTimeout: js.UndefOr[Double] = js.undefined
    
    var ipCheck: js.UndefOr[Boolean] = js.undefined
    
    var maxFreshTimeout: js.UndefOr[Double] = js.undefined
    
    var uaCheck: js.UndefOr[Boolean] = js.undefined
  }
  object SessionOptions {
    
    @scala.inline
    def apply(): SessionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionOptions]
    }
    
    @scala.inline
    implicit class SessionOptionsMutableBuilder[Self <: SessionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFreshTimeout(value: Double): Self = StObject.set(x, "freshTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreshTimeoutUndefined: Self = StObject.set(x, "freshTimeout", js.undefined)
      
      @scala.inline
      def setIpCheck(value: Boolean): Self = StObject.set(x, "ipCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpCheckUndefined: Self = StObject.set(x, "ipCheck", js.undefined)
      
      @scala.inline
      def setMaxFreshTimeout(value: Double): Self = StObject.set(x, "maxFreshTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFreshTimeoutUndefined: Self = StObject.set(x, "maxFreshTimeout", js.undefined)
      
      @scala.inline
      def setUaCheck(value: Boolean): Self = StObject.set(x, "uaCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUaCheckUndefined: Self = StObject.set(x, "uaCheck", js.undefined)
    }
  }
  
  /* augmented module */
  object expressSessionAugmentingMod {
    
    @js.native
    trait Session extends StObject {
      
      def getRole(): String = js.native
      
      def hasRole(role: String): Boolean = js.native
      
      def isFresh(): Boolean = js.native
      
      def isGuest(): Boolean = js.native
      
      def isLoggedIn(): Boolean = js.native
      def isLoggedIn(role: String): Boolean = js.native
      
      def login(callback: js.Function): Unit = js.native
      def login(extend: js.Object, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
      def login(role: String, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
      def login(role: String, extend: js.Object, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
      
      def logout(callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
      
      def setRole(role: String): Session = js.native
    }
  }
}
