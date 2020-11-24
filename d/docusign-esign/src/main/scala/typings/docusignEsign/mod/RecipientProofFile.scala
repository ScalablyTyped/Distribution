package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientProofFile extends js.Object {
  
  var isInProofFile: js.UndefOr[String] = js.native
}
object RecipientProofFile {
  
  @scala.inline
  def apply(): RecipientProofFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientProofFile]
  }
  
  @scala.inline
  implicit class RecipientProofFileOps[Self <: RecipientProofFile] (val x: Self) extends AnyVal {
    
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
    def setIsInProofFile(value: String): Self = this.set("isInProofFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInProofFile: Self = this.set("isInProofFile", js.undefined)
  }
}
