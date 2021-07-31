package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionEnd extends StObject {
  
  var selectionEnd: Double
  
  var selectionStart: Double
}
object SelectionEnd {
  
  @scala.inline
  def apply(selectionEnd: Double, selectionStart: Double): SelectionEnd = {
    val __obj = js.Dynamic.literal(selectionEnd = selectionEnd.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionEnd]
  }
  
  @scala.inline
  implicit class SelectionEndMutableBuilder[Self <: SelectionEnd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectionEnd(value: Double): Self = StObject.set(x, "selectionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionStart(value: Double): Self = StObject.set(x, "selectionStart", value.asInstanceOf[js.Any])
  }
}
