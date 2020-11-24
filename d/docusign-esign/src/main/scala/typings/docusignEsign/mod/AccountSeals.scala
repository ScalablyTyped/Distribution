package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountSeals extends js.Object {
  
  /**
    * A list of electronic seals to apply to documents.
    */
  var seals: js.UndefOr[js.Array[SealIdentifier]] = js.native
}
object AccountSeals {
  
  @scala.inline
  def apply(): AccountSeals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSeals]
  }
  
  @scala.inline
  implicit class AccountSealsOps[Self <: AccountSeals] (val x: Self) extends AnyVal {
    
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
    def setSealsVarargs(value: SealIdentifier*): Self = this.set("seals", js.Array(value :_*))
    
    @scala.inline
    def setSeals(value: js.Array[SealIdentifier]): Self = this.set("seals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeals: Self = this.set("seals", js.undefined)
  }
}
