package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Start extends StObject {
  
  var end: js.UndefOr[Double] = js.undefined
  
  var start: js.UndefOr[Double] = js.undefined
}
object Start {
  
  @scala.inline
  def apply(): Start = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Start]
  }
  
  @scala.inline
  implicit class StartMutableBuilder[Self <: Start] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
