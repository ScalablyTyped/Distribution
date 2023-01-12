package typings.dhtmlxscheduler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerLocale extends StObject {
  
  var date: SchedulerLocaleDate
  
  var labels: SchedulerLocaleLabels
}
object SchedulerLocale {
  
  inline def apply(date: SchedulerLocaleDate, labels: SchedulerLocaleLabels): SchedulerLocale = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerLocale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchedulerLocale] (val x: Self) extends AnyVal {
    
    inline def setDate(value: SchedulerLocaleDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: SchedulerLocaleLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
  }
}
