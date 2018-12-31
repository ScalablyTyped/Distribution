package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFilterViewRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `filter` is implied and should not be specified.
    * A single `"&#42;"` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** The new properties of the filter view. */
  var filter: js.UndefOr[FilterView] = js.undefined
}

