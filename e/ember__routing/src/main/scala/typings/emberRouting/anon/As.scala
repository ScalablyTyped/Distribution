package typings.emberRouting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait As extends js.Object {
  
  var as: js.UndefOr[String] = js.native
  
  var engineInfo: js.UndefOr[js.Any] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var resetNamespace: js.UndefOr[Boolean] = js.native
}
object As {
  
  @scala.inline
  def apply(): As = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[As]
  }
  
  @scala.inline
  implicit class AsOps[Self <: As] (val x: Self) extends AnyVal {
    
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
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setEngineInfo(value: js.Any): Self = this.set("engineInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineInfo: Self = this.set("engineInfo", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setResetNamespace(value: Boolean): Self = this.set("resetNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetNamespace: Self = this.set("resetNamespace", js.undefined)
  }
}
