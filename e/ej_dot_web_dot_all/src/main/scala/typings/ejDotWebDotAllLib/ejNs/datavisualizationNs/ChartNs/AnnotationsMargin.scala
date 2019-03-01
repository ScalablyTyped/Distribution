package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsMargin extends js.Object {
  /** Annotation is placed at the specified value above its original position.
    * @Default {0}
    */
  var bottom: js.UndefOr[scala.Double] = js.undefined
  /** Annotation is placed at the specified value from left side of its original position.
    * @Default {0}
    */
  var left: js.UndefOr[scala.Double] = js.undefined
  /** Annotation is placed at the specified value from the right side of its original position.
    * @Default {0}
    */
  var right: js.UndefOr[scala.Double] = js.undefined
  /** Annotation is placed at the specified value under its original position.
    * @Default {0}
    */
  var top: js.UndefOr[scala.Double] = js.undefined
}

object AnnotationsMargin {
  @scala.inline
  def apply(
    bottom: scala.Int | scala.Double = null,
    left: scala.Int | scala.Double = null,
    right: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null
  ): AnnotationsMargin = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsMargin]
  }
}

