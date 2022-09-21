package typings.fullcalendarCommon.mod

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoreLinkRootProps extends StObject {
  
  var alignGridTop: js.UndefOr[Boolean] = js.undefined
  
  var alignmentElRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RefObject<HTMLElement> */ Any
  
  var allDayDate: js.Date | Null
  
  var allSegs: js.Array[Seg]
  
  def children(
    rootElRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any,
    classNames: js.Array[String],
    innerElRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any,
    innerContent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any,
    handleClick: js.Function1[/* ev */ MouseEvent, Unit],
    title: String,
    isExpanded: Boolean,
    popoverId: String
  ): Any
  @JSName("children")
  var children_Original: MoreLinkChildren
  
  var dateProfile: DateProfile
  
  var defaultContent: js.UndefOr[
    js.Function1[
      /* hookProps */ MoreLinkContentArg, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any
    ]
  ] = js.undefined
  
  var extraDateSpan: js.UndefOr[Dictionary] = js.undefined
  
  var hiddenSegs: js.Array[Seg]
  
  var moreCnt: Double
  
  def popoverContent(): Any
  
  var todayRange: DateRange
  
  var topAlignmentElRef: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RefObject<HTMLElement> */ Any
  ] = js.undefined
}
object MoreLinkRootProps {
  
  inline def apply(
    alignmentElRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RefObject<HTMLElement> */ Any,
    allSegs: js.Array[Seg],
    children: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ /* rootElRef */ Any, /* classNames */ js.Array[String], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ /* innerElRef */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ /* innerContent */ Any, /* handleClick */ js.Function1[/* ev */ MouseEvent, Unit], /* title */ String, /* isExpanded */ Boolean, /* popoverId */ String) => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any,
    dateProfile: DateProfile,
    hiddenSegs: js.Array[Seg],
    moreCnt: Double,
    popoverContent: () => Any,
    todayRange: DateRange
  ): MoreLinkRootProps = {
    val __obj = js.Dynamic.literal(alignmentElRef = alignmentElRef.asInstanceOf[js.Any], allSegs = allSegs.asInstanceOf[js.Any], children = js.Any.fromFunction8(children), dateProfile = dateProfile.asInstanceOf[js.Any], hiddenSegs = hiddenSegs.asInstanceOf[js.Any], moreCnt = moreCnt.asInstanceOf[js.Any], popoverContent = js.Any.fromFunction0(popoverContent), todayRange = todayRange.asInstanceOf[js.Any], allDayDate = null)
    __obj.asInstanceOf[MoreLinkRootProps]
  }
  
  extension [Self <: MoreLinkRootProps](x: Self) {
    
    inline def setAlignGridTop(value: Boolean): Self = StObject.set(x, "alignGridTop", value.asInstanceOf[js.Any])
    
    inline def setAlignGridTopUndefined: Self = StObject.set(x, "alignGridTop", js.undefined)
    
    inline def setAlignmentElRef(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RefObject<HTMLElement> */ Any
    ): Self = StObject.set(x, "alignmentElRef", value.asInstanceOf[js.Any])
    
    inline def setAllDayDate(value: js.Date): Self = StObject.set(x, "allDayDate", value.asInstanceOf[js.Any])
    
    inline def setAllDayDateNull: Self = StObject.set(x, "allDayDate", null)
    
    inline def setAllSegs(value: js.Array[Seg]): Self = StObject.set(x, "allSegs", value.asInstanceOf[js.Any])
    
    inline def setAllSegsVarargs(value: Seg*): Self = StObject.set(x, "allSegs", js.Array(value*))
    
    inline def setChildren(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ /* rootElRef */ Any, /* classNames */ js.Array[String], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ /* innerElRef */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ /* innerContent */ Any, /* handleClick */ js.Function1[/* ev */ MouseEvent, Unit], /* title */ String, /* isExpanded */ Boolean, /* popoverId */ String) => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any
    ): Self = StObject.set(x, "children", js.Any.fromFunction8(value))
    
    inline def setDateProfile(value: DateProfile): Self = StObject.set(x, "dateProfile", value.asInstanceOf[js.Any])
    
    inline def setDefaultContent(
      value: /* hookProps */ MoreLinkContentArg => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any
    ): Self = StObject.set(x, "defaultContent", js.Any.fromFunction1(value))
    
    inline def setDefaultContentUndefined: Self = StObject.set(x, "defaultContent", js.undefined)
    
    inline def setExtraDateSpan(value: Dictionary): Self = StObject.set(x, "extraDateSpan", value.asInstanceOf[js.Any])
    
    inline def setExtraDateSpanUndefined: Self = StObject.set(x, "extraDateSpan", js.undefined)
    
    inline def setHiddenSegs(value: js.Array[Seg]): Self = StObject.set(x, "hiddenSegs", value.asInstanceOf[js.Any])
    
    inline def setHiddenSegsVarargs(value: Seg*): Self = StObject.set(x, "hiddenSegs", js.Array(value*))
    
    inline def setMoreCnt(value: Double): Self = StObject.set(x, "moreCnt", value.asInstanceOf[js.Any])
    
    inline def setPopoverContent(value: () => Any): Self = StObject.set(x, "popoverContent", js.Any.fromFunction0(value))
    
    inline def setTodayRange(value: DateRange): Self = StObject.set(x, "todayRange", value.asInstanceOf[js.Any])
    
    inline def setTopAlignmentElRef(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RefObject<HTMLElement> */ Any
    ): Self = StObject.set(x, "topAlignmentElRef", value.asInstanceOf[js.Any])
    
    inline def setTopAlignmentElRefUndefined: Self = StObject.set(x, "topAlignmentElRef", js.undefined)
  }
}
