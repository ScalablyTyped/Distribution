package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaMonthDay extends StObject {
  
  /**
    * Day of a month, value in [1, 31] range. Valid range depends on the
    * specified month.
    */
  var day: js.UndefOr[Double] = js.native
  
  /**
    * Month of a year. e.g. 1 = JAN, 2 = FEB etc.
    */
  var month: js.UndefOr[Double] = js.native
}
object SchemaMonthDay {
  
  @scala.inline
  def apply(): SchemaMonthDay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMonthDay]
  }
  
  @scala.inline
  implicit class SchemaMonthDayMutableBuilder[Self <: SchemaMonthDay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    @scala.inline
    def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
  }
}
