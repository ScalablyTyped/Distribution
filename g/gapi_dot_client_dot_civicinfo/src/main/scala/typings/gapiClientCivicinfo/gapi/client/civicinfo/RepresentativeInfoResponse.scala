package typings.gapiClientCivicinfo.gapi.client.civicinfo

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepresentativeInfoResponse extends js.Object {
  /** Political geographic divisions that contain the requested address. */
  var divisions: js.UndefOr[Record[String, GeographicDivision]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "civicinfo#representativeInfoResponse". */
  var kind: js.UndefOr[String] = js.undefined
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
    divisions: Record[String, GeographicDivision] = null,
    kind: String = null,
    normalizedInput: SimpleAddressType = null,
    offices: js.Array[Office] = null,
    officials: js.Array[Official] = null
  ): RepresentativeInfoResponse = {
    val __obj = js.Dynamic.literal()
    if (divisions != null) __obj.updateDynamic("divisions")(divisions.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (normalizedInput != null) __obj.updateDynamic("normalizedInput")(normalizedInput.asInstanceOf[js.Any])
    if (offices != null) __obj.updateDynamic("offices")(offices.asInstanceOf[js.Any])
    if (officials != null) __obj.updateDynamic("officials")(officials.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepresentativeInfoResponse]
  }
}

