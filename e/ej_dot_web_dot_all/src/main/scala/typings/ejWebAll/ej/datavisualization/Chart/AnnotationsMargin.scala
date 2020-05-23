package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsMargin extends js.Object {
  /** Annotation is placed at the specified value above its original position.
    * @Default {0}
    */
  var bottom: js.UndefOr[Double] = js.undefined
  /** Annotation is placed at the specified value from left side of its original position.
    * @Default {0}
    */
  var left: js.UndefOr[Double] = js.undefined
  /** Annotation is placed at the specified value from the right side of its original position.
    * @Default {0}
    */
  var right: js.UndefOr[Double] = js.undefined
  /** Annotation is placed at the specified value under its original position.
    * @Default {0}
    */
  var top: js.UndefOr[Double] = js.undefined
}

object AnnotationsMargin {
  @scala.inline
  def apply(
    bottom: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    right: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined
  ): AnnotationsMargin = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsMargin]
  }
}

