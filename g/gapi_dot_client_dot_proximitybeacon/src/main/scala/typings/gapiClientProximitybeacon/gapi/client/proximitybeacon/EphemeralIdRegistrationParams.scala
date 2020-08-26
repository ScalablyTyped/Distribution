package typings.gapiClientProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EphemeralIdRegistrationParams extends js.Object {
  /**
    * Indicates the maximum rotation period supported by the service.
    * See EddystoneEidRegistration.rotation_period_exponent
    */
  var maxRotationPeriodExponent: js.UndefOr[Double] = js.native
  /**
    * Indicates the minimum rotation period supported by the service.
    * See EddystoneEidRegistration.rotation_period_exponent
    */
  var minRotationPeriodExponent: js.UndefOr[Double] = js.native
  /**
    * The beacon service's public key for use by a beacon to derive its
    * Identity Key using Elliptic Curve Diffie-Hellman key exchange.
    */
  var serviceEcdhPublicKey: js.UndefOr[String] = js.native
}

object EphemeralIdRegistrationParams {
  @scala.inline
  def apply(): EphemeralIdRegistrationParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EphemeralIdRegistrationParams]
  }
  @scala.inline
  implicit class EphemeralIdRegistrationParamsOps[Self <: EphemeralIdRegistrationParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaxRotationPeriodExponent(value: Double): Self = this.set("maxRotationPeriodExponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRotationPeriodExponent: Self = this.set("maxRotationPeriodExponent", js.undefined)
    @scala.inline
    def setMinRotationPeriodExponent(value: Double): Self = this.set("minRotationPeriodExponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinRotationPeriodExponent: Self = this.set("minRotationPeriodExponent", js.undefined)
    @scala.inline
    def setServiceEcdhPublicKey(value: String): Self = this.set("serviceEcdhPublicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceEcdhPublicKey: Self = this.set("serviceEcdhPublicKey", js.undefined)
  }
  
}

