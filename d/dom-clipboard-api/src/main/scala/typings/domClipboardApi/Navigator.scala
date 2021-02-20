package typings.domClipboardApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigator extends StObject {
  
  val clipboard: Clipboard = js.native
}
object Navigator {
  
  @scala.inline
  def apply(clipboard: Clipboard): Navigator = {
    val __obj = js.Dynamic.literal(clipboard = clipboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit class NavigatorMutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClipboard(value: Clipboard): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
  }
}
