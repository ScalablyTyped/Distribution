package typings.gapiClientCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Office extends js.Object {
  /** The OCD ID of the division with which this office is associated. */
  var divisionId: js.UndefOr[String] = js.undefined
  /**
    * The levels of government of which this office is part. There may be more than one in cases where a jurisdiction effectively acts at two different
    * levels of government; for example, the mayor of the District of Columbia acts at "locality" level, but also effectively at both "administrative-area-2"
    * and "administrative-area-1".
    */
  var levels: js.UndefOr[js.Array[String]] = js.undefined
  /** The human-readable name of the office. */
  var name: js.UndefOr[String] = js.undefined
  /** List of indices in the officials array of people who presently hold this office. */
  var officialIndices: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * The roles which this office fulfills. Roles are not meant to be exhaustive, or to exactly specify the entire set of responsibilities of a given office,
    * but are meant to be rough categories that are useful for general selection from or sorting of a list of offices.
    */
  var roles: js.UndefOr[js.Array[String]] = js.undefined
  /** A list of sources for this office. If multiple sources are listed, the data has been aggregated from those sources. */
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
}

object Office {
  @scala.inline
  def apply(
    divisionId: String = null,
    levels: js.Array[String] = null,
    name: String = null,
    officialIndices: js.Array[Double] = null,
    roles: js.Array[String] = null,
    sources: js.Array[Source] = null
  ): Office = {
    val __obj = js.Dynamic.literal()
    if (divisionId != null) __obj.updateDynamic("divisionId")(divisionId.asInstanceOf[js.Any])
    if (levels != null) __obj.updateDynamic("levels")(levels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (officialIndices != null) __obj.updateDynamic("officialIndices")(officialIndices.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Office]
  }
}

