package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the delta metadata.
  */
trait ASPxClientDashboardItemDataDelta extends js.Object {
  /**
    * Gets the identifier for the measure that provides actual values.
    * Value: A string value that is the measure identifier.
    */
  var ActualMeasureId: String
  /**
    * Gets the data item identifier.
    * Value: A string that is the data item identifier.
    */
  var Id: String
  /**
    * Gets the name of the data item container.
    * Value: A string value that is the name of the data item container.
    */
  var Name: String
  /**
    * Gets the identifier for the measure that provides target values.
    * Value: A string value that is the measure identifier.
    */
  var TargetMeasureId: String
}

object ASPxClientDashboardItemDataDelta {
  @scala.inline
  def apply(ActualMeasureId: String, Id: String, Name: String, TargetMeasureId: String): ASPxClientDashboardItemDataDelta = {
    val __obj = js.Dynamic.literal(ActualMeasureId = ActualMeasureId, Id = Id, Name = Name, TargetMeasureId = TargetMeasureId)
  
    __obj.asInstanceOf[ASPxClientDashboardItemDataDelta]
  }
}

