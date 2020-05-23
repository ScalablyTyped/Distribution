package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the delta metadata.
  */
trait ASPxClientDashboardItemDataDelta extends js.Object {
  /**
    * Gets the identifier for the measure that provides actual values.
    */
  var ActualMeasureId: String
  /**
    * Gets the data item identifier.
    */
  var Id: String
  /**
    * Gets the name of the data item container.
    */
  var Name: String
  /**
    * Gets the identifier for the measure that provides target values.
    */
  var TargetMeasureId: String
}

object ASPxClientDashboardItemDataDelta {
  @scala.inline
  def apply(ActualMeasureId: String, Id: String, Name: String, TargetMeasureId: String): ASPxClientDashboardItemDataDelta = {
    val __obj = js.Dynamic.literal(ActualMeasureId = ActualMeasureId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TargetMeasureId = TargetMeasureId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemDataDelta]
  }
}

