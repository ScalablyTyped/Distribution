package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPointsBorder extends js.Object {
  /** Border color of the point.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Border width of the point.
    * @Default {null}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object SeriesPointsBorder {
  @scala.inline
  def apply(color: String = null, width: Int | Double = null): SeriesPointsBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesPointsBorder]
  }
}

