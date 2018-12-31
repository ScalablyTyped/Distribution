package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasteDataRequest extends js.Object {
  /** The coordinate at which the data should start being inserted. */
  var coordinate: js.UndefOr[GridCoordinate] = js.undefined
  /** The data to insert. */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /** The delimiter in the data. */
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  /** True if the data is HTML. */
  var html: js.UndefOr[scala.Boolean] = js.undefined
  /** How the data should be pasted. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

