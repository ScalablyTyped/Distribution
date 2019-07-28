package typings.expo.expoMod

import typings.expo.expoMod.LocalAuthenticationNs.AuthenticationTypeType
import typings.expo.expoMod.LocalAuthenticationNs.LocalAuthenticationResult
import typings.expo.expoNumbers.`false`
import typings.expo.expoNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "LocalAuthentication")
@js.native
object LocalAuthenticationNs extends js.Object {
  trait AuthenticationTypeType extends js.Object {
    var FACIAL_RECOGNITION: Double
    var FINGERPRINT: Double
  }
  
  trait LocalAuthenticationResult extends js.Object {
    /** Error code in the case where authentication fails. */
    var error: js.UndefOr[String] = js.undefined
    var success: js.UndefOr[`false` | `true`] = js.undefined
  }
  
  /**
    * Attempts to authenticate via Fingerprint. Android: When using the fingerprint module on Android, you need to provide a UI component to prompt the user to scan their fingerprint, as the OS has no default alert for it.
    *
    * @param promptMessage A message that is shown alongside the TouchID/FaceID prompt. (iOS only)
    */
  def authenticateAsync(): js.Promise[LocalAuthenticationResult] = js.native
  def authenticateAsync(promptMessageIOS: String): js.Promise[LocalAuthenticationResult] = js.native
  /** Cancels the fingerprint authentication flow. (Android only) */
  def cancelAuthenticate(): Unit = js.native
  /** Determine whether a face or fingerprint scanner is available on the device. */
  def hasHardwareAsync(): js.Promise[Boolean] = js.native
  /** Determine whether the device has saved fingerprints or facial data to use for authentication. */
  def isEnrolledAsync(): js.Promise[Boolean] = js.native
  /** Determine the auhentication types supported on the device. */
  def supportedAuthenticationTypesAsync(): js.Promise[js.Array[AuthenticationTypeType]] = js.native
}

