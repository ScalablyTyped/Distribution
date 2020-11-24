package typings.easyApiRequest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cb extends js.Object {
  
  var cb: js.Any = js.native
  
  var opts: js.Any = js.native
}
object Cb {
  
  @scala.inline
  def apply(cb: js.Any, opts: js.Any): Cb = {
    val __obj = js.Dynamic.literal(cb = cb.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cb]
  }
  
  @scala.inline
  implicit class CbOps[Self <: Cb] (val x: Self) extends AnyVal {
    
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
    def setCb(value: js.Any): Self = this.set("cb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpts(value: js.Any): Self = this.set("opts", value.asInstanceOf[js.Any])
  }
}
