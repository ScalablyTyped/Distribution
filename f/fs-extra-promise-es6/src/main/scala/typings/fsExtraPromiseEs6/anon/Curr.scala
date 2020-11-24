package typings.fsExtraPromiseEs6.anon

import typings.fsExtraPromiseEs6.mod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Curr extends js.Object {
  
  var curr: Stats = js.native
  
  var prev: Stats = js.native
}
object Curr {
  
  @scala.inline
  def apply(curr: Stats, prev: Stats): Curr = {
    val __obj = js.Dynamic.literal(curr = curr.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Curr]
  }
  
  @scala.inline
  implicit class CurrOps[Self <: Curr] (val x: Self) extends AnyVal {
    
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
    def setCurr(value: Stats): Self = this.set("curr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrev(value: Stats): Self = this.set("prev", value.asInstanceOf[js.Any])
  }
}
