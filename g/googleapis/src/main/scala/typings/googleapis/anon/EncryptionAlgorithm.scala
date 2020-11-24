package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptionAlgorithm extends js.Object {
  
  var encryptionAlgorithm: js.UndefOr[String] = js.native
  
  var keySha256: js.UndefOr[String] = js.native
}
object EncryptionAlgorithm {
  
  @scala.inline
  def apply(): EncryptionAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionAlgorithm]
  }
  
  @scala.inline
  implicit class EncryptionAlgorithmOps[Self <: EncryptionAlgorithm] (val x: Self) extends AnyVal {
    
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
    def setEncryptionAlgorithm(value: String): Self = this.set("encryptionAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionAlgorithm: Self = this.set("encryptionAlgorithm", js.undefined)
    
    @scala.inline
    def setKeySha256(value: String): Self = this.set("keySha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeySha256: Self = this.set("keySha256", js.undefined)
  }
}
