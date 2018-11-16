package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DimensionProperties extends js.Object {
  /** The developer metadata associated with a single row or column. */
  var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.undefined
  /**
               * True if this dimension is being filtered.
               * This field is read-only.
               */
  var hiddenByFilter: js.UndefOr[scala.Boolean] = js.undefined
  /** True if this dimension is explicitly hidden. */
  var hiddenByUser: js.UndefOr[scala.Boolean] = js.undefined
  /** The height (if a row) or width (if a column) of the dimension in pixels. */
  var pixelSize: js.UndefOr[scala.Double] = js.undefined
}

