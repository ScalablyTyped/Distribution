package typings.easySession

import typings.easySession.anon.FnCall
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("easy-session", "checkRole")
  @js.native
  def checkRole(role: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("easy-session", "checkRole")
  @js.native
  def checkRole(role: String, errorCallback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("easy-session", "isFresh")
  @js.native
  def isFresh(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("easy-session", "isFresh")
  @js.native
  def isFresh(errorCallback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("easy-session", "isLoggedIn")
  @js.native
  def isLoggedIn(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("easy-session", "isLoggedIn")
  @js.native
  def isLoggedIn(errorCallback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("easy-session", "main")
  @js.native
  def main(session: FnCall): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("easy-session", "main")
  @js.native
  def main(session: FnCall, options: SessionOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @js.native
  trait SessionOptions extends StObject {
    
    var freshTimeout: js.UndefOr[Double] = js.native
    
    var ipCheck: js.UndefOr[Boolean] = js.native
    
    var maxFreshTimeout: js.UndefOr[Double] = js.native
    
    var uaCheck: js.UndefOr[Boolean] = js.native
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
