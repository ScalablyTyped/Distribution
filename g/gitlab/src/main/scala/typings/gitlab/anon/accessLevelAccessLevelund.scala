package typings.gitlab.anon

import typings.gitlab.resourceAccessRequestsMod.AccessLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  accessLevel :gitlab.gitlab/dist/types/core/templates/ResourceAccessRequests.AccessLevel | undefined} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
@js.native
trait accessLevelAccessLevelund extends js.Object {
  
  var accessLevel: js.UndefOr[AccessLevel] = js.native
  
  var sudo: js.UndefOr[String | Double] = js.native
}
object accessLevelAccessLevelund {
  
  @scala.inline
  def apply(): accessLevelAccessLevelund = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[accessLevelAccessLevelund]
  }
  
  @scala.inline
  implicit class accessLevelAccessLevelundOps[Self <: accessLevelAccessLevelund] (val x: Self) extends AnyVal {
    
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
    def setAccessLevel(value: AccessLevel): Self = this.set("accessLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessLevel: Self = this.set("accessLevel", js.undefined)
    
    @scala.inline
    def setSudo(value: String | Double): Self = this.set("sudo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSudo: Self = this.set("sudo", js.undefined)
  }
}
