package typings.gapiDotClientDotSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PawsInitResponse extends js.Object {
  /**
    * A database may include the databaseChange parameter to notify a device of a change to its database URI, providing one or more alternate database URIs.
    * The device should use this information to update its list of pre-configured databases by (only) replacing its entry for the responding database with
    * the list of alternate URIs.
    */
  var databaseChange: js.UndefOr[DbUpdateSpec] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "spectrum#pawsInitResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The rulesetInfo parameter must be included in the response. This parameter specifies the regulatory domain and parameters applicable to that domain.
    * The database must include the authority field, which defines the regulatory domain for the location specified in the INIT_REQ message.
    */
  var rulesetInfo: js.UndefOr[RulesetInfo] = js.undefined
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

object PawsInitResponse {
  @scala.inline
  def apply(
    databaseChange: DbUpdateSpec = null,
    kind: String = null,
    rulesetInfo: RulesetInfo = null,
    `type`: String = null,
    version: String = null
  ): PawsInitResponse = {
    val __obj = js.Dynamic.literal()
    if (databaseChange != null) __obj.updateDynamic("databaseChange")(databaseChange.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (rulesetInfo != null) __obj.updateDynamic("rulesetInfo")(rulesetInfo.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PawsInitResponse]
  }
}

