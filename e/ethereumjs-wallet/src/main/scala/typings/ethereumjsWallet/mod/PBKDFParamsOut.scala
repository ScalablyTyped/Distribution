package typings.ethereumjsWallet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PBKDFParamsOut extends KDFParamsOut {
  
  var c: Double = js.native
  
  var dklen: Double = js.native
  
  var prf: String = js.native
  
  var salt: String = js.native
}
object PBKDFParamsOut {
  
  @scala.inline
  def apply(c: Double, dklen: Double, prf: String, salt: String): PBKDFParamsOut = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], dklen = dklen.asInstanceOf[js.Any], prf = prf.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PBKDFParamsOut]
  }
  
  @scala.inline
  implicit class PBKDFParamsOutOps[Self <: PBKDFParamsOut] (val x: Self) extends AnyVal {
    
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
    def setC(value: Double): Self = this.set("c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDklen(value: Double): Self = this.set("dklen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrf(value: String): Self = this.set("prf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSalt(value: String): Self = this.set("salt", value.asInstanceOf[js.Any])
  }
}
