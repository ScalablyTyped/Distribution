package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetMatchPolicy extends js.Object {
  
  var kind: js.UndefOr[String] = js.native
  
  var policyId: js.UndefOr[String] = js.native
  
  var rules: js.UndefOr[js.Array[PolicyRule]] = js.native
}
object AssetMatchPolicy {
  
  @scala.inline
  def apply(): AssetMatchPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetMatchPolicy]
  }
  
  @scala.inline
  implicit class AssetMatchPolicyOps[Self <: AssetMatchPolicy] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPolicyId(value: String): Self = this.set("policyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyId: Self = this.set("policyId", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: PolicyRule*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: js.Array[PolicyRule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
  }
}
