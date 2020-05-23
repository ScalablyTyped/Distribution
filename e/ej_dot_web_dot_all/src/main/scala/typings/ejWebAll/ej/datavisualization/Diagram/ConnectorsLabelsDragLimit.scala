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
    bottom: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    right: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined
  ): ConnectorsLabelsDragLimit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorsLabelsDragLimit]
  }
}

