package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartArea extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String | googleDotVisualizationLib.Anon_Stroke] = js.undefined
  var bottom: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var left: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var right: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var top: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object ChartArea {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String | googleDotVisualizationLib.Anon_Stroke = null,
    bottom: scala.Double | java.lang.String = null,
    height: scala.Double | java.lang.String = null,
    left: scala.Double | java.lang.String = null,
    right: scala.Double | java.lang.String = null,
    top: scala.Double | java.lang.String = null,
    width: scala.Double | java.lang.String = null
  ): ChartArea = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartArea]
  }
}

