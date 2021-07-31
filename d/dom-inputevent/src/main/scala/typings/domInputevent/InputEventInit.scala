package typings.domInputevent

import typings.std.UIEventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputEventInit
  extends StObject
     with UIEventInit {
  
  var data: js.UndefOr[String | Null] = js.undefined
  
  var isComposing: js.UndefOr[Boolean] = js.undefined
}
object InputEventInit {
  
  @scala.inline
  def apply(): InputEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputEventInit]
  }
  
  @scala.inline
  implicit class InputEventInitMutableBuilder[Self <: InputEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = StObject.set(x, "data", null)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setIsComposing(value: Boolean): Self = StObject.set(x, "isComposing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsComposingUndefined: Self = StObject.set(x, "isComposing", js.undefined)
  }
}
