package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountPasswordLockoutDurationMinutes extends js.Object {
  
  var maximumMinutes: js.UndefOr[String] = js.native
  
  var minimumMinutes: js.UndefOr[String] = js.native
}
object AccountPasswordLockoutDurationMinutes {
  
  @scala.inline
  def apply(): AccountPasswordLockoutDurationMinutes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPasswordLockoutDurationMinutes]
  }
  
  @scala.inline
  implicit class AccountPasswordLockoutDurationMinutesOps[Self <: AccountPasswordLockoutDurationMinutes] (val x: Self) extends AnyVal {
    
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
    def setMaximumMinutes(value: String): Self = this.set("maximumMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumMinutes: Self = this.set("maximumMinutes", js.undefined)
    
    @scala.inline
    def setMinimumMinutes(value: String): Self = this.set("minimumMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumMinutes: Self = this.set("minimumMinutes", js.undefined)
  }
}
