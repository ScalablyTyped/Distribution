package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inserts data into the spreadsheet starting at the specified coordinate.
  */
@js.native
trait Schema$PasteDataRequest extends js.Object {
  /**
    * The coordinate at which the data should start being inserted.
    */
  var coordinate: js.UndefOr[Schema$GridCoordinate] = js.native
  /**
    * The data to insert.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * The delimiter in the data.
    */
  var delimiter: js.UndefOr[String] = js.native
  /**
    * True if the data is HTML.
    */
  var html: js.UndefOr[Boolean] = js.native
  /**
    * How the data should be pasted.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$PasteDataRequest {
  @scala.inline
  def apply(
    coordinate: Schema$GridCoordinate = null,
    data: String = null,
    delimiter: String = null,
    html: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): Schema$PasteDataRequest = {
    val __obj = js.Dynamic.literal()
    if (coordinate != null) __obj.updateDynamic("coordinate")(coordinate.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PasteDataRequest]
  }
}

