package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebExtEvent[TCallback /* <: js.Function1[/* repeated */ js.Any, _] */] extends js.Object {
  
  def addListener(cb: TCallback): Unit = js.native
  
  def hasListener(cb: TCallback): Boolean = js.native
  
  def removeListener(cb: TCallback): Unit = js.native
}
object WebExtEvent {
  
  @scala.inline
  def apply[TCallback /* <: js.Function1[/* repeated */ js.Any, _] */](
    addListener: TCallback => Unit,
    hasListener: TCallback => Boolean,
    removeListener: TCallback => Unit
  ): WebExtEvent[TCallback] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
    __obj.asInstanceOf[WebExtEvent[TCallback]]
  }
  
  @scala.inline
  implicit class WebExtEventOps[Self <: WebExtEvent[_], TCallback /* <: js.Function1[/* repeated */ js.Any, _] */] (val x: Self with WebExtEvent[TCallback]) extends AnyVal {
    
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
    def setAddListener(value: TCallback => Unit): Self = this.set("addListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasListener(value: TCallback => Boolean): Self = this.set("hasListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveListener(value: TCallback => Unit): Self = this.set("removeListener", js.Any.fromFunction1(value))
  }
}
