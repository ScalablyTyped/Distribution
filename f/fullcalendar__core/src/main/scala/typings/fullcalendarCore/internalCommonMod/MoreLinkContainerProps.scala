package typings.fullcalendarCore.internalCommonMod

import typings.preact.mod.ComponentChild
import typings.preact.mod.ComponentChildren
import typings.preact.mod.RefObject
import typings.preact.srcJsxMod.JSXInternal.CSSProperties
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@fullcalendar/core.@fullcalendar/core/internal-common.ElProps> */
trait MoreLinkContainerProps extends StObject {
  
  var alignGridTop: js.UndefOr[Boolean] = js.undefined
  
  var alignmentElRef: js.UndefOr[RefObject[HTMLElement]] = js.undefined
  
  var allDayDate: js.Date | Null
  
  var allSegs: js.Array[Seg]
  
  var children: js.UndefOr[InnerContainerFunc[MoreLinkContentArg]] = js.undefined
  
  var dateProfile: DateProfile
  
  var defaultGenerator: js.UndefOr[js.Function1[/* renderProps */ MoreLinkContentArg, ComponentChild]] = js.undefined
  
  var elAttrs: js.UndefOr[ElAttrs] = js.undefined
  
  var elClasses: js.UndefOr[js.Array[String]] = js.undefined
  
  var elRef: js.UndefOr[ElRef] = js.undefined
  
  var elStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var elTag: js.UndefOr[String] = js.undefined
  
  var extraDateSpan: js.UndefOr[Dictionary] = js.undefined
  
  var forceTimed: js.UndefOr[Boolean] = js.undefined
  
  var hiddenSegs: js.Array[Seg]
  
  var moreCnt: Double
  
  def popoverContent(): ComponentChild
  
  var todayRange: DateRange
}
object MoreLinkContainerProps {
  
  inline def apply(
    allSegs: js.Array[Seg],
    dateProfile: DateProfile,
    hiddenSegs: js.Array[Seg],
    moreCnt: Double,
    popoverContent: () => ComponentChild,
    todayRange: DateRange
  ): MoreLinkContainerProps = {
    val __obj = js.Dynamic.literal(allSegs = allSegs.asInstanceOf[js.Any], dateProfile = dateProfile.asInstanceOf[js.Any], hiddenSegs = hiddenSegs.asInstanceOf[js.Any], moreCnt = moreCnt.asInstanceOf[js.Any], popoverContent = js.Any.fromFunction0(popoverContent), todayRange = todayRange.asInstanceOf[js.Any], allDayDate = null)
    __obj.asInstanceOf[MoreLinkContainerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoreLinkContainerProps] (val x: Self) extends AnyVal {
    
    inline def setAlignGridTop(value: Boolean): Self = StObject.set(x, "alignGridTop", value.asInstanceOf[js.Any])
    
    inline def setAlignGridTopUndefined: Self = StObject.set(x, "alignGridTop", js.undefined)
    
    inline def setAlignmentElRef(value: RefObject[HTMLElement]): Self = StObject.set(x, "alignmentElRef", value.asInstanceOf[js.Any])
    
    inline def setAlignmentElRefUndefined: Self = StObject.set(x, "alignmentElRef", js.undefined)
    
    inline def setAllDayDate(value: js.Date): Self = StObject.set(x, "allDayDate", value.asInstanceOf[js.Any])
    
    inline def setAllDayDateNull: Self = StObject.set(x, "allDayDate", null)
    
    inline def setAllSegs(value: js.Array[Seg]): Self = StObject.set(x, "allSegs", value.asInstanceOf[js.Any])
    
    inline def setAllSegsVarargs(value: Seg*): Self = StObject.set(x, "allSegs", js.Array(value*))
    
    inline def setChildren(
      value: (/* InnerContainer */ InnerContainerComponent, MoreLinkContentArg, /* elAttrs */ ElAttrs) => ComponentChildren
    ): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDateProfile(value: DateProfile): Self = StObject.set(x, "dateProfile", value.asInstanceOf[js.Any])
    
    inline def setDefaultGenerator(value: /* renderProps */ MoreLinkContentArg => ComponentChild): Self = StObject.set(x, "defaultGenerator", js.Any.fromFunction1(value))
    
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
    
    inline def setExtraDateSpan(value: Dictionary): Self = StObject.set(x, "extraDateSpan", value.asInstanceOf[js.Any])
    
    inline def setExtraDateSpanUndefined: Self = StObject.set(x, "extraDateSpan", js.undefined)
    
    inline def setForceTimed(value: Boolean): Self = StObject.set(x, "forceTimed", value.asInstanceOf[js.Any])
    
    inline def setForceTimedUndefined: Self = StObject.set(x, "forceTimed", js.undefined)
    
    inline def setHiddenSegs(value: js.Array[Seg]): Self = StObject.set(x, "hiddenSegs", value.asInstanceOf[js.Any])
    
    inline def setHiddenSegsVarargs(value: Seg*): Self = StObject.set(x, "hiddenSegs", js.Array(value*))
    
    inline def setMoreCnt(value: Double): Self = StObject.set(x, "moreCnt", value.asInstanceOf[js.Any])
    
    inline def setPopoverContent(value: () => ComponentChild): Self = StObject.set(x, "popoverContent", js.Any.fromFunction0(value))
    
    inline def setTodayRange(value: DateRange): Self = StObject.set(x, "todayRange", value.asInstanceOf[js.Any])
  }
}
