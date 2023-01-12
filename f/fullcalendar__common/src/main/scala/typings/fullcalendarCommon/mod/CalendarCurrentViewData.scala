package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarCurrentViewData extends StObject {
  
  var dateProfileGenerator: DateProfileGenerator
  
  var options: ViewOptionsRefined
  
  var viewApi: ViewApi
  
  var viewSpec: ViewSpec
}
object CalendarCurrentViewData {
  
  inline def apply(
    dateProfileGenerator: DateProfileGenerator,
    options: ViewOptionsRefined,
    viewApi: ViewApi,
    viewSpec: ViewSpec
  ): CalendarCurrentViewData = {
    val __obj = js.Dynamic.literal(dateProfileGenerator = dateProfileGenerator.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], viewApi = viewApi.asInstanceOf[js.Any], viewSpec = viewSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarCurrentViewData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalendarCurrentViewData] (val x: Self) extends AnyVal {
    
    inline def setDateProfileGenerator(value: DateProfileGenerator): Self = StObject.set(x, "dateProfileGenerator", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ViewOptionsRefined): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setViewApi(value: ViewApi): Self = StObject.set(x, "viewApi", value.asInstanceOf[js.Any])
    
    inline def setViewSpec(value: ViewSpec): Self = StObject.set(x, "viewSpec", value.asInstanceOf[js.Any])
  }
}
