package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a political geographic division that matches the requested
  * query.
  */
@js.native
trait Schema$DivisionSearchResult extends js.Object {
  /**
    * Other Open Civic Data identifiers that refer to the same division -- for
    * example, those that refer to other political divisions whose boundaries
    * are defined to be coterminous with this one. For example,
    * ocd-division/country:us/state:wy will include an alias of
    * ocd-division/country:us/state:wy/cd:1, since Wyoming has only one
    * Congressional district.
    */
  var aliases: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name of the division.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The unique Open Civic Data identifier for this division.
    */
  var ocdId: js.UndefOr[String] = js.native
}

object Schema$DivisionSearchResult {
  @scala.inline
  def apply(aliases: js.Array[String] = null, name: String = null, ocdId: String = null): Schema$DivisionSearchResult = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ocdId != null) __obj.updateDynamic("ocdId")(ocdId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DivisionSearchResult]
  }
}

