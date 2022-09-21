package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarRootProps extends StObject {
  
  def children(classNames: js.Array[String], height: CssDimValue, isHeightAuto: Boolean, forPrint: Boolean): Any
  
  var emitter: Emitter[CalendarListeners]
  
  var options: CalendarOptions
  
  var theme: Theme
}
object CalendarRootProps {
  
  inline def apply(
    children: (js.Array[String], CssDimValue, Boolean, Boolean) => Any,
    emitter: Emitter[CalendarListeners],
    options: CalendarOptions,
    theme: Theme
  ): CalendarRootProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction4(children), emitter = emitter.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarRootProps]
  }
  
  extension [Self <: CalendarRootProps](x: Self) {
    
    inline def setChildren(value: (js.Array[String], CssDimValue, Boolean, Boolean) => Any): Self = StObject.set(x, "children", js.Any.fromFunction4(value))
    
    inline def setEmitter(value: Emitter[CalendarListeners]): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: CalendarOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
