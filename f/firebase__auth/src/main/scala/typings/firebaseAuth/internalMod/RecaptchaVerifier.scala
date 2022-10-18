package typings.firebaseAuth.internalMod

import typings.firebaseAuth.distSrcModelPublicTypesMod.Auth
import typings.firebaseAuth.distSrcModelPublicTypesMod.RecaptchaParameters
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/internal", "RecaptchaVerifier")
@js.native
open class RecaptchaVerifier protected ()
  extends typings.firebaseAuth.distInternalMod.RecaptchaVerifier {
  def this(containerOrId: String, parameters: RecaptchaParameters, authExtern: Auth) = this()
  /**
    *
    * @param containerOrId - The reCAPTCHA container parameter.
    *
    * @remarks
    * This has different meaning depending on whether the reCAPTCHA is hidden or visible. For a
    * visible reCAPTCHA the container must be empty. If a string is used, it has to correspond to
    * an element ID. The corresponding element must also must be in the DOM at the time of
    * initialization.
    *
    * @param parameters - The optional reCAPTCHA parameters.
    *
    * @remarks
    * Check the reCAPTCHA docs for a comprehensive list. All parameters are accepted except for
    * the sitekey. Firebase Auth backend provisions a reCAPTCHA for each project and will
    * configure this upon rendering. For an invisible reCAPTCHA, a size key must have the value
    * 'invisible'.
    *
    * @param authExtern - The corresponding Firebase {@link Auth} instance.
    */
  def this(containerOrId: HTMLElement, parameters: RecaptchaParameters, authExtern: Auth) = this()
}
