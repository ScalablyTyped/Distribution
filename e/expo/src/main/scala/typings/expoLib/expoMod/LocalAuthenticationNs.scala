package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "LocalAuthentication")
@js.native
object LocalAuthenticationNs extends js.Object {
  /**
    * Attempts to authenticate via Fingerprint. Android: When using the fingerprint module on Android, you need to provide a UI component to prompt the user to scan their fingerprint, as the OS has no default alert for it.
    *
    * @param promptMessage A message that is shown alongside the TouchID/FaceID prompt. (iOS only)
    */
  def authenticateAsync(): js.Promise[LocalAuthenticationResult] = js.native
  def authenticateAsync(promptMessageIOS: java.lang.String): js.Promise[LocalAuthenticationResult] = js.native
  /** Cancels the fingerprint authentication flow. (Android only) */
  def cancelAuthenticate(): scala.Unit = js.native
  /** Determine whether a face or fingerprint scanner is available on the device. */
  def hasHardwareAsync(): js.Promise[scala.Boolean] = js.native
  /** Determine whether the device has saved fingerprints or facial data to use for authentication. */
  def isEnrolledAsync(): js.Promise[scala.Boolean] = js.native
  type LocalAuthenticationResult = expoLib.Anon_Success | expoLib.Anon_ErrorFalse
}

