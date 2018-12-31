package typings
package gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Office extends js.Object {
  /** The OCD ID of the division with which this office is associated. */
  var divisionId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The levels of government of which this office is part. There may be more than one in cases where a jurisdiction effectively acts at two different
    * levels of government; for example, the mayor of the District of Columbia acts at "locality" level, but also effectively at both "administrative-area-2"
    * and "administrative-area-1".
    */
  var levels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The human-readable name of the office. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** List of indices in the officials array of people who presently hold this office. */
  var officialIndices: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * The roles which this office fulfills. Roles are not meant to be exhaustive, or to exactly specify the entire set of responsibilities of a given office,
    * but are meant to be rough categories that are useful for general selection from or sorting of a list of offices.
    */
  var roles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A list of sources for this office. If multiple sources are listed, the data has been aggregated from those sources. */
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
}

