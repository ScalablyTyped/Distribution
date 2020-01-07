package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about an Office held by one or more Officials.
  */
@js.native
trait Schema$Office extends js.Object {
  /**
    * The OCD ID of the division with which this office is associated.
    */
  var divisionId: js.UndefOr[String] = js.native
  /**
    * The levels of government of which this office is part. There may be more
    * than one in cases where a jurisdiction effectively acts at two different
    * levels of government; for example, the mayor of the District of Columbia
    * acts at &quot;locality&quot; level, but also effectively at both
    * &quot;administrative-area-2&quot; and &quot;administrative-area-1&quot;.
    */
  var levels: js.UndefOr[js.Array[String]] = js.native
  /**
    * The human-readable name of the office.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * List of indices in the officials array of people who presently hold this
    * office.
    */
  var officialIndices: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The roles which this office fulfills. Roles are not meant to be
    * exhaustive, or to exactly specify the entire set of responsibilities of a
    * given office, but are meant to be rough categories that are useful for
    * general selection from or sorting of a list of offices.
    */
  var roles: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of sources for this office. If multiple sources are listed, the
    * data has been aggregated from those sources.
    */
  var sources: js.UndefOr[js.Array[Schema$Source]] = js.native
}

object Schema$Office {
  @scala.inline
  def apply(
    divisionId: String = null,
    levels: js.Array[String] = null,
    name: String = null,
    officialIndices: js.Array[Double] = null,
    roles: js.Array[String] = null,
    sources: js.Array[Schema$Source] = null
  ): Schema$Office = {
    val __obj = js.Dynamic.literal()
    if (divisionId != null) __obj.updateDynamic("divisionId")(divisionId.asInstanceOf[js.Any])
    if (levels != null) __obj.updateDynamic("levels")(levels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (officialIndices != null) __obj.updateDynamic("officialIndices")(officialIndices.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Office]
  }
}

