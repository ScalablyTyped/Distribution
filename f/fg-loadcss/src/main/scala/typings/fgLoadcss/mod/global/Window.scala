package typings.fgLoadcss.mod.global

import typings.std.HTMLLinkElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends js.Object {
  
  def onloadCSS(stylesheet: HTMLLinkElement, callback: js.Function0[Unit]): Unit = js.native
}
object Window {
  
  @scala.inline
  def apply(onloadCSS: (HTMLLinkElement, js.Function0[Unit]) => Unit): Window = {
    val __obj = js.Dynamic.literal(onloadCSS = js.Any.fromFunction2(onloadCSS))
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    
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
    def setOnloadCSS(value: (HTMLLinkElement, js.Function0[Unit]) => Unit): Self = this.set("onloadCSS", js.Any.fromFunction2(value))
  }
}
