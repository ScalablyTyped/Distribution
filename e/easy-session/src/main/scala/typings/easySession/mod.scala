package typings.easySession

import typings.easySession.anon.FnCall
import typings.express.mod.RequestHandler
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("easy-session", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkRole(role: String): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkRole")(role.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def checkRole(role: String, errorCallback: js.Function1[/* err */ js.UndefOr[Any], Unit]): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkRole")(role.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  inline def isFresh(): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("isFresh")().asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def isFresh(errorCallback: js.Function1[/* err */ js.UndefOr[Any], Unit]): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("isFresh")(errorCallback.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  inline def isLoggedIn(): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoggedIn")().asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def isLoggedIn(errorCallback: js.Function1[/* err */ js.UndefOr[Any], Unit]): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoggedIn")(errorCallback.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  inline def main(session: FnCall): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("main")(session.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def main(session: FnCall, options: SessionOptions): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("main")(session.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  trait SessionOptions extends StObject {
    
    var freshTimeout: js.UndefOr[Double] = js.undefined
    
    var ipCheck: js.UndefOr[Boolean] = js.undefined
    
    var maxFreshTimeout: js.UndefOr[Double] = js.undefined
    
    var uaCheck: js.UndefOr[Boolean] = js.undefined
  }
  object SessionOptions {
    
    inline def apply(): SessionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionOptions]
    }
    
    extension [Self <: SessionOptions](x: Self) {
      
      inline def setFreshTimeout(value: Double): Self = StObject.set(x, "freshTimeout", value.asInstanceOf[js.Any])
      
      inline def setFreshTimeoutUndefined: Self = StObject.set(x, "freshTimeout", js.undefined)
      
      inline def setIpCheck(value: Boolean): Self = StObject.set(x, "ipCheck", value.asInstanceOf[js.Any])
      
      inline def setIpCheckUndefined: Self = StObject.set(x, "ipCheck", js.undefined)
      
      inline def setMaxFreshTimeout(value: Double): Self = StObject.set(x, "maxFreshTimeout", value.asInstanceOf[js.Any])
      
      inline def setMaxFreshTimeoutUndefined: Self = StObject.set(x, "maxFreshTimeout", js.undefined)
      
      inline def setUaCheck(value: Boolean): Self = StObject.set(x, "uaCheck", value.asInstanceOf[js.Any])
      
      inline def setUaCheckUndefined: Self = StObject.set(x, "uaCheck", js.undefined)
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
      def login(extend: js.Object, callback: js.Function1[/* err */ js.UndefOr[Any], Unit]): Unit = js.native
      def login(role: String, callback: js.Function1[/* err */ js.UndefOr[Any], Unit]): Unit = js.native
      def login(role: String, extend: js.Object, callback: js.Function1[/* err */ js.UndefOr[Any], Unit]): Unit = js.native
      
      def logout(callback: js.Function1[/* err */ js.UndefOr[Any], Unit]): Unit = js.native
      
      def setRole(role: String): Session = js.native
    }
  }
}
