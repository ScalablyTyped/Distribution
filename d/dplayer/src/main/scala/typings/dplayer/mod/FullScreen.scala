package typings.dplayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullScreen extends js.Object {
  
  def cancel(`type`: FullScreenType): Unit = js.native
  
  def request(`type`: FullScreenType): Unit = js.native
}
object FullScreen {
  
  @scala.inline
  def apply(cancel: FullScreenType => Unit, request: FullScreenType => Unit): FullScreen = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), request = js.Any.fromFunction1(request))
    __obj.asInstanceOf[FullScreen]
  }
  
  @scala.inline
  implicit class FullScreenOps[Self <: FullScreen] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: FullScreenType => Unit): Self = this.set("cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequest(value: FullScreenType => Unit): Self = this.set("request", js.Any.fromFunction1(value))
  }
}
