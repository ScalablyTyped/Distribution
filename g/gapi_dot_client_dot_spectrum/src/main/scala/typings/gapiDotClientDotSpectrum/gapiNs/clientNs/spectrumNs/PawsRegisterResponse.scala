package typings.gapiDotClientDotSpectrum.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PawsRegisterResponse extends js.Object {
  /**
    * A database may include the databaseChange parameter to notify a device of a change to its database URI, providing one or more alternate database URIs.
    * The device should use this information to update its list of pre-configured databases by (only) replacing its entry for the responding database with
    * the list of alternate URIs.
    */
  var databaseChange: js.UndefOr[DbUpdateSpec] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "spectrum#pawsRegisterResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The message type (e.g., INIT_REQ, AVAIL_SPECTRUM_REQ, ...).
    *
    * Required field.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * The PAWS version. Must be exactly 1.0.
    *
    * Required field.
    */
  var version: js.UndefOr[String] = js.undefined
}

object PawsRegisterResponse {
  @scala.inline
  def apply(
    databaseChange: DbUpdateSpec = null,
    kind: String = null,
    `type`: String = null,
    version: String = null
  ): PawsRegisterResponse = {
    val __obj = js.Dynamic.literal()
    if (databaseChange != null) __obj.updateDynamic("databaseChange")(databaseChange)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[PawsRegisterResponse]
  }
}

