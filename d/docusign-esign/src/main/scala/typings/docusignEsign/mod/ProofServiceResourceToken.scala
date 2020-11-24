package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProofServiceResourceToken extends js.Object {
  
  var ResourceToken: js.UndefOr[String] = js.native
}
object ProofServiceResourceToken {
  
  @scala.inline
  def apply(): ProofServiceResourceToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProofServiceResourceToken]
  }
  
  @scala.inline
  implicit class ProofServiceResourceTokenOps[Self <: ProofServiceResourceToken] (val x: Self) extends AnyVal {
    
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
    def setResourceToken(value: String): Self = this.set("ResourceToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceToken: Self = this.set("ResourceToken", js.undefined)
  }
}
