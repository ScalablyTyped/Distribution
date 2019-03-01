package typings
package draggabillyLib.draggabillyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggabillyOptions extends js.Object {
  var axis: js.UndefOr[draggabillyLib.draggabillyLibStrings.x | draggabillyLib.draggabillyLibStrings.y] = js.undefined
  var containment: js.UndefOr[stdLib.Element | java.lang.String | scala.Boolean] = js.undefined
  var grid: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var handle: js.UndefOr[java.lang.String] = js.undefined
}

object DraggabillyOptions {
  @scala.inline
  def apply(
    axis: draggabillyLib.draggabillyLibStrings.x | draggabillyLib.draggabillyLibStrings.y = null,
    containment: stdLib.Element | java.lang.String | scala.Boolean = null,
    grid: js.Tuple2[scala.Double, scala.Double] = null,
    handle: java.lang.String = null
  ): DraggabillyOptions = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (containment != null) __obj.updateDynamic("containment")(containment.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (handle != null) __obj.updateDynamic("handle")(handle)
    __obj.asInstanceOf[DraggabillyOptions]
  }
}

