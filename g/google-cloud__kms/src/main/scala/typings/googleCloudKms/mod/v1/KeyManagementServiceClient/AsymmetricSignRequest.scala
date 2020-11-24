package typings.googleCloudKms.mod.v1.KeyManagementServiceClient

import typings.googleCloudKms.mod.v1.Digest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsymmetricSignRequest extends js.Object {
  
  var digest: Digest = js.native
  
  var name: String = js.native
}
object AsymmetricSignRequest {
  
  @scala.inline
  def apply(digest: Digest, name: String): AsymmetricSignRequest = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsymmetricSignRequest]
  }
  
  @scala.inline
  implicit class AsymmetricSignRequestOps[Self <: AsymmetricSignRequest] (val x: Self) extends AnyVal {
    
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
    def setDigest(value: Digest): Self = this.set("digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
