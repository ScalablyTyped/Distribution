package typings.firebaseDatabase

import typings.firebaseAppTypes.privateMod.FirebaseAuthTokenData
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreAuthTokenProviderMod {
  
  @JSImport("@firebase/database/dist/src/core/AuthTokenProvider", "EmulatorTokenProvider")
  @js.native
  open class EmulatorTokenProvider protected ()
    extends StObject
       with AuthTokenProvider {
    def this(accessToken: String) = this()
    
    /* private */ var accessToken: Any = js.native
    
    /* CompleteClass */
    override def addTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def getToken(forceRefresh: Boolean): js.Promise[FirebaseAuthTokenData] = js.native
    
    /* CompleteClass */
    override def notifyForInvalidToken(): Unit = js.native
    
    /* CompleteClass */
    override def removeTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
  }
  /* static members */
  object EmulatorTokenProvider {
    
    @JSImport("@firebase/database/dist/src/core/AuthTokenProvider", "EmulatorTokenProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /** A string that is treated as an admin access token by the RTDB emulator. Used by Admin SDK. */
    @JSImport("@firebase/database/dist/src/core/AuthTokenProvider", "EmulatorTokenProvider.OWNER")
    @js.native
    def OWNER: String = js.native
    inline def OWNER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OWNER")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/database/dist/src/core/AuthTokenProvider", "FirebaseAuthTokenProvider")
  @js.native
  open class FirebaseAuthTokenProvider protected ()
    extends StObject
       with AuthTokenProvider {
    def this(
      appName_ : String,
      firebaseOptions_ : js.Object,
      authProvider_ : Provider[FirebaseAuthInternalName]
    ) = this()
    
    /* CompleteClass */
    override def addTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
    
    /* private */ var appName_ : Any = js.native
    
    /* private */ var authProvider_ : Any = js.native
    
    /* private */ var auth_ : Any = js.native
    
    /* private */ var firebaseOptions_ : Any = js.native
    
    /* CompleteClass */
    override def getToken(forceRefresh: Boolean): js.Promise[FirebaseAuthTokenData] = js.native
    
    /* CompleteClass */
    override def notifyForInvalidToken(): Unit = js.native
    
    /* CompleteClass */
    override def removeTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
  }
  
  trait AuthTokenProvider extends StObject {
    
    def addTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): Unit
    
    def getToken(forceRefresh: Boolean): js.Promise[FirebaseAuthTokenData]
    
    def notifyForInvalidToken(): Unit
    
    def removeTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): Unit
  }
  object AuthTokenProvider {
    
    inline def apply(
      addTokenChangeListener: js.Function1[/* token */ String | Null, Unit] => Unit,
      getToken: Boolean => js.Promise[FirebaseAuthTokenData],
      notifyForInvalidToken: () => Unit,
      removeTokenChangeListener: js.Function1[/* token */ String | Null, Unit] => Unit
    ): AuthTokenProvider = {
      val __obj = js.Dynamic.literal(addTokenChangeListener = js.Any.fromFunction1(addTokenChangeListener), getToken = js.Any.fromFunction1(getToken), notifyForInvalidToken = js.Any.fromFunction0(notifyForInvalidToken), removeTokenChangeListener = js.Any.fromFunction1(removeTokenChangeListener))
      __obj.asInstanceOf[AuthTokenProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthTokenProvider] (val x: Self) extends AnyVal {
      
      inline def setAddTokenChangeListener(value: js.Function1[/* token */ String | Null, Unit] => Unit): Self = StObject.set(x, "addTokenChangeListener", js.Any.fromFunction1(value))
      
      inline def setGetToken(value: Boolean => js.Promise[FirebaseAuthTokenData]): Self = StObject.set(x, "getToken", js.Any.fromFunction1(value))
      
      inline def setNotifyForInvalidToken(value: () => Unit): Self = StObject.set(x, "notifyForInvalidToken", js.Any.fromFunction0(value))
      
      inline def setRemoveTokenChangeListener(value: js.Function1[/* token */ String | Null, Unit] => Unit): Self = StObject.set(x, "removeTokenChangeListener", js.Any.fromFunction1(value))
    }
  }
}
