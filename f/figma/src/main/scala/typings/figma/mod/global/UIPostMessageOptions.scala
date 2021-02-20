package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIPostMessageOptions extends StObject {
  
  var origin: js.UndefOr[String] = js.native
}
object UIPostMessageOptions {
  
  @scala.inline
  def apply(): UIPostMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIPostMessageOptions]
  }
  
  @scala.inline
  implicit class UIPostMessageOptionsMutableBuilder[Self <: UIPostMessageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
