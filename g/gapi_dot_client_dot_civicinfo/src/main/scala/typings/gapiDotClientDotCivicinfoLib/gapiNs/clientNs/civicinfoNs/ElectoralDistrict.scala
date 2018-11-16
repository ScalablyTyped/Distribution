package typings
package gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ElectoralDistrict extends js.Object {
  /** An identifier for this district, relative to its scope. For example, the 34th State Senate district would have id "34" and a scope of stateUpper. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kgForeignKey: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the district. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The geographic scope of this district. If unspecified the district's geography is not known. One of: national, statewide, congressional, stateUpper,
               * stateLower, countywide, judicial, schoolBoard, cityWide, township, countyCouncil, cityCouncil, ward, special
               */
  var scope: js.UndefOr[java.lang.String] = js.undefined
}

