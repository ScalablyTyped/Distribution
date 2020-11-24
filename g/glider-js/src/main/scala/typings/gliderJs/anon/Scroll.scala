package typings.gliderJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scroll extends js.Object {
  
  def scroll(): Unit = js.native
}
object Scroll {
  
  @scala.inline
  def apply(scroll: () => Unit): Scroll = {
    val __obj = js.Dynamic.literal(scroll = js.Any.fromFunction0(scroll))
    __obj.asInstanceOf[Scroll]
  }
  
  @scala.inline
  implicit class ScrollOps[Self <: Scroll] (val x: Self) extends AnyVal {
    
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
    def setScroll(value: () => Unit): Self = this.set("scroll", js.Any.fromFunction0(value))
  }
}
