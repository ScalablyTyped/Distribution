package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountMinimumPasswordLength extends js.Object {
  
  var maximumLength: js.UndefOr[String] = js.native
  
  /**
    * Minimum length of the access code string.
    */
  var minimumLength: js.UndefOr[String] = js.native
}
object AccountMinimumPasswordLength {
  
  @scala.inline
  def apply(): AccountMinimumPasswordLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountMinimumPasswordLength]
  }
  
  @scala.inline
  implicit class AccountMinimumPasswordLengthOps[Self <: AccountMinimumPasswordLength] (val x: Self) extends AnyVal {
    
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
    def setMaximumLength(value: String): Self = this.set("maximumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumLength: Self = this.set("maximumLength", js.undefined)
    
    @scala.inline
    def setMinimumLength(value: String): Self = this.set("minimumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumLength: Self = this.set("minimumLength", js.undefined)
  }
}
