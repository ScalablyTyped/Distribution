package typings.feathersjsAuthenticationClient

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.feathersjsAuthenticationClient.anon.Typeofself
import typings.std.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@feathersjs/authentication-client", JSImport.Default)
  @js.native
  val default: (js.Function1[/* config */ js.UndefOr[FeathersAuthClientConfig], js.Function0[Unit]]) & Typeofself = js.native
  
  object defaults {
    
    @JSImport("@feathersjs/authentication-client", "defaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@feathersjs/authentication-client", "defaults.cookie")
    @js.native
    def cookie: String = js.native
    inline def cookie_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cookie")(x.asInstanceOf[js.Any])
    
    @JSImport("@feathersjs/authentication-client", "defaults.entity")
    @js.native
    def entity: String = js.native
    inline def entity_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("entity")(x.asInstanceOf[js.Any])
    
    @JSImport("@feathersjs/authentication-client", "defaults.header")
    @js.native
    def header: String = js.native
    inline def header_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("header")(x.asInstanceOf[js.Any])
    
    @JSImport("@feathersjs/authentication-client", "defaults.jwtStrategy")
    @js.native
    def jwtStrategy: String = js.native
    inline def jwtStrategy_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jwtStrategy")(x.asInstanceOf[js.Any])
    
    @JSImport("@feathersjs/authentication-client", "defaults.path")
    @js.native
    def path: String = js.native
    inline def path_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
    
    @JSImport("@feathersjs/authentication-client", "defaults.service")
    @js.native
    def service: String = js.native
    inline def service_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("service")(x.asInstanceOf[js.Any])
    
    @JSImport("@feathersjs/authentication-client", "defaults.storageKey")
    @js.native
    def storageKey: String = js.native
    inline def storageKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storageKey")(x.asInstanceOf[js.Any])
    
    @JSImport("@feathersjs/authentication-client", "defaults.timeout")
    @js.native
    def timeout: Double = js.native
    inline def timeout_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  trait FeathersAuthClientConfig extends StObject {
    
    var cookie: js.UndefOr[String] = js.undefined
    
    var entity: js.UndefOr[String] = js.undefined
    
    var header: js.UndefOr[String] = js.undefined
    
    var jwtStrategy: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var service: js.UndefOr[String] = js.undefined
    
    var storage: js.UndefOr[Storage] = js.undefined
    
    var storageKey: js.UndefOr[String] = js.undefined
  }
  object FeathersAuthClientConfig {
    
    inline def apply(): FeathersAuthClientConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeathersAuthClientConfig]
    }
    
    extension [Self <: FeathersAuthClientConfig](x: Self) {
      
      inline def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setJwtStrategy(value: String): Self = StObject.set(x, "jwtStrategy", value.asInstanceOf[js.Any])
      
      inline def setJwtStrategyUndefined: Self = StObject.set(x, "jwtStrategy", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      inline def setStorage(value: Storage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
      
      inline def setStorageKeyUndefined: Self = StObject.set(x, "storageKey", js.undefined)
      
      inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    }
  }
  
  trait FeathersAuthCredentials
    extends StObject
       with /* index */ StringDictionary[js.Any] {
    
    var strategy: String
  }
  object FeathersAuthCredentials {
    
    inline def apply(strategy: String): FeathersAuthCredentials = {
      val __obj = js.Dynamic.literal(strategy = strategy.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeathersAuthCredentials]
    }
    
    extension [Self <: FeathersAuthCredentials](x: Self) {
      
      inline def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Passport extends StObject {
    
    def authenticate(): js.Any = js.native
    def authenticate(credentials: FeathersAuthCredentials): js.Any = js.native
    
    def authenticateSocket(credentials: FeathersAuthCredentials, socket: js.Any, emit: js.Any): js.Any = js.native
    
    def clearCookie(name: String): Null = js.native
    
    def connected(): js.Promise[js.Any] = js.native
    
    def getCookie(name: String): String = js.native
    
    def getJWT(): js.Promise[js.Any] = js.native
    
    def getStorage(storage: js.Any): js.Any = js.native
    
    def logout(): js.Promise[js.Any] = js.native
    
    def logoutSocket(socket: js.Any, emit: js.Any): js.Promise[js.Any] = js.native
    
    def payloadIsValid(payload: String): Boolean = js.native
    
    def setJWT(data: js.Any): js.Promise[js.Any] = js.native
    
    def setupSocketListeners(): Unit = js.native
    
    def verifyJWT(token: String): js.Promise[js.Any] = js.native
  }
  
  type _To = (js.Function1[/* config */ js.UndefOr[FeathersAuthClientConfig], js.Function0[Unit]]) & Typeofself
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: (js.Function1[/* config */ js.UndefOr[FeathersAuthClientConfig], js.Function0[Unit]]) & Typeofself = default
  
  object feathersjsFeathersAugmentingMod {
    
    @js.native
    trait Application[ServiceTypes] extends StObject {
      
      def authenticate(): js.Promise[js.Any] = js.native
      def authenticate(options: FeathersAuthCredentials): js.Promise[js.Any] = js.native
      
      def logout(): js.Promise[Unit] = js.native
      
      var passport: Passport = js.native
    }
  }
}
