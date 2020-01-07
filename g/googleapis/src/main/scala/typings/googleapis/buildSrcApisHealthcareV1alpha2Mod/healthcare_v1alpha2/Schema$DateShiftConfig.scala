package typings.googleapis.buildSrcApisHealthcareV1alpha2Mod.healthcare_v1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Shift a date forward or backward in time by a random amount which is
  * consistent for a given patient and crypto key combination.
  */
@js.native
trait Schema$DateShiftConfig extends js.Object {
  /**
    * An AES 128/192/256 bit key. Causes the shift to be computed based on this
    * key and the patient ID. A default key is generated for each
    * DeidentifyDataset operation and is used wherever crypto_key is not
    * specified.
    */
  var cryptoKey: js.UndefOr[String] = js.native
}

object Schema$DateShiftConfig {
  @scala.inline
  def apply(cryptoKey: String = null): Schema$DateShiftConfig = {
    val __obj = js.Dynamic.literal()
    if (cryptoKey != null) __obj.updateDynamic("cryptoKey")(cryptoKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DateShiftConfig]
  }
}

