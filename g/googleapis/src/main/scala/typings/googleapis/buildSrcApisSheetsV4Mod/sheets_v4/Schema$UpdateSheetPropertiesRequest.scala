package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates properties of the sheet with the specified sheetId.
  */
@js.native
trait Schema$UpdateSheetPropertiesRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `properties` is implied and should not be specified. A single
    * `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The properties to update.
    */
  var properties: js.UndefOr[Schema$SheetProperties] = js.native
}

object Schema$UpdateSheetPropertiesRequest {
  @scala.inline
  def apply(fields: String = null, properties: Schema$SheetProperties = null): Schema$UpdateSheetPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateSheetPropertiesRequest]
  }
}

