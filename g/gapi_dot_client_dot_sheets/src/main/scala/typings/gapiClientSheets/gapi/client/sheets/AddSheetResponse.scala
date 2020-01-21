package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddSheetResponse extends js.Object {
  /** The properties of the newly added sheet. */
  var properties: js.UndefOr[SheetProperties] = js.undefined
}

object AddSheetResponse {
  @scala.inline
  def apply(properties: SheetProperties = null): AddSheetResponse = {
    val __obj = js.Dynamic.literal()
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddSheetResponse]
  }
}

