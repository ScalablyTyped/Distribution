package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGroupValueMetadata extends js.Object {
  /** True if the data corresponding to the value is collapsed. */
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The calculated value the metadata corresponds to.
    * (Note that formulaValue is not valid,
    * because the values will be calculated.)
    */
  var value: js.UndefOr[ExtendedValue] = js.undefined
}

