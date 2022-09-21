package typings.fullcalendarCommon.anon

import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnKeyDown extends StObject {
  
  def onKeyDown(ev: KeyboardEvent): scala.Unit
  
  var tabIndex: Double
}
object OnKeyDown {
  
  inline def apply(onKeyDown: KeyboardEvent => scala.Unit, tabIndex: Double): OnKeyDown = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown), tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnKeyDown]
  }
  
  extension [Self <: OnKeyDown](x: Self) {
    
    inline def setOnKeyDown(value: KeyboardEvent => scala.Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
  }
}
