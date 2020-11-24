package typings.devextreme.mod.DevExpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxSchedulerTimeZone extends js.Object {
  
  /**
    * [descr:dxSchedulerTimeZone.id]
    */
  var id: String = js.native
  
  /**
    * [descr:dxSchedulerTimeZone.offset]
    */
  var offset: Double = js.native
  
  /**
    * [descr:dxSchedulerTimeZone.title]
    */
  var title: String = js.native
}
object dxSchedulerTimeZone {
  
  @scala.inline
  def apply(id: String, offset: Double, title: String): dxSchedulerTimeZone = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxSchedulerTimeZone]
  }
  
  @scala.inline
  implicit class dxSchedulerTimeZoneOps[Self <: dxSchedulerTimeZone] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
