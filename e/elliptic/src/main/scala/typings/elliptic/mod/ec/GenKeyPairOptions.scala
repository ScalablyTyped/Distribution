package typings.elliptic.mod.ec

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenKeyPairOptions extends js.Object {
  
  var entropy: js.Any = js.native
  
  var entropyEnc: js.UndefOr[String] = js.native
  
  var pers: js.UndefOr[js.Any] = js.native
  
  var persEnc: js.UndefOr[String] = js.native
}
object GenKeyPairOptions {
  
  @scala.inline
  def apply(entropy: js.Any): GenKeyPairOptions = {
    val __obj = js.Dynamic.literal(entropy = entropy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenKeyPairOptions]
  }
  
  @scala.inline
  implicit class GenKeyPairOptionsOps[Self <: GenKeyPairOptions] (val x: Self) extends AnyVal {
    
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
    def setEntropy(value: js.Any): Self = this.set("entropy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntropyEnc(value: String): Self = this.set("entropyEnc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntropyEnc: Self = this.set("entropyEnc", js.undefined)
    
    @scala.inline
    def setPers(value: js.Any): Self = this.set("pers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePers: Self = this.set("pers", js.undefined)
    
    @scala.inline
    def setPersEnc(value: String): Self = this.set("persEnc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersEnc: Self = this.set("persEnc", js.undefined)
  }
}
