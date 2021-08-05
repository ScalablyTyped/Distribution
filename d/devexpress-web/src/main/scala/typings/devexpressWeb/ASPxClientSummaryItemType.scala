package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists values that specify the summary item's aggregate function types.
  */
trait ASPxClientSummaryItemType extends StObject {
  
  /**
    * The column's average value.
    */
  var Average: Double
  
  /**
    * The record count.
    */
  var Count: Double
  
  /**
    * The maximum value in the column.
    */
  var Max: Double
  
  /**
    * The minimum value in the column.
    */
  var Min: Double
  
  /**
    * The sum of all values in a column.
    */
  var Sum: Double
}
object ASPxClientSummaryItemType {
  
  inline def apply(Average: Double, Count: Double, Max: Double, Min: Double, Sum: Double): ASPxClientSummaryItemType = {
    val __obj = js.Dynamic.literal(Average = Average.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Min = Min.asInstanceOf[js.Any], Sum = Sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSummaryItemType]
  }
  
  extension [Self <: ASPxClientSummaryItemType](x: Self) {
    
    inline def setAverage(value: Double): Self = StObject.set(x, "Average", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setSum(value: Double): Self = StObject.set(x, "Sum", value.asInstanceOf[js.Any])
  }
}
