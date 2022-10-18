package typings.firebaseAuth

import typings.firebaseAuth.distNodeSrcCoreCredentialsPhoneMod.PhoneAuthCredential
import typings.firebaseAuth.distNodeSrcMfaMfaAssertionMod.MultiFactorAssertionImpl
import typings.firebaseAuth.distNodeSrcModelPublicTypesMod.PhoneMultiFactorAssertion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSrcPlatformBrowserMfaAssertionsPhoneMod {
  
  @JSImport("@firebase/auth/dist/node/src/platform_browser/mfa/assertions/phone", "PhoneMultiFactorAssertionImpl")
  @js.native
  /* private */ open class PhoneMultiFactorAssertionImpl () extends MultiFactorAssertionImpl {
    
    /* private */ val credential: Any = js.native
  }
  /* static members */
  object PhoneMultiFactorAssertionImpl {
    
    @JSImport("@firebase/auth/dist/node/src/platform_browser/mfa/assertions/phone", "PhoneMultiFactorAssertionImpl")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def _fromCredential(credential: PhoneAuthCredential): PhoneMultiFactorAssertionImpl = ^.asInstanceOf[js.Dynamic].applyDynamic("_fromCredential")(credential.asInstanceOf[js.Any]).asInstanceOf[PhoneMultiFactorAssertionImpl]
  }
  
  @JSImport("@firebase/auth/dist/node/src/platform_browser/mfa/assertions/phone", "PhoneMultiFactorGenerator")
  @js.native
  /* private */ open class PhoneMultiFactorGenerator () extends StObject
  /* static members */
  object PhoneMultiFactorGenerator {
    
    @JSImport("@firebase/auth/dist/node/src/platform_browser/mfa/assertions/phone", "PhoneMultiFactorGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The identifier of the phone second factor: `phone`.
      */
    @JSImport("@firebase/auth/dist/node/src/platform_browser/mfa/assertions/phone", "PhoneMultiFactorGenerator.FACTOR_ID")
    @js.native
    def FACTOR_ID: String = js.native
    inline def FACTOR_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACTOR_ID")(x.asInstanceOf[js.Any])
    
    /**
      * Provides a {@link PhoneMultiFactorAssertion} to confirm ownership of the phone second factor.
      *
      * @param phoneAuthCredential - A credential provided by {@link PhoneAuthProvider.credential}.
      * @returns A {@link PhoneMultiFactorAssertion} which can be used with
      * {@link MultiFactorResolver.resolveSignIn}
      */
    inline def assertion(credential: PhoneAuthCredential): PhoneMultiFactorAssertion = ^.asInstanceOf[js.Dynamic].applyDynamic("assertion")(credential.asInstanceOf[js.Any]).asInstanceOf[PhoneMultiFactorAssertion]
  }
}
