package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tl extends js.Object {
  
  var bl: X = js.native
  
  var br: X = js.native
  
  var tl: X = js.native
  
  var tr: X = js.native
}
object Tl {
  
  @scala.inline
  def apply(bl: X, br: X, tl: X, tr: X): Tl = {
    val __obj = js.Dynamic.literal(bl = bl.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tl]
  }
  
  @scala.inline
  implicit class TlOps[Self <: Tl] (val x: Self) extends AnyVal {
    
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
    def setBl(value: X): Self = this.set("bl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBr(value: X): Self = this.set("br", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTl(value: X): Self = this.set("tl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTr(value: X): Self = this.set("tr", value.asInstanceOf[js.Any])
  }
}
