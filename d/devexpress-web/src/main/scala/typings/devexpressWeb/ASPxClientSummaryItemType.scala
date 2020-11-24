package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists values that specify the summary item's aggregate function types.
  */
@js.native
trait ASPxClientSummaryItemType extends js.Object {
  
  /**
    * The column's average value.
    */
  var Average: Double = js.native
  
  /**
    * The record count.
    */
  var Count: Double = js.native
  
  /**
    * The maximum value in the column.
    */
  var Max: Double = js.native
  
  /**
    * The minimum value in the column.
    */
  var Min: Double = js.native
  
  /**
    * The sum of all values in a column.
    */
  var Sum: Double = js.native
}
object ASPxClientSummaryItemType {
  
  @scala.inline
  def apply(Average: Double, Count: Double, Max: Double, Min: Double, Sum: Double): ASPxClientSummaryItemType = {
    val __obj = js.Dynamic.literal(Average = Average.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Min = Min.asInstanceOf[js.Any], Sum = Sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSummaryItemType]
  }
  
  @scala.inline
  implicit class ASPxClientSummaryItemTypeOps[Self <: ASPxClientSummaryItemType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAverage(value: Double): Self = this.set("Average", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("Max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = this.set("Min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSum(value: Double): Self = this.set("Sum", value.asInstanceOf[js.Any])
  }
}
