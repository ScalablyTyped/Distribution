package typings.dwt.dynamsoftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Container extends js.Object {
  
  var ContainerId: js.UndefOr[String] = js.native
  
  var Height: js.UndefOr[String | Double] = js.native
  
  var WebTwainId: String = js.native
  
  var Width: js.UndefOr[String | Double] = js.native
  
  var bLocalService: js.UndefOr[Boolean] = js.native
  
  var bNoUI: js.UndefOr[Boolean] = js.native
}
object Container {
  
  @scala.inline
  def apply(WebTwainId: String): Container = {
    val __obj = js.Dynamic.literal(WebTwainId = WebTwainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit class ContainerOps[Self <: Container] (val x: Self) extends AnyVal {
    
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
    def setWebTwainId(value: String): Self = this.set("WebTwainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerId(value: String): Self = this.set("ContainerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerId: Self = this.set("ContainerId", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("Height", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("Width", js.undefined)
    
    @scala.inline
    def setBLocalService(value: Boolean): Self = this.set("bLocalService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBLocalService: Self = this.set("bLocalService", js.undefined)
    
    @scala.inline
    def setBNoUI(value: Boolean): Self = this.set("bNoUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBNoUI: Self = this.set("bNoUI", js.undefined)
  }
}
