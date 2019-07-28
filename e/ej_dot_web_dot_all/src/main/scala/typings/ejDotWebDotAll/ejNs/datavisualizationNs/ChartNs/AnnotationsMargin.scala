package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

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
    bottom: Int | Double = null,
    left: Int | Double = null,
    right: Int | Double = null,
    top: Int | Double = null
  ): AnnotationsMargin = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsMargin]
  }
}

