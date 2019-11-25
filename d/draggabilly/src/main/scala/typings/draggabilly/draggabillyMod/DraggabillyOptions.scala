package typings.draggabilly.draggabillyMod

import typings.draggabilly.draggabillyStrings.x
import typings.draggabilly.draggabillyStrings.y
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggabillyOptions extends js.Object {
  var axis: js.UndefOr[x | y] = js.undefined
  var containment: js.UndefOr[Element | String | Boolean] = js.undefined
  var grid: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var handle: js.UndefOr[String] = js.undefined
}

object DraggabillyOptions {
  @scala.inline
  def apply(
    axis: x | y = null,
    containment: Element | String | Boolean = null,
    grid: js.Tuple2[Double, Double] = null,
    handle: String = null
  ): DraggabillyOptions = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (containment != null) __obj.updateDynamic("containment")(containment.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggabillyOptions]
  }
}

