package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontOptions extends js.Object {
  /** Pass the color
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Pass the font family
    */
  var fontFamily: js.UndefOr[js.Any] = js.undefined
  /** Pass the font size
    */
  var fontSize: js.UndefOr[java.lang.String] = js.undefined
  /** Pass the font style
    */
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  /** Pass the font weight
    */
  var fontWeight: js.UndefOr[java.lang.String] = js.undefined
  /** Pass the text decoration
    */
  var textDecoration: js.UndefOr[java.lang.String] = js.undefined
}

object FontOptions {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    fontFamily: js.Any = null,
    fontSize: java.lang.String = null,
    fontStyle: java.lang.String = null,
    fontWeight: java.lang.String = null,
    textDecoration: java.lang.String = null
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

