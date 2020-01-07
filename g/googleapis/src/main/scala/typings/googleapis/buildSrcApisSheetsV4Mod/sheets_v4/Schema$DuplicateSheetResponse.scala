package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of duplicating a sheet.
  */
@js.native
trait Schema$DuplicateSheetResponse extends js.Object {
  /**
    * The properties of the duplicate sheet.
    */
  var properties: js.UndefOr[Schema$SheetProperties] = js.native
}

object Schema$DuplicateSheetResponse {
  @scala.inline
  def apply(properties: Schema$SheetProperties = null): Schema$DuplicateSheetResponse = {
    val __obj = js.Dynamic.literal()
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DuplicateSheetResponse]
  }
}

