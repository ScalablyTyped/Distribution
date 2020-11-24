package typings.emberData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundReload extends js.Object {
  
  var adapterOptions: js.UndefOr[js.Any] = js.native
  
  var backgroundReload: js.UndefOr[Boolean] = js.native
  
  var include: js.UndefOr[String] = js.native
  
  var reload: js.UndefOr[Boolean] = js.native
}
object BackgroundReload {
  
  @scala.inline
  def apply(): BackgroundReload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundReload]
  }
  
  @scala.inline
  implicit class BackgroundReloadOps[Self <: BackgroundReload] (val x: Self) extends AnyVal {
    
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
    def setAdapterOptions(value: js.Any): Self = this.set("adapterOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdapterOptions: Self = this.set("adapterOptions", js.undefined)
    
    @scala.inline
    def setBackgroundReload(value: Boolean): Self = this.set("backgroundReload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundReload: Self = this.set("backgroundReload", js.undefined)
    
    @scala.inline
    def setInclude(value: String): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setReload(value: Boolean): Self = this.set("reload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReload: Self = this.set("reload", js.undefined)
  }
}
