package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DuplicateSheetResponse extends js.Object {
  /** The properties of the duplicate sheet. */
  var properties: js.UndefOr[SheetProperties] = js.undefined
}

object DuplicateSheetResponse {
  @scala.inline
  def apply(properties: SheetProperties = null): DuplicateSheetResponse = {
    val __obj = js.Dynamic.literal()
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DuplicateSheetResponse]
  }
}

