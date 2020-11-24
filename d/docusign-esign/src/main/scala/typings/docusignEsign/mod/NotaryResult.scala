package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotaryResult extends js.Object {
  
  var jurisdictions: js.UndefOr[js.Array[Jurisdiction]] = js.native
  
  var notary: js.UndefOr[Notary] = js.native
}
object NotaryResult {
  
  @scala.inline
  def apply(): NotaryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotaryResult]
  }
  
  @scala.inline
  implicit class NotaryResultOps[Self <: NotaryResult] (val x: Self) extends AnyVal {
    
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
    def setJurisdictionsVarargs(value: Jurisdiction*): Self = this.set("jurisdictions", js.Array(value :_*))
    
    @scala.inline
    def setJurisdictions(value: js.Array[Jurisdiction]): Self = this.set("jurisdictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJurisdictions: Self = this.set("jurisdictions", js.undefined)
    
    @scala.inline
    def setNotary(value: Notary): Self = this.set("notary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotary: Self = this.set("notary", js.undefined)
  }
}
