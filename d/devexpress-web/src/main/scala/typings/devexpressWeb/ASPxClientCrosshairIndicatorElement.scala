package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Crosshair Cursor's element that displays information about an indicator.
  */
trait ASPxClientCrosshairIndicatorElement extends js.Object {
  /**
    * Returns the indicator for whose point the Crosshair Cursor creates the element.
    */
  var Indicator: ASPxClientIndicator
}

object ASPxClientCrosshairIndicatorElement {
  @scala.inline
  def apply(Indicator: ASPxClientIndicator): ASPxClientCrosshairIndicatorElement = {
    val __obj = js.Dynamic.literal(Indicator = Indicator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairIndicatorElement]
  }
}

