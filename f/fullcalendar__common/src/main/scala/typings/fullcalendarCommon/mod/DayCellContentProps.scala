package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DayCellContentProps extends StObject {
  
  def children(
    innerElRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any,
    innerContent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any
  ): Any
  
  var date: js.Date
  
  var dateProfile: DateProfile
  
  var defaultContent: js.UndefOr[
    js.Function1[
      /* hookProps */ DayCellContentArg1, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any
    ]
  ] = js.undefined
  
  var extraHookProps: js.UndefOr[Dictionary] = js.undefined
  
  var showDayNumber: js.UndefOr[Boolean] = js.undefined
  
  var todayRange: DateRange
}
object DayCellContentProps {
  
  inline def apply(
    children: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any) => Any,
    date: js.Date,
    dateProfile: DateProfile,
    todayRange: DateRange
  ): DayCellContentProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), date = date.asInstanceOf[js.Any], dateProfile = dateProfile.asInstanceOf[js.Any], todayRange = todayRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayCellContentProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DayCellContentProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any) => Any
    ): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateProfile(value: DateProfile): Self = StObject.set(x, "dateProfile", value.asInstanceOf[js.Any])
    
    inline def setDefaultContent(
      value: /* hookProps */ DayCellContentArg1 => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentChildren */ Any
    ): Self = StObject.set(x, "defaultContent", js.Any.fromFunction1(value))
    
    inline def setDefaultContentUndefined: Self = StObject.set(x, "defaultContent", js.undefined)
    
    inline def setExtraHookProps(value: Dictionary): Self = StObject.set(x, "extraHookProps", value.asInstanceOf[js.Any])
    
    inline def setExtraHookPropsUndefined: Self = StObject.set(x, "extraHookProps", js.undefined)
    
    inline def setShowDayNumber(value: Boolean): Self = StObject.set(x, "showDayNumber", value.asInstanceOf[js.Any])
    
    inline def setShowDayNumberUndefined: Self = StObject.set(x, "showDayNumber", js.undefined)
    
    inline def setTodayRange(value: DateRange): Self = StObject.set(x, "todayRange", value.asInstanceOf[js.Any])
  }
}
