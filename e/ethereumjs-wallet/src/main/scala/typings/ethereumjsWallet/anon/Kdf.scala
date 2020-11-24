package typings.ethereumjsWallet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Kdf extends js.Object {
  
  var Kdf: String = js.native
  
  var KdfParams: DkLen = js.native
  
  var Version: String = js.native
}
object Kdf {
  
  @scala.inline
  def apply(Kdf: String, KdfParams: DkLen, Version: String): Kdf = {
    val __obj = js.Dynamic.literal(Kdf = Kdf.asInstanceOf[js.Any], KdfParams = KdfParams.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kdf]
  }
  
  @scala.inline
  implicit class KdfOps[Self <: Kdf] (val x: Self) extends AnyVal {
    
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
    def setKdf(value: String): Self = this.set("Kdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKdfParams(value: DkLen): Self = this.set("KdfParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("Version", value.asInstanceOf[js.Any])
  }
}
