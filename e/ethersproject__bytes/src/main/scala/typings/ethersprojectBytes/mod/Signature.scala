package typings.ethersprojectBytes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Signature extends js.Object {
  
  var _vs: String = js.native
  
  var r: String = js.native
  
  var recoveryParam: Double = js.native
  
  var s: String = js.native
  
  var v: Double = js.native
}
object Signature {
  
  @scala.inline
  def apply(_vs: String, r: String, recoveryParam: Double, s: String, v: Double): Signature = {
    val __obj = js.Dynamic.literal(_vs = _vs.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], recoveryParam = recoveryParam.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signature]
  }
  
  @scala.inline
  implicit class SignatureOps[Self <: Signature] (val x: Self) extends AnyVal {
    
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
    def set_vs(value: String): Self = this.set("_vs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: String): Self = this.set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecoveryParam(value: Double): Self = this.set("recoveryParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: String): Self = this.set("s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: Double): Self = this.set("v", value.asInstanceOf[js.Any])
  }
}
