package typings.firebaseAuth.distBrowserCjsIndexDotnodeMod

import typings.firebaseAuth.distBrowserCjsSrcModelPublicTypesMod.MultiFactorSession
import typings.firebaseAuth.distBrowserCjsSrcModelPublicTypesMod.TotpMultiFactorAssertion
import typings.firebaseAuth.firebaseAuthStrings.totp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/browser-cjs/index.node", "TotpMultiFactorGenerator")
@js.native
open class TotpMultiFactorGenerator ()
  extends typings.firebaseAuth.distBrowserCjsMod.TotpMultiFactorGenerator
/* static members */
object TotpMultiFactorGenerator {
  
  @JSImport("@firebase/auth/dist/browser-cjs/index.node", "TotpMultiFactorGenerator")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The identifier of the TOTP second factor: `totp`.
    */
  @JSImport("@firebase/auth/dist/browser-cjs/index.node", "TotpMultiFactorGenerator.FACTOR_ID")
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
  inline def assertionForEnrollment(
    secret: typings.firebaseAuth.distBrowserCjsSrcMfaAssertionsTotpMod.TotpSecret,
    oneTimePassword: String
  ): TotpMultiFactorAssertion = (^.asInstanceOf[js.Dynamic].applyDynamic("assertionForEnrollment")(secret.asInstanceOf[js.Any], oneTimePassword.asInstanceOf[js.Any])).asInstanceOf[TotpMultiFactorAssertion]
  
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
  inline def generateSecret(session: MultiFactorSession): js.Promise[typings.firebaseAuth.distBrowserCjsSrcMfaAssertionsTotpMod.TotpSecret] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSecret")(session.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.firebaseAuth.distBrowserCjsSrcMfaAssertionsTotpMod.TotpSecret]]
}
