package typings.firebaseAuth

import typings.firebaseAuth.distBrowserCjsSrcApiAccountManagementMfaMod.StartTotpMfaEnrollmentResponse
import typings.firebaseAuth.distBrowserCjsSrcApiAccountManagementMfaMod.TotpVerificationInfo
import typings.firebaseAuth.distBrowserCjsSrcMfaMfaAssertionMod.MultiFactorAssertionImpl
import typings.firebaseAuth.distBrowserCjsSrcModelAuthMod.AuthInternal
import typings.firebaseAuth.distBrowserCjsSrcModelPublicTypesMod.MultiFactorSession
import typings.firebaseAuth.distBrowserCjsSrcModelPublicTypesMod.TotpMultiFactorAssertion
import typings.firebaseAuth.firebaseAuthStrings.totp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBrowserCjsSrcMfaAssertionsTotpMod {
  
  @JSImport("@firebase/auth/dist/browser-cjs/src/mfa/assertions/totp", "TotpMultiFactorAssertionImpl")
  @js.native
  open class TotpMultiFactorAssertionImpl protected () extends MultiFactorAssertionImpl {
    def this(otp: String) = this()
    def this(otp: String, enrollmentId: String) = this()
    def this(otp: String, enrollmentId: String, secret: TotpSecret) = this()
    def this(otp: String, enrollmentId: Unit, secret: TotpSecret) = this()
    
    val enrollmentId: js.UndefOr[String] = js.native
    
    val otp: String = js.native
    
    val secret: js.UndefOr[TotpSecret] = js.native
  }
  /* static members */
  object TotpMultiFactorAssertionImpl {
    
    @JSImport("@firebase/auth/dist/browser-cjs/src/mfa/assertions/totp", "TotpMultiFactorAssertionImpl")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def _fromEnrollmentId(enrollmentId: String, otp: String): TotpMultiFactorAssertionImpl = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromEnrollmentId")(enrollmentId.asInstanceOf[js.Any], otp.asInstanceOf[js.Any])).asInstanceOf[TotpMultiFactorAssertionImpl]
    
    /** @internal */
    inline def _fromSecret(secret: TotpSecret, otp: String): TotpMultiFactorAssertionImpl = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromSecret")(secret.asInstanceOf[js.Any], otp.asInstanceOf[js.Any])).asInstanceOf[TotpMultiFactorAssertionImpl]
  }
  
  @JSImport("@firebase/auth/dist/browser-cjs/src/mfa/assertions/totp", "TotpMultiFactorGenerator")
  @js.native
  open class TotpMultiFactorGenerator () extends StObject
  /* static members */
  object TotpMultiFactorGenerator {
    
    @JSImport("@firebase/auth/dist/browser-cjs/src/mfa/assertions/totp", "TotpMultiFactorGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The identifier of the TOTP second factor: `totp`.
      */
    @JSImport("@firebase/auth/dist/browser-cjs/src/mfa/assertions/totp", "TotpMultiFactorGenerator.FACTOR_ID")
    @js.native
    def FACTOR_ID: totp = js.native
    inline def FACTOR_ID_=(x: totp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FACTOR_ID")(x.asInstanceOf[js.Any])
    
    /**
      * Provides a {@link TotpMultiFactorAssertion} to confirm ownership of
      * the TOTP (time-based one-time password) second factor.
      * This assertion is used to complete enrollment in TOTP second factor.
      *
      * @param secret A {@link TotpSecret} containing the shared secret key and other TOTP parameters.
      * @param oneTimePassword One-time password from TOTP App.
      * @returns A {@link TotpMultiFactorAssertion} which can be used with
      * {@link MultiFactorUser.enroll}.
      */
    inline def assertionForEnrollment(secret: TotpSecret, oneTimePassword: String): TotpMultiFactorAssertion = (^.asInstanceOf[js.Dynamic].applyDynamic("assertionForEnrollment")(secret.asInstanceOf[js.Any], oneTimePassword.asInstanceOf[js.Any])).asInstanceOf[TotpMultiFactorAssertion]
    
    /**
      * Provides a {@link TotpMultiFactorAssertion} to confirm ownership of the TOTP second factor.
      * This assertion is used to complete signIn with TOTP as the second factor.
      *
      * @param enrollmentId identifies the enrolled TOTP second factor.
      * @param oneTimePassword One-time password from TOTP App.
      * @returns A {@link TotpMultiFactorAssertion} which can be used with
      * {@link MultiFactorResolver.resolveSignIn}.
      */
    inline def assertionForSignIn(enrollmentId: String, oneTimePassword: String): TotpMultiFactorAssertion = (^.asInstanceOf[js.Dynamic].applyDynamic("assertionForSignIn")(enrollmentId.asInstanceOf[js.Any], oneTimePassword.asInstanceOf[js.Any])).asInstanceOf[TotpMultiFactorAssertion]
    
    /**
      * Returns a promise to {@link TotpSecret} which contains the TOTP shared secret key and other parameters.
      * Creates a TOTP secret as part of enrolling a TOTP second factor.
      * Used for generating a QR code URL or inputting into a TOTP app.
      * This method uses the auth instance corresponding to the user in the multiFactorSession.
      *
      * @param session The {@link MultiFactorSession} that the user is part of.
      * @returns A promise to {@link TotpSecret}.
      */
    inline def generateSecret(session: MultiFactorSession): js.Promise[TotpSecret] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSecret")(session.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TotpSecret]]
  }
  
  @JSImport("@firebase/auth/dist/browser-cjs/src/mfa/assertions/totp", "TotpSecret")
  @js.native
  /* private */ open class TotpSecret () extends StObject {
    
    /** @internal */
    def _makeTotpVerificationInfo(otp: String): TotpVerificationInfo = js.native
    
    /* private */ val auth: Any = js.native
    
    /**
      * The interval (in seconds) when the OTP codes should change.
      */
    val codeIntervalSeconds: Double = js.native
    
    /**
      * Length of the one-time passwords to be generated.
      */
    val codeLength: Double = js.native
    
    /**
      * The timestamp (UTC string) by which TOTP enrollment should be completed.
      */
    val enrollmentCompletionDeadline: String = js.native
    
    /**
      * Returns a QR code URL as described in
      * https://github.com/google/google-authenticator/wiki/Key-Uri-Format
      * This can be displayed to the user as a QR code to be scanned into a TOTP app like Google Authenticator.
      * If the optional parameters are unspecified, an accountName of <userEmail> and issuer of <firebaseAppName> are used.
      *
      * @param accountName the name of the account/app along with a user identifier.
      * @param issuer issuer of the TOTP (likely the app name).
      * @returns A QR code URL string.
      */
    def generateQrCodeUrl(): String = js.native
    def generateQrCodeUrl(accountName: String): String = js.native
    def generateQrCodeUrl(accountName: String, issuer: String): String = js.native
    def generateQrCodeUrl(accountName: Unit, issuer: String): String = js.native
    
    /**
      * Hashing algorithm used.
      */
    val hashingAlgorithm: String = js.native
    
    /**
      * Shared secret key/seed used for enrolling in TOTP MFA and generating OTPs.
      */
    val secretKey: String = js.native
    
    /* private */ val sessionInfo: Any = js.native
  }
  /* static members */
  object TotpSecret {
    
    @JSImport("@firebase/auth/dist/browser-cjs/src/mfa/assertions/totp", "TotpSecret")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def _fromStartTotpMfaEnrollmentResponse(response: StartTotpMfaEnrollmentResponse, auth: AuthInternal): TotpSecret = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromStartTotpMfaEnrollmentResponse")(response.asInstanceOf[js.Any], auth.asInstanceOf[js.Any])).asInstanceOf[TotpSecret]
  }
}
