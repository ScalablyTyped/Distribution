package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesPointersPointerValueTextFont extends js.Object {
  /** Specify pointer value text font family of circular gauge.
    * @Default {Arial}
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /** Specify pointer value text font style of circular gauge.
    * @Default {Bold}
    */
  var fontStyle: js.UndefOr[String] = js.undefined
  /** Specify pointer value text size of circular gauge.
    * @Default {11px}
    */
  var size: js.UndefOr[String] = js.undefined
}

object ScalesPointersPointerValueTextFont {
  @scala.inline
  def apply(fontFamily: String = null, fontStyle: String = null, size: String = null): ScalesPointersPointerValueTextFont = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesPointersPointerValueTextFont]
  }
}

