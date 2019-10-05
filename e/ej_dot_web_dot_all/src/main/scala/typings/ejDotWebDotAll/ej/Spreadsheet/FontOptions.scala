package typings.ejDotWebDotAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontOptions extends js.Object {
  /** Pass the color
    */
  var color: js.UndefOr[String] = js.undefined
  /** Pass the font family
    */
  var fontFamily: js.UndefOr[js.Any] = js.undefined
  /** Pass the font size
    */
  var fontSize: js.UndefOr[String] = js.undefined
  /** Pass the font style
    */
  var fontStyle: js.UndefOr[String] = js.undefined
  /** Pass the font weight
    */
  var fontWeight: js.UndefOr[String] = js.undefined
  /** Pass the text decoration
    */
  var textDecoration: js.UndefOr[String] = js.undefined
}

object FontOptions {
  @scala.inline
  def apply(
    color: String = null,
    fontFamily: js.Any = null,
    fontSize: String = null,
    fontStyle: String = null,
    fontWeight: String = null,
    textDecoration: String = null
  ): FontOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration)
    __obj.asInstanceOf[FontOptions]
  }
}

