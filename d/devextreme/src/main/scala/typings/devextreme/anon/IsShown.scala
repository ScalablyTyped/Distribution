package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsShown extends StObject {
  
  var isShown: js.UndefOr[Boolean] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object IsShown {
  
  @scala.inline
  def apply(): IsShown = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsShown]
  }
  
  @scala.inline
  implicit class IsShownMutableBuilder[Self <: IsShown] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsShown(value: Boolean): Self = StObject.set(x, "isShown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsShownUndefined: Self = StObject.set(x, "isShown", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
