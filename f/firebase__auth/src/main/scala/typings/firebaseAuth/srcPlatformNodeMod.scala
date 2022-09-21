package typings.firebaseAuth

import org.scalablytyped.runtime.Instantiable0
import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseApp.mod.FirebaseError
import typings.firebaseAuth.modelPublicTypesMod.Auth
import typings.firebaseAuth.modelPublicTypesMod.Persistence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPlatformNodeMod {
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@firebase/auth/dist/esm2017/src/platform_node", "PhoneAuthProvider")
  @js.native
  open class PhoneAuthProvider ()
    extends StObject
       with FailClass
  @JSImport("@firebase/auth/dist/esm2017/src/platform_node", "PhoneAuthProvider")
  @js.native
  val PhoneAuthProvider: Instantiable0[FailClass] = js.native
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_node", "PhoneMultiFactorGenerator")
  @js.native
  open class PhoneMultiFactorGenerator () extends StObject
  /* static members */
  object PhoneMultiFactorGenerator {
    
    @JSImport("@firebase/auth/dist/esm2017/src/platform_node", "PhoneMultiFactorGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def assertion(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assertion")().asInstanceOf[Any]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@firebase/auth/dist/esm2017/src/platform_node", "RecaptchaVerifier")
  @js.native
  open class RecaptchaVerifier ()
    extends StObject
       with FailClass
  @JSImport("@firebase/auth/dist/esm2017/src/platform_node", "RecaptchaVerifier")
  @js.native
  val RecaptchaVerifier: Instantiable0[FailClass] = js.native
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_node", "browserLocalPersistence")
  @js.native
  val browserLocalPersistence: Persistence = js.native
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_node", "browserPopupRedirectResolver")
  @js.native
  val browserPopupRedirectResolver: FirebaseError = js.native
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_node", "browserSessionPersistence")
  @js.native
  val browserSessionPersistence: Persistence = js.native
  
  inline def getAuth(): Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuth")().asInstanceOf[Auth]
  inline def getAuth(app: FirebaseApp): Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuth")(app.asInstanceOf[js.Any]).asInstanceOf[Auth]
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_node", "getRedirectResult")
  @js.native
  val getRedirectResult: js.Function0[js.Promise[Unit]] = js.native
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_node", "indexedDBLocalPersistence")
  @js.native
  val indexedDBLocalPersistence: Persistence = js.native
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_node", "linkWithPhoneNumber")
  @js.native
  val linkWithPhoneNumber: js.Function0[js.Promise[Unit]] = js.native
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_node", "linkWithPopup")
  @js.native
  val linkWithPopup: js.Function0[js.Promise[Unit]] = js.native
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_node", "linkWithRedirect")
  @js.native
  val linkWithRedirect: js.Function0[js.Promise[Unit]] = js.native
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_node", "reauthenticateWithPhoneNumber")
  @js.native
  val reauthenticateWithPhoneNumber: js.Function0[js.Promise[Unit]] = js.native
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_node", "reauthenticateWithPopup")
  @js.native
  val reauthenticateWithPopup: js.Function0[js.Promise[Unit]] = js.native
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_node", "reauthenticateWithRedirect")
  @js.native
  val reauthenticateWithRedirect: js.Function0[js.Promise[Unit]] = js.native
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_node", "signInWithPhoneNumber")
  @js.native
  val signInWithPhoneNumber: js.Function0[js.Promise[Unit]] = js.native
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_node", "signInWithPopup")
  @js.native
  val signInWithPopup: js.Function0[js.Promise[Unit]] = js.native
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_node", "signInWithRedirect")
  @js.native
  val signInWithRedirect: js.Function0[js.Promise[Unit]] = js.native
  
  @JSImport("@firebase/auth/dist/esm2017/src/platform_node", "updatePhoneNumber")
  @js.native
  val updatePhoneNumber: js.Function0[js.Promise[Unit]] = js.native
  
  /**
    * A class which will throw with
    * auth/operation-not-supported-in-this-environment if instantiated
    */
  trait FailClass extends StObject
}
