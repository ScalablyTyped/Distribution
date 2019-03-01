package typings
package gapiDotClientDotProximitybeaconLib.gapiNs.clientNs.proximitybeaconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EphemeralIdRegistrationParams extends js.Object {
  /**
    * Indicates the maximum rotation period supported by the service.
    * See EddystoneEidRegistration.rotation_period_exponent
    */
  var maxRotationPeriodExponent: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates the minimum rotation period supported by the service.
    * See EddystoneEidRegistration.rotation_period_exponent
    */
  var minRotationPeriodExponent: js.UndefOr[scala.Double] = js.undefined
  /**
    * The beacon service's public key for use by a beacon to derive its
    * Identity Key using Elliptic Curve Diffie-Hellman key exchange.
    */
  var serviceEcdhPublicKey: js.UndefOr[java.lang.String] = js.undefined
}

object EphemeralIdRegistrationParams {
  @scala.inline
  def apply(
    maxRotationPeriodExponent: scala.Int | scala.Double = null,
    minRotationPeriodExponent: scala.Int | scala.Double = null,
    serviceEcdhPublicKey: java.lang.String = null
  ): EphemeralIdRegistrationParams = {
    val __obj = js.Dynamic.literal()
    if (maxRotationPeriodExponent != null) __obj.updateDynamic("maxRotationPeriodExponent")(maxRotationPeriodExponent.asInstanceOf[js.Any])
    if (minRotationPeriodExponent != null) __obj.updateDynamic("minRotationPeriodExponent")(minRotationPeriodExponent.asInstanceOf[js.Any])
    if (serviceEcdhPublicKey != null) __obj.updateDynamic("serviceEcdhPublicKey")(serviceEcdhPublicKey)
    __obj.asInstanceOf[EphemeralIdRegistrationParams]
  }
}

