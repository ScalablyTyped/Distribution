package typings.ethereumjsWallet.thirdpartyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EvpKdfOpts extends js.Object {
  
  var count: Double = js.native
  
  var digest: String = js.native
  
  var ivsize: Double = js.native
  
  var keysize: Double = js.native
}
object EvpKdfOpts {
  
  @scala.inline
  def apply(count: Double, digest: String, ivsize: Double, keysize: Double): EvpKdfOpts = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any], ivsize = ivsize.asInstanceOf[js.Any], keysize = keysize.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvpKdfOpts]
  }
  
  @scala.inline
  implicit class EvpKdfOptsOps[Self <: EvpKdfOpts] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigest(value: String): Self = this.set("digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvsize(value: Double): Self = this.set("ivsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysize(value: Double): Self = this.set("keysize", value.asInstanceOf[js.Any])
  }
}
