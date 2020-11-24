package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapGridViewCellInfo extends js.Object {
  
  val instance: js.Any = js.native
  
  val rowVisibleIndex: Double = js.native
}
object BootstrapGridViewCellInfo {
  
  @scala.inline
  def apply(instance: js.Any, rowVisibleIndex: Double): BootstrapGridViewCellInfo = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], rowVisibleIndex = rowVisibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapGridViewCellInfo]
  }
  
  @scala.inline
  implicit class BootstrapGridViewCellInfoOps[Self <: BootstrapGridViewCellInfo] (val x: Self) extends AnyVal {
    
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
    def setInstance(value: js.Any): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowVisibleIndex(value: Double): Self = this.set("rowVisibleIndex", value.asInstanceOf[js.Any])
  }
}
