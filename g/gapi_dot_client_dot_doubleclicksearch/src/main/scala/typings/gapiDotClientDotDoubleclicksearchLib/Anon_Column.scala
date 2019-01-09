package typings
package gapiDotClientDotDoubleclicksearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  /** Column to perform the filter on. This can be a DoubleClick Search column or a saved column. */
  var column: js.UndefOr[
    gapiDotClientDotDoubleclicksearchLib.gapiNs.clientNs.doubleclicksearchNs.ReportApiColumnSpec
  ] = js.undefined
  /** Operator to use in the filter. See the filter reference for a list of available operators. */
  var operator: js.UndefOr[java.lang.String] = js.undefined
  /** A list of values to filter the column value against. */
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

