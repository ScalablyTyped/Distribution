package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UpdateProtectedRangeRequest extends js.Object {
  /**
               * The fields that should be updated.  At least one field must be specified.
               * The root `protectedRange` is implied and should not be specified.
               * A single `"&#42;"` can be used as short-hand for listing every field.
               */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** The protected range to update with the new properties. */
  var protectedRange: js.UndefOr[ProtectedRange] = js.undefined
}

