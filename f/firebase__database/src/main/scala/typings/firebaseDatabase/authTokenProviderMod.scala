package typings.firebaseDatabase

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseAppTypes.privateMod.FirebaseAuthTokenData
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authTokenProviderMod {
  
  @JSImport("@firebase/database/dist/src/core/AuthTokenProvider", "EmulatorAdminTokenProvider")
  @js.native
  class EmulatorAdminTokenProvider () extends AuthTokenProvider
  /* static members */
  object EmulatorAdminTokenProvider {
    
    @JSImport("@firebase/database/dist/src/core/AuthTokenProvider", "EmulatorAdminTokenProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/database/dist/src/core/AuthTokenProvider", "EmulatorAdminTokenProvider.EMULATOR_AUTH_TOKEN")
    @js.native
    def EMULATOR_AUTH_TOKEN: js.Any = js.native
    @scala.inline
    def EMULATOR_AUTH_TOKEN_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMULATOR_AUTH_TOKEN")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/database/dist/src/core/AuthTokenProvider", "FirebaseAuthTokenProvider")
  @js.native
  class FirebaseAuthTokenProvider protected () extends AuthTokenProvider {
    def this(app_ : FirebaseApp, authProvider_ : Provider[FirebaseAuthInternalName]) = this()
    
    var app_ : js.Any = js.native
    
    var authProvider_ : js.Any = js.native
    
    var auth_ : js.Any = js.native
  }
  
  @js.native
  trait AuthTokenProvider extends StObject {
    
    def addTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
    
    def getToken(forceRefresh: Boolean): js.Promise[FirebaseAuthTokenData] = js.native
    
    def notifyForInvalidToken(): Unit = js.native
    
    def removeTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
  }
  object AuthTokenProvider {
    
    @scala.inline
    def apply(
      addTokenChangeListener: js.Function1[/* token */ String | Null, Unit] => Unit,
      getToken: Boolean => js.Promise[FirebaseAuthTokenData],
      notifyForInvalidToken: () => Unit,
      removeTokenChangeListener: js.Function1[/* token */ String | Null, Unit] => Unit
    ): AuthTokenProvider = {
      val __obj = js.Dynamic.literal(addTokenChangeListener = js.Any.fromFunction1(addTokenChangeListener), getToken = js.Any.fromFunction1(getToken), notifyForInvalidToken = js.Any.fromFunction0(notifyForInvalidToken), removeTokenChangeListener = js.Any.fromFunction1(removeTokenChangeListener))
      __obj.asInstanceOf[AuthTokenProvider]
    }
    
    @scala.inline
    implicit class AuthTokenProviderMutableBuilder[Self <: AuthTokenProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddTokenChangeListener(value: js.Function1[/* token */ String | Null, Unit] => Unit): Self = StObject.set(x, "addTokenChangeListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetToken(value: Boolean => js.Promise[FirebaseAuthTokenData]): Self = StObject.set(x, "getToken", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotifyForInvalidToken(value: () => Unit): Self = StObject.set(x, "notifyForInvalidToken", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveTokenChangeListener(value: js.Function1[/* token */ String | Null, Unit] => Unit): Self = StObject.set(x, "removeTokenChangeListener", js.Any.fromFunction1(value))
    }
  }
}
