package typings.dhtmlxscheduler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerLocale extends StObject {
  
  var date: SchedulerLocaleDate = js.native
  
  var labels: SchedulerLocaleLabels = js.native
}
object SchedulerLocale {
  
  @scala.inline
  def apply(date: SchedulerLocaleDate, labels: SchedulerLocaleLabels): SchedulerLocale = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerLocale]
  }
  
  @scala.inline
  implicit class SchedulerLocaleMutableBuilder[Self <: SchedulerLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: SchedulerLocaleDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: SchedulerLocaleLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
  }
}
