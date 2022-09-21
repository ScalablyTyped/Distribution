package typings.firebaseAuth

import typings.firebaseAuth.firebaseAuthStrings.phone
import typings.firebaseAuth.nodeSrcCoreCredentialsPhoneMod.PhoneAuthCredential
import typings.firebaseAuth.nodeSrcCoreMod.AuthCredential
import typings.firebaseAuth.nodeSrcModelPublicTypesMod.ApplicationVerifier
import typings.firebaseAuth.nodeSrcModelPublicTypesMod.Auth
import typings.firebaseAuth.nodeSrcModelPublicTypesMod.PhoneInfoOptions
import typings.firebaseAuth.nodeSrcModelPublicTypesMod.UserCredential
import typings.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeSrcPlatformBrowserProvidersPhoneMod {
  
  @JSImport("@firebase/auth/dist/node/src/platform_browser/providers/phone", "PhoneAuthProvider")
  @js.native
  open class PhoneAuthProvider protected () extends StObject {
    /**
      * @param auth - The Firebase {@link Auth} instance in which sign-ins should occur.
      *
      */
    def this(auth: Auth) = this()
    
    /* private */ val auth: Any = js.native
    
    /** Always set to {@link ProviderId}.PHONE. */
    val providerId: phone = js.native
    
    def verifyPhoneNumber(phoneOptions: String, applicationVerifier: ApplicationVerifier): js.Promise[String] = js.native
    /**
      *
      * Starts a phone number authentication flow by sending a verification code to the given phone
      * number.
      *
      * @example
      * ```javascript
      * const provider = new PhoneAuthProvider(auth);
      * const verificationId = await provider.verifyPhoneNumber(phoneNumber, applicationVerifier);
      * // Obtain verificationCode from the user.
      * const authCredential = PhoneAuthProvider.credential(verificationId, verificationCode);
      * const userCredential = await signInWithCredential(auth, authCredential);
      * ```
      *
      * @example
      * An alternative flow is provided using the `signInWithPhoneNumber` method.
      * ```javascript
      * const confirmationResult = signInWithPhoneNumber(auth, phoneNumber, applicationVerifier);
      * // Obtain verificationCode from the user.
      * const userCredential = confirmationResult.confirm(verificationCode);
      * ```
      *
      * @param phoneInfoOptions - The user's {@link PhoneInfoOptions}. The phone number should be in
      * E.164 format (e.g. +16505550101).
      * @param applicationVerifier - For abuse prevention, this method also requires a
      * {@link ApplicationVerifier}. This SDK includes a reCAPTCHA-based implementation,
      * {@link RecaptchaVerifier}.
      *
      * @returns A Promise for a verification ID that can be passed to
      * {@link PhoneAuthProvider.credential} to identify this flow..
      */
    def verifyPhoneNumber(phoneOptions: PhoneInfoOptions, applicationVerifier: ApplicationVerifier): js.Promise[String] = js.native
  }
  /* static members */
  object PhoneAuthProvider {
    
    @JSImport("@firebase/auth/dist/node/src/platform_browser/providers/phone", "PhoneAuthProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /** Always set to {@link SignInMethod}.PHONE. */
    @JSImport("@firebase/auth/dist/node/src/platform_browser/providers/phone", "PhoneAuthProvider.PHONE_SIGN_IN_METHOD")
    @js.native
    val PHONE_SIGN_IN_METHOD: phone = js.native
    
    /** Always set to {@link ProviderId}.PHONE. */
    @JSImport("@firebase/auth/dist/node/src/platform_browser/providers/phone", "PhoneAuthProvider.PROVIDER_ID")
    @js.native
    val PROVIDER_ID: phone = js.native
    
    /**
      * Creates a phone auth credential, given the verification ID from
      * {@link PhoneAuthProvider.verifyPhoneNumber} and the code that was sent to the user's
      * mobile device.
      *
      * @example
      * ```javascript
      * const provider = new PhoneAuthProvider(auth);
      * const verificationId = provider.verifyPhoneNumber(phoneNumber, applicationVerifier);
      * // Obtain verificationCode from the user.
      * const authCredential = PhoneAuthProvider.credential(verificationId, verificationCode);
      * const userCredential = signInWithCredential(auth, authCredential);
      * ```
      *
      * @example
      * An alternative flow is provided using the `signInWithPhoneNumber` method.
      * ```javascript
      * const confirmationResult = await signInWithPhoneNumber(auth, phoneNumber, applicationVerifier);
      * // Obtain verificationCode from the user.
      * const userCredential = await confirmationResult.confirm(verificationCode);
      * ```
      *
      * @param verificationId - The verification ID returned from {@link PhoneAuthProvider.verifyPhoneNumber}.
      * @param verificationCode - The verification code sent to the user's mobile device.
      *
      * @returns The auth provider credential.
      */
    inline def credential(verificationId: String, verificationCode: String): PhoneAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(verificationId.asInstanceOf[js.Any], verificationCode.asInstanceOf[js.Any])).asInstanceOf[PhoneAuthCredential]
    
    /**
      * Returns an {@link AuthCredential} when passed an error.
      *
      * @remarks
      *
      * This method works for errors like
      * `auth/account-exists-with-different-credentials`. This is useful for
      * recovering when attempting to set a user's phone number but the number
      * in question is already tied to another account. For example, the following
      * code tries to update the current user's phone number, and if that
      * fails, links the user with the account associated with that number:
      *
      * ```js
      * const provider = new PhoneAuthProvider(auth);
      * const verificationId = await provider.verifyPhoneNumber(number, verifier);
      * try {
      *   const code = ''; // Prompt the user for the verification code
      *   await updatePhoneNumber(
      *       auth.currentUser,
      *       PhoneAuthProvider.credential(verificationId, code));
      * } catch (e) {
      *   if ((e as FirebaseError)?.code === 'auth/account-exists-with-different-credential') {
      *     const cred = PhoneAuthProvider.credentialFromError(e);
      *     await linkWithCredential(auth.currentUser, cred);
      *   }
      * }
      *
      * // At this point, auth.currentUser.phoneNumber === number.
      * ```
      *
      * @param error - The error to generate a credential from.
      */
    inline def credentialFromError(error: FirebaseError): AuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[AuthCredential | Null]
    
    /**
      * Generates an {@link AuthCredential} from a {@link UserCredential}.
      * @param userCredential - The user credential.
      */
    inline def credentialFromResult(userCredential: UserCredential): AuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[AuthCredential | Null]
    
    @JSImport("@firebase/auth/dist/node/src/platform_browser/providers/phone", "PhoneAuthProvider.credentialFromTaggedObject")
    @js.native
    def credentialFromTaggedObject: Any = js.native
    inline def credentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("credentialFromTaggedObject")(x.asInstanceOf[js.Any])
  }
}
