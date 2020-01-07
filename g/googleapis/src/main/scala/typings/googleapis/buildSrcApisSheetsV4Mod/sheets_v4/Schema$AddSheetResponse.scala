package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of adding a sheet.
  */
@js.native
trait Schema$AddSheetResponse extends js.Object {
  /**
    * The properties of the newly added sheet.
    */
  var properties: js.UndefOr[Schema$SheetProperties] = js.native
}

object Schema$AddSheetResponse {
  @scala.inline
  def apply(properties: Schema$SheetProperties = null): Schema$AddSheetResponse = {
    val __obj = js.Dynamic.literal()
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AddSheetResponse]
  }
}

