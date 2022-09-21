package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DayCellRootProps extends StObject {
  
  def children(
    rootElRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any,
    classNames: js.Array[String],
    rootDataAttrs: Any,
    isDisabled: Boolean
  ): Any
  
  var date: js.Date
  
  var dateProfile: DateProfile
  
  var elRef: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any
  ] = js.undefined
  
  var extraHookProps: js.UndefOr[Dictionary] = js.undefined
  
  var showDayNumber: js.UndefOr[Boolean] = js.undefined
  
  var todayRange: DateRange
}
object DayCellRootProps {
  
  inline def apply(
    children: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any, js.Array[String], Any, Boolean) => Any,
    date: js.Date,
    dateProfile: DateProfile,
    todayRange: DateRange
  ): DayCellRootProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction4(children), date = date.asInstanceOf[js.Any], dateProfile = dateProfile.asInstanceOf[js.Any], todayRange = todayRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayCellRootProps]
  }
  
  extension [Self <: DayCellRootProps](x: Self) {
    
    inline def setChildren(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any, js.Array[String], Any, Boolean) => Any
    ): Self = StObject.set(x, "children", js.Any.fromFunction4(value))
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateProfile(value: DateProfile): Self = StObject.set(x, "dateProfile", value.asInstanceOf[js.Any])
    
    inline def setElRef(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<any> */ Any
    ): Self = StObject.set(x, "elRef", value.asInstanceOf[js.Any])
    
    inline def setElRefUndefined: Self = StObject.set(x, "elRef", js.undefined)
    
    inline def setExtraHookProps(value: Dictionary): Self = StObject.set(x, "extraHookProps", value.asInstanceOf[js.Any])
    
    inline def setExtraHookPropsUndefined: Self = StObject.set(x, "extraHookProps", js.undefined)
    
    inline def setShowDayNumber(value: Boolean): Self = StObject.set(x, "showDayNumber", value.asInstanceOf[js.Any])
    
    inline def setShowDayNumberUndefined: Self = StObject.set(x, "showDayNumber", js.undefined)
    
    inline def setTodayRange(value: DateRange): Self = StObject.set(x, "todayRange", value.asInstanceOf[js.Any])
  }
}
