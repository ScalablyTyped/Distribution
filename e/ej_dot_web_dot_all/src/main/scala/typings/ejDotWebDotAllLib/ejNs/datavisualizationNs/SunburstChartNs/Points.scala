package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Points extends js.Object {
  /** Points fill color of the sunburst.
    * @Default {null}
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Points text of the sunburst.
    * @Default {null}
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Points x value of the sunburst.
    * @Default {null}
    */
  var x: js.UndefOr[java.lang.String] = js.undefined
  /** Points y value of the sunburst.
    * @Default {null}
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object Points {
  @scala.inline
  def apply(
    fill: java.lang.String = null,
    text: java.lang.String = null,
    x: java.lang.String = null,
    y: scala.Int | scala.Double = null
  ): Points = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (text != null) __obj.updateDynamic("text")(text)
    if (x != null) __obj.updateDynamic("x")(x)
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Points]
  }
}

