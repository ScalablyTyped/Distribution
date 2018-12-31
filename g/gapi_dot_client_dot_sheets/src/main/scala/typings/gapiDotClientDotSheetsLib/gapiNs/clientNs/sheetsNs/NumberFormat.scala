package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFormat extends js.Object {
  /**
    * Pattern string used for formatting.  If not set, a default pattern based on
    * the user's locale will be used if necessary for the given type.
    * See the [Date and Number Formats guide](/sheets/api/guides/formats) for more
    * information about the supported patterns.
    */
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of the number format.
    * When writing, this field must be set.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

