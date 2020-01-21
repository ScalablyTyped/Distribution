package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRepresentativeInfoData extends js.Object {
  /**
    * Political geographic divisions that contain the requested address.
    */
  var divisions: js.UndefOr[StringDictionary[SchemaGeographicDivision]] = js.native
  /**
    * Elected offices referenced by the divisions listed above. Will only be
    * present if includeOffices was true in the request.
    */
  var offices: js.UndefOr[js.Array[SchemaOffice]] = js.native
  /**
    * Officials holding the offices listed above. Will only be present if
    * includeOffices was true in the request.
    */
  var officials: js.UndefOr[js.Array[SchemaOfficial]] = js.native
}

object SchemaRepresentativeInfoData {
  @scala.inline
  def apply(
    divisions: StringDictionary[SchemaGeographicDivision] = null,
    offices: js.Array[SchemaOffice] = null,
    officials: js.Array[SchemaOfficial] = null
  ): SchemaRepresentativeInfoData = {
    val __obj = js.Dynamic.literal()
    if (divisions != null) __obj.updateDynamic("divisions")(divisions.asInstanceOf[js.Any])
    if (offices != null) __obj.updateDynamic("offices")(offices.asInstanceOf[js.Any])
    if (officials != null) __obj.updateDynamic("officials")(officials.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRepresentativeInfoData]
  }
}

