package typings.fullcalendarCore.internalCommonMod

import typings.preact.mod.ComponentChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeekNumberContainerProps
  extends StObject
     with ElProps {
  
  var children: js.UndefOr[InnerContainerFunc[WeekNumberContentArg]] = js.undefined
  
  var date: js.Date
  
  var defaultFormat: DateFormatter
}
object WeekNumberContainerProps {
  
  inline def apply(date: js.Date, defaultFormat: DateFormatter, elTag: String): WeekNumberContainerProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], defaultFormat = defaultFormat.asInstanceOf[js.Any], elTag = elTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeekNumberContainerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WeekNumberContainerProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(
      value: (/* InnerContainer */ InnerContainerComponent, WeekNumberContentArg, /* elAttrs */ ElAttrs) => ComponentChildren
    ): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDefaultFormat(value: DateFormatter): Self = StObject.set(x, "defaultFormat", value.asInstanceOf[js.Any])
  }
}
