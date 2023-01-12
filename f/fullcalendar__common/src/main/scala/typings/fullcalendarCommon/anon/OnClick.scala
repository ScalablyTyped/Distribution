package typings.fullcalendarCommon.anon

import typings.std.KeyboardEvent
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClick extends StObject {
  
  def onClick(ev: UIEvent): scala.Unit
  
  def onKeyDown(ev: KeyboardEvent): scala.Unit
  
  var tabIndex: Double
}
object OnClick {
  
  inline def apply(onClick: UIEvent => scala.Unit, onKeyDown: KeyboardEvent => scala.Unit, tabIndex: Double): OnClick = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), onKeyDown = js.Any.fromFunction1(onKeyDown), tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnClick] (val x: Self) extends AnyVal {
    
    inline def setOnClick(value: UIEvent => scala.Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnKeyDown(value: KeyboardEvent => scala.Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
  }
}
