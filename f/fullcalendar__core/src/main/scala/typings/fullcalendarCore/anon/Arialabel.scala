package typings.fullcalendarCore.anon

import typings.std.KeyboardEvent
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arialabel extends StObject {
  
  var `aria-label`: scala.Unit
  
  var `data-navlink`: String
  
  def onClick(ev: UIEvent): scala.Unit
  
  def onKeyDown(ev: KeyboardEvent): scala.Unit
  
  var tabIndex: Double
  
  var title: Any
}
object Arialabel {
  
  inline def apply(
    `aria-label`: scala.Unit,
    `data-navlink`: String,
    onClick: UIEvent => scala.Unit,
    onKeyDown: KeyboardEvent => scala.Unit,
    tabIndex: Double,
    title: Any
  ): Arialabel = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), onKeyDown = js.Any.fromFunction1(onKeyDown), tabIndex = tabIndex.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-navlink")(`data-navlink`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arialabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Arialabel] (val x: Self) extends AnyVal {
    
    inline def `setAria-label`(value: scala.Unit): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setData-navlink`(value: String): Self = StObject.set(x, "data-navlink", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: UIEvent => scala.Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnKeyDown(value: KeyboardEvent => scala.Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
