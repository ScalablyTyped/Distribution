package typings.dhtmlxgantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttEnterprise extends js.Object {
  def getGanttInstance(): GanttStatic
}

object GanttEnterprise {
  @scala.inline
  def apply(getGanttInstance: () => GanttStatic): GanttEnterprise = {
    val __obj = js.Dynamic.literal(getGanttInstance = js.Any.fromFunction0(getGanttInstance))
  
    __obj.asInstanceOf[GanttEnterprise]
  }
}

