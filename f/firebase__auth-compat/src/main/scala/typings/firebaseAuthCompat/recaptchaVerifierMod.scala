package typings.firebaseAuthCompat

import typings.firebaseAuthCompat.mod.FirebaseApp
import typings.firebaseUtil.mod.Compat
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recaptchaVerifierMod {
  
  @JSImport("@firebase/auth-compat/dist/auth-compat/src/recaptcha_verifier", "RecaptchaVerifier")
  @js.native
  open class RecaptchaVerifier protected ()
    extends typings.firebaseAuthTypes.mod.RecaptchaVerifier
       with Compat[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.ApplicationVerifier */ Any
        ] {
    def this(container: String) = this()
    def this(container: HTMLElement) = this()
    def this(container: String, parameters: js.Object) = this()
    def this(container: HTMLElement, parameters: js.Object) = this()
    def this(container: String, parameters: js.Object, app: FirebaseApp) = this()
    def this(container: String, parameters: Null, app: FirebaseApp) = this()
    def this(container: String, parameters: Unit, app: FirebaseApp) = this()
    def this(container: HTMLElement, parameters: js.Object, app: FirebaseApp) = this()
    def this(container: HTMLElement, parameters: Null, app: FirebaseApp) = this()
    def this(container: HTMLElement, parameters: Unit, app: FirebaseApp) = this()
    
    /* CompleteClass */
    var _delegate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify exp.ApplicationVerifier */ Any = js.native
    
    /* CompleteClass */
    /* InferMemberOverrides */
    override def verify(): js.Promise[String] = js.native
  }
}
