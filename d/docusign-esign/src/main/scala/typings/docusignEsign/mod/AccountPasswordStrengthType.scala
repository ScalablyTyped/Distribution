package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountPasswordStrengthType extends js.Object {
  
  /**
    * An array of option strings supported by this setting.
    */
  var options: js.UndefOr[js.Array[AccountPasswordStrengthTypeOption]] = js.native
}
object AccountPasswordStrengthType {
  
  @scala.inline
  def apply(): AccountPasswordStrengthType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPasswordStrengthType]
  }
  
  @scala.inline
  implicit class AccountPasswordStrengthTypeOps[Self <: AccountPasswordStrengthType] (val x: Self) extends AnyVal {
    
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
    def setOptionsVarargs(value: AccountPasswordStrengthTypeOption*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[AccountPasswordStrengthTypeOption]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
