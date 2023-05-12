package typings.fullcalendarCore.internalCommonMod

import typings.preact.mod.ComponentChild
import typings.preact.mod.ComponentChildren
import typings.preact.srcJsxMod.JSXInternal.CSSProperties
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@fullcalendar/core.@fullcalendar/core/internal-common.ElProps> */
trait DayCellContainerProps extends StObject {
  
  var children: js.UndefOr[InnerContainerFunc[DayCellContentArg]] = js.undefined
  
  var date: js.Date
  
  var dateProfile: DateProfile
  
  var defaultGenerator: js.UndefOr[js.Function1[/* renderProps */ DayCellContentArg, ComponentChild]] = js.undefined
  
  var elAttrs: js.UndefOr[ElAttrs] = js.undefined
  
  var elClasses: js.UndefOr[js.Array[String]] = js.undefined
  
  var elRef: js.UndefOr[ElRef] = js.undefined
  
  var elStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var elTag: js.UndefOr[String] = js.undefined
  
  var extraRenderProps: js.UndefOr[Dictionary] = js.undefined
  
  var isMonthStart: js.UndefOr[Boolean] = js.undefined
  
  var showDayNumber: js.UndefOr[Boolean] = js.undefined
  
  var todayRange: DateRange
}
object DayCellContainerProps {
  
  inline def apply(date: js.Date, dateProfile: DateProfile, todayRange: DateRange): DayCellContainerProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dateProfile = dateProfile.asInstanceOf[js.Any], todayRange = todayRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayCellContainerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DayCellContainerProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(
      value: (/* InnerContainer */ InnerContainerComponent, DayCellContentArg, /* elAttrs */ ElAttrs) => ComponentChildren
    ): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateProfile(value: DateProfile): Self = StObject.set(x, "dateProfile", value.asInstanceOf[js.Any])
    
    inline def setDefaultGenerator(value: /* renderProps */ DayCellContentArg => ComponentChild): Self = StObject.set(x, "defaultGenerator", js.Any.fromFunction1(value))
    
    inline def setDefaultGeneratorUndefined: Self = StObject.set(x, "defaultGenerator", js.undefined)
    
    inline def setElAttrs(value: ElAttrs): Self = StObject.set(x, "elAttrs", value.asInstanceOf[js.Any])
    
    inline def setElAttrsUndefined: Self = StObject.set(x, "elAttrs", js.undefined)
    
    inline def setElClasses(value: js.Array[String]): Self = StObject.set(x, "elClasses", value.asInstanceOf[js.Any])
    
    inline def setElClassesUndefined: Self = StObject.set(x, "elClasses", js.undefined)
    
    inline def setElClassesVarargs(value: String*): Self = StObject.set(x, "elClasses", js.Array(value*))
    
    inline def setElRef(value: ElRef): Self = StObject.set(x, "elRef", value.asInstanceOf[js.Any])
    
    inline def setElRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "elRef", js.Any.fromFunction1(value))
    
    inline def setElRefNull: Self = StObject.set(x, "elRef", null)
    
    inline def setElRefUndefined: Self = StObject.set(x, "elRef", js.undefined)
    
    inline def setElStyle(value: CSSProperties): Self = StObject.set(x, "elStyle", value.asInstanceOf[js.Any])
    
    inline def setElStyleUndefined: Self = StObject.set(x, "elStyle", js.undefined)
    
    inline def setElTag(value: String): Self = StObject.set(x, "elTag", value.asInstanceOf[js.Any])
    
    inline def setElTagUndefined: Self = StObject.set(x, "elTag", js.undefined)
    
    inline def setExtraRenderProps(value: Dictionary): Self = StObject.set(x, "extraRenderProps", value.asInstanceOf[js.Any])
    
    inline def setExtraRenderPropsUndefined: Self = StObject.set(x, "extraRenderProps", js.undefined)
    
    inline def setIsMonthStart(value: Boolean): Self = StObject.set(x, "isMonthStart", value.asInstanceOf[js.Any])
    
    inline def setIsMonthStartUndefined: Self = StObject.set(x, "isMonthStart", js.undefined)
    
    inline def setShowDayNumber(value: Boolean): Self = StObject.set(x, "showDayNumber", value.asInstanceOf[js.Any])
    
    inline def setShowDayNumberUndefined: Self = StObject.set(x, "showDayNumber", js.undefined)
    
    inline def setTodayRange(value: DateRange): Self = StObject.set(x, "todayRange", value.asInstanceOf[js.Any])
  }
}
