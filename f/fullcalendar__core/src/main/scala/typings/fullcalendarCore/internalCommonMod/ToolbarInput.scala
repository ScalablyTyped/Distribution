package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolbarInput extends StObject {
  
  var center: js.UndefOr[String] = js.undefined
  
  var end: js.UndefOr[String] = js.undefined
  
  var left: js.UndefOr[String] = js.undefined
  
  var right: js.UndefOr[String] = js.undefined
  
  var start: js.UndefOr[String] = js.undefined
}
object ToolbarInput {
  
  inline def apply(): ToolbarInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToolbarInput] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: String): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
