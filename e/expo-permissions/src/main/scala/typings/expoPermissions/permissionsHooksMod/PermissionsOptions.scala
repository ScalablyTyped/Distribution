package typings.expoPermissions.permissionsHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionsOptions extends js.Object {
  
  /** If it should ask the permissions when mounted, defaults to `false` */
  var ask: js.UndefOr[Boolean] = js.native
  
  /** If it should fetch information about the permissions when mounted, defaults to `true` */
  var get: js.UndefOr[Boolean] = js.native
}
object PermissionsOptions {
  
  @scala.inline
  def apply(): PermissionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionsOptions]
  }
  
  @scala.inline
  implicit class PermissionsOptionsOps[Self <: PermissionsOptions] (val x: Self) extends AnyVal {
    
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
    def setAsk(value: Boolean): Self = this.set("ask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsk: Self = this.set("ask", js.undefined)
    
    @scala.inline
    def setGet(value: Boolean): Self = this.set("get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
  }
}
