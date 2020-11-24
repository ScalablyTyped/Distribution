package typings.ethereumjsWallet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DkLen extends js.Object {
  
  var DkLen: Double = js.native
  
  var N: Double = js.native
  
  var P: Double = js.native
  
  var R: Double = js.native
  
  var SaltLen: Double = js.native
}
object DkLen {
  
  @scala.inline
  def apply(DkLen: Double, N: Double, P: Double, R: Double, SaltLen: Double): DkLen = {
    val __obj = js.Dynamic.literal(DkLen = DkLen.asInstanceOf[js.Any], N = N.asInstanceOf[js.Any], P = P.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any], SaltLen = SaltLen.asInstanceOf[js.Any])
    __obj.asInstanceOf[DkLen]
  }
  
  @scala.inline
  implicit class DkLenOps[Self <: DkLen] (val x: Self) extends AnyVal {
    
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
    def setDkLen(value: Double): Self = this.set("DkLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: Double): Self = this.set("N", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP(value: Double): Self = this.set("P", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: Double): Self = this.set("R", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltLen(value: Double): Self = this.set("SaltLen", value.asInstanceOf[js.Any])
  }
}
