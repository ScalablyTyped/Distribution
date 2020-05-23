package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the CrosshairElementGroup class.
  */
trait ASPxClientCrosshairElementGroup extends js.Object {
  /**
    * Returns the collection of elements that the Crosshair Cursor displays in the group.
    */
  var CrosshairElements: js.Array[ASPxClientCrosshairElement]
  /**
    * Returns the collection of indicator elements that the Crosshair Cursor displays in the group.
    */
  var CrosshairIndicatorElements: js.Array[ASPxClientCrosshairIndicatorElement]
  /**
    * Returns the Crosshair Cursor group's Header element.
    */
  var HeaderElement: ASPxClientCrosshairGroupHeaderElement
}

object ASPxClientCrosshairElementGroup {
  @scala.inline
  def apply(
    CrosshairElements: js.Array[ASPxClientCrosshairElement],
    CrosshairIndicatorElements: js.Array[ASPxClientCrosshairIndicatorElement],
    HeaderElement: ASPxClientCrosshairGroupHeaderElement
  ): ASPxClientCrosshairElementGroup = {
    val __obj = js.Dynamic.literal(CrosshairElements = CrosshairElements.asInstanceOf[js.Any], CrosshairIndicatorElements = CrosshairIndicatorElements.asInstanceOf[js.Any], HeaderElement = HeaderElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairElementGroup]
  }
}

