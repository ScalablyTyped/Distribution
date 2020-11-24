package typings.elliptic.mod.ec

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyPairOptions extends js.Object {
  
  var priv: js.UndefOr[Buffer] = js.native
  
  var privEnc: js.UndefOr[String] = js.native
  
  var pub: js.UndefOr[Buffer] = js.native
  
  var pubEnc: js.UndefOr[String] = js.native
}
object KeyPairOptions {
  
  @scala.inline
  def apply(): KeyPairOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyPairOptions]
  }
  
  @scala.inline
  implicit class KeyPairOptionsOps[Self <: KeyPairOptions] (val x: Self) extends AnyVal {
    
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
    def setPriv(value: Buffer): Self = this.set("priv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriv: Self = this.set("priv", js.undefined)
    
    @scala.inline
    def setPrivEnc(value: String): Self = this.set("privEnc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivEnc: Self = this.set("privEnc", js.undefined)
    
    @scala.inline
    def setPub(value: Buffer): Self = this.set("pub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePub: Self = this.set("pub", js.undefined)
    
    @scala.inline
    def setPubEnc(value: String): Self = this.set("pubEnc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubEnc: Self = this.set("pubEnc", js.undefined)
  }
}
