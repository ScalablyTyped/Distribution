package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityUserLinkEntity extends js.Object {
  
  var accountRef: js.UndefOr[AccountRef] = js.native
  
  var profileRef: js.UndefOr[ProfileRef] = js.native
  
  var webPropertyRef: js.UndefOr[WebPropertyRef] = js.native
}
object EntityUserLinkEntity {
  
  @scala.inline
  def apply(): EntityUserLinkEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityUserLinkEntity]
  }
  
  @scala.inline
  implicit class EntityUserLinkEntityOps[Self <: EntityUserLinkEntity] (val x: Self) extends AnyVal {
    
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
    def setAccountRef(value: AccountRef): Self = this.set("accountRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountRef: Self = this.set("accountRef", js.undefined)
    
    @scala.inline
    def setProfileRef(value: ProfileRef): Self = this.set("profileRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileRef: Self = this.set("profileRef", js.undefined)
    
    @scala.inline
    def setWebPropertyRef(value: WebPropertyRef): Self = this.set("webPropertyRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebPropertyRef: Self = this.set("webPropertyRef", js.undefined)
  }
}
