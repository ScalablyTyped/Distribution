package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Duplicates the contents of a sheet.
  */
@js.native
trait Schema$DuplicateSheetRequest extends js.Object {
  /**
    * The zero-based index where the new sheet should be inserted. The index of
    * all sheets after this are incremented.
    */
  var insertSheetIndex: js.UndefOr[Double] = js.native
  /**
    * If set, the ID of the new sheet. If not set, an ID is chosen. If set, the
    * ID must not conflict with any existing sheet ID. If set, it must be
    * non-negative.
    */
  var newSheetId: js.UndefOr[Double] = js.native
  /**
    * The name of the new sheet.  If empty, a new name is chosen for you.
    */
  var newSheetName: js.UndefOr[String] = js.native
  /**
    * The sheet to duplicate.
    */
  var sourceSheetId: js.UndefOr[Double] = js.native
}

object Schema$DuplicateSheetRequest {
  @scala.inline
  def apply(
    insertSheetIndex: Int | Double = null,
    newSheetId: Int | Double = null,
    newSheetName: String = null,
    sourceSheetId: Int | Double = null
  ): Schema$DuplicateSheetRequest = {
    val __obj = js.Dynamic.literal()
    if (insertSheetIndex != null) __obj.updateDynamic("insertSheetIndex")(insertSheetIndex.asInstanceOf[js.Any])
    if (newSheetId != null) __obj.updateDynamic("newSheetId")(newSheetId.asInstanceOf[js.Any])
    if (newSheetName != null) __obj.updateDynamic("newSheetName")(newSheetName.asInstanceOf[js.Any])
    if (sourceSheetId != null) __obj.updateDynamic("sourceSheetId")(sourceSheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DuplicateSheetRequest]
  }
}

