package typings
package gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepresentativeInfoResponse extends js.Object {
  /** Political geographic divisions that contain the requested address. */
  var divisions: js.UndefOr[stdLib.Record[java.lang.String, GeographicDivision]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "civicinfo#representativeInfoResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The normalized version of the requested address */
  var normalizedInput: js.UndefOr[SimpleAddressType] = js.undefined
  /** Elected offices referenced by the divisions listed above. Will only be present if includeOffices was true in the request. */
  var offices: js.UndefOr[js.Array[Office]] = js.undefined
  /** Officials holding the offices listed above. Will only be present if includeOffices was true in the request. */
  var officials: js.UndefOr[js.Array[Official]] = js.undefined
}

object RepresentativeInfoResponse {
  @scala.inline
  def apply(
    divisions: stdLib.Record[java.lang.String, GeographicDivision] = null,
    kind: java.lang.String = null,
    normalizedInput: SimpleAddressType = null,
    offices: js.Array[Office] = null,
    officials: js.Array[Official] = null
  ): RepresentativeInfoResponse = {
    val __obj = js.Dynamic.literal()
    if (divisions != null) __obj.updateDynamic("divisions")(divisions)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (normalizedInput != null) __obj.updateDynamic("normalizedInput")(normalizedInput)
    if (offices != null) __obj.updateDynamic("offices")(offices)
    if (officials != null) __obj.updateDynamic("officials")(officials)
    __obj.asInstanceOf[RepresentativeInfoResponse]
  }
}

