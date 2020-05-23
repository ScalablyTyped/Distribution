package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists values that specify the summary item's aggregate function types.
  */
trait ASPxClientSummaryItemType extends js.Object {
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
  @scala.inline
  def apply(Average: Double, Count: Double, Max: Double, Min: Double, Sum: Double): ASPxClientSummaryItemType = {
    val __obj = js.Dynamic.literal(Average = Average.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Min = Min.asInstanceOf[js.Any], Sum = Sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSummaryItemType]
  }
}

