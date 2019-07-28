package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an object under the hit test point within a chart control, on the client side.
  */
trait ASPxClientHitObject extends js.Object {
  /**
    * Provides access to an object, which is in some way related to the object being hit. The returned value depends on the Object type and hit point location.
    * Value: An ASPxClientWebChartElement object that represents an additional object related to the one being hit.
    */
  var AdditionalObject: ASPxClientWebChartElement
  /**
    * Gets the chart element for which the event was raised.
    * Value: An ASPxClientWebChartElement object, representing the chart element for which the event was raised.
    */
  var Object: ASPxClientWebChartElement
}

object ASPxClientHitObject {
  @scala.inline
  def apply(AdditionalObject: ASPxClientWebChartElement, Object: ASPxClientWebChartElement): ASPxClientHitObject = {
    val __obj = js.Dynamic.literal(AdditionalObject = AdditionalObject, Object = Object)
  
    __obj.asInstanceOf[ASPxClientHitObject]
  }
}

