package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Time window specified for weekly operations.
  */
trait SchemaResourcePolicyWeeklyCycle extends StObject {
  
  /**
    * Up to 7 intervals/windows, one for each day of the week.
    */
  var dayOfWeeks: js.UndefOr[js.Array[SchemaResourcePolicyWeeklyCycleDayOfWeek]] = js.undefined
}
object SchemaResourcePolicyWeeklyCycle {
  
  @scala.inline
  def apply(): SchemaResourcePolicyWeeklyCycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicyWeeklyCycle]
  }
  
  @scala.inline
  implicit class SchemaResourcePolicyWeeklyCycleMutableBuilder[Self <: SchemaResourcePolicyWeeklyCycle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDayOfWeeks(value: js.Array[SchemaResourcePolicyWeeklyCycleDayOfWeek]): Self = StObject.set(x, "dayOfWeeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayOfWeeksUndefined: Self = StObject.set(x, "dayOfWeeks", js.undefined)
    
    @scala.inline
    def setDayOfWeeksVarargs(value: SchemaResourcePolicyWeeklyCycleDayOfWeek*): Self = StObject.set(x, "dayOfWeeks", js.Array(value :_*))
  }
}
