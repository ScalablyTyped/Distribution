package typings.fullcalendarDaygrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CurrentRange extends StObject {
    
    var currentRange: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateRange */ Any
    
    var dateEnv: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateEnv */ Any
    
    var fixedWeekCount: Boolean
    
    var snapToWeek: Boolean
  }
  object CurrentRange {
    
    inline def apply(
      currentRange: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateRange */ Any,
      dateEnv: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateEnv */ Any,
      fixedWeekCount: Boolean,
      snapToWeek: Boolean
    ): CurrentRange = {
      val __obj = js.Dynamic.literal(currentRange = currentRange.asInstanceOf[js.Any], dateEnv = dateEnv.asInstanceOf[js.Any], fixedWeekCount = fixedWeekCount.asInstanceOf[js.Any], snapToWeek = snapToWeek.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentRange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CurrentRange] (val x: Self) extends AnyVal {
      
      inline def setCurrentRange(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateRange */ Any
      ): Self = StObject.set(x, "currentRange", value.asInstanceOf[js.Any])
      
      inline def setDateEnv(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DateEnv */ Any
      ): Self = StObject.set(x, "dateEnv", value.asInstanceOf[js.Any])
      
      inline def setFixedWeekCount(value: Boolean): Self = StObject.set(x, "fixedWeekCount", value.asInstanceOf[js.Any])
      
      inline def setSnapToWeek(value: Boolean): Self = StObject.set(x, "snapToWeek", value.asInstanceOf[js.Any])
    }
  }
}
