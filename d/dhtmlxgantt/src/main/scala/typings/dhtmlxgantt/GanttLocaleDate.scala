package typings.dhtmlxgantt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttLocaleDate extends StObject {
  
  var day_full: js.Array[String]
  
  var day_short: js.Array[String]
  
  var month_full: js.Array[String]
  
  var month_short: js.Array[String]
}
object GanttLocaleDate {
  
  inline def apply(
    day_full: js.Array[String],
    day_short: js.Array[String],
    month_full: js.Array[String],
    month_short: js.Array[String]
  ): GanttLocaleDate = {
    val __obj = js.Dynamic.literal(day_full = day_full.asInstanceOf[js.Any], day_short = day_short.asInstanceOf[js.Any], month_full = month_full.asInstanceOf[js.Any], month_short = month_short.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttLocaleDate]
  }
  
  extension [Self <: GanttLocaleDate](x: Self) {
    
    inline def setDay_full(value: js.Array[String]): Self = StObject.set(x, "day_full", value.asInstanceOf[js.Any])
    
    inline def setDay_fullVarargs(value: String*): Self = StObject.set(x, "day_full", js.Array(value :_*))
    
    inline def setDay_short(value: js.Array[String]): Self = StObject.set(x, "day_short", value.asInstanceOf[js.Any])
    
    inline def setDay_shortVarargs(value: String*): Self = StObject.set(x, "day_short", js.Array(value :_*))
    
    inline def setMonth_full(value: js.Array[String]): Self = StObject.set(x, "month_full", value.asInstanceOf[js.Any])
    
    inline def setMonth_fullVarargs(value: String*): Self = StObject.set(x, "month_full", js.Array(value :_*))
    
    inline def setMonth_short(value: js.Array[String]): Self = StObject.set(x, "month_short", value.asInstanceOf[js.Any])
    
    inline def setMonth_shortVarargs(value: String*): Self = StObject.set(x, "month_short", js.Array(value :_*))
  }
}
