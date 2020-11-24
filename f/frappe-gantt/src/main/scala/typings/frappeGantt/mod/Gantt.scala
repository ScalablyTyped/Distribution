package typings.frappeGantt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gantt extends js.Object {
  
  def change_view_mode(mode: viewMode): Unit = js.native
  
  def refresh(tasks: js.Array[Task]): Unit = js.native
}
object Gantt {
  
  @scala.inline
  def apply(change_view_mode: viewMode => Unit, refresh: js.Array[Task] => Unit): Gantt = {
    val __obj = js.Dynamic.literal(change_view_mode = js.Any.fromFunction1(change_view_mode), refresh = js.Any.fromFunction1(refresh))
    __obj.asInstanceOf[Gantt]
  }
  
  @scala.inline
  implicit class GanttOps[Self <: Gantt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChange_view_mode(value: viewMode => Unit): Self = this.set("change_view_mode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefresh(value: js.Array[Task] => Unit): Self = this.set("refresh", js.Any.fromFunction1(value))
  }
}
