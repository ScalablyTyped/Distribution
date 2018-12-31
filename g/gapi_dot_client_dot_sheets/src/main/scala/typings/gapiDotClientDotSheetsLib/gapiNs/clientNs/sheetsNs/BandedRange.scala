package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BandedRange extends js.Object {
  /** The id of the banded range. */
  var bandedRangeId: js.UndefOr[scala.Double] = js.undefined
  /**
    * Properties for column bands. These properties will be applied on a column-
    * by-column basis throughout all the columns in the range. At least one of
    * row_properties or column_properties must be specified.
    */
  var columnProperties: js.UndefOr[BandingProperties] = js.undefined
  /** The range over which these properties are applied. */
  var range: js.UndefOr[GridRange] = js.undefined
  /**
    * Properties for row bands. These properties will be applied on a row-by-row
    * basis throughout all the rows in the range. At least one of
    * row_properties or column_properties must be specified.
    */
  var rowProperties: js.UndefOr[BandingProperties] = js.undefined
}

