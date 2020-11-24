package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SealIdentifier extends js.Object {
  
  /**
    * The user-friendly display name for a seal.
    */
  var sealDisplayName: js.UndefOr[String] = js.native
  
  /**
    * The name of a seal.
    */
  var sealName: js.UndefOr[String] = js.native
}
object SealIdentifier {
  
  @scala.inline
  def apply(): SealIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SealIdentifier]
  }
  
  @scala.inline
  implicit class SealIdentifierOps[Self <: SealIdentifier] (val x: Self) extends AnyVal {
    
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
    def setSealDisplayName(value: String): Self = this.set("sealDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSealDisplayName: Self = this.set("sealDisplayName", js.undefined)
    
    @scala.inline
    def setSealName(value: String): Self = this.set("sealName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSealName: Self = this.set("sealName", js.undefined)
  }
}
