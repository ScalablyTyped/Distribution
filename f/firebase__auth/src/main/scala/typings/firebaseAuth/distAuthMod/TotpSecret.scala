package typings.firebaseAuth.distAuthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/auth", "TotpSecret")
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
  
  @JSImport("@firebase/auth/dist/auth", "TotpSecret")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def _fromStartTotpMfaEnrollmentResponse(response: StartTotpMfaEnrollmentResponse, auth: AuthInternal): TotpSecret = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromStartTotpMfaEnrollmentResponse")(response.asInstanceOf[js.Any], auth.asInstanceOf[js.Any])).asInstanceOf[TotpSecret]
}
