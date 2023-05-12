package typings.fullcalendarCore.internalCommonMod

import typings.preact.mod.ComponentChildren
import typings.preact.srcJsxMod.JSXInternal.CSSProperties
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@fullcalendar/core.@fullcalendar/core/internal-common.ElProps> */
trait NowIndicatorContainerProps extends StObject {
  
  var children: js.UndefOr[InnerContainerFunc[NowIndicatorContentArg]] = js.undefined
  
  var date: js.Date
  
  var elAttrs: js.UndefOr[ElAttrs] = js.undefined
  
  var elClasses: js.UndefOr[js.Array[String]] = js.undefined
  
  var elRef: js.UndefOr[ElRef] = js.undefined
  
  var elStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var elTag: js.UndefOr[String] = js.undefined
  
  var isAxis: Boolean
}
object NowIndicatorContainerProps {
  
  inline def apply(date: js.Date, isAxis: Boolean): NowIndicatorContainerProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], isAxis = isAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[NowIndicatorContainerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NowIndicatorContainerProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(
      value: (/* InnerContainer */ InnerContainerComponent, NowIndicatorContentArg, /* elAttrs */ ElAttrs) => ComponentChildren
    ): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
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
    
    inline def setIsAxis(value: Boolean): Self = StObject.set(x, "isAxis", value.asInstanceOf[js.Any])
  }
}
