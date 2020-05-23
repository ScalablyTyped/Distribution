package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an object under the hit test point within a chart control, on the client side.
  */
trait ASPxClientHitObject extends js.Object {
  /**
    * Provides access to an object, which is in some way related to the object being hit. The returned value depends on the ASPxClientHitObject.Object type and hit point location.
    */
  var AdditionalObject: ASPxClientWebChartElement
  /**
    * Gets the chart element for which the event was raised.
    */
  var Object: ASPxClientWebChartElement
}

object ASPxClientHitObject {
  @scala.inline
  def apply(AdditionalObject: ASPxClientWebChartElement, Object: ASPxClientWebChartElement): ASPxClientHitObject = {
    val __obj = js.Dynamic.literal(AdditionalObject = AdditionalObject.asInstanceOf[js.Any], Object = Object.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHitObject]
  }
}

