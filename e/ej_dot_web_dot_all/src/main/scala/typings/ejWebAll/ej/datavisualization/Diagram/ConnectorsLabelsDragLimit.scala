package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorsLabelsDragLimit extends js.Object {
  /** To set the drag limit of the label in bottom direction
    * @Default {10}
    */
  var bottom: js.UndefOr[Double] = js.undefined
  /** To set the drag limit of the label in left direction
    * @Default {10}
    */
  var left: js.UndefOr[Double] = js.undefined
  /** To set the drag limit of the label in right direction
    * @Default {10}
    */
  var right: js.UndefOr[Double] = js.undefined
  /** To set the drag limit of the label in top direction
    * @Default {10}
    */
  var top: js.UndefOr[Double] = js.undefined
}

object ConnectorsLabelsDragLimit {
  @scala.inline
  def apply(
    bottom: Int | Double = null,
    left: Int | Double = null,
    right: Int | Double = null,
    top: Int | Double = null
  ): ConnectorsLabelsDragLimit = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorsLabelsDragLimit]
  }
}

