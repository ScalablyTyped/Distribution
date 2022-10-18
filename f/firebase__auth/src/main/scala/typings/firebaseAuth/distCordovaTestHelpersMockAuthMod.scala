package typings.firebaseAuth

import typings.firebaseAuth.distCordovaSrcCoreAuthAuthImplMod.AuthImpl
import typings.firebaseAuth.distCordovaSrcCorePersistenceInMemoryMod.InMemoryPersistence_
import typings.firebaseAuth.distCordovaSrcCorePersistenceMod.PersistedBlob
import typings.firebaseAuth.distCordovaSrcModelAuthMod.AuthInternal
import typings.firebaseAuth.distCordovaSrcModelPublicTypesMod.PopupRedirectResolver
import typings.firebaseAuth.distCordovaSrcModelUserMod.UserInternal
import typings.firebaseAuth.firebaseAuthStrings.heartbeat
import typings.firebaseComponent.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCordovaTestHelpersMockAuthMod {
  
  @JSImport("@firebase/auth/dist/cordova/test/helpers/mock_auth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object FAKE_HEARTBEAT_CONTROLLER {
    
    @JSImport("@firebase/auth/dist/cordova/test/helpers/mock_auth", "FAKE_HEARTBEAT_CONTROLLER")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getHeartbeatsHeader(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeartbeatsHeader")().asInstanceOf[js.Promise[String]]
  }
  
  @JSImport("@firebase/auth/dist/cordova/test/helpers/mock_auth", "FAKE_HEARTBEAT_CONTROLLER_PROVIDER")
  @js.native
  val FAKE_HEARTBEAT_CONTROLLER_PROVIDER: Provider[heartbeat] = js.native
  
  @JSImport("@firebase/auth/dist/cordova/test/helpers/mock_auth", "MockPersistenceLayer")
  @js.native
  open class MockPersistenceLayer () extends InMemoryPersistence_ {
    
    def _set(key: String, `object`: PersistedBlob): js.Promise[Unit] = js.native
    
    var lastObjectSet: PersistedBlob | Null = js.native
  }
  
  @JSImport("@firebase/auth/dist/cordova/test/helpers/mock_auth", "TEST_AUTH_DOMAIN")
  @js.native
  val TEST_AUTH_DOMAIN: /* "localhost" */ String = js.native
  
  @JSImport("@firebase/auth/dist/cordova/test/helpers/mock_auth", "TEST_HOST")
  @js.native
  val TEST_HOST: /* "localhost" */ String = js.native
  
  @JSImport("@firebase/auth/dist/cordova/test/helpers/mock_auth", "TEST_KEY")
  @js.native
  val TEST_KEY: /* "test-api-key" */ String = js.native
  
  @JSImport("@firebase/auth/dist/cordova/test/helpers/mock_auth", "TEST_SCHEME")
  @js.native
  val TEST_SCHEME: /* "mock" */ String = js.native
  
  @JSImport("@firebase/auth/dist/cordova/test/helpers/mock_auth", "TEST_TOKEN_HOST")
  @js.native
  val TEST_TOKEN_HOST: /* "localhost/token" */ String = js.native
  
  inline def testAuth(): js.Promise[TestAuth_] = ^.asInstanceOf[js.Dynamic].applyDynamic("testAuth")().asInstanceOf[js.Promise[TestAuth_]]
  inline def testAuth(popupRedirectResolver: Unit, persistence: MockPersistenceLayer): js.Promise[TestAuth_] = (^.asInstanceOf[js.Dynamic].applyDynamic("testAuth")(popupRedirectResolver.asInstanceOf[js.Any], persistence.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TestAuth_]]
  inline def testAuth(popupRedirectResolver: PopupRedirectResolver): js.Promise[TestAuth_] = ^.asInstanceOf[js.Dynamic].applyDynamic("testAuth")(popupRedirectResolver.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TestAuth_]]
  inline def testAuth(popupRedirectResolver: PopupRedirectResolver, persistence: MockPersistenceLayer): js.Promise[TestAuth_] = (^.asInstanceOf[js.Dynamic].applyDynamic("testAuth")(popupRedirectResolver.asInstanceOf[js.Any], persistence.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TestAuth_]]
  
  inline def testUser(auth: AuthInternal, uid: String): UserInternal = (^.asInstanceOf[js.Dynamic].applyDynamic("testUser")(auth.asInstanceOf[js.Any], uid.asInstanceOf[js.Any])).asInstanceOf[UserInternal]
  inline def testUser(auth: AuthInternal, uid: String, email: String): UserInternal = (^.asInstanceOf[js.Dynamic].applyDynamic("testUser")(auth.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[UserInternal]
  inline def testUser(auth: AuthInternal, uid: String, email: String, fakeTokens: Boolean): UserInternal = (^.asInstanceOf[js.Dynamic].applyDynamic("testUser")(auth.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], email.asInstanceOf[js.Any], fakeTokens.asInstanceOf[js.Any])).asInstanceOf[UserInternal]
  inline def testUser(auth: AuthInternal, uid: String, email: Unit, fakeTokens: Boolean): UserInternal = (^.asInstanceOf[js.Dynamic].applyDynamic("testUser")(auth.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], email.asInstanceOf[js.Any], fakeTokens.asInstanceOf[js.Any])).asInstanceOf[UserInternal]
  
  @js.native
  trait TestAuth_ extends AuthImpl {
    
    var persistenceLayer: MockPersistenceLayer = js.native
  }
}
