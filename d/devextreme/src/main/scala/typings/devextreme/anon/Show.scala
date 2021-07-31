package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Show extends StObject {
  
  var hide: js.UndefOr[Double] = js.undefined
  
  var show: js.UndefOr[Double] = js.undefined
}
object Show {
  
  @scala.inline
  def apply(): Show = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Show]
  }
  
  @scala.inline
  implicit class ShowMutableBuilder[Self <: Show] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHide(value: Double): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    @scala.inline
    def setShow(value: Double): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
