package typings.firebaseAuth

import typings.firebaseAuth.distBrowserCjsSrcCoreCredentialsMod.AuthCredential
import typings.firebaseAuth.distBrowserCjsSrcModelEnumsMod.ProviderId
import typings.firebaseAuth.distBrowserCjsSrcModelEnumsMod.SignInMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBrowserCjsTestHelpersMockAuthCredentialMod {
  
  @JSImport("@firebase/auth/dist/browser-cjs/test/helpers/mock_auth_credential", "MockAuthCredential")
  @js.native
  open class MockAuthCredential protected () extends AuthCredential {
    def this(providerId: ProviderId, signInMethod: SignInMethod) = this()
    
    def fromJSON(_json: String): AuthCredential | Null = js.native
    def fromJSON(_json: js.Object): AuthCredential | Null = js.native
    
    @JSName("providerId")
    val providerId_MockAuthCredential: ProviderId = js.native
    
    @JSName("signInMethod")
    val signInMethod_MockAuthCredential: SignInMethod = js.native
  }
}
