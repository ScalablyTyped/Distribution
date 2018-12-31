package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataFilter extends js.Object {
  /** Selects data that matches the specified A1 range. */
  var a1Range: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Selects data associated with the developer metadata matching the criteria
    * described by this DeveloperMetadataLookup.
    */
  var developerMetadataLookup: js.UndefOr[DeveloperMetadataLookup] = js.undefined
  /** Selects data that matches the range described by the GridRange. */
  var gridRange: js.UndefOr[GridRange] = js.undefined
}

