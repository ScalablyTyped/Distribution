package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UpdateDeveloperMetadataRequest extends js.Object {
  /** The filters matching the developer metadata entries to update. */
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.undefined
  /** The value that all metadata matched by the data filters will be updated to. */
  var developerMetadata: js.UndefOr[DeveloperMetadata] = js.undefined
  /**
               * The fields that should be updated.  At least one field must be specified.
               * The root `developerMetadata` is implied and should not be specified.
               * A single `"&#42;"` can be used as short-hand for listing every field.
               */
  var fields: js.UndefOr[java.lang.String] = js.undefined
}

