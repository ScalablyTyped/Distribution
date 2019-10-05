package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorsLabelsMargin extends js.Object {
  /** To set the margin of the label in bottom direction
    * @Default {0}
    */
  var bottom: js.UndefOr[Double] = js.undefined
  /** To set the margin of the label in left direction
    * @Default {0}
    */
  var left: js.UndefOr[Double] = js.undefined
  /** To set the margin of the label in right direction
    * @Default {0}
    */
  var right: js.UndefOr[Double] = js.undefined
  /** To set the margin of the label in top direction
    * @Default {0}
    */
  var top: js.UndefOr[Double] = js.undefined
}

object ConnectorsLabelsMargin {
  @scala.inline
  def apply(
    bottom: Int | Double = null,
    left: Int | Double = null,
    right: Int | Double = null,
    top: Int | Double = null
  ): ConnectorsLabelsMargin = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorsLabelsMargin]
  }
}

