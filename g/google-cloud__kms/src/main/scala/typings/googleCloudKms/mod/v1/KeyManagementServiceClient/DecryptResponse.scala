package typings.googleCloudKms.mod.v1.KeyManagementServiceClient

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecryptResponse extends js.Object {
  
  var plaintext: Buffer = js.native
}
object DecryptResponse {
  
  @scala.inline
  def apply(plaintext: Buffer): DecryptResponse = {
    val __obj = js.Dynamic.literal(plaintext = plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptResponse]
  }
  
  @scala.inline
  implicit class DecryptResponseOps[Self <: DecryptResponse] (val x: Self) extends AnyVal {
    
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
    def setPlaintext(value: Buffer): Self = this.set("plaintext", value.asInstanceOf[js.Any])
  }
}
