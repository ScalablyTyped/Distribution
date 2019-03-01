package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorsLabelsMargin extends js.Object {
  /** To set the margin of the label in bottom direction
    * @Default {0}
    */
  var bottom: js.UndefOr[scala.Double] = js.undefined
  /** To set the margin of the label in left direction
    * @Default {0}
    */
  var left: js.UndefOr[scala.Double] = js.undefined
  /** To set the margin of the label in right direction
    * @Default {0}
    */
  var right: js.UndefOr[scala.Double] = js.undefined
  /** To set the margin of the label in top direction
    * @Default {0}
    */
  var top: js.UndefOr[scala.Double] = js.undefined
}

object ConnectorsLabelsMargin {
  @scala.inline
  def apply(
    bottom: scala.Int | scala.Double = null,
    left: scala.Int | scala.Double = null,
    right: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null
  ): ConnectorsLabelsMargin = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorsLabelsMargin]
  }
}

