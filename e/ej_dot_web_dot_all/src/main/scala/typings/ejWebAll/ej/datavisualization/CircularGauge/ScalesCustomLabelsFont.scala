package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesCustomLabelsFont extends js.Object {
  /** Specify font fontFamily for custom labels.
    * @Default {Arial}
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /** Specify font Style for custom labels.
    * @Default {Bold}
    */
  var fontStyle: js.UndefOr[String] = js.undefined
  /** Specify font size for custom labels.
    * @Default {12px}
    */
  var size: js.UndefOr[String] = js.undefined
}

object ScalesCustomLabelsFont {
  @scala.inline
  def apply(fontFamily: String = null, fontStyle: String = null, size: String = null): ScalesCustomLabelsFont = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesCustomLabelsFont]
  }
}

