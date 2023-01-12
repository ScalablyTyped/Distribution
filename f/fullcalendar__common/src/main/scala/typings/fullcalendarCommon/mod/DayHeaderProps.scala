package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DayHeaderProps extends StObject {
  
  var dateProfile: DateProfile
  
  var dates: js.Array[js.Date]
  
  var datesRepDistinctDays: Boolean
  
  var renderIntro: js.UndefOr[
    js.Function1[
      /* rowKey */ String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any
    ]
  ] = js.undefined
}
object DayHeaderProps {
  
  inline def apply(dateProfile: DateProfile, dates: js.Array[js.Date], datesRepDistinctDays: Boolean): DayHeaderProps = {
    val __obj = js.Dynamic.literal(dateProfile = dateProfile.asInstanceOf[js.Any], dates = dates.asInstanceOf[js.Any], datesRepDistinctDays = datesRepDistinctDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayHeaderProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DayHeaderProps] (val x: Self) extends AnyVal {
    
    inline def setDateProfile(value: DateProfile): Self = StObject.set(x, "dateProfile", value.asInstanceOf[js.Any])
    
    inline def setDates(value: js.Array[js.Date]): Self = StObject.set(x, "dates", value.asInstanceOf[js.Any])
    
    inline def setDatesRepDistinctDays(value: Boolean): Self = StObject.set(x, "datesRepDistinctDays", value.asInstanceOf[js.Any])
    
    inline def setDatesVarargs(value: js.Date*): Self = StObject.set(x, "dates", js.Array(value*))
    
    inline def setRenderIntro(
      value: /* rowKey */ String => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any
    ): Self = StObject.set(x, "renderIntro", js.Any.fromFunction1(value))
    
    inline def setRenderIntroUndefined: Self = StObject.set(x, "renderIntro", js.undefined)
  }
}
