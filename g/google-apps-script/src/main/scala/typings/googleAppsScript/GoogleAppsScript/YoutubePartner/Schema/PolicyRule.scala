package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyRule extends js.Object {
  
  var action: js.UndefOr[String] = js.native
  
  var conditions: js.UndefOr[Conditions] = js.native
  
  var subaction: js.UndefOr[js.Array[String]] = js.native
}
object PolicyRule {
  
  @scala.inline
  def apply(): PolicyRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyRule]
  }
  
  @scala.inline
  implicit class PolicyRuleOps[Self <: PolicyRule] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setConditions(value: Conditions): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    
    @scala.inline
    def setSubactionVarargs(value: String*): Self = this.set("subaction", js.Array(value :_*))
    
    @scala.inline
    def setSubaction(value: js.Array[String]): Self = this.set("subaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaction: Self = this.set("subaction", js.undefined)
  }
}
