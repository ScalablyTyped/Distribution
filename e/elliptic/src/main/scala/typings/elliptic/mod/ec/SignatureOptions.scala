package typings.elliptic.mod.ec

import typings.elliptic.mod.BNInput
import typings.elliptic.mod._SignatureInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureOptions extends _SignatureInput {
  
  var r: BNInput = js.native
  
  var recoveryParam: js.UndefOr[Double] = js.native
  
  var s: BNInput = js.native
}
object SignatureOptions {
  
  @scala.inline
  def apply(r: BNInput, s: BNInput): SignatureOptions = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureOptions]
  }
  
  @scala.inline
  implicit class SignatureOptionsOps[Self <: SignatureOptions] (val x: Self) extends AnyVal {
    
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
    def setRVarargs(value: Double*): Self = this.set("r", js.Array(value :_*))
    
    @scala.inline
    def setR(value: BNInput): Self = this.set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSVarargs(value: Double*): Self = this.set("s", js.Array(value :_*))
    
    @scala.inline
    def setS(value: BNInput): Self = this.set("s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecoveryParam(value: Double): Self = this.set("recoveryParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecoveryParam: Self = this.set("recoveryParam", js.undefined)
  }
}
