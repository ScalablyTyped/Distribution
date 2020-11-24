package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountPasswordExpirePasswordDays extends js.Object {
  
  var maximumDays: js.UndefOr[String] = js.native
  
  var minimumDays: js.UndefOr[String] = js.native
}
object AccountPasswordExpirePasswordDays {
  
  @scala.inline
  def apply(): AccountPasswordExpirePasswordDays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPasswordExpirePasswordDays]
  }
  
  @scala.inline
  implicit class AccountPasswordExpirePasswordDaysOps[Self <: AccountPasswordExpirePasswordDays] (val x: Self) extends AnyVal {
    
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
    def setMaximumDays(value: String): Self = this.set("maximumDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumDays: Self = this.set("maximumDays", js.undefined)
    
    @scala.inline
    def setMinimumDays(value: String): Self = this.set("minimumDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumDays: Self = this.set("minimumDays", js.undefined)
  }
}
