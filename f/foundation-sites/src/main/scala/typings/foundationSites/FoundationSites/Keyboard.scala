package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Keyboard extends js.Object {
  
  def findFocusable($element: js.Object): js.Object = js.native
  
  def handleKey(event: js.Any, component: js.Any, functions: js.Any): Unit = js.native
  
  def parseKey(event: js.Any): String = js.native
}
object Keyboard {
  
  @scala.inline
  def apply(
    findFocusable: js.Object => js.Object,
    handleKey: (js.Any, js.Any, js.Any) => Unit,
    parseKey: js.Any => String
  ): Keyboard = {
    val __obj = js.Dynamic.literal(findFocusable = js.Any.fromFunction1(findFocusable), handleKey = js.Any.fromFunction3(handleKey), parseKey = js.Any.fromFunction1(parseKey))
    __obj.asInstanceOf[Keyboard]
  }
  
  @scala.inline
  implicit class KeyboardOps[Self <: Keyboard] (val x: Self) extends AnyVal {
    
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
    def setFindFocusable(value: js.Object => js.Object): Self = this.set("findFocusable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleKey(value: (js.Any, js.Any, js.Any) => Unit): Self = this.set("handleKey", js.Any.fromFunction3(value))
    
    @scala.inline
    def setParseKey(value: js.Any => String): Self = this.set("parseKey", js.Any.fromFunction1(value))
  }
}
