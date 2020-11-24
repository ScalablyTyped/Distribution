package typings.googleapis.anon

import typings.googleapis.v3Mod.analyticsV3.SchemaAccountRef
import typings.googleapis.v3Mod.analyticsV3.SchemaProfileRef
import typings.googleapis.v3Mod.analyticsV3.SchemaWebPropertyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountRef extends js.Object {
  
  var accountRef: js.UndefOr[SchemaAccountRef] = js.native
  
  var profileRef: js.UndefOr[SchemaProfileRef] = js.native
  
  var webPropertyRef: js.UndefOr[SchemaWebPropertyRef] = js.native
}
object AccountRef {
  
  @scala.inline
  def apply(): AccountRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountRef]
  }
  
  @scala.inline
  implicit class AccountRefOps[Self <: AccountRef] (val x: Self) extends AnyVal {
    
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
    def setAccountRef(value: SchemaAccountRef): Self = this.set("accountRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountRef: Self = this.set("accountRef", js.undefined)
    
    @scala.inline
    def setProfileRef(value: SchemaProfileRef): Self = this.set("profileRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileRef: Self = this.set("profileRef", js.undefined)
    
    @scala.inline
    def setWebPropertyRef(value: SchemaWebPropertyRef): Self = this.set("webPropertyRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebPropertyRef: Self = this.set("webPropertyRef", js.undefined)
  }
}
