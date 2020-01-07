package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The format of a run of text in a cell. Absent values indicate that the
  * field isn&#39;t specified.
  */
@js.native
trait Schema$TextFormat extends js.Object {
  /**
    * True if the text is bold.
    */
  var bold: js.UndefOr[Boolean] = js.native
  /**
    * The font family.
    */
  var fontFamily: js.UndefOr[String] = js.native
  /**
    * The size of the font.
    */
  var fontSize: js.UndefOr[Double] = js.native
  /**
    * The foreground color of the text.
    */
  var foregroundColor: js.UndefOr[Schema$Color] = js.native
  /**
    * True if the text is italicized.
    */
  var italic: js.UndefOr[Boolean] = js.native
  /**
    * True if the text has a strikethrough.
    */
  var strikethrough: js.UndefOr[Boolean] = js.native
  /**
    * True if the text is underlined.
    */
  var underline: js.UndefOr[Boolean] = js.native
}

object Schema$TextFormat {
  @scala.inline
  def apply(
    bold: js.UndefOr[Boolean] = js.undefined,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    foregroundColor: Schema$Color = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    strikethrough: js.UndefOr[Boolean] = js.undefined,
    underline: js.UndefOr[Boolean] = js.undefined
  ): Schema$TextFormat = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.asInstanceOf[js.Any])
    if (!js.isUndefined(strikethrough)) __obj.updateDynamic("strikethrough")(strikethrough.asInstanceOf[js.Any])
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TextFormat]
  }
}

