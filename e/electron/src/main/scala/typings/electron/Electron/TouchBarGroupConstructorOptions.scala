package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarGroupConstructorOptions extends StObject {
  
  /**
    * Items to display as a group.
    */
  var items: TouchBar = js.native
}
object TouchBarGroupConstructorOptions {
  
  @scala.inline
  def apply(items: TouchBar): TouchBarGroupConstructorOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarGroupConstructorOptions]
  }
  
  @scala.inline
  implicit class TouchBarGroupConstructorOptionsMutableBuilder[Self <: TouchBarGroupConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: TouchBar): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
  }
}
