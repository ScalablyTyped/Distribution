package typings.googleCloudKms.mod.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CryptoKeyVersionTemplate extends js.Object {
  
  var algorithm: CryptoKeyVersionAlgorithm = js.native
  
  var protectionLevel: ProtectionLevel = js.native
}
object CryptoKeyVersionTemplate {
  
  @scala.inline
  def apply(algorithm: CryptoKeyVersionAlgorithm, protectionLevel: ProtectionLevel): CryptoKeyVersionTemplate = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], protectionLevel = protectionLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKeyVersionTemplate]
  }
  
  @scala.inline
  implicit class CryptoKeyVersionTemplateOps[Self <: CryptoKeyVersionTemplate] (val x: Self) extends AnyVal {
    
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
    def setAlgorithm(value: CryptoKeyVersionAlgorithm): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionLevel(value: ProtectionLevel): Self = this.set("protectionLevel", value.asInstanceOf[js.Any])
  }
}
