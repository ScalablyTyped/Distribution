package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a political geography.
  */
@js.native
trait SchemaGeographicDivision extends js.Object {
  /**
    * Any other valid OCD IDs that refer to the same division.  Because OCD IDs
    * are meant to be human-readable and at least somewhat predictable, there
    * are occasionally several identifiers for a single division. These
    * identifiers are defined to be equivalent to one another, and one is
    * always indicated as the primary identifier. The primary identifier will
    * be returned in ocd_id above, and any other equivalent valid identifiers
    * will be returned in this list.  For example, if this division&#39;s OCD
    * ID is ocd-division/country:us/district:dc, this will contain
    * ocd-division/country:us/state:dc.
    */
  var alsoKnownAs: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name of the division.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * List of indices in the offices array, one for each office elected from
    * this division. Will only be present if includeOffices was true (or
    * absent) in the request.
    */
  var officeIndices: js.UndefOr[js.Array[Double]] = js.native
}

object SchemaGeographicDivision {
  @scala.inline
  def apply(alsoKnownAs: js.Array[String] = null, name: String = null, officeIndices: js.Array[Double] = null): SchemaGeographicDivision = {
    val __obj = js.Dynamic.literal()
    if (alsoKnownAs != null) __obj.updateDynamic("alsoKnownAs")(alsoKnownAs.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (officeIndices != null) __obj.updateDynamic("officeIndices")(officeIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGeographicDivision]
  }
}

