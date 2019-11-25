package typings.ejDotWebDotAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitterSettings extends js.Object {
  /** Specifies the position of splitter in Gantt, based on column index in Gantt.
    */
  var index: js.UndefOr[String] = js.undefined
  /** Specifies position of the splitter in Gantt , splitter can be placed either based on percentage values or pixel values.
    */
  var position: js.UndefOr[String] = js.undefined
}

object SplitterSettings {
  @scala.inline
  def apply(index: String = null, position: String = null): SplitterSettings = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitterSettings]
  }
}

