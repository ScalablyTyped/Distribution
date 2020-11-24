package typings.firebase.mod.default.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An {@link https://www.google.com/recaptcha/ reCAPTCHA}-based application
  * verifier.
  *
  * @webonly
  *
  * @param container The reCAPTCHA container parameter. This
  *     has different meaning depending on whether the reCAPTCHA is hidden or
  *     visible. For a visible reCAPTCHA the container must be empty. If a string
  *     is used, it has to correspond to an element ID. The corresponding element
  *     must also must be in the DOM at the time of initialization.
  * @param parameters The optional reCAPTCHA parameters. Check the
  *     reCAPTCHA docs for a comprehensive list. All parameters are accepted
  *     except for the sitekey. Firebase Auth backend provisions a reCAPTCHA for
  *     each project and will configure this upon rendering. For an invisible
  *     reCAPTCHA, a size key must have the value 'invisible'.
  * @param app The corresponding Firebase app. If none is
  *     provided, the default Firebase App instance is used. A Firebase App
  *     instance must be initialized with an API key, otherwise an error will be
  *     thrown.
  */
@JSImport("firebase", "auth.RecaptchaVerifier")
@js.native
class RecaptchaVerifier ()
  extends typings.firebase.mod.firebase.auth.RecaptchaVerifierInstance
