package typings.firebaseAuth

import typings.firebaseAuth.distNodeEsmSrcModelApplicationVerifierMod.ApplicationVerifierInternal
import typings.firebaseAuth.distNodeEsmSrcModelPublicTypesMod.Auth
import typings.firebaseAuth.distNodeEsmSrcModelPublicTypesMod.RecaptchaParameters
import typings.firebaseAuth.distNodeEsmSrcPlatformBrowserRecaptchaRecaptchaLoaderMod.ReCaptchaLoader
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcPlatformBrowserRecaptchaRecaptchaVerifierMod {
  
  @JSImport("@firebase/auth/dist/node-esm/src/platform_browser/recaptcha/recaptcha_verifier", "RECAPTCHA_VERIFIER_TYPE")
  @js.native
  val RECAPTCHA_VERIFIER_TYPE: /* "recaptcha" */ String = js.native
  
  @JSImport("@firebase/auth/dist/node-esm/src/platform_browser/recaptcha/recaptcha_verifier", "RecaptchaVerifier")
  @js.native
  open class RecaptchaVerifier protected ()
    extends StObject
       with ApplicationVerifierInternal {
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
    
    /** @internal */
    val _recaptchaLoader: ReCaptchaLoader = js.native
    
    /**
      * @internal
      */
    /* CompleteClass */
    override def _reset(): Unit = js.native
    
    /* private */ var assertNotDestroyed: Any = js.native
    
    /* private */ val auth: Any = js.native
    
    /**
      * Clears the reCAPTCHA widget from the page and destroys the instance.
      */
    def clear(): Unit = js.native
    
    /* private */ val container: Any = js.native
    
    /* private */ var destroyed: Any = js.native
    
    /* private */ var getAssertedRecaptcha: Any = js.native
    
    /* private */ var init: Any = js.native
    
    /* private */ val isInvisible: Any = js.native
    
    /* private */ var makeRenderPromise: Any = js.native
    
    /* private */ var makeTokenCallback: Any = js.native
    
    /* private */ val parameters: Any = js.native
    
    /* private */ var recaptcha: Any = js.native
    
    /**
      * Renders the reCAPTCHA widget on the page.
      *
      * @returns A Promise that resolves with the reCAPTCHA widget ID.
      */
    def render(): js.Promise[Double] = js.native
    
    /* private */ var renderPromise: Any = js.native
    
    /* private */ val tokenChangeListeners: Any = js.native
    
    /**
      * Identifies the type of application verifier (e.g. "recaptcha").
      */
    /* CompleteClass */
    override val `type`: String = js.native
    
    /* private */ var validateStartingState: Any = js.native
    
    /**
      * Executes the verification process.
      *
      * @returns A Promise for a token that can be used to assert the validity of a request.
      */
    /* CompleteClass */
    override def verify(): js.Promise[String] = js.native
    
    /* private */ var widgetId: Any = js.native
  }
}
