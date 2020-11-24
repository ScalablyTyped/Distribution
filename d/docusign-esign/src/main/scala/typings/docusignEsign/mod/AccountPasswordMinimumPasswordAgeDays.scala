package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountPasswordMinimumPasswordAgeDays extends js.Object {
  
  var maximumAge: js.UndefOr[String] = js.native
  
  var minimumAge: js.UndefOr[String] = js.native
}
object AccountPasswordMinimumPasswordAgeDays {
  
  @scala.inline
  def apply(): AccountPasswordMinimumPasswordAgeDays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPasswordMinimumPasswordAgeDays]
  }
  
  @scala.inline
  implicit class AccountPasswordMinimumPasswordAgeDaysOps[Self <: AccountPasswordMinimumPasswordAgeDays] (val x: Self) extends AnyVal {
    
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
    def setMaximumAge(value: String): Self = this.set("maximumAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumAge: Self = this.set("maximumAge", js.undefined)
    
    @scala.inline
    def setMinimumAge(value: String): Self = this.set("minimumAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumAge: Self = this.set("minimumAge", js.undefined)
  }
}
