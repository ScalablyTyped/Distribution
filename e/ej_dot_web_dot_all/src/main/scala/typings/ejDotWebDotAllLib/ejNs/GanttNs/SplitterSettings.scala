package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitterSettings extends js.Object {
  /** Specifies the position of splitter in Gantt, based on column index in Gantt.
    */
  var index: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies position of the splitter in Gantt , splitter can be placed either based on percentage values or pixel values.
    */
  var position: js.UndefOr[java.lang.String] = js.undefined
}

object SplitterSettings {
  @scala.inline
  def apply(index: java.lang.String = null, position: java.lang.String = null): SplitterSettings = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[SplitterSettings]
  }
}

