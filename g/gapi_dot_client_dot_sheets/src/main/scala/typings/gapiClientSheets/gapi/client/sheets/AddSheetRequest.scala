package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddSheetRequest extends js.Object {
  /**
    * The properties the new sheet should have.
    * All properties are optional.
    * The sheetId field is optional; if one is not
    * set, an id will be randomly generated. (It is an error to specify the ID
    * of a sheet that already exists.)
    */
  var properties: js.UndefOr[SheetProperties] = js.undefined
}

object AddSheetRequest {
  @scala.inline
  def apply(properties: SheetProperties = null): AddSheetRequest = {
    val __obj = js.Dynamic.literal()
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddSheetRequest]
  }
}

