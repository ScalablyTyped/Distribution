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

