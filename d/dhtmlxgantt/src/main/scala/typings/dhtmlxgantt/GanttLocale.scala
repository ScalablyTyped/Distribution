package typings.dhtmlxgantt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttLocale extends StObject {
  
  var date: GanttLocaleDate
  
  var labels: GanttLocaleLabels
}
object GanttLocale {
  
  inline def apply(date: GanttLocaleDate, labels: GanttLocaleLabels): GanttLocale = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttLocale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GanttLocale] (val x: Self) extends AnyVal {
    
    inline def setDate(value: GanttLocaleDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: GanttLocaleLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
  }
}
