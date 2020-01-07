package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RepresentativeInfoData extends js.Object {
  /**
    * Political geographic divisions that contain the requested address.
    */
  var divisions: js.UndefOr[StringDictionary[Schema$GeographicDivision]] = js.native
  /**
    * Elected offices referenced by the divisions listed above. Will only be
    * present if includeOffices was true in the request.
    */
  var offices: js.UndefOr[js.Array[Schema$Office]] = js.native
  /**
    * Officials holding the offices listed above. Will only be present if
    * includeOffices was true in the request.
    */
  var officials: js.UndefOr[js.Array[Schema$Official]] = js.native
}

object Schema$RepresentativeInfoData {
  @scala.inline
  def apply(
    divisions: StringDictionary[Schema$GeographicDivision] = null,
    offices: js.Array[Schema$Office] = null,
    officials: js.Array[Schema$Official] = null
  ): Schema$RepresentativeInfoData = {
    val __obj = js.Dynamic.literal()
    if (divisions != null) __obj.updateDynamic("divisions")(divisions.asInstanceOf[js.Any])
    if (offices != null) __obj.updateDynamic("offices")(offices.asInstanceOf[js.Any])
    if (officials != null) __obj.updateDynamic("officials")(officials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RepresentativeInfoData]
  }
}

