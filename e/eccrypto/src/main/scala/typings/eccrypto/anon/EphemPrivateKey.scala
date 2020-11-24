package typings.eccrypto.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EphemPrivateKey extends js.Object {
  
  var ephemPrivateKey: js.UndefOr[Buffer] = js.native
  
  var iv: js.UndefOr[Buffer] = js.native
}
object EphemPrivateKey {
  
  @scala.inline
  def apply(): EphemPrivateKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EphemPrivateKey]
  }
  
  @scala.inline
  implicit class EphemPrivateKeyOps[Self <: EphemPrivateKey] (val x: Self) extends AnyVal {
    
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
    def setEphemPrivateKey(value: Buffer): Self = this.set("ephemPrivateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEphemPrivateKey: Self = this.set("ephemPrivateKey", js.undefined)
    
    @scala.inline
    def setIv(value: Buffer): Self = this.set("iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIv: Self = this.set("iv", js.undefined)
  }
}
