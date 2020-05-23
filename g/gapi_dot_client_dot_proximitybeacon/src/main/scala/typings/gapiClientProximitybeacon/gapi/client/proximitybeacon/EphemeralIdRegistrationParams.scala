package typings.gapiClientProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EphemeralIdRegistrationParams extends js.Object {
  /**
    * Indicates the maximum rotation period supported by the service.
    * See EddystoneEidRegistration.rotation_period_exponent
    */
  var maxRotationPeriodExponent: js.UndefOr[Double] = js.undefined
  /**
    * Indicates the minimum rotation period supported by the service.
    * See EddystoneEidRegistration.rotation_period_exponent
    */
  var minRotationPeriodExponent: js.UndefOr[Double] = js.undefined
  /**
    * The beacon service's public key for use by a beacon to derive its
    * Identity Key using Elliptic Curve Diffie-Hellman key exchange.
    */
  var serviceEcdhPublicKey: js.UndefOr[String] = js.undefined
}

object EphemeralIdRegistrationParams {
  @scala.inline
  def apply(
    maxRotationPeriodExponent: js.UndefOr[Double] = js.undefined,
    minRotationPeriodExponent: js.UndefOr[Double] = js.undefined,
    serviceEcdhPublicKey: String = null
  ): EphemeralIdRegistrationParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxRotationPeriodExponent)) __obj.updateDynamic("maxRotationPeriodExponent")(maxRotationPeriodExponent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minRotationPeriodExponent)) __obj.updateDynamic("minRotationPeriodExponent")(minRotationPeriodExponent.get.asInstanceOf[js.Any])
    if (serviceEcdhPublicKey != null) __obj.updateDynamic("serviceEcdhPublicKey")(serviceEcdhPublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EphemeralIdRegistrationParams]
  }
}

