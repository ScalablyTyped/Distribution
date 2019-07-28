package typings.gapiDotClientDotCloudkms.gapiNs.clientNs.cloudkmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoKeyVersion extends js.Object {
  /** Output only. The time at which this CryptoKeyVersion was created. */
  var createTime: js.UndefOr[String] = js.undefined
  /**
    * Output only. The time this CryptoKeyVersion's key material was
    * destroyed. Only present if state is
    * DESTROYED.
    */
  var destroyEventTime: js.UndefOr[String] = js.undefined
  /**
    * Output only. The time this CryptoKeyVersion's key material is scheduled
    * for destruction. Only present if state is
    * DESTROY_SCHEDULED.
    */
  var destroyTime: js.UndefOr[String] = js.undefined
  /**
    * Output only. The resource name for this CryptoKeyVersion in the format
    * `projects/&#42;/locations/&#42;/keyRings/&#42;/cryptoKeys/&#42;/cryptoKeyVersions/&#42;`.
    */
  var name: js.UndefOr[String] = js.undefined
  /** The current state of the CryptoKeyVersion. */
  var state: js.UndefOr[String] = js.undefined
}

object CryptoKeyVersion {
  @scala.inline
  def apply(
    createTime: String = null,
    destroyEventTime: String = null,
    destroyTime: String = null,
    name: String = null,
    state: String = null
  ): CryptoKeyVersion = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime)
    if (destroyEventTime != null) __obj.updateDynamic("destroyEventTime")(destroyEventTime)
    if (destroyTime != null) __obj.updateDynamic("destroyTime")(destroyTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[CryptoKeyVersion]
  }
}

